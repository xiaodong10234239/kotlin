// RUN_PIPELINE_TILL: FRONTEND
// FILE: a.kt
package a
class <!PACKAGE_OR_CLASSIFIER_REDECLARATION!>b<!> {}
// FILE: b.kt
package a.<!PACKAGE_OR_CLASSIFIER_REDECLARATION!>b<!>
// FILE: c.kt
package a.<!PACKAGE_OR_CLASSIFIER_REDECLARATION!>b<!>
