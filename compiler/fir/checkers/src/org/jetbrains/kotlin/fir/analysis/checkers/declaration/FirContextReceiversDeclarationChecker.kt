/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.analysis.checkers.declaration

import org.jetbrains.kotlin.KtFakeSourceElementKind
import org.jetbrains.kotlin.config.LanguageFeature
import org.jetbrains.kotlin.diagnostics.DiagnosticReporter
import org.jetbrains.kotlin.diagnostics.reportOn
import org.jetbrains.kotlin.fir.analysis.checkers.MppCheckerKind
import org.jetbrains.kotlin.fir.analysis.checkers.context.CheckerContext
import org.jetbrains.kotlin.fir.analysis.checkers.findContextReceiverListSource
import org.jetbrains.kotlin.fir.analysis.checkers.getModifierList
import org.jetbrains.kotlin.fir.analysis.diagnostics.FirErrors
import org.jetbrains.kotlin.fir.declarations.*
import org.jetbrains.kotlin.fir.declarations.utils.isOperator
import org.jetbrains.kotlin.fir.declarations.utils.nameOrSpecialName
import org.jetbrains.kotlin.fir.types.*
import org.jetbrains.kotlin.util.OperatorNameConventions

object FirContextReceiversDeclarationChecker : FirBasicDeclarationChecker(MppCheckerKind.Platform) {
    override fun check(declaration: FirDeclaration, context: CheckerContext, reporter: DiagnosticReporter) {
        if (declaration.source?.kind is KtFakeSourceElementKind) return

        val source = declaration.source?.findContextReceiverListSource() ?: return

        if (declaration is FirTypeAlias) {
            reporter.reportOn(
                source,
                FirErrors.UNSUPPORTED,
                "Context parameters on type aliases are unsupported.",
                context
            )
        }

        val contextParameters = declaration.getContextParameters()
        if (contextParameters.isEmpty()) return

        val contextReceiversEnabled = context.languageVersionSettings.supportsFeature(LanguageFeature.ContextReceivers)
        val contextParametersEnabled = context.languageVersionSettings.supportsFeature(LanguageFeature.ContextParameters)

        if (!contextReceiversEnabled && !contextParametersEnabled) {
            reporter.reportOn(
                source,
                FirErrors.UNSUPPORTED_FEATURE,
                LanguageFeature.ContextParameters to context.languageVersionSettings,
                context
            )
            return
        }

        if (contextReceiversEnabled) {
            if (checkSubTypes(contextParameters.map { it.returnTypeRef.coneType }, context)) {
                reporter.reportOn(
                    source,
                    FirErrors.SUBTYPING_BETWEEN_CONTEXT_RECEIVERS,
                    context
                )
            }
        }

        if (contextParametersEnabled) {
            when (declaration) {
                is FirClass -> reporter.reportOn(
                    source,
                    FirErrors.UNSUPPORTED,
                    "Context parameters on classes are unsupported.",
                    context
                )
                is FirConstructor -> reporter.reportOn(
                    source,
                    FirErrors.UNSUPPORTED,
                    "Context parameters on constructors are unsupported.",
                    context
                )
                is FirCallableDeclaration if declaration.isDelegationOperator() -> reporter.reportOn(
                    source,
                    FirErrors.UNSUPPORTED,
                    "Context parameters on delegation operators are unsupported.",
                    context
                )
                is FirProperty if declaration.delegate != null -> reporter.reportOn(
                    source,
                    FirErrors.UNSUPPORTED,
                    "Context parameters on delegated properties are unsupported.",
                    context
                )
                else -> for (parameter in contextParameters) {
                    if (parameter.isLegacyContextReceiver()) {
                        reporter.reportOn(parameter.source, FirErrors.CONTEXT_PARAMETER_WITHOUT_NAME, context)
                    }

                    parameter.source?.getModifierList()?.modifiers?.forEach { modifier ->
                        reporter.reportOn(modifier.source, FirErrors.WRONG_MODIFIER_TARGET, modifier.token, "context parameter", context)
                    }
                }
            }
        } else {
            for (parameter in contextParameters) {
                if (!parameter.isLegacyContextReceiver()) {
                    reporter.reportOn(
                        parameter.source,
                        FirErrors.UNSUPPORTED_FEATURE,
                        LanguageFeature.ContextParameters to context.languageVersionSettings,
                        context
                    )
                }
            }
        }
    }

    private fun FirCallableDeclaration.isDelegationOperator(): Boolean {
        return this.isOperator && this.nameOrSpecialName in OperatorNameConventions.DELEGATED_PROPERTY_OPERATORS
    }

    private fun FirDeclaration.getContextParameters(): List<FirValueParameter> {
        return when (this) {
            is FirCallableDeclaration -> contextReceivers
            is FirRegularClass -> contextReceivers
            else -> emptyList()
        }
    }
}

/**
 * Simplified checking of subtype relation used in context receiver checkers.
 * It converts type parameters to star projections and top level type parameters to its supertypes. Then it checks the relation.
 */
fun checkSubTypes(types: List<ConeKotlinType>, context: CheckerContext): Boolean {
    fun replaceTypeParametersByStarProjections(type: ConeClassLikeType): ConeClassLikeType {
        return type.withArguments(type.typeArguments.map {
            when {
                it.isStarProjection -> it
                it.type!! is ConeTypeParameterType -> ConeStarProjection
                it.type!! is ConeClassLikeType -> replaceTypeParametersByStarProjections(it.type as ConeClassLikeType)
                else -> it
            }
        }.toTypedArray())
    }

    val replacedTypeParameters = types.flatMap { r ->
        when (r) {
            is ConeTypeParameterType -> r.lookupTag.typeParameterSymbol.resolvedBounds.map { it.coneType }
            is ConeClassLikeType -> listOf(replaceTypeParametersByStarProjections(r))
            else -> listOf(r)
        }
    }

    for (i in replacedTypeParameters.indices)
        for (j in i + 1..<replacedTypeParameters.size) {
            if (replacedTypeParameters[i].isSubtypeOf(replacedTypeParameters[j], context.session)
                || replacedTypeParameters[j].isSubtypeOf(replacedTypeParameters[i], context.session)
            )
                return true
        }

    return false
}
