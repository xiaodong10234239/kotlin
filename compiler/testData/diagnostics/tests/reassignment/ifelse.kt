// RUN_PIPELINE_TILL: FRONTEND
// FIR_IDENTICAL
// DIAGNOSTICS: -UNUSED_VALUE

fun foo(f: Boolean): Int {
    val i: Int
    if (f) {
        i = 1
    }
    else {
        i = 2
    }
    <!VAL_REASSIGNMENT!>i<!> = 3
    return i
}