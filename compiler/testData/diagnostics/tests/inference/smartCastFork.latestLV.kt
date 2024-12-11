// RUN_PIPELINE_TILL: FRONTEND
// SKIP_TXT
// LATEST_LV_DIFFERENCE
// DIAGNOSTICS: -UNUSED_VARIABLE

interface A<E> {
    fun foo(): E
}

interface B : A<Int>
interface C : A<Long>

fun <T> bar(a: A<T>, w: T) {
    baz(a, w) // OK in FE1.0

    if (a is B) {
        baz(a, 1) // OK in FE1.0
        baz(a, w) // Type mismatch: Required Int, but found E
        baz(a, <!ARGUMENT_TYPE_MISMATCH!>""<!>)
    }

    if (a is B || a is C) {
        baz(a, w) // OK in FE 1.0 (Smart cast doesn't work), fail at FIR: it infers F to `LBU(Int, Long)` and then `w` is considered inapplicable
    }
}

fun <F> baz(a: A<F>, f: F) {}
