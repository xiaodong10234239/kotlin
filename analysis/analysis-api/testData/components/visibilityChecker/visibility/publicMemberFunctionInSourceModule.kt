// MODULE: dependency
// MODULE_KIND: Source
// FILE: Foo.kt
class Foo {
    fun bar() { }
}

// MODULE: main(dependency)
// FILE: main.kt
fun foo() {
    p<caret>rintln()
}

// callable: /Foo.bar
