/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// Auto-generated file. DO NOT EDIT!
// Generated by org.jetbrains.kotlin.generators.builtins.arrays.GenerateWasmArrays

@file:Suppress("UNUSED_PARAMETER")

package kotlin

import kotlin.wasm.internal.*

/**
 * An array of bytes. When targeting the JVM, instances of this class are represented as `byte[]`.
 *
 * See [Kotlin language documentation](https://kotlinlang.org/docs/arrays.html)
 * for more information on arrays.
 */
public actual class ByteArray
/**
 * Creates a new array of the specified [size], with all elements initialized to zero.
 * @throws RuntimeException if the specified [size] is negative.
 */
public actual constructor(size: Int) {
    /**
     * Creates a new array of the specified [size], where each element is calculated by calling the specified
     * [init] function.
     *
     * The function [init] is called for each array element sequentially starting from the first one.
     * It should return the value for an array element given its index.
     *
     * @throws RuntimeException if the specified [size] is negative.
     */
    @Suppress("WRONG_MODIFIER_TARGET", "TYPE_PARAMETER_AS_REIFIED")
    public actual inline constructor(size: Int, init: (Int) -> Byte) : this(size)

    internal val storage: WasmByteArray

    init {
        if (size < 0) throw IllegalArgumentException("Negative array size")
        storage = WasmByteArray(size)
    }

    @WasmPrimitiveConstructor
    @Suppress("PRIMARY_CONSTRUCTOR_DELEGATION_CALL_EXPECTED")
    internal constructor(storage: WasmByteArray)

    /**
     * Returns the array element at the given [index].
     *
     * This method can be called using the index operator:
     * ```
     * value = array[index]
     * ```
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public actual operator fun get(index: Int): Byte {
        rangeCheck(index, storage.len())
        return storage.get(index)
    }

    /**
     * Sets the array element at the given [index] to the given [value].
     *
     * This method can be called using the index operator:
     * ```
     * array[index] = value
     * ```
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public actual operator fun set(index: Int, value: Byte): Unit {
        rangeCheck(index, storage.len())
        storage.set(index, value)
    }

    /**
     * Returns the number of elements in the array.
     */
    public actual val size: Int
        get() = storage.len()

    /** Creates a specialized [ByteIterator] for iterating over the elements of the array. */
    public actual operator fun iterator(): ByteIterator =
        ByteArrayIterator(this)
}

private class ByteArrayIterator constructor(val array: ByteArray) : ByteIterator() {
    private var index = 0
    override fun hasNext() = index < array.size
    override fun nextByte() = if (index < array.size) array[index++] else throw NoSuchElementException("$index")
}

/**
 * An array of chars. When targeting the JVM, instances of this class are represented as `char[]`.
 *
 * See [Kotlin language documentation](https://kotlinlang.org/docs/arrays.html)
 * for more information on arrays.
 */
public actual class CharArray
/**
 * Creates a new array of the specified [size], with all elements initialized to null char (`\u0000').
 * @throws RuntimeException if the specified [size] is negative.
 */
public actual constructor(size: Int) {
    /**
     * Creates a new array of the specified [size], where each element is calculated by calling the specified
     * [init] function.
     *
     * The function [init] is called for each array element sequentially starting from the first one.
     * It should return the value for an array element given its index.
     *
     * @throws RuntimeException if the specified [size] is negative.
     */
    @Suppress("WRONG_MODIFIER_TARGET", "TYPE_PARAMETER_AS_REIFIED")
    public actual inline constructor(size: Int, init: (Int) -> Char) : this(size)

    internal val storage: WasmCharArray

    init {
        if (size < 0) throw IllegalArgumentException("Negative array size")
        storage = WasmCharArray(size)
    }

    @WasmPrimitiveConstructor
    @Suppress("PRIMARY_CONSTRUCTOR_DELEGATION_CALL_EXPECTED")
    internal constructor(storage: WasmCharArray)

    /**
     * Returns the array element at the given [index].
     *
     * This method can be called using the index operator:
     * ```
     * value = array[index]
     * ```
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public actual operator fun get(index: Int): Char {
        rangeCheck(index, storage.len())
        return storage.get(index)
    }

    /**
     * Sets the array element at the given [index] to the given [value].
     *
     * This method can be called using the index operator:
     * ```
     * array[index] = value
     * ```
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public actual operator fun set(index: Int, value: Char): Unit {
        rangeCheck(index, storage.len())
        storage.set(index, value)
    }

    /**
     * Returns the number of elements in the array.
     */
    public actual val size: Int
        get() = storage.len()

    /** Creates a specialized [CharIterator] for iterating over the elements of the array. */
    public actual operator fun iterator(): CharIterator =
        CharArrayIterator(this)
}

