// RUN_PIPELINE_TILL: FRONTEND
// DIAGNOSTICS: -UNUSED_PARAMETER -UNUSED_VARIABLE
// NI_EXPECTED_FILE

interface A
fun <T: A, R: T> emptyStrangeMap(): Map<T, R> = TODO()
fun test7() : Map<A, A> = emptyStrangeMap()

fun test() = <!CANNOT_INFER_PARAMETER_TYPE, CANNOT_INFER_PARAMETER_TYPE, NEW_INFERENCE_NO_INFORMATION_FOR_PARAMETER, NEW_INFERENCE_NO_INFORMATION_FOR_PARAMETER!>emptyStrangeMap<!>()
