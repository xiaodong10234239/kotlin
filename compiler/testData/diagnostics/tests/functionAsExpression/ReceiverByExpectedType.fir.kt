// RUN_PIPELINE_TILL: FRONTEND
fun foo(f: String.() -> Int) {}
val test = foo(<!ARGUMENT_TYPE_MISMATCH!>fun () = <!UNRESOLVED_REFERENCE!>length<!><!>)
