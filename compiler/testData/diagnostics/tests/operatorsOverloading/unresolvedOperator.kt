// RUN_PIPELINE_TILL: FRONTEND
// RENDER_DIAGNOSTICS_FULL_TEXT

fun test() {
    var a = ""

    a<!UNRESOLVED_REFERENCE!>++<!>
    a<!UNRESOLVED_REFERENCE!>--<!>
    <!UNRESOLVED_REFERENCE!>+<!>a
    <!UNRESOLVED_REFERENCE!>-<!>a
    <!UNRESOLVED_REFERENCE!>!<!>a
    a <!UNRESOLVED_REFERENCE!>*<!> a
    true <!UNRESOLVED_REFERENCE_WRONG_RECEIVER!>+<!> false
    a <!UNRESOLVED_REFERENCE!>-<!> a
    a <!UNRESOLVED_REFERENCE!>/<!> a
    a <!UNRESOLVED_REFERENCE!>%<!> a
    a <!UNRESOLVED_REFERENCE!>..<!> a
    a <!UNRESOLVED_REFERENCE!>..<<!> a
}
