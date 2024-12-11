/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.symbols

import org.jetbrains.kotlin.analysis.api.KaExperimentalApi
import org.jetbrains.kotlin.analysis.api.KaImplementationDetail
import org.jetbrains.kotlin.analysis.api.symbols.markers.KaAnnotatedSymbol
import org.jetbrains.kotlin.analysis.api.symbols.markers.KaTypeParameterOwnerSymbol
import org.jetbrains.kotlin.descriptors.Visibility

/**
 * Represents a symbol of declaration which can be directly expressed in source code.
 * Eg, classes, type parameters or functions are [KaDeclarationSymbol], but files and packages are not
 */
public sealed interface KaDeclarationSymbol : KaSymbol, KaAnnotatedSymbol {
    public val modality: KaSymbolModality

    public val visibility: KaSymbolVisibility
        @OptIn(KaExperimentalApi::class)
        get() = compilerVisibility.asKaSymbolVisibility

    @KaExperimentalApi
    public val compilerVisibility: Visibility

    /**
     * Returns true if the declaration is a platform-specific implementation in a multiplatform project.
     *
     * See [the official Kotlin documentation](https://kotlinlang.org/docs/multiplatform-connect-to-apis.html) for more details.
     */
    public val isActual: Boolean

    /**
     * Returns true if the declaration is a platform-specific declaration in a multiplatform project.
     * An implementation in platform modules is expected.
     * Note, that in the following example:
     * ```kotlin
     * expect class A {
     *     class Nested
     * }
     * ```
     * `isExpect` returns `true` for both `A` and `A.Nested`.
     *
     * See [the official Kotlin documentation](https://kotlinlang.org/docs/multiplatform-connect-to-apis.html) for more details.
     */
    public val isExpect: Boolean
}

@KaExperimentalApi
public val KaDeclarationSymbol.typeParameters: List<KaTypeParameterSymbol>
    @OptIn(KaImplementationDetail::class)
    get() = if (this is KaTypeParameterOwnerSymbol) typeParameters else emptyList()
