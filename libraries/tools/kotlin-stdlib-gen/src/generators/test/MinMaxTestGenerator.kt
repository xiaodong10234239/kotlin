/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package generators.test

import templates.*
import templates.Family.*
import templates.PrimitiveType
import java.io.File

object MinMaxTestGenerator {
    fun generate() {
        generate(Iterables)
        generate(Sequences)
        generate(CharSequences)
        generate(ArraysOfObjects)
        for (primitive in PrimitiveType.defaultPrimitives - PrimitiveType.Boolean) {
            generate(ArraysOfPrimitives, primitive)
        }
        for (primitive in PrimitiveType.unsignedPrimitives) {
            generate(ArraysOfUnsigned, primitive)
        }
    }



    private fun elements(elementType: String) = when (elementType) {
        "Int", "Byte", "Short", "Long" -> listOf("1", "2", "$elementType.MAX_VALUE")
        "UInt", "UByte", "UShort" -> listOf("1U", "2U", "$elementType.MAX_VALUE")
        "ULong" -> listOf("1UL", "2UL", "$elementType.MAX_VALUE")
        "Double" -> listOf("1.0", "2.0", "$elementType.POSITIVE_INFINITY")
        "Float" -> listOf("1.0F", "2.0F", "$elementType.POSITIVE_INFINITY")
        "Char" -> listOf("'a'", "'b'", "$elementType.MAX_VALUE")
        "T" -> listOf("a", "bcd", "e").map { "\"$it\"" }
        else -> error(elementType)
    }

