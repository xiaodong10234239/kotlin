// RUN_PIPELINE_TILL: FRONTEND
// LANGUAGE: -ProhibitNonExhaustiveIfInRhsOfElvis
// DIAGNOSTICS: -USELESS_ELVIS
// ISSUE: KT-44705

fun test_1(x: String?, y: String?) {
    while (true) {
        x ?: <!INVALID_IF_AS_EXPRESSION_WARNING!>if<!> (y == null) break
    }
}

fun test_2(x: String?, y: String?) {
    while (true) {
        val z = x ?: <!INVALID_IF_AS_EXPRESSION!>if<!> (y == null) break
    }
}

fun test_3(x: String?, y: String?) {
    while (true) {
        x ?: <!NO_ELSE_IN_WHEN_WARNING!>when<!> { true -> break }
        x ?: <!NO_ELSE_IN_WHEN_WARNING!>when<!> (y) { "hello" -> break }
    }
}

fun test_4(x: String?, y: String?) {
    while (true) {
        val a = x ?: <!NO_ELSE_IN_WHEN!>when<!> { true -> break }
        val b = x ?: <!NO_ELSE_IN_WHEN!>when<!> (y) { "hello" -> break }
    }
}
