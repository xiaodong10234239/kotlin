// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_STDLIB
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in 1u downTo 2u step 2) {
        uintList += i
    }
    assertTrue(uintList.isEmpty())

    val ulongList = mutableListOf<ULong>()
    for (i in 1uL downTo 2uL step 2L) {
        ulongList += i
    }
    assertTrue(ulongList.isEmpty())

    return "OK"
}