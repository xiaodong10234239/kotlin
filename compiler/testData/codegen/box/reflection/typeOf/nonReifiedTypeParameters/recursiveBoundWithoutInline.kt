// TODO: it should target all backends, but now it's possible to have only one .fail file per test file,
//  so we can't define different messages for different test suites/runners.
// TARGET_BACKEND: JS_IR
// KJS_WITH_FULL_RUNTIME

import kotlin.reflect.typeOf

fun <T : Comparable<T>> foo() {
    typeOf<List<T>>()
}

fun box(): String {
    foo<Int>()
    return "OK"
}
