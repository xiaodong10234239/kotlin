// RUN_PIPELINE_TILL: FRONTEND
// FILE: KotlinFile.kt
fun foo(javaClass: JavaClass) {
    javaClass.<!INVISIBLE_REFERENCE!>doSomething<!> { }
}

// FILE: JavaClass.java
public class JavaClass {
    private void doSomething(Runnable runnable) { runnable.run(); }
}
