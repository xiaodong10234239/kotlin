// RUN_PIPELINE_TILL: FRONTEND
// DIAGNOSTICS: -UNUSED_PARAMETER -UNUSED_VARIABLE
// LANGUAGE: -JavaTypeParameterDefaultRepresentationWithDNN

interface Foo

fun test() {
    var nullable: Foo? = null
    val foo: Collection<Foo> = <!INITIALIZER_TYPE_MISMATCH!>java.util.Collections.singleton(nullable)<!>
    val foo1: Collection<Foo> = java.util.Collections.singleton(nullable!!)
}
