// RUN_PIPELINE_TILL: FRONTEND
// LANGUAGE: +AllowContractsForCustomFunctions +UseCallsInPlaceEffect
// OPT_IN: kotlin.contracts.ExperimentalContracts
// DIAGNOSTICS: -INVISIBLE_REFERENCE -INVISIBLE_MEMBER

import kotlin.contracts.*

inline fun <T> myRun(block: () -> T): T {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return block()
}

fun exitOnlyThroughLocalReturns(b: Boolean) {
    var x: Int
    var s: String

    myRun {
        if (b) {
            x = 42
            return@myRun
        }

        if (!b) {
            s = "hello"
            x = 42
            return@myRun
        }
        else {
            s = "world"
            x = 239
        }
    }

    x.inc()
    <!UNINITIALIZED_VARIABLE!>s<!>.length
}

fun exitOnlyThroughNonLocalReturns(b: Boolean?) {
    var x: Int
    var s: String
    myRun {
        if (b == null) {
            x = 42
            return
        }

        if (b.not()) {
            x = 54
        }

        if (<!UNINITIALIZED_VARIABLE!>x<!> == 42) {
            return
        }
        else {
            x = 42
            s = "hello"
            return
        }
    }

    <!UNINITIALIZED_VARIABLE!>x<!>.inc()
    <!UNINITIALIZED_VARIABLE!>s<!>.length
}

fun nonLocalReturnAndOrdinaryExit(b: Boolean) {
    var x: Int
    var s: String
    myRun {
        if (b) {
            x = 42
            return
        }
        x = 54
        s = "hello"
    }
    x.inc()
    s.length
}
