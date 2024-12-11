// TARGET_BACKEND: NATIVE
// MODULE: cinterop
// FILE: structAnonym.def
---

/*
 *  Test of return/send-by-value for aggregate type (struct or union) with anonymous inner struct or union member.
 *  Specific issues: alignment, packed, nested named and anon struct/union, other anon types (named field  of anon struct type; anon bitfield)
 */

#include <inttypes.h>

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Winitializer-overrides"

// Basic, 2 levels

struct StructAnonRecordMember_Complicate {
    char first; // __attribute__((aligned(16)));
    union {
        int a[2];
        union { char c1; int c2; };
        struct { char b1; int64_t b2; };  // implicit 64-bits alignment
    };
    char second __attribute__((aligned(16)));
    struct {
        char x;
        struct { int64_t b11, b12; } Y2;
        int32_t f  __attribute__((aligned(16)));
    }; // __attribute__((aligned(16)));
    char last;
};

#define INIT(T, x) 	struct T x = \
{ \
    .first = 'a', \
    .b1 = 'b', \
    .b2 = 42, \
    .second = 's', \
    .last = 'z', \
    .f = 314, \
    .Y2 = {11, 12} \
}

static struct StructAnonRecordMember_Complicate retByValue_StructAnonRecordMember_Complicate() {
    INIT(StructAnonRecordMember_Complicate, c);
    return c;
}
#pragma clang diagnostic pop

// MODULE: main(cinterop)
// FILE: main.kt

@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)


import kotlinx.cinterop.*
import kotlin.test.*
import structAnonym.*

fun box(): String {
    retByValue_StructAnonRecordMember_Complicate()
        .useContents{
            assertEquals('a', first.toInt().toChar())
            assertEquals('s', second.toInt().toChar())
            assertEquals('z', last.toInt().toChar())
            assertEquals('b', b1.toInt().toChar())
            assertEquals(42L, b2)
            assertEquals(314, f)
            assertEquals(11L, Y2.b11)
        }

    return "OK"
}