    private fun generate(family: Family, primitive: PrimitiveType? = null) {
        val containerClass = when(family) {
            Iterables, Sequences, CharSequences -> family.toString().dropLast(1)
            ArraysOfObjects -> "Array"
            ArraysOfPrimitives, ArraysOfUnsigned -> "${primitive!!}Array"
            else -> error(family)
        }

        val isGeneric = family in listOf(Iterables, Sequences, ArraysOfObjects)

        val elementType = when {
            isGeneric -> "T"
            family == CharSequences -> "Char"
            else -> primitive!!.toString()
        }
        val defaultElements = elements(elementType)

        val containerType = containerClass + "<T>".ifOrEmpty(isGeneric)

        fun emptyContainer(elementType: String): String {
            val type = if (elementType == "T") "Int" else elementType
            return when (family) {
                CharSequences -> "StringBuilder()"
                Iterables -> "listOf<$type>()"
                Sequences -> "sequenceOf<$type>()"
                ArraysOfObjects -> "arrayOf<$type>()"
                else -> "${containerClass.let { it.substring(0, 2).lowercase() + it.substring(2) }}Of()"
            }
        }



        fun containerOf(elements: List<String>, shuffle: Boolean = false): String {
            require(elements.isNotEmpty())
            val args = elements.joinToString()
            val shuffled = when (family) {
                ArraysOfObjects, ArraysOfPrimitives, ArraysOfUnsigned, CharSequences -> ".apply { shuffle() }"
                else -> ".shuffled()"
            }
            return when (family) {
                CharSequences -> "StringBuilder(charArrayOf($args)${shuffled.ifOrEmpty(shuffle)}.concatToString())"
                Iterables -> "listOf($args)${shuffled.ifOrEmpty(shuffle)}"
                else -> "${containerClass.let { it.substring(0, 2).lowercase() + it.substring(2) }}Of($args)${shuffled.ifOrEmpty(shuffle)}"
            }
        }

        val className = "MinMax${containerClass}Test"
        val file = File("libraries/stdlib/test/generated/minmax/$className.kt")
        file.bufferedWriter().use { writer ->

            writer.appendLine(COPYRIGHT_NOTICE)
            writer.appendLine()
            writer.appendLine("package test.generated.minmax")
            writer.appendLine()
            writer.appendLine(autoGeneratedWarning("MinMaxTestGenerator.kt"))
            writer.appendLine()
            writer.appendLine("import kotlin.math.pow")
            writer.appendLine("import kotlin.test.*")
            writer.appendLine("import test.*")
            writer.appendLine()
            writer.appendLine("class $className {")
            writer.appendLine("""
    
    private fun ${"<T : Comparable<T>> ".ifOrEmpty(isGeneric)}expectMinMax(min: $elementType, max: $elementType, elements: $containerType) {
        assertEquals(min, elements.minOrNull())
        assertEquals(max, elements.maxOrNull())
        assertEquals(min, elements.min())
        assertEquals(max, elements.max())
    }

    @Test
    fun minMax() {""")

            for (size in 1..3) {
                val elements = defaultElements.take(size)
                writer.appendLine("        expectMinMax(${elements.first()}, ${elements.last()}, ${containerOf(elements)})")
            }

            if (isGeneric) {
                for (type in listOf(PrimitiveType.Int, PrimitiveType.Long, PrimitiveType.UInt, PrimitiveType.Char)) {
                    val elements = elements(type.toString())
                    writer.appendLine("        expectMinMax(${elements.first()}, ${elements.last()}, ${containerOf(elements)})")
                }
            }

            writer.appendLine(
"""                    
    }

    @Test
    fun minMaxEmpty() {
        val empty = ${emptyContainer(elementType)}
        assertNull(empty.minOrNull())
        assertNull(empty.maxOrNull())
        assertFailsWith<NoSuchElementException> { empty.min() }
        assertFailsWith<NoSuchElementException> { empty.max() }
    }
""")
            run {
                val assertions = """
        assertIsNegativeZero(zeroes.min().toDouble())
        assertIsNegativeZero(zeroes.minOrNull()!!.toDouble())
        assertTrue(NaNs.min().isNaN())
        assertTrue(NaNs.minOrNull()!!.isNaN())

        assertIsPositiveZero(zeroes.max().toDouble())
        assertIsPositiveZero(zeroes.maxOrNull()!!.toDouble())
        assertTrue(NaNs.max().isNaN())
        assertTrue(NaNs.maxOrNull()!!.isNaN())             
"""
                if (isGeneric || primitive == PrimitiveType.Double) {
                    writer.appendLine("""
    @Test
    fun minMaxDouble() {
        val zeroes = ${containerOf(listOf("0.0", "-0.0"), shuffle = true)}
        val NaNs = ${containerOf(listOf("0.0", "Double.NaN"), shuffle = true)}
$assertions
    }
""")
                }
                if (isGeneric || primitive == PrimitiveType.Float) {
                    writer.appendLine("""
    @Test
    fun minMaxFloat() {
        val zeroes = ${containerOf(listOf("0.0F", "-0.0F"), shuffle = true)}
        val NaNs = ${containerOf(listOf("0.0F", "Float.NaN"), shuffle = true)}
$assertions
    }
""")
                }
            }
            writer.appendLine("""

    private fun ${"<T> ".ifOrEmpty(isGeneric)}expectMinMaxWith(min: $elementType, max: $elementType, elements: $containerType, comparator: Comparator<$elementType>) {
        assertEquals(min, elements.minWithOrNull(comparator))
        assertEquals(max, elements.maxWithOrNull(comparator))
        assertEquals(min, elements.minWith(comparator))
        assertEquals(max, elements.maxWith(comparator))
    }

    @Test
    fun minMaxWith() {""")
            for (size in 1..3) {
                val elements = defaultElements.take(size)
                writer.appendLine("        expectMinMaxWith(${elements.first()}, ${elements.last()}, ${containerOf(elements)}, naturalOrder())")
            }
            if (isGeneric) {
                val elements = listOf("a", "B").map { "\"$it\"" }
                writer.appendLine("        expectMinMaxWith(${elements.first()}, ${elements.last()}, ${containerOf(elements)}, String.CASE_INSENSITIVE_ORDER)")
            }
            writer.appendLine("""
    }

    @Test
    fun minMaxWithEmpty() {
        val empty = ${emptyContainer(elementType)}
        assertNull(empty.minWithOrNull(naturalOrder()))
        assertNull(empty.maxWithOrNull(naturalOrder()))
        assertFailsWith<NoSuchElementException> { empty.minWith(naturalOrder()) }
        assertFailsWith<NoSuchElementException> { empty.maxWith(naturalOrder()) }
    }


    private inline fun <${"T, ".ifOrEmpty(isGeneric)}K : Comparable<K>> expectMinMaxBy(min: $elementType, max: $elementType, elements: $containerType, selector: ($elementType) -> K) {
        assertEquals(min, elements.minBy(selector))
        assertEquals(min, elements.minByOrNull(selector))
        assertEquals(max, elements.maxBy(selector))
        assertEquals(max, elements.maxByOrNull(selector))
    }

    @Test
    fun minMaxBy() {""")
            for (size in 1..3) {
                val elements = defaultElements.take(size)
                writer.appendLine("        expectMinMaxBy(${elements.first()}, ${elements.last()}, ${containerOf(elements)}, { it })")
            }
            if (isGeneric) {
                val elements = listOf("abc", "De").map { "\"$it\"" }
                writer.appendLine("        expectMinMaxBy(${elements.last()}, ${elements.first()}, ${containerOf(elements)}, { it.length })")
            }
            writer.appendLine("""
    }

    @Test
    fun minMaxByEmpty() {
        val empty = ${emptyContainer(elementType)}
        assertNull(empty.minByOrNull { it.toString() })
        assertNull(empty.maxByOrNull { it.toString() })
        assertFailsWith<NoSuchElementException> { empty.minBy { it.toString() } }
        assertFailsWith<NoSuchElementException> { empty.maxBy { it.toString() } }                       
    }

    @Test 
    fun minBySelectorEvaluateOnce() {
        val source = ${containerOf(defaultElements)}
        var c = 0
        source.minBy { c++ }
        assertEquals(${defaultElements.size}, c)
        c = 0
        source.minByOrNull { c++ }
        assertEquals(${defaultElements.size}, c)
    }

    @Test 
    fun maxBySelectorEvaluateOnce() {
        val source = ${containerOf(defaultElements)}
        var c = 0
        source.maxBy { c++ }
        assertEquals(${defaultElements.size}, c)
        c = 0
        source.maxByOrNull { c++ }
        assertEquals(${defaultElements.size}, c)
    }
    
    
    private inline fun <${"T, ".ifOrEmpty(isGeneric)}R : Comparable<R>> expectMinMaxOf(min: R, max: R, elements: $containerType, selector: ($elementType) -> R) {
        assertEquals(min, elements.minOf(selector))
        assertEquals(min, elements.minOfOrNull(selector))
        assertEquals(max, elements.maxOf(selector))
        assertEquals(max, elements.maxOfOrNull(selector))
    }
    
    @Test
    fun minMaxOf() {""")
            for (size in 1..3) {
                val elements = defaultElements.take(size)
                if (primitive?.isNumeric() == true) {
                    writer.appendLine("        expectMinMaxOf(-${elements.last()}, -${elements.first()}, ${containerOf(elements)}, { -it })")
                } else if (primitive?.isUnsigned() == true) {
                    writer.appendLine("        expectMinMaxOf((0u - ${elements.last()}).to$primitive(), (0u - ${elements.first()}).to$primitive(), ${containerOf(elements)}, { (0u - it).to$primitive() })")
                } else {
                    writer.appendLine("        expectMinMaxOf(\"_\" + ${elements.first()}, \"_\" + ${elements.last()}, ${containerOf(elements)}, { \"_\$it\" })")
                }
            }
            writer.appendLine("""
    }
    
    @Test
    fun minMaxOfDouble() {
        val middle = ${defaultElements[1]}
        val items = ${containerOf(defaultElements, shuffle = true)}
        assertTrue(items.minOf { it.compareTo(middle).toDouble().pow(0.5) }.isNaN())
        assertTrue(items.minOfOrNull { it.compareTo(middle).toDouble().pow(0.5) }!!.isNaN())
        assertTrue(items.maxOf { it.compareTo(middle).toDouble().pow(0.5) }.isNaN())
        assertTrue(items.maxOfOrNull { it.compareTo(middle).toDouble().pow(0.5) }!!.isNaN())
        
        assertIsNegativeZero(items.minOf { it.compareTo(middle) * 0.0 })
        assertIsNegativeZero(items.minOfOrNull { it.compareTo(middle) * 0.0 }!!)
        assertIsPositiveZero(items.maxOf { it.compareTo(middle) * 0.0 })
        assertIsPositiveZero(items.maxOfOrNull { it.compareTo(middle) * 0.0 }!!)
    }
    
    @Test
    fun minMaxOfFloat() {
        val middle = ${defaultElements[1]}
        val items = ${containerOf(defaultElements, shuffle = true)}
        assertTrue(items.minOf { it.compareTo(middle).toFloat().pow(0.5F) }.isNaN())
        assertTrue(items.minOfOrNull { it.compareTo(middle).toFloat().pow(0.5F) }!!.isNaN())
        assertTrue(items.maxOf { it.compareTo(middle).toFloat().pow(0.5F) }.isNaN())
        assertTrue(items.maxOfOrNull { it.compareTo(middle).toFloat().pow(0.5F) }!!.isNaN())
        
        assertIsNegativeZero(items.minOf { it.compareTo(middle) * 0.0F }.toDouble())
        assertIsNegativeZero(items.minOfOrNull { it.compareTo(middle) * 0.0F }!!.toDouble())
        assertIsPositiveZero(items.maxOf { it.compareTo(middle) * 0.0F }.toDouble())
        assertIsPositiveZero(items.maxOfOrNull { it.compareTo(middle) * 0.0F }!!.toDouble())
    }
    
    @Test
    fun minMaxOfEmpty() {
        val empty = ${emptyContainer(elementType)}""")
            for (selector in listOf("it.toString()", "0.0", "0.0F")) {
                writer.appendLine("""
        assertNull(empty.minOfOrNull { $selector })
        assertNull(empty.maxOfOrNull { $selector })
        assertFailsWith<NoSuchElementException> { empty.minOf { $selector } }
        assertFailsWith<NoSuchElementException> { empty.maxOf { $selector } }                       
""")
            }
            writer.appendLine("""
    }
    
    
    private inline fun <${"T, ".ifOrEmpty(isGeneric)}R> expectMinMaxOfWith(min: R, max: R, elements: $containerType, comparator: Comparator<R>, selector: ($elementType) -> R) {
        assertEquals(min, elements.minOfWith(comparator, selector))
        assertEquals(min, elements.minOfWithOrNull(comparator, selector))
        assertEquals(max, elements.maxOfWith(comparator, selector))
        assertEquals(max, elements.maxOfWithOrNull(comparator, selector))
    }
    
    @Test
    fun minMaxOfWith() {""")
            for (size in 1..3) {
                val elements = defaultElements.take(size)
                if (primitive?.isNumeric() == true) {
                    writer.appendLine("        expectMinMaxOfWith(-${elements.first()}, -${elements.last()}, ${containerOf(elements)}, reverseOrder(), { -it })")
                } else if (primitive?.isUnsigned() == true) {
                    writer.appendLine("        expectMinMaxOfWith((0u - ${elements.first()}).to$primitive(), (0u - ${elements.last()}).to$primitive(), ${containerOf(elements)}, reverseOrder(), { (0u - it).to$primitive() })")
                } else {
                    writer.appendLine("        expectMinMaxOfWith(\"_\" + ${elements.last()}, \"_\" + ${elements.first()}, ${containerOf(elements)}, reverseOrder(), { \"_\$it\" })")
                }
            }
            writer.appendLine("""
    }
    
    @Test
    fun minMaxOfWithEmpty() {
        val empty = ${emptyContainer(elementType)}
        assertNull(empty.minOfWithOrNull(naturalOrder()) { it.toString() })
        assertNull(empty.maxOfWithOrNull(naturalOrder()) { it.toString() })
        assertFailsWith<NoSuchElementException> { empty.minOfWith(naturalOrder()) { it.toString() } }
        assertFailsWith<NoSuchElementException> { empty.maxOfWith(naturalOrder()) { it.toString() } }
    }
""")
            writer.appendLine("}")
        }

    }

}
