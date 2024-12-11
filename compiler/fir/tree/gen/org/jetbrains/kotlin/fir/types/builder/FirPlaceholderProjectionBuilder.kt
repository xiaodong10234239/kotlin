/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// This file was generated automatically. See compiler/fir/tree/tree-generator/Readme.md.
// DO NOT MODIFY IT MANUALLY.

@file:Suppress("DuplicatedCode", "unused")

package org.jetbrains.kotlin.fir.types.builder

import kotlin.contracts.*
import org.jetbrains.kotlin.KtSourceElement
import org.jetbrains.kotlin.fir.builder.FirBuilderDsl
import org.jetbrains.kotlin.fir.types.FirPlaceholderProjection
import org.jetbrains.kotlin.fir.types.impl.FirPlaceholderProjectionImpl

@FirBuilderDsl
class FirPlaceholderProjectionBuilder {
    var source: KtSourceElement? = null

    fun build(): FirPlaceholderProjection {
        return FirPlaceholderProjectionImpl(
            source,
        )
    }

}

@OptIn(ExperimentalContracts::class)
inline fun buildPlaceholderProjection(init: FirPlaceholderProjectionBuilder.() -> Unit = {}): FirPlaceholderProjection {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return FirPlaceholderProjectionBuilder().apply(init).build()
}
