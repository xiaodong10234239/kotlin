package test

typealias Alias = Unknown

val l<caret_type1>ist: List<String> = emptyList()

val u<caret_type2>nknown: Alias = error("")

// ARE_EQUAL: false
// ARE_EQUAL_LENIENT: true
// IS_SUBTYPE: false
// IS_SUBTYPE_LENIENT: true

// SUPERCLASS_ID: test/Alias
// IS_CLASS_SUBTYPE: false
// IS_CLASS_SUBTYPE_LENIENT: true
