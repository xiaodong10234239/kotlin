// RUN_PIPELINE_TILL: FRONTEND
// DIAGNOSTICS: -UNUSED_VARIABLE
// FULL_JDK

import java.util.*
import java.util.concurrent.*

fun bar(): String? = null
val nullableInt: Int? = null

fun hashMapTest() {
    var x: HashMap<String, Int> = HashMap<String, Int>()
    x.put(<!NULL_FOR_NONNULL_TYPE!>null<!>, <!NULL_FOR_NONNULL_TYPE!>null<!>)
    x.put("", <!NULL_FOR_NONNULL_TYPE!>null<!>)
    x.put(<!ARGUMENT_TYPE_MISMATCH!>bar()<!>, 1)
    x.put("", 1)

    x[<!NULL_FOR_NONNULL_TYPE!>null<!>] = 1
    x[<!ARGUMENT_TYPE_MISMATCH!>bar()<!>] = 1
    x[""] = <!ARGUMENT_TYPE_MISMATCH!>nullableInt<!>
    x[""] = 1

    val b1: MutableMap<String, Int?> = <!INITIALIZER_TYPE_MISMATCH!>x<!>
    val b2: MutableMap<String, Int> = x
    val b3: Map<String?, Int> = <!INITIALIZER_TYPE_MISMATCH!>x<!>
    val b4: Map<String?, Int?> = <!INITIALIZER_TYPE_MISMATCH!>x<!>
    val b5: Map<String, Int?> = x

    val b6: Int = <!INITIALIZER_TYPE_MISMATCH, TYPE_MISMATCH!>x[""]<!>
    val b7: Int = <!INITIALIZER_TYPE_MISMATCH, TYPE_MISMATCH!>x.get("")<!>

    val b8: Int? = x.get("")
}

fun treeMapTest() {
    var x: TreeMap<String, Int> = TreeMap<String, Int>()
    x.put(<!NULL_FOR_NONNULL_TYPE!>null<!>, <!NULL_FOR_NONNULL_TYPE!>null<!>)
    x.put("", <!NULL_FOR_NONNULL_TYPE!>null<!>)
    x.put(<!ARGUMENT_TYPE_MISMATCH!>bar()<!>, 1)
    x.put("", 1)

    x[<!NULL_FOR_NONNULL_TYPE!>null<!>] = 1
    x[<!ARGUMENT_TYPE_MISMATCH!>bar()<!>] = 1
    x[""] = <!ARGUMENT_TYPE_MISMATCH!>nullableInt<!>
    x[""] = 1

    val b1: MutableMap<String, Int?> = <!INITIALIZER_TYPE_MISMATCH!>x<!>
    val b2: MutableMap<String, Int> = x
    val b3: Map<String?, Int> = <!INITIALIZER_TYPE_MISMATCH!>x<!>
    val b4: Map<String?, Int?> = <!INITIALIZER_TYPE_MISMATCH!>x<!>
    val b5: Map<String, Int?> = x

    val b6: Int = <!INITIALIZER_TYPE_MISMATCH, TYPE_MISMATCH!>x[""]<!>
    val b7: Int = <!INITIALIZER_TYPE_MISMATCH, TYPE_MISMATCH!>x.get("")<!>

    val b8: Int? = x.get("")
}

fun concurrentHashMapTest() {
    var x: ConcurrentHashMap<String, Int> = ConcurrentHashMap<String, Int>()
    x.put(<!NULL_FOR_NONNULL_TYPE!>null<!>, <!NULL_FOR_NONNULL_TYPE!>null<!>)
    x.put("", <!NULL_FOR_NONNULL_TYPE!>null<!>)
    x.put(<!ARGUMENT_TYPE_MISMATCH!>bar()<!>, 1)
    x.put("", 1)

    x[<!NULL_FOR_NONNULL_TYPE!>null<!>] = 1
    x[<!ARGUMENT_TYPE_MISMATCH!>bar()<!>] = 1
    x[""] = <!ARGUMENT_TYPE_MISMATCH!>nullableInt<!>
    x[""] = 1

    val b1: MutableMap<String, Int?> = <!INITIALIZER_TYPE_MISMATCH!>x<!>
    val b2: MutableMap<String, Int> = x
    val b3: Map<String?, Int> = <!INITIALIZER_TYPE_MISMATCH!>x<!>
    val b4: Map<String?, Int?> = <!INITIALIZER_TYPE_MISMATCH!>x<!>
    val b5: Map<String, Int?> = x

    val b6: Int = <!INITIALIZER_TYPE_MISMATCH, TYPE_MISMATCH!>x[""]<!>
    val b7: Int = <!INITIALIZER_TYPE_MISMATCH, TYPE_MISMATCH!>x.get("")<!>

    val b8: Int? = x.get("")
}
