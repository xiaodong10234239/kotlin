/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.annotations

import org.jetbrains.kotlin.analysis.api.lifetime.KaLifetimeOwner
import org.jetbrains.kotlin.name.Name

/**
 * Name-Value pair which is used as annotation argument.
 */
public interface KaNamedAnnotationValue : KaLifetimeOwner {
    public val name: Name
    public val expression: KaAnnotationValue
}
