// RUN_PIPELINE_TILL: FRONTEND
// FIR_IDENTICAL
interface A
interface Foo {
    operator fun A.invoke()
}

fun test(a: A, foo: Foo) {
    a.<!UNRESOLVED_REFERENCE!>foo<!>()
}

fun test(a: Int, foo: Int.()->Unit) {
    a.foo()
}
