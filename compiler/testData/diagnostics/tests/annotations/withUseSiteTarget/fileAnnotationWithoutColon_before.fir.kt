// RUN_PIPELINE_TILL: FRONTEND
// LANGUAGE: -RestrictionOfWrongAnnotationsWithUseSiteTargetsOnTypes
// DIAGNOSTICS: -UNUSED_PARAMETER

fun test1(<!WRONG_ANNOTATION_TARGET_WITH_USE_SITE_TARGET!>@<!INAPPLICABLE_FILE_TARGET!>file<!><!SYNTAX!><!> Suppress("")<!> x: Int) {}

<!WRONG_ANNOTATION_TARGET_WITH_USE_SITE_TARGET!>@<!INAPPLICABLE_FILE_TARGET!>file<!> <!SYNTAX!>@<!>Suppress("")<!>
fun test2() {}

class OnType(x: <!WRONG_ANNOTATION_TARGET_WITH_USE_SITE_TARGET!>@file<!SYNTAX!><!> Suppress("")<!> Int)

fun <!WRONG_ANNOTATION_TARGET_WITH_USE_SITE_TARGET!>@file : Suppress("")<!> Int.test3() {}
