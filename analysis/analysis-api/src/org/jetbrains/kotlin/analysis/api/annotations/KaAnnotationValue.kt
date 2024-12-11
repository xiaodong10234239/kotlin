/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.annotations

import org.jetbrains.kotlin.analysis.api.base.KaConstantValue
import org.jetbrains.kotlin.analysis.api.lifetime.KaLifetimeOwner
import org.jetbrains.kotlin.analysis.api.types.KaClassErrorType
import org.jetbrains.kotlin.analysis.api.types.KaType
import org.jetbrains.kotlin.name.CallableId
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.psi.KtElement

/**
 * Annotation values are expected to be compile-time constants. According to the
 * [spec](https://kotlinlang.org/spec/annotations.html#annotation-values),
 * allowed kinds are:
 *   * integer types,
 *   * string type,
 *   * enum types,
 *   * other annotation types, and
 *   * array of aforementioned types
 *
 *  [KaConstantAnnotationValue]  covers first two kinds;
 *  [KaEnumEntryAnnotationValue] corresponds to enum types;
 *  [KaAnnotationApplicationValue] represents annotation types (with annotation fq name and arguments); and
 *  [KaArrayAnnotationValue] abstracts an array of [KaAnnotationValue]s.
 */
public sealed interface KaAnnotationValue : KaLifetimeOwner {
    public val sourcePsi: KtElement?

    /**
     * Represents an unsupported expression used as an annotation value.
     */
    public interface UnsupportedValue : KaAnnotationValue

    /**
     * Represents an array of annotation values.
     * E.g., `[1, 2]`.
     */
    public interface ArrayValue : KaAnnotationValue {
        public val values: Collection<KaAnnotationValue>
    }

    /**
     * Represents a nested annotation value.
     * E.g., @Foo(bar = Bar(1)).
     */
    public interface NestedAnnotationValue : KaAnnotationValue {
        public val annotation: KaAnnotation
    }

    /**
     * Represents a class literal value.
     * E.g., `String::class`.
     */
    public interface ClassLiteralValue : KaAnnotationValue {
        /**
         * The referenced [ClassId], if available.
         * The property is useful for error handling, as [KaClassErrorType] currently does not provide a [ClassId].
         */
        public val classId: ClassId?

        /**
         * The class reference type.
         * E.g., `Array<String>` for the `Array<String>::class` literal.
         */
        public val type: KaType
    }

    /**
     * Represents an enum entry value.
     * E.g., `Color.RED`.
     */
    public interface EnumEntryValue : KaAnnotationValue {
        /**
         * Name of an enum entry.
         */
        public val callableId: CallableId?
    }

    /**
     * Represents a constant value.
     * E.g., `1`, `"foo"`.
     *
     * @see [KaConstantValue]
     */
    public interface ConstantValue : KaAnnotationValue {
        public val value: KaConstantValue
    }
}

/**
 * Render annotation value, resulted string is a valid Kotlin source code.
 */
public fun KaAnnotationValue.renderAsSourceCode(): String =
    KaAnnotationValueRenderer.render(this)
