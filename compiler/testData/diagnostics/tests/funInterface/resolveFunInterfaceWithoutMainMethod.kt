// RUN_PIPELINE_TILL: FRONTEND
<!FUN_INTERFACE_WRONG_COUNT_OF_ABSTRACT_MEMBERS!>fun<!> interface IsolatedFunFace {
}

typealias FunAlias = IsolatedFunFace

fun referIsolatedFunFace(iff: IsolatedFunFace) {}

fun callIsolatedFunFace() {
    referIsolatedFunFace(<!RESOLUTION_TO_CLASSIFIER!>IsolatedFunFace<!> {})
    referIsolatedFunFace(<!RESOLUTION_TO_CLASSIFIER!>FunAlias<!> {})
    referIsolatedFunFace(<!TYPE_MISMATCH!>{}<!>)
}
