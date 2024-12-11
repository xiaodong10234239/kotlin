// RUN_PIPELINE_TILL: BACKEND
// FIR_IDENTICAL
// DIAGNOSTICS: -UNUSED_PARAMETER
// ALLOW_KOTLIN_PACKAGE

// FILE: annotation.kt

package kotlin

annotation class BuilderInference

// FILE: test.kt

class GenericController<T> {
    suspend fun yield(t: T) {}
}

suspend fun <S> GenericController<S>.extensionYield(s: S) {}

suspend fun <S> GenericController<S>.safeExtensionYield(s: S) {}

fun <S> generate(g: suspend GenericController<S>.() -> Unit): List<S> = TODO()

val normal = generate {
    yield(42)
}

val extension = generate {
    extensionYield("foo")
}

val safeExtension = generate {
    safeExtensionYield("foo")
}
