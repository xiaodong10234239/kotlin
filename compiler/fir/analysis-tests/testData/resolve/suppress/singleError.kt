// RUN_PIPELINE_TILL: BACKEND
fun foo(x: String) {}

@Suppress(<!ERROR_SUPPRESSION!>"ARGUMENT_TYPE_MISMATCH"<!>)
fun bar() {
    foo(10)
}
