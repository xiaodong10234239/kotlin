/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.integration;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.test.generators.GenerateCompilerTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/integration/ant/jvm")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class AntTaskTestGenerated extends AbstractAntTaskTest {
  private void runTest(String testDataFilePath) {
    KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
  }

  @TestMetadata("additionalArguments")
  public void testAdditionalArguments() {
    runTest("compiler/testData/integration/ant/jvm/additionalArguments/");
  }

  public void testAllFilesPresentInJvm() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/integration/ant/jvm"), Pattern.compile("^([^\\.]+)$"), null, false);
  }

  @TestMetadata("doNotFailOnError")
  public void testDoNotFailOnError() {
    runTest("compiler/testData/integration/ant/jvm/doNotFailOnError/");
  }

  @TestMetadata("doNotIncludeRuntimeByDefault")
  public void testDoNotIncludeRuntimeByDefault() {
    runTest("compiler/testData/integration/ant/jvm/doNotIncludeRuntimeByDefault/");
  }

  @TestMetadata("failOnErrorByDefault")
  public void testFailOnErrorByDefault() {
    runTest("compiler/testData/integration/ant/jvm/failOnErrorByDefault/");
  }

  @TestMetadata("fork")
  public void testFork() {
    runTest("compiler/testData/integration/ant/jvm/fork/");
  }

  @TestMetadata("forkOnError")
  public void testForkOnError() {
    runTest("compiler/testData/integration/ant/jvm/forkOnError/");
  }

  @TestMetadata("helloWorld")
  public void testHelloWorld() {
    runTest("compiler/testData/integration/ant/jvm/helloWorld/");
  }

  @TestMetadata("internalMembers")
  public void testInternalMembers() {
    runTest("compiler/testData/integration/ant/jvm/internalMembers/");
  }

  @TestMetadata("jvmClasspath")
  public void testJvmClasspath() {
    runTest("compiler/testData/integration/ant/jvm/jvmClasspath/");
  }

  @TestMetadata("kt11995")
  public void testKt11995() {
    runTest("compiler/testData/integration/ant/jvm/kt11995/");
  }

  @TestMetadata("languageVersion")
  public void testLanguageVersion() {
    runTest("compiler/testData/integration/ant/jvm/languageVersion/");
  }

  @TestMetadata("mainInFiles")
  public void testMainInFiles() {
    runTest("compiler/testData/integration/ant/jvm/mainInFiles/");
  }

  @TestMetadata("manySourceRoots")
  public void testManySourceRoots() {
    runTest("compiler/testData/integration/ant/jvm/manySourceRoots/");
  }

  @TestMetadata("moduleName")
  public void testModuleName() {
    runTest("compiler/testData/integration/ant/jvm/moduleName/");
  }

  @TestMetadata("moduleNameDefault")
  public void testModuleNameDefault() {
    runTest("compiler/testData/integration/ant/jvm/moduleNameDefault/");
  }

  @TestMetadata("moduleNameWithKotlin")
  public void testModuleNameWithKotlin() {
    runTest("compiler/testData/integration/ant/jvm/moduleNameWithKotlin/");
  }

  @TestMetadata("noReflectForJavac")
  public void testNoReflectForJavac() {
    runTest("compiler/testData/integration/ant/jvm/noReflectForJavac/");
  }

  @TestMetadata("noStdlibForJavac")
  public void testNoStdlibForJavac() {
    runTest("compiler/testData/integration/ant/jvm/noStdlibForJavac/");
  }

  @TestMetadata("overloadResolutionOnCollectionLiteral")
  public void testOverloadResolutionOnCollectionLiteral() {
    runTest("compiler/testData/integration/ant/jvm/overloadResolutionOnCollectionLiteral/");
  }

  @TestMetadata("stdlibForJavacWithNoKotlin")
  public void testStdlibForJavacWithNoKotlin() {
    runTest("compiler/testData/integration/ant/jvm/stdlibForJavacWithNoKotlin/");
  }

  @TestMetadata("suppressWarnings")
  public void testSuppressWarnings() {
    runTest("compiler/testData/integration/ant/jvm/suppressWarnings/");
  }

  @TestMetadata("twoStdlibForCollectionLiterals")
  public void testTwoStdlibForCollectionLiterals() {
    runTest("compiler/testData/integration/ant/jvm/twoStdlibForCollectionLiterals/");
  }

  @TestMetadata("valWithInvoke")
  public void testValWithInvoke() {
    runTest("compiler/testData/integration/ant/jvm/valWithInvoke/");
  }

  @TestMetadata("verbose")
  public void testVerbose() {
    runTest("compiler/testData/integration/ant/jvm/verbose/");
  }

  @TestMetadata("version")
  public void testVersion() {
    runTest("compiler/testData/integration/ant/jvm/version/");
  }

  @TestMetadata("withKotlinFork")
  public void testWithKotlinFork() {
    runTest("compiler/testData/integration/ant/jvm/withKotlinFork/");
  }

  @TestMetadata("withKotlinNoJavaSources")
  public void testWithKotlinNoJavaSources() {
    runTest("compiler/testData/integration/ant/jvm/withKotlinNoJavaSources/");
  }

  @TestMetadata("wrongCallForCollectionLiteral")
  public void testWrongCallForCollectionLiteral() {
    runTest("compiler/testData/integration/ant/jvm/wrongCallForCollectionLiteral/");
  }
}
