// RUN_PIPELINE_TILL: FRONTEND
// DIAGNOSTICS: -UNUSED_EXPRESSION -UNUSED_PARAMETER -UNUSED_VARIABLE -UNREACHABLE_CODE

class A {
    class B {
        class C
    }
}

fun test(a: A.<!SYNTAX!><!>): A.<!SYNTAX!><!> {
    val aa: A. <!SYNTAX!>=<!><!SYNTAX!><!> null!!
}

fun test1(a: A.B.<!SYNTAX!><!>): A.B.<!SYNTAX!><!> {
    val aa: A.B. <!SYNTAX!>=<!><!SYNTAX!><!> null!!
}

fun test2(a: A.<!UNRESOLVED_REFERENCE!>e<!>.<!DEBUG_INFO_MISSING_UNRESOLVED!>C<!>): A.<!UNRESOLVED_REFERENCE!>e<!>.<!DEBUG_INFO_MISSING_UNRESOLVED!>C<!> {
    val aa: A.<!UNRESOLVED_REFERENCE!>e<!>.<!DEBUG_INFO_MISSING_UNRESOLVED!>C<!> = null!!
<!NO_RETURN_IN_FUNCTION_WITH_BLOCK_BODY!>}<!>

fun test3(a: <!UNRESOLVED_REFERENCE!>a<!>.<!DEBUG_INFO_MISSING_UNRESOLVED!>A<!>.<!DEBUG_INFO_MISSING_UNRESOLVED!>C<!>): <!UNRESOLVED_REFERENCE!>a<!>.<!DEBUG_INFO_MISSING_UNRESOLVED!>A<!>.<!DEBUG_INFO_MISSING_UNRESOLVED!>C<!> {
    val aa: <!UNRESOLVED_REFERENCE!>a<!>.<!DEBUG_INFO_MISSING_UNRESOLVED!>A<!>.<!DEBUG_INFO_MISSING_UNRESOLVED!>C<!> = null!!
<!NO_RETURN_IN_FUNCTION_WITH_BLOCK_BODY!>}<!>

fun test4(a: A.B.<!UNRESOLVED_REFERENCE!>ee<!>): A.B.<!UNRESOLVED_REFERENCE!>ee<!> {
    val aa: A.B.<!UNRESOLVED_REFERENCE!>ee<!> = null!!
<!NO_RETURN_IN_FUNCTION_WITH_BLOCK_BODY!>}<!>

fun test5(a: A.<!UNRESOLVED_REFERENCE!>ee<!>): A.<!UNRESOLVED_REFERENCE!>ee<!> {
    val aa: A.<!UNRESOLVED_REFERENCE!>ee<!> = null!!
<!NO_RETURN_IN_FUNCTION_WITH_BLOCK_BODY!>}<!>
