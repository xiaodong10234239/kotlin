// RUN_PIPELINE_TILL: FRONTEND
// DIAGNOSTICS: -CONTEXT_RECEIVERS_DEPRECATED, -CONTEXT_CLASS_OR_CONSTRUCTOR
// LANGUAGE: +ContextReceivers

interface Context {
    fun h() {}
}

open class A {
    open fun f() {}
}

class B : A() {
    override fun f() {}

    context(Context)
    inner class C {
        fun g() {
            super@B.f()
            super<!UNRESOLVED_LABEL!>@Context<!>.h()
        }
    }
}