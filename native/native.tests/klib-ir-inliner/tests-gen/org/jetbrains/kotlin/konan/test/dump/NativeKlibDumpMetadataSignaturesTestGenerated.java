/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.dump;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateKlibNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("native/native.tests/testData/klib/dump-signatures")
@TestDataPath("$PROJECT_ROOT")
public class NativeKlibDumpMetadataSignaturesTestGenerated extends AbstractNativeKlibDumpMetadataSignaturesTest {
  @Test
  public void testAllFilesPresentInDump_signatures() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/klib/dump-signatures"), Pattern.compile("^([^_](.+)).(kt|def)$"), null, true);
  }

  @Test
  @TestMetadata("callables.kt")
  public void testCallables() {
    runTest("native/native.tests/testData/klib/dump-signatures/callables.kt");
  }

  @Test
  @TestMetadata("imported_declarations.kt")
  public void testImported_declarations() {
    runTest("native/native.tests/testData/klib/dump-signatures/imported_declarations.kt");
  }

  @Test
  @TestMetadata("imported_from_cinterop.kt")
  public void testImported_from_cinterop() {
    runTest("native/native.tests/testData/klib/dump-signatures/imported_from_cinterop.kt");
  }

  @Test
  @TestMetadata("imported_from_cinterop.lib.def")
  public void testImported_from_cinterop_lib() {
    runTest("native/native.tests/testData/klib/dump-signatures/imported_from_cinterop.lib.def");
  }

  @Test
  @TestMetadata("just_cinterop_c.def")
  public void testJust_cinterop_c() {
    runTest("native/native.tests/testData/klib/dump-signatures/just_cinterop_c.def");
  }

  @Test
  @TestMetadata("just_cinterop_objc.def")
  public void testJust_cinterop_objc() {
    runTest("native/native.tests/testData/klib/dump-signatures/just_cinterop_objc.def");
  }

  @Test
  @TestMetadata("type_parameters.kt")
  public void testType_parameters() {
    runTest("native/native.tests/testData/klib/dump-signatures/type_parameters.kt");
  }

  @Test
  @TestMetadata("visibility.kt")
  public void testVisibility() {
    runTest("native/native.tests/testData/klib/dump-signatures/visibility.kt");
  }
}
