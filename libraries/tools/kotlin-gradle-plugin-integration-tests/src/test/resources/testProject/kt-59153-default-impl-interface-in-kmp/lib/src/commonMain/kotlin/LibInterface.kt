interface LibInterface {
    fun test(f: () -> String) = "foo".run { f() }
}
