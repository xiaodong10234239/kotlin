// RUN_PIPELINE_TILL: BACKEND
// DIAGNOSTICS: -CONTEXT_RECEIVERS_DEPRECATED
// FIR_IDENTICAL
// LANGUAGE: +ContextReceivers

class A {
    val x = 1
}

context(A) class B {
    val prop = x + this@A.x

    fun f() = x + this@A.x
}
