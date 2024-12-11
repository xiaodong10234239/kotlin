/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.headerklib;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateKlibNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("native/native.tests/testData/klib/header-klibs/comparison")
@TestDataPath("$PROJECT_ROOT")
public class NativeHeaderKlibComparisonTestGenerated extends AbstractNativeHeaderKlibComparisonTest {
  @Test
  public void testAllFilesPresentInComparison() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/klib/header-klibs/comparison"), Pattern.compile("^([^\\.]+)$"), null, false);
  }

  @Test
  @TestMetadata("anonymousObjects")
  public void testAnonymousObjects() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/anonymousObjects/");
  }

  @Test
  @TestMetadata("classFlags")
  public void testClassFlags() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/classFlags/");
  }

  @Test
  @TestMetadata("classPrivateMembers")
  public void testClassPrivateMembers() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/classPrivateMembers/");
  }

  @Test
  @TestMetadata("constant")
  public void testConstant() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/constant/");
  }

  @Test
  @TestMetadata("declarationOrderInline")
  public void testDeclarationOrderInline() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/declarationOrderInline/");
  }

  @Test
  @TestMetadata("functionBody")
  public void testFunctionBody() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/functionBody/");
  }

  @Test
  @TestMetadata("inlineFunInPrivateClass")
  public void testInlineFunInPrivateClass() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/inlineFunInPrivateClass/");
  }

  @Test
  @TestMetadata("inlineFunInPrivateNestedClass")
  public void testInlineFunInPrivateNestedClass() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/inlineFunInPrivateNestedClass/");
  }

  @Test
  @TestMetadata("inlineFunctionBody")
  public void testInlineFunctionBody() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/inlineFunctionBody/");
  }

  @Test
  @TestMetadata("lambdas")
  public void testLambdas() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/lambdas/");
  }

  @Test
  @TestMetadata("parameterName")
  public void testParameterName() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/parameterName/");
  }

  @Test
  @TestMetadata("privateInterface")
  public void testPrivateInterface() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/privateInterface/");
  }

  @Test
  @TestMetadata("privateTypealias")
  public void testPrivateTypealias() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/privateTypealias/");
  }

  @Test
  @TestMetadata("returnType")
  public void testReturnType() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/returnType/");
  }

  @Test
  @TestMetadata("superClass")
  public void testSuperClass() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/superClass/");
  }

  @Test
  @TestMetadata("syntheticAccessors")
  public void testSyntheticAccessors() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/syntheticAccessors/");
  }

  @Test
  @TestMetadata("topLevelPrivateMembers")
  public void testTopLevelPrivateMembers() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/topLevelPrivateMembers/");
  }
}
