// RUN_PIPELINE_TILL: FRONTEND
// FIR_IDENTICAL
class Outer {
    class Nested
    inner class Inner
}

fun test() {
    Outer()::Inner
    Outer()::<!UNRESOLVED_REFERENCE!>Nested<!>
}
