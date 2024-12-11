/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

@file:Suppress("NEWER_VERSION_IN_SINCE_KOTLIN")
package kotlin.concurrent

/**
 * An [Int] value that may be updated atomically.
 *
 * Instances of [AtomicInt] are represented by [java.util.concurrent.atomic.AtomicInteger] and provide the the same atomicity guarantees.
 */
@SinceKotlin("2.2")
public actual class AtomicInt(value: Int) {
    /**
     * Atomically gets the value of the atomic.
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicInteger.get].
     */
    public actual fun load(): Int

    /**
     * Atomically sets the value of the atomic to the [new value][newValue].
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicInteger.set].
     */
    public actual fun store(newValue: Int)

    /**
     * Atomically sets the value to the given [new value][newValue] and returns the old value.
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicInteger.getAndSet].
     */
    public actual fun exchange(newValue: Int): Int

    /**
     * Atomically sets the value to the given [new value][newValue] if the current value equals the [expected value][expectedValue],
     * returns true if the operation was successful and false only if the current value was not equal to the expected value.
     *
     * Comparison of values is done by value.
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicInteger.compareAndSet].
     */
    public actual fun compareAndSet(expectedValue: Int, newValue: Int): Boolean

    /**
     * Atomically sets the value to the given [new value][newValue] if the current value equals the [expected value][expectedValue]
     * and returns the old value in any case.
     *
     * Comparison of values is done by value.
     *
     * In order to maintain compatibility with Java 8, [compareAndExchange] is implemented using [java.util.concurrent.atomic.AtomicInteger.compareAndSet],
     * since [java.util.concurrent.atomic.AtomicInteger.compareAndExchange] method is only available starting from Java 9.
     *
     * In the future releases it's planned to delegate the implementation of [compareAndExchange] to [java.util.concurrent.atomic.AtomicInteger.compareAndExchange]
     * for users running JDK 9 or higher.
     */
    public actual fun compareAndExchange(expectedValue: Int, newValue: Int): Int

    /**
     * Atomically adds the [given value][delta] to the current value and returns the old value.
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicInteger.getAndAdd].
     */
    public actual fun fetchAndAdd(delta: Int): Int

    /**
     * Atomically adds the [given value][delta] to the current value and returns the new value.
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicInteger.addAndGet].
     */
    public actual fun addAndFetch(delta: Int): Int

    /**
     * Returns the string representation of the underlying [Int] value.
     *
     * This operation does not provide any atomicity guarantees.
     */
    public actual override fun toString(): String
}

/**
 * A [Long] value that may be updated atomically.
 *
 * Instances of [AtomicLong] are represented by [java.util.concurrent.atomic.AtomicLong] and provide the the same atomicity guarantees.
 */
@SinceKotlin("2.2")
public actual class AtomicLong(value: Long) {
    /**
     * Atomically gets the value of the atomic.
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicLong.get].
     */
    public actual fun load(): Long

    /**
     * Atomically sets the value of the atomic to the [new value][newValue].
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicLong.set].
     */
    public actual fun store(newValue: Long)

    /**
     * Atomically sets the value to the given [new value][newValue] and returns the old value.
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicLong.getAndSet].
     */
    public actual fun exchange(newValue: Long): Long

    /**
     * Atomically sets the value to the given [new value][newValue] if the current value equals the [expected value][expectedValue],
     * returns true if the operation was successful and false only if the current value was not equal to the expected value.
     *
     * Comparison of values is done by value.
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicLong.compareAndSet].
     */
    public actual fun compareAndSet(expectedValue: Long, newValue: Long): Boolean

    /**
     * Atomically sets the value to the given [new value][newValue] if the current value equals the [expected value][expectedValue]
     * and returns the old value in any case.
     *
     * Comparison of values is done by value.
     *
     * In order to maintain compatibility with Java 8, [compareAndExchange] is implemented using [java.util.concurrent.atomic.AtomicLong.compareAndSet],
     * since [java.util.concurrent.atomic.AtomicLong.compareAndExchange] method is only available starting from Java 9.
     *
     * In the future releases it's planned to delegate the implementation of [compareAndExchange] to [java.util.concurrent.atomic.AtomicLong.compareAndExchange]
     * for users running JDK 9 or higher.
     */
    public actual fun compareAndExchange(expectedValue: Long, newValue: Long): Long

    /**
     * Atomically adds the [given value][delta] to the current value and returns the old value.
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicLong.getAndAdd].
     */
    public actual fun fetchAndAdd(delta: Long): Long

    /**
     * Atomically adds the [given value][delta] to the current value and returns the new value.
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicLong.addAndGet].
     */
    public actual fun addAndFetch(delta: Long): Long

    /**
     * Returns the string representation of the underlying [Long] value.
     *
     * This operation does not provide any atomicity guarantees.
     */
    public actual override fun toString(): String
}

