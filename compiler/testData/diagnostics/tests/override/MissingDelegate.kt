// RUN_PIPELINE_TILL: FRONTEND
class C : <!DELEGATION_NOT_TO_INTERFACE, UNRESOLVED_REFERENCE!>Base1<!> by <!UNRESOLVED_REFERENCE!>Base2<!>(1) {
  fun test() { }
}