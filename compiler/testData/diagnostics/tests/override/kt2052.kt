// RUN_PIPELINE_TILL: FRONTEND
// FIR_IDENTICAL
interface Runnable {
    fun run()
}

class C {
    fun f() {
        <!ABSTRACT_MEMBER_NOT_IMPLEMENTED!>class MyRunnable<!>(): Runnable {
        }
    }
}