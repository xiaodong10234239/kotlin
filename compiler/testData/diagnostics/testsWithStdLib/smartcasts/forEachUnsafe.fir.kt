// RUN_PIPELINE_TILL: FRONTEND
// KT-7186: False "Type mismatch" error

fun indexOfMax(a: IntArray): Int? {
    var maxI: Int? = 0
    a.forEachIndexed { i, value ->
        if (value >= a[<!ARGUMENT_TYPE_MISMATCH!>maxI<!>]) {
            maxI = i
        }
        else if (value < 0) {
            maxI = null
        }
    }
    return maxI
}