/**
 * A [Boolean] value that may be updated atomically.
 *
 * Instances of [AtomicBoolean] are represented by [java.util.concurrent.atomic.AtomicBoolean] and provide the the same atomicity guarantees.
 */
@SinceKotlin("2.2")
public actual class AtomicBoolean (value: Boolean) {
    /**
     * Atomically gets the value of the atomic.
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicBoolean.get].
     */
    public actual fun load(): Boolean

    /**
     * Atomically sets the value of the atomic to the [new value][newValue].
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicBoolean.set].
     */
    public actual fun store(newValue: Boolean)

    /**
     * Atomically sets the value to the given [new value][newValue] and returns the old value.
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicBoolean.getAndSet].
     */
    public actual fun exchange(newValue: Boolean): Boolean

    /**
     * Atomically sets the value to the given [new value][newValue] if the current value equals the [expected value][expectedValue],
     * returns true if the operation was successful and false only if the current value was not equal to the expected value.
     *
     * Comparison of values is done by value.
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicBoolean.compareAndSet].
     */
    public actual fun compareAndSet(expectedValue: Boolean, newValue: Boolean): Boolean

    /**
     * Atomically sets the value to the given [new value][newValue] if the current value equals the [expected value][expectedValue]
     * and returns the old value in any case.
     *
     * Comparison of values is done by value.
     *
     * In order to maintain compatibility with Java 8, [compareAndExchange] is implemented using [java.util.concurrent.atomic.AtomicBoolean.compareAndSet],
     * since [java.util.concurrent.atomic.AtomicBoolean.compareAndExchange] method is only available starting from Java 9.
     *
     * In the future releases it's planned to delegate the implementation of [compareAndExchange] to [java.util.concurrent.atomic.AtomicBoolean.compareAndExchange]
     * for users running JDK 9 or higher.
     */
    public actual fun compareAndExchange(expectedValue: Boolean, newValue: Boolean): Boolean

    /**
     * Returns the string representation of the underlying [Boolean] value.
     *
     * This operation does not provide any atomicity guarantees.
     */
    public actual override fun toString(): String
}

/**
 * An object reference that may be updated atomically.
 *
 * Instances of [AtomicReference] are represented by [java.util.concurrent.atomic.AtomicReference] and provide the the same atomicity guarantees.
 */
@SinceKotlin("2.2")
public actual class AtomicReference<T> (value: T) {
    /**
     * Atomically gets the value of the atomic.
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicReference.get].
     */
    public actual fun load(): T

    /**
     * Atomically sets the value of the atomic to the [new value][newValue].
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicReference.set].
     */
    public actual fun store(newValue: T)

    /**
     * Atomically sets the value to the given [new value][newValue] and returns the old value.
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicReference.getAndSet].
     */
    public actual fun exchange(newValue: T): T

    /**
     * Atomically sets the value to the given [new value][newValue] if the current value equals the [expected value][expectedValue],
     * returns true if the operation was successful and false only if the current value was not equal to the expected value.
     *
     * Comparison of values is done by value.
     *
     * Has the same memory effects as [java.util.concurrent.atomic.AtomicReference.compareAndSet].
     */
    public actual fun compareAndSet(expectedValue: T, newValue: T): Boolean

    /**
     * Atomically sets the value to the given [new value][newValue] if the current value equals the [expected value][expectedValue]
     * and returns the old value in any case.
     *
     * Comparison of values is done by value.
     *
     * In order to maintain compatibility with Java 8, [compareAndExchange] is implemented using [java.util.concurrent.atomic.AtomicReference.compareAndSet],
     * since [java.util.concurrent.atomic.AtomicReference.compareAndExchange] method is only available starting from Java 9.
     *
     * In the future releases it's planned to delegate the implementation of [compareAndExchange] to [java.util.concurrent.atomic.AtomicReference.compareAndExchange]
     * for users running JDK 9 or higher.
     */
    public actual fun compareAndExchange(expectedValue: T, newValue: T): T

    /**
     * Returns the string representation of the underlying object.
     *
     * This operation does not provide any atomicity guarantees.
     */
    public actual override fun toString(): String
}