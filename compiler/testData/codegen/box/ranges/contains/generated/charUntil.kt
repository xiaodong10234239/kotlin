// Auto-generated by GenerateInRangeExpressionTestData. Do not edit!
// WITH_STDLIB



val range0 = '1' until '3'
val range1 = '3' until '1'

val element0 = '0'
val element1 = '1'
val element2 = '2'
val element3 = '3'
val element4 = '4'

fun box(): String {
    testR0xE0()
    testR0xE1()
    testR0xE2()
    testR0xE3()
    testR0xE4()
    testR1xE0()
    testR1xE1()
    testR1xE2()
    testR1xE3()
    testR1xE4()
    return "OK"
}

fun testR0xE0() {
    // with possible local optimizations
    if ('0' in '1' until '3' != range0.contains('0')) throw AssertionError()
    if ('0' !in '1' until '3' != !range0.contains('0')) throw AssertionError()
    if (!('0' in '1' until '3') != !range0.contains('0')) throw AssertionError()
    if (!('0' !in '1' until '3') != range0.contains('0')) throw AssertionError()
    // no local optimizations
    if (element0 in '1' until '3' != range0.contains(element0)) throw AssertionError()
    if (element0 !in '1' until '3' != !range0.contains(element0)) throw AssertionError()
    if (!(element0 in '1' until '3') != !range0.contains(element0)) throw AssertionError()
    if (!(element0 !in '1' until '3') != range0.contains(element0)) throw AssertionError()
}

fun testR0xE1() {
    // with possible local optimizations
    if ('1' in '1' until '3' != range0.contains('1')) throw AssertionError()
    if ('1' !in '1' until '3' != !range0.contains('1')) throw AssertionError()
    if (!('1' in '1' until '3') != !range0.contains('1')) throw AssertionError()
    if (!('1' !in '1' until '3') != range0.contains('1')) throw AssertionError()
    // no local optimizations
    if (element1 in '1' until '3' != range0.contains(element1)) throw AssertionError()
    if (element1 !in '1' until '3' != !range0.contains(element1)) throw AssertionError()
    if (!(element1 in '1' until '3') != !range0.contains(element1)) throw AssertionError()
    if (!(element1 !in '1' until '3') != range0.contains(element1)) throw AssertionError()
}

fun testR0xE2() {
    // with possible local optimizations
    if ('2' in '1' until '3' != range0.contains('2')) throw AssertionError()
    if ('2' !in '1' until '3' != !range0.contains('2')) throw AssertionError()
    if (!('2' in '1' until '3') != !range0.contains('2')) throw AssertionError()
    if (!('2' !in '1' until '3') != range0.contains('2')) throw AssertionError()
    // no local optimizations
    if (element2 in '1' until '3' != range0.contains(element2)) throw AssertionError()
    if (element2 !in '1' until '3' != !range0.contains(element2)) throw AssertionError()
    if (!(element2 in '1' until '3') != !range0.contains(element2)) throw AssertionError()
    if (!(element2 !in '1' until '3') != range0.contains(element2)) throw AssertionError()
}

fun testR0xE3() {
    // with possible local optimizations
    if ('3' in '1' until '3' != range0.contains('3')) throw AssertionError()
    if ('3' !in '1' until '3' != !range0.contains('3')) throw AssertionError()
    if (!('3' in '1' until '3') != !range0.contains('3')) throw AssertionError()
    if (!('3' !in '1' until '3') != range0.contains('3')) throw AssertionError()
    // no local optimizations
    if (element3 in '1' until '3' != range0.contains(element3)) throw AssertionError()
    if (element3 !in '1' until '3' != !range0.contains(element3)) throw AssertionError()
    if (!(element3 in '1' until '3') != !range0.contains(element3)) throw AssertionError()
    if (!(element3 !in '1' until '3') != range0.contains(element3)) throw AssertionError()
}

fun testR0xE4() {
    // with possible local optimizations
    if ('4' in '1' until '3' != range0.contains('4')) throw AssertionError()
    if ('4' !in '1' until '3' != !range0.contains('4')) throw AssertionError()
    if (!('4' in '1' until '3') != !range0.contains('4')) throw AssertionError()
    if (!('4' !in '1' until '3') != range0.contains('4')) throw AssertionError()
    // no local optimizations
    if (element4 in '1' until '3' != range0.contains(element4)) throw AssertionError()
    if (element4 !in '1' until '3' != !range0.contains(element4)) throw AssertionError()
    if (!(element4 in '1' until '3') != !range0.contains(element4)) throw AssertionError()
    if (!(element4 !in '1' until '3') != range0.contains(element4)) throw AssertionError()
}

