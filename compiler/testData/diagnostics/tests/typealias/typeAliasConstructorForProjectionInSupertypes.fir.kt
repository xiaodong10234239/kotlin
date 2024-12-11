// RUN_PIPELINE_TILL: FRONTEND
// LATEST_LV_DIFFERENCE
// ISSUE: KT-60305

open class C<T>

typealias CStar = C<*>
typealias CIn = C<in Int>
typealias COut = C<out Int>
typealias CT<T> = C<T>

class Test1 : <!CONSTRUCTOR_OR_SUPERTYPE_ON_TYPEALIAS_WITH_TYPE_PROJECTION_WARNING!>CStar<!>()
class Test2 : <!CONSTRUCTOR_OR_SUPERTYPE_ON_TYPEALIAS_WITH_TYPE_PROJECTION_WARNING!>CIn<!>()
class Test3 : <!CONSTRUCTOR_OR_SUPERTYPE_ON_TYPEALIAS_WITH_TYPE_PROJECTION_WARNING!>COut<!>()

class Test4 : <!CONSTRUCTOR_OR_SUPERTYPE_ON_TYPEALIAS_WITH_TYPE_PROJECTION_WARNING!>CStar<!> {
    constructor() : super()
}

class Test5 : CT<<!PROJECTION_IN_IMMEDIATE_ARGUMENT_TO_SUPERTYPE!>*<!>>()
