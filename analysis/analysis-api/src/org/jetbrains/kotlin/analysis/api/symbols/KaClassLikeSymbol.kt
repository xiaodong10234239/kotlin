/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.symbols

import org.jetbrains.kotlin.analysis.api.KaExperimentalApi
import org.jetbrains.kotlin.analysis.api.KaImplementationDetail
import org.jetbrains.kotlin.analysis.api.base.KaContextReceiversOwner
import org.jetbrains.kotlin.analysis.api.lifetime.withValidityAssertion
import org.jetbrains.kotlin.analysis.api.symbols.markers.KaDeclarationContainerSymbol
import org.jetbrains.kotlin.analysis.api.symbols.markers.KaNamedSymbol
import org.jetbrains.kotlin.analysis.api.symbols.markers.KaTypeParameterOwnerSymbol
import org.jetbrains.kotlin.analysis.api.symbols.pointers.KaSymbolPointer
import org.jetbrains.kotlin.analysis.api.types.KaType
import org.jetbrains.kotlin.descriptors.Visibilities
import org.jetbrains.kotlin.descriptors.Visibility
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.name.SpecialNames
import org.jetbrains.kotlin.types.Variance

public sealed class KaClassifierSymbol : KaDeclarationSymbol {
    public abstract val name: Name?
}

public val KaClassifierSymbol.nameOrAnonymous: Name
    get() = name ?: SpecialNames.ANONYMOUS

public abstract class KaTypeParameterSymbol : KaClassifierSymbol(), KaNamedSymbol {
    abstract override fun createPointer(): KaSymbolPointer<KaTypeParameterSymbol>

    public abstract val upperBounds: List<KaType>
    public abstract val variance: Variance
    public abstract val isReified: Boolean

    final override val modality: KaSymbolModality get() = withValidityAssertion { KaSymbolModality.FINAL }
    final override val isActual: Boolean get() = withValidityAssertion { false }
    final override val isExpect: Boolean get() = withValidityAssertion { false }

    @KaExperimentalApi
    final override val compilerVisibility: Visibility get() = withValidityAssertion { Visibilities.Local }
}

public sealed class KaClassLikeSymbol : KaClassifierSymbol() {
    /**
     * The [ClassId] of this class, or `null` if this class is local.
     */
    public abstract val classId: ClassId?

    abstract override fun createPointer(): KaSymbolPointer<KaClassLikeSymbol>
}

@OptIn(KaImplementationDetail::class)
public abstract class KaTypeAliasSymbol : KaClassLikeSymbol(),
    KaNamedSymbol,
    KaTypeParameterOwnerSymbol
{
    final override val modality: KaSymbolModality
        get() = withValidityAssertion { KaSymbolModality.FINAL }

    /**
     * Returns type from right-hand site of type alias
     * If type alias has type parameters, then those type parameters will be present in result type
     */
    public abstract val expandedType: KaType

    abstract override fun createPointer(): KaSymbolPointer<KaTypeAliasSymbol>
}

public sealed class KaClassSymbol : KaClassLikeSymbol(), KaDeclarationContainerSymbol {

    public abstract val classKind: KaClassKind

    /**
     * A list of the direct supertypes. If the class has no explicit supertypes, the supertype will be [Any], or a special supertype such as
     * [Enum] for enum classes.
     *
     * Type parameters are included in supertype type arguments in an unsubstituted form. For example, if we have `class A<T> : B<T>`,
     * [superTypes] for `A` contains `B<T>` as a type, with an unsubstituted [KaTypeParameterType][org.jetbrains.kotlin.analysis.api.types.KaTypeParameterType]
     * `T`.
     *
     * For a list of all supertypes, consider using [KaType.allSupertypes][org.jetbrains.kotlin.analysis.api.components.KaTypeProvider.allSupertypes]
     * on [KaNamedClassSymbol.defaultType][org.jetbrains.kotlin.analysis.api.components.KaTypeProvider.defaultType]. To check whether
     * this symbol is a subtype of another symbol, consider using [KaClassSymbol.isSubClassOf][org.jetbrains.kotlin.analysis.api.components.KaSymbolRelationProvider.isSubClassOf],
     * or [KaType.isSubtypeOf][org.jetbrains.kotlin.analysis.api.components.KaTypeRelationChecker.isSubtypeOf].
     */
    public abstract val superTypes: List<KaType>

    abstract override fun createPointer(): KaSymbolPointer<KaClassSymbol>
}

public abstract class KaAnonymousObjectSymbol : KaClassSymbol() {
    final override val classKind: KaClassKind get() = withValidityAssertion { KaClassKind.ANONYMOUS_OBJECT }
    final override val classId: ClassId? get() = withValidityAssertion { null }
    final override val location: KaSymbolLocation get() = withValidityAssertion { KaSymbolLocation.LOCAL }
    final override val modality: KaSymbolModality get() = withValidityAssertion { KaSymbolModality.FINAL }

    @KaExperimentalApi
    final override val compilerVisibility: Visibility get() = withValidityAssertion { Visibilities.Local }

    final override val isExpect: Boolean get() = withValidityAssertion { false }
    final override val isActual: Boolean get() = withValidityAssertion { false }

    final override val name: Name? get() = withValidityAssertion { null }

    abstract override fun createPointer(): KaSymbolPointer<KaAnonymousObjectSymbol>
}

@OptIn(KaImplementationDetail::class, KaExperimentalApi::class)
public abstract class KaNamedClassSymbol : KaClassSymbol(),
    KaTypeParameterOwnerSymbol,
    KaNamedSymbol,
    KaContextReceiversOwner {

    public abstract val isInner: Boolean
    public abstract val isData: Boolean
    public abstract val isInline: Boolean
    public abstract val isFun: Boolean

    public abstract val isExternal: Boolean

    public abstract val companionObject: KaNamedClassSymbol?

    abstract override fun createPointer(): KaSymbolPointer<KaNamedClassSymbol>
}

public enum class KaClassKind {
    CLASS,
    ENUM_CLASS,
    ANNOTATION_CLASS,
    OBJECT,
    COMPANION_OBJECT,
    INTERFACE,
    ANONYMOUS_OBJECT;

    public val isObject: Boolean get() = this == OBJECT || this == COMPANION_OBJECT || this == ANONYMOUS_OBJECT
    public val isClass: Boolean get() = this == CLASS || this == ANNOTATION_CLASS || this == ENUM_CLASS
}