private class CharArrayIterator constructor(val array: CharArray) : CharIterator() {
    private var index = 0
    override fun hasNext() = index < array.size
    override fun nextChar() = if (index < array.size) array[index++] else throw NoSuchElementException("$index")
}

/**
 * An array of shorts. When targeting the JVM, instances of this class are represented as `short[]`.
 *
 * See [Kotlin language documentation](https://kotlinlang.org/docs/arrays.html)
 * for more information on arrays.
 */
public actual class ShortArray
/**
 * Creates a new array of the specified [size], with all elements initialized to zero.
 * @throws RuntimeException if the specified [size] is negative.
 */
public actual constructor(size: Int) {
    /**
     * Creates a new array of the specified [size], where each element is calculated by calling the specified
     * [init] function.
     *
     * The function [init] is called for each array element sequentially starting from the first one.
     * It should return the value for an array element given its index.
     *
     * @throws RuntimeException if the specified [size] is negative.
     */
    @Suppress("WRONG_MODIFIER_TARGET", "TYPE_PARAMETER_AS_REIFIED")
    public actual inline constructor(size: Int, init: (Int) -> Short) : this(size)

    internal val storage: WasmShortArray

    init {
        if (size < 0) throw IllegalArgumentException("Negative array size")
        storage = WasmShortArray(size)
    }

    @WasmPrimitiveConstructor
    @Suppress("PRIMARY_CONSTRUCTOR_DELEGATION_CALL_EXPECTED")
    internal constructor(storage: WasmShortArray)

    /**
     * Returns the array element at the given [index].
     *
     * This method can be called using the index operator:
     * ```
     * value = array[index]
     * ```
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public actual operator fun get(index: Int): Short {
        rangeCheck(index, storage.len())
        return storage.get(index)
    }

    /**
     * Sets the array element at the given [index] to the given [value].
     *
     * This method can be called using the index operator:
     * ```
     * array[index] = value
     * ```
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public actual operator fun set(index: Int, value: Short): Unit {
        rangeCheck(index, storage.len())
        storage.set(index, value)
    }

    /**
     * Returns the number of elements in the array.
     */
    public actual val size: Int
        get() = storage.len()

    /** Creates a specialized [ShortIterator] for iterating over the elements of the array. */
    public actual operator fun iterator(): ShortIterator =
        ShortArrayIterator(this)
}

private class ShortArrayIterator constructor(val array: ShortArray) : ShortIterator() {
    private var index = 0
    override fun hasNext() = index < array.size
    override fun nextShort() = if (index < array.size) array[index++] else throw NoSuchElementException("$index")
}

/**
 * An array of ints. When targeting the JVM, instances of this class are represented as `int[]`.
 *
 * See [Kotlin language documentation](https://kotlinlang.org/docs/arrays.html)
 * for more information on arrays.
 */
public actual class IntArray
/**
 * Creates a new array of the specified [size], with all elements initialized to zero.
 * @throws RuntimeException if the specified [size] is negative.
 */
public actual constructor(size: Int) {
    /**
     * Creates a new array of the specified [size], where each element is calculated by calling the specified
     * [init] function.
     *
     * The function [init] is called for each array element sequentially starting from the first one.
     * It should return the value for an array element given its index.
     *
     * @throws RuntimeException if the specified [size] is negative.
     */
    @Suppress("WRONG_MODIFIER_TARGET", "TYPE_PARAMETER_AS_REIFIED")
    public actual inline constructor(size: Int, init: (Int) -> Int) : this(size)

    internal val storage: WasmIntArray

    init {
        if (size < 0) throw IllegalArgumentException("Negative array size")
        storage = WasmIntArray(size)
    }

    @WasmPrimitiveConstructor
    @Suppress("PRIMARY_CONSTRUCTOR_DELEGATION_CALL_EXPECTED")
    internal constructor(storage: WasmIntArray)

    /**
     * Returns the array element at the given [index].
     *
     * This method can be called using the index operator:
     * ```
     * value = array[index]
     * ```
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public actual operator fun get(index: Int): Int {
        rangeCheck(index, storage.len())
        return storage.get(index)
    }

    /**
     * Sets the array element at the given [index] to the given [value].
     *
     * This method can be called using the index operator:
     * ```
     * array[index] = value
     * ```
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public actual operator fun set(index: Int, value: Int): Unit {
        rangeCheck(index, storage.len())
        storage.set(index, value)
    }

    /**
     * Returns the number of elements in the array.
     */
    public actual val size: Int
        get() = storage.len()

    /** Creates a specialized [IntIterator] for iterating over the elements of the array. */
    public actual operator fun iterator(): IntIterator =
        IntArrayIterator(this)
}

private class IntArrayIterator constructor(val array: IntArray) : IntIterator() {
    private var index = 0
    override fun hasNext() = index < array.size
    override fun nextInt() = if (index < array.size) array[index++] else throw NoSuchElementException("$index")
}

