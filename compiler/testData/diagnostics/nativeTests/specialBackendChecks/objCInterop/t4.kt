// FIR_IDENTICAL
// WITH_PLATFORM_LIBS
import platform.darwin.*
import platform.Foundation.*

fun foo() = println(NSAssertionHandler()::handleFailureInFunction)
