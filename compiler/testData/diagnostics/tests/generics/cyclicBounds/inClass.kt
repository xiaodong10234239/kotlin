// RUN_PIPELINE_TILL: FRONTEND
// FIR_IDENTICAL
class A1<T : <!CYCLIC_GENERIC_UPPER_BOUND!>F?<!>, F : <!CYCLIC_GENERIC_UPPER_BOUND!>T?<!>>

class A2<T : F?, F : <!CYCLIC_GENERIC_UPPER_BOUND!>E<!>, E : <!CYCLIC_GENERIC_UPPER_BOUND!>F?<!>>

class A3<T, F> where T : <!CYCLIC_GENERIC_UPPER_BOUND!>F?<!>, F : <!CYCLIC_GENERIC_UPPER_BOUND!>T?<!>

class A4<T, F, E> where T : F?, F : <!CYCLIC_GENERIC_UPPER_BOUND!>E<!>, E : <!CYCLIC_GENERIC_UPPER_BOUND!>F<!>