fun testR1xE0() {
    // with possible local optimizations
    if ('0' in '3' until '1' != range1.contains('0')) throw AssertionError()
    if ('0' !in '3' until '1' != !range1.contains('0')) throw AssertionError()
    if (!('0' in '3' until '1') != !range1.contains('0')) throw AssertionError()
    if (!('0' !in '3' until '1') != range1.contains('0')) throw AssertionError()
    // no local optimizations
    if (element0 in '3' until '1' != range1.contains(element0)) throw AssertionError()
    if (element0 !in '3' until '1' != !range1.contains(element0)) throw AssertionError()
    if (!(element0 in '3' until '1') != !range1.contains(element0)) throw AssertionError()
    if (!(element0 !in '3' until '1') != range1.contains(element0)) throw AssertionError()
}

fun testR1xE1() {
    // with possible local optimizations
    if ('1' in '3' until '1' != range1.contains('1')) throw AssertionError()
    if ('1' !in '3' until '1' != !range1.contains('1')) throw AssertionError()
    if (!('1' in '3' until '1') != !range1.contains('1')) throw AssertionError()
    if (!('1' !in '3' until '1') != range1.contains('1')) throw AssertionError()
    // no local optimizations
    if (element1 in '3' until '1' != range1.contains(element1)) throw AssertionError()
    if (element1 !in '3' until '1' != !range1.contains(element1)) throw AssertionError()
    if (!(element1 in '3' until '1') != !range1.contains(element1)) throw AssertionError()
    if (!(element1 !in '3' until '1') != range1.contains(element1)) throw AssertionError()
}

fun testR1xE2() {
    // with possible local optimizations
    if ('2' in '3' until '1' != range1.contains('2')) throw AssertionError()
    if ('2' !in '3' until '1' != !range1.contains('2')) throw AssertionError()
    if (!('2' in '3' until '1') != !range1.contains('2')) throw AssertionError()
    if (!('2' !in '3' until '1') != range1.contains('2')) throw AssertionError()
    // no local optimizations
    if (element2 in '3' until '1' != range1.contains(element2)) throw AssertionError()
    if (element2 !in '3' until '1' != !range1.contains(element2)) throw AssertionError()
    if (!(element2 in '3' until '1') != !range1.contains(element2)) throw AssertionError()
    if (!(element2 !in '3' until '1') != range1.contains(element2)) throw AssertionError()
}

fun testR1xE3() {
    // with possible local optimizations
    if ('3' in '3' until '1' != range1.contains('3')) throw AssertionError()
    if ('3' !in '3' until '1' != !range1.contains('3')) throw AssertionError()
    if (!('3' in '3' until '1') != !range1.contains('3')) throw AssertionError()
    if (!('3' !in '3' until '1') != range1.contains('3')) throw AssertionError()
    // no local optimizations
    if (element3 in '3' until '1' != range1.contains(element3)) throw AssertionError()
    if (element3 !in '3' until '1' != !range1.contains(element3)) throw AssertionError()
    if (!(element3 in '3' until '1') != !range1.contains(element3)) throw AssertionError()
    if (!(element3 !in '3' until '1') != range1.contains(element3)) throw AssertionError()
}

fun testR1xE4() {
    // with possible local optimizations
    if ('4' in '3' until '1' != range1.contains('4')) throw AssertionError()
    if ('4' !in '3' until '1' != !range1.contains('4')) throw AssertionError()
    if (!('4' in '3' until '1') != !range1.contains('4')) throw AssertionError()
    if (!('4' !in '3' until '1') != range1.contains('4')) throw AssertionError()
    // no local optimizations
    if (element4 in '3' until '1' != range1.contains(element4)) throw AssertionError()
    if (element4 !in '3' until '1' != !range1.contains(element4)) throw AssertionError()
    if (!(element4 in '3' until '1') != !range1.contains(element4)) throw AssertionError()
    if (!(element4 !in '3' until '1') != range1.contains(element4)) throw AssertionError()
}


