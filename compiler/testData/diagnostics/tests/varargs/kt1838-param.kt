// RUN_PIPELINE_TILL: BACKEND
// FIR_IDENTICAL
class A(vararg t : Int) {
    init {
        val t1 : IntArray = t
    }
}
