// RUN_PIPELINE_TILL: FRONTEND
// FIR_IDENTICAL
// DIAGNOSTICS: -UNUSED_PARAMETER
// CHECK_TYPE
interface A<T : A<T?>?> {
    fun foo(): T?
}
fun testA(a: A<*>) {
    a.foo() checkType { _<A<*>?>() }
}