/**
 * An array of longs. When targeting the JVM, instances of this class are represented as `long[]`.
 *
 * See [Kotlin language documentation](https://kotlinlang.org/docs/arrays.html)
 * for more information on arrays.
 */
public actual class LongArray
/**
 * Creates a new array of the specified [size], with all elements initialized to zero.
 * @throws RuntimeException if the specified [size] is negative.
 */
public actual constructor(size: Int) {
    /**
     * Creates a new array of the specified [size], where each element is calculated by calling the specified
     * [init] function.
     *
     * The function [init] is called for each array element sequentially starting from the first one.
     * It should return the value for an array element given its index.
     *
     * @throws RuntimeException if the specified [size] is negative.
     */
    @Suppress("WRONG_MODIFIER_TARGET", "TYPE_PARAMETER_AS_REIFIED")
    public actual inline constructor(size: Int, init: (Int) -> Long) : this(size)

    internal val storage: WasmLongArray

    init {
        if (size < 0) throw IllegalArgumentException("Negative array size")
        storage = WasmLongArray(size)
    }

    @WasmPrimitiveConstructor
    @Suppress("PRIMARY_CONSTRUCTOR_DELEGATION_CALL_EXPECTED")
    internal constructor(storage: WasmLongArray)

    /**
     * Returns the array element at the given [index].
     *
     * This method can be called using the index operator:
     * ```
     * value = array[index]
     * ```
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public actual operator fun get(index: Int): Long {
        rangeCheck(index, storage.len())
        return storage.get(index)
    }

    /**
     * Sets the array element at the given [index] to the given [value].
     *
     * This method can be called using the index operator:
     * ```
     * array[index] = value
     * ```
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public actual operator fun set(index: Int, value: Long): Unit {
        rangeCheck(index, storage.len())
        storage.set(index, value)
    }

    /**
     * Returns the number of elements in the array.
     */
    public actual val size: Int
        get() = storage.len()

    /** Creates a specialized [LongIterator] for iterating over the elements of the array. */
    public actual operator fun iterator(): LongIterator =
        LongArrayIterator(this)
}

private class LongArrayIterator constructor(val array: LongArray) : LongIterator() {
    private var index = 0
    override fun hasNext() = index < array.size
    override fun nextLong() = if (index < array.size) array[index++] else throw NoSuchElementException("$index")
}

/**
 * An array of floats. When targeting the JVM, instances of this class are represented as `float[]`.
 *
 * See [Kotlin language documentation](https://kotlinlang.org/docs/arrays.html)
 * for more information on arrays.
 */
public actual class FloatArray
/**
 * Creates a new array of the specified [size], with all elements initialized to zero.
 * @throws RuntimeException if the specified [size] is negative.
 */
public actual constructor(size: Int) {
    /**
     * Creates a new array of the specified [size], where each element is calculated by calling the specified
     * [init] function.
     *
     * The function [init] is called for each array element sequentially starting from the first one.
     * It should return the value for an array element given its index.
     *
     * @throws RuntimeException if the specified [size] is negative.
     */
    @Suppress("WRONG_MODIFIER_TARGET", "TYPE_PARAMETER_AS_REIFIED")
    public actual inline constructor(size: Int, init: (Int) -> Float) : this(size)

    internal val storage: WasmFloatArray

    init {
        if (size < 0) throw IllegalArgumentException("Negative array size")
        storage = WasmFloatArray(size)
    }

    @WasmPrimitiveConstructor
    @Suppress("PRIMARY_CONSTRUCTOR_DELEGATION_CALL_EXPECTED")
    internal constructor(storage: WasmFloatArray)

    /**
     * Returns the array element at the given [index].
     *
     * This method can be called using the index operator:
     * ```
     * value = array[index]
     * ```
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public actual operator fun get(index: Int): Float {
        rangeCheck(index, storage.len())
        return storage.get(index)
    }

    /**
     * Sets the array element at the given [index] to the given [value].
     *
     * This method can be called using the index operator:
     * ```
     * array[index] = value
     * ```
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public actual operator fun set(index: Int, value: Float): Unit {
        rangeCheck(index, storage.len())
        storage.set(index, value)
    }

    /**
     * Returns the number of elements in the array.
     */
    public actual val size: Int
        get() = storage.len()

    /** Creates a specialized [FloatIterator] for iterating over the elements of the array. */
    public actual operator fun iterator(): FloatIterator =
        FloatArrayIterator(this)
}

private class FloatArrayIterator constructor(val array: FloatArray) : FloatIterator() {
    private var index = 0
    override fun hasNext() = index < array.size
    override fun nextFloat() = if (index < array.size) array[index++] else throw NoSuchElementException("$index")
}

/**
 * An array of doubles. When targeting the JVM, instances of this class are represented as `double[]`.
 *
 * See [Kotlin language documentation](https://kotlinlang.org/docs/arrays.html)
 * for more information on arrays.
 */
