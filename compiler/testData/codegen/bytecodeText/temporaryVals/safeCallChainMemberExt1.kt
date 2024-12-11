class A
class B
class C

object Host {
    val A.b: B get() = B()
    val B.c: C get() = C()
    val C.s: String get() = "s"

    fun test(an: A?) = an?.b?.c?.s
}

// 0 ASTORE
// 1 ACONST_NULL
// 3 IFNULL
// 0 IFNONNULL
