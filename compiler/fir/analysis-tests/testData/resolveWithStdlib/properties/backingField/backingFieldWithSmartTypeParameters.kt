// RUN_PIPELINE_TILL: BACKEND
val items: List<String>
    field = mutableListOf()

fun test() {
    items.add("one more item")
}
