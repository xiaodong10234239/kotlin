// RUN_PIPELINE_TILL: FRONTEND
// DIAGNOSTICS: -UNUSED_VARIABLE -UNUSED_PARAMETER

typealias R<T: <!BOUND_ON_TYPE_ALIAS_PARAMETER_NOT_ALLOWED!>List<<!WRONG_NUMBER_OF_TYPE_ARGUMENTS!>R<!>><!>> = List<T>
