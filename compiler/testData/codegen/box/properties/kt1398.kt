// WITH_STDLIB

open class Base(val bar: String)

class Foo(bar: String) : Base(bar) {
  fun something() = bar.uppercase()
}

fun box() = Foo("ok").something()
