// RUN_PIPELINE_TILL: FRONTEND
package test

interface A {
    private val a: String
      get() = "AAAA!"
}

open class C {
    private val a: String = ""
}

class Subject : C(), A {
    val c = <!NONE_APPLICABLE!>a<!>
}
