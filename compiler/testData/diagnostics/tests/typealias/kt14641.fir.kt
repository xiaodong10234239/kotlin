// RUN_PIPELINE_TILL: FRONTEND
// DIAGNOSTICS: -UNUSED_VARIABLE -UNUSED_PARAMETER -TOPLEVEL_TYPEALIASES_ONLY

class A {
    public inner class B { }
    public <!WRONG_MODIFIER_TARGET!>inner<!> typealias BAlias = B
}

fun f() {
    val a = A()
    a.<!UNRESOLVED_REFERENCE!>BAlias<!>
}
