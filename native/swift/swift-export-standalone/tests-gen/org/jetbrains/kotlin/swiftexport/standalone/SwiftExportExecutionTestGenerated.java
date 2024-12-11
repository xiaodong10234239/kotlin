/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.swiftexport.standalone;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.junit.jupiter.api.Tag;
import org.jetbrains.kotlin.konan.test.blackbox.support.group.FirPipeline;
import org.jetbrains.kotlin.konan.test.blackbox.support.group.UseStandardTestCaseGroupProvider;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.native.swift.sir.GenerateSirTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("native/swift/swift-export-standalone/testData/execution")
@TestDataPath("$PROJECT_ROOT")
@Tag("frontend-fir")
@FirPipeline()
@UseStandardTestCaseGroupProvider()
public class SwiftExportExecutionTestGenerated extends AbstractSwiftExportExecutionTest {
  @Test
  public void testAllFilesPresentInExecution() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/swift/swift-export-standalone/testData/execution"), Pattern.compile("^([^_](.+))$"), null, false);
  }

  @Test
  @TestMetadata("autoimport")
  public void testAutoimport() {
    runTest("native/swift/swift-export-standalone/testData/execution/autoimport/");
  }

  @Test
  @TestMetadata("char")
  public void testChar() {
    runTest("native/swift/swift-export-standalone/testData/execution/char/");
  }

  @Test
  @TestMetadata("classMappings")
  public void testClassMappings() {
    runTest("native/swift/swift-export-standalone/testData/execution/classMappings/");
  }

  @Test
  @TestMetadata("exceptions")
  public void testExceptions() {
    runTest("native/swift/swift-export-standalone/testData/execution/exceptions/");
  }

  @Test
  @TestMetadata("inheritance")
  public void testInheritance() {
    runTest("native/swift/swift-export-standalone/testData/execution/inheritance/");
  }

  @Test
  @TestMetadata("list")
  public void testList() {
    runTest("native/swift/swift-export-standalone/testData/execution/list/");
  }

  @Test
  @TestMetadata("map")
  public void testMap() {
    runTest("native/swift/swift-export-standalone/testData/execution/map/");
  }

  @Test
  @TestMetadata("never_type")
  public void testNever_type() {
    runTest("native/swift/swift-export-standalone/testData/execution/never_type/");
  }

  @Test
  @TestMetadata("null_type")
  public void testNull_type() {
    runTest("native/swift/swift-export-standalone/testData/execution/null_type/");
  }

  @Test
  @TestMetadata("nullable_never_type")
  public void testNullable_never_type() {
    runTest("native/swift/swift-export-standalone/testData/execution/nullable_never_type/");
  }

  @Test
  @TestMetadata("properties")
  public void testProperties() {
    runTest("native/swift/swift-export-standalone/testData/execution/properties/");
  }

  @Test
  @TestMetadata("referenceTypes")
  public void testReferenceTypes() {
    runTest("native/swift/swift-export-standalone/testData/execution/referenceTypes/");
  }

  @Test
  @TestMetadata("set")
  public void testSet() {
    runTest("native/swift/swift-export-standalone/testData/execution/set/");
  }

  @Test
  @TestMetadata("smokes")
  public void testSmokes() {
    runTest("native/swift/swift-export-standalone/testData/execution/smokes/");
  }

  @Test
  @TestMetadata("specialTypes")
  public void testSpecialTypes() {
    runTest("native/swift/swift-export-standalone/testData/execution/specialTypes/");
  }
}
