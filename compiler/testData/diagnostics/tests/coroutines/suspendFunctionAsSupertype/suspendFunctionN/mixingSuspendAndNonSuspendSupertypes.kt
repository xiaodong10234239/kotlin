// RUN_PIPELINE_TILL: FRONTEND
// FIR_IDENTICAL
// LANGUAGE: +SuspendFunctionAsSupertype
// SKIP_TXT
// DIAGNOSTICS: -CONFLICTING_INHERITED_MEMBERS, -CONFLICTING_OVERLOADS, -ABSTRACT_MEMBER_NOT_IMPLEMENTED, -FUN_INTERFACE_WRONG_COUNT_OF_ABSTRACT_MEMBERS
import kotlin.coroutines.*

class C: <!MIXING_SUSPEND_AND_NON_SUSPEND_SUPERTYPES!>SuspendFunction0<Unit>, () -> Unit<!> {
    override suspend fun invoke() {
    }
}

fun interface FI: <!MIXING_SUSPEND_AND_NON_SUSPEND_SUPERTYPES!>SuspendFunction0<Unit>, () -> Unit<!> {
}

interface I: <!MIXING_SUSPEND_AND_NON_SUSPEND_SUPERTYPES!>SuspendFunction0<Unit>, () -> Unit<!> {
}

object O: <!MIXING_SUSPEND_AND_NON_SUSPEND_SUPERTYPES!>SuspendFunction0<Unit>, () -> Unit<!> {
    override suspend fun invoke() {
    }
}
