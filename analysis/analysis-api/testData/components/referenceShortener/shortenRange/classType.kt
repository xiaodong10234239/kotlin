// FILE: main.kt
package a.b.c

class Outer {
    class Inner {
        companion object {
        }
    }
}

fun foo(): Class<*> {
    return <expr>a.b.c.Outer.Inner::class.java</expr>
}