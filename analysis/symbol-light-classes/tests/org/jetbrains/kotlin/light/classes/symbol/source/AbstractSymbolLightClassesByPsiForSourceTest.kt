/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.light.classes.symbol.source

import org.jetbrains.kotlin.light.classes.symbol.base.AbstractSymbolLightClassesByPsiTest
import org.jetbrains.kotlin.light.classes.symbol.base.SymbolLightClassSourceTestConfigurator
import org.jetbrains.kotlin.platform.js.JsPlatforms
import org.jetbrains.kotlin.platform.jvm.JvmPlatforms

abstract class AbstractSymbolLightClassesByPsiForSourceTest : AbstractSymbolLightClassesByPsiTest(
    SymbolLightClassSourceTestConfigurator(JvmPlatforms.defaultJvmPlatform),
    EXTENSIONS.FIR_JAVA,
    isTestAgainstCompiledCode = false,
)

abstract class AbstractJsSymbolLightClassesByPsiForSourceTest : AbstractSymbolLightClassesByPsiTest(
    SymbolLightClassSourceTestConfigurator(JsPlatforms.defaultJsPlatform),
    EXTENSIONS.KMP_JAVA,
    isTestAgainstCompiledCode = false,
)