public actual class DoubleArray
/**
 * Creates a new array of the specified [size], with all elements initialized to zero.
 * @throws RuntimeException if the specified [size] is negative.
 */
public actual constructor(size: Int) {
    /**
     * Creates a new array of the specified [size], where each element is calculated by calling the specified
     * [init] function.
     *
     * The function [init] is called for each array element sequentially starting from the first one.
     * It should return the value for an array element given its index.
     *
     * @throws RuntimeException if the specified [size] is negative.
     */
    @Suppress("WRONG_MODIFIER_TARGET", "TYPE_PARAMETER_AS_REIFIED")
    public actual inline constructor(size: Int, init: (Int) -> Double) : this(size)

    internal val storage: WasmDoubleArray

    init {
        if (size < 0) throw IllegalArgumentException("Negative array size")
        storage = WasmDoubleArray(size)
    }

    @WasmPrimitiveConstructor
    @Suppress("PRIMARY_CONSTRUCTOR_DELEGATION_CALL_EXPECTED")
    internal constructor(storage: WasmDoubleArray)

    /**
     * Returns the array element at the given [index].
     *
     * This method can be called using the index operator:
     * ```
     * value = array[index]
     * ```
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public actual operator fun get(index: Int): Double {
        rangeCheck(index, storage.len())
        return storage.get(index)
    }

    /**
     * Sets the array element at the given [index] to the given [value].
     *
     * This method can be called using the index operator:
     * ```
     * array[index] = value
     * ```
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public actual operator fun set(index: Int, value: Double): Unit {
        rangeCheck(index, storage.len())
        storage.set(index, value)
    }

    /**
     * Returns the number of elements in the array.
     */
    public actual val size: Int
        get() = storage.len()

    /** Creates a specialized [DoubleIterator] for iterating over the elements of the array. */
    public actual operator fun iterator(): DoubleIterator =
        DoubleArrayIterator(this)
}

private class DoubleArrayIterator constructor(val array: DoubleArray) : DoubleIterator() {
    private var index = 0
    override fun hasNext() = index < array.size
    override fun nextDouble() = if (index < array.size) array[index++] else throw NoSuchElementException("$index")
}

/**
 * An array of booleans. When targeting the JVM, instances of this class are represented as `boolean[]`.
 *
 * See [Kotlin language documentation](https://kotlinlang.org/docs/arrays.html)
 * for more information on arrays.
 */
public actual class BooleanArray
/**
 * Creates a new array of the specified [size], with all elements initialized to `false`.
 * @throws RuntimeException if the specified [size] is negative.
 */
public actual constructor(size: Int) {
    /**
     * Creates a new array of the specified [size], where each element is calculated by calling the specified
     * [init] function.
     *
     * The function [init] is called for each array element sequentially starting from the first one.
     * It should return the value for an array element given its index.
     *
     * @throws RuntimeException if the specified [size] is negative.
     */
    @Suppress("WRONG_MODIFIER_TARGET", "TYPE_PARAMETER_AS_REIFIED")
    public actual inline constructor(size: Int, init: (Int) -> Boolean) : this(size)

    internal val storage: WasmByteArray

    init {
        if (size < 0) throw IllegalArgumentException("Negative array size")
        storage = WasmByteArray(size)
    }

    @WasmPrimitiveConstructor
    @Suppress("PRIMARY_CONSTRUCTOR_DELEGATION_CALL_EXPECTED")
    internal constructor(storage: WasmByteArray)

    /**
     * Returns the array element at the given [index].
     *
     * This method can be called using the index operator:
     * ```
     * value = array[index]
     * ```
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public actual operator fun get(index: Int): Boolean {
        rangeCheck(index, storage.len())
        return storage.get(index).reinterpretAsInt().reinterpretAsBoolean()
    }

    /**
     * Sets the array element at the given [index] to the given [value].
     *
     * This method can be called using the index operator:
     * ```
     * array[index] = value
     * ```
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public actual operator fun set(index: Int, value: Boolean): Unit {
        rangeCheck(index, storage.len())
        storage.set(index, value.reinterpretAsByte())
    }

    /**
     * Returns the number of elements in the array.
     */
    public actual val size: Int
        get() = storage.len()

    /** Creates a specialized [BooleanIterator] for iterating over the elements of the array. */
    public actual operator fun iterator(): BooleanIterator =
        BooleanArrayIterator(this)
}

private class BooleanArrayIterator constructor(val array: BooleanArray) : BooleanIterator() {
    private var index = 0
    override fun hasNext() = index < array.size
    override fun nextBoolean() = if (index < array.size) array[index++] else throw NoSuchElementException("$index")
}

@WasmNoOpCast
private fun Boolean.reinterpretAsByte(): Byte =
    implementedAsIntrinsic
