// ES_MODULES
// SPLIT_PER_FILE
// MODULE: lib1
// FILE: lib1.kt

fun foo() = "OK"

// MODULE: lib2(lib1)
// FILE: lib2.kt

inline fun bar() = foo()

// MODULE: main(lib1, lib2)
// FILE: main.kt

fun box() = bar()
