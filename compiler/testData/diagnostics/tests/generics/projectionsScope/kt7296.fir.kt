// RUN_PIPELINE_TILL: FRONTEND
// DIAGNOSTICS: -UNUSED_VARIABLE
// CHECK_TYPE
import java.util.ArrayList

class ListOfLists<T>(public val x : ArrayList<ArrayList<T>>)

fun main() {
    val a : ArrayList<ArrayList<String>> = ArrayList()
    val b : ListOfLists<String> = ListOfLists(a)
    val c : ListOfLists<*> = b
    val d : ArrayList<ArrayList<*>> = <!INITIALIZER_TYPE_MISMATCH!>c.x<!>

    c.x checkType { _<ArrayList<out ArrayList<*>>>() }
}
