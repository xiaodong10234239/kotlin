/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// This file was generated automatically. See compiler/ir/ir.tree/tree-generator/ReadMe.md.
// DO NOT MODIFY IT MANUALLY.

@file:Suppress("DuplicatedCode")

package org.jetbrains.kotlin.ir.expressions.impl

import org.jetbrains.kotlin.ir.declarations.IrAttributeContainer
import org.jetbrains.kotlin.ir.expressions.IrConstantObject
import org.jetbrains.kotlin.ir.expressions.IrConstantValue
import org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol
import org.jetbrains.kotlin.ir.types.IrType
import org.jetbrains.kotlin.ir.util.IrElementConstructorIndicator
import org.jetbrains.kotlin.utils.SmartList

class IrConstantObjectImpl internal constructor(
    @Suppress("UNUSED_PARAMETER") constructorIndicator: IrElementConstructorIndicator?,
    override val startOffset: Int,
    override val endOffset: Int,
    override var type: IrType,
    override var constructor: IrConstructorSymbol,
) : IrConstantObject() {
    override var attributeOwnerId: IrAttributeContainer = this

    override var originalBeforeInline: IrAttributeContainer? = null

    override val valueArguments: MutableList<IrConstantValue> = SmartList()

    override val typeArguments: MutableList<IrType> = SmartList()
}
