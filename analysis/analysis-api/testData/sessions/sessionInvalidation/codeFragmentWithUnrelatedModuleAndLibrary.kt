// MODULE: sourceModule
// MODULE_KIND: Source
// FILE: sourceModule.kt
fun foo() {
    <caret_context>val x = 0
}

// MODULE: unrelatedLibrary
// MODULE_KIND: LibraryBinary
// WILDCARD_MODIFICATION_EVENT
// FILE: unrelatedLibrary.kt

// MODULE: unrelatedModule(unrelatedLibrary)
// MODULE_KIND: Source
// FILE: unrelatedModule.kt
fun unrelated() {
    val y = 1
}

// MODULE: fragment1.kt
// MODULE_KIND: CodeFragment
// CONTEXT_MODULE: sourceModule

// FILE: fragment1.kt
// CODE_FRAGMENT_KIND: BLOCK
<caret>foo()
