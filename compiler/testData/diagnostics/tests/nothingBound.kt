// RUN_PIPELINE_TILL: FRONTEND
// ISSUE: KT-70352

fun <<!CONFLICTING_UPPER_BOUNDS!>T<!>: <!FINAL_UPPER_BOUND!>Nothing<!>> f() {}
