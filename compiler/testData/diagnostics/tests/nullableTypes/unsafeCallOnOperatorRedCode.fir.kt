// RUN_PIPELINE_TILL: FRONTEND
fun add(a: Int?, b: Int?): Int {
    return a+<!SYNTAX!><!>
}
