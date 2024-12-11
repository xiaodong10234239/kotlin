/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.scripting.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/scripting/scripting-tests/testData/diagnostics/repl")
@TestDataPath("$PROJECT_ROOT")
public class ReplWithCustomDefDiagnosticsTestBaseGenerated extends AbstractReplWithCustomDefDiagnosticsTestBase {
  @Test
  public void testAllFilesPresentInRepl() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/scripting/scripting-tests/testData/diagnostics/repl"), Pattern.compile("^(.+)\\.kts$"), null, true);
  }

  @Test
  @TestMetadata("mixed1.repl.kts")
  public void testMixed1_repl() {
    runTest("plugins/scripting/scripting-tests/testData/diagnostics/repl/mixed1.repl.kts");
  }

  @Test
  @TestMetadata("separate_snippets_use_before_define.repl.kts")
  public void testSeparate_snippets_use_before_define_repl() {
    runTest("plugins/scripting/scripting-tests/testData/diagnostics/repl/separate_snippets_use_before_define.repl.kts");
  }

  @Test
  @TestMetadata("simple_class.repl.kts")
  public void testSimple_class_repl() {
    runTest("plugins/scripting/scripting-tests/testData/diagnostics/repl/simple_class.repl.kts");
  }

  @Test
  @TestMetadata("simple_property.repl.kts")
  public void testSimple_property_repl() {
    runTest("plugins/scripting/scripting-tests/testData/diagnostics/repl/simple_property.repl.kts");
  }

  @Test
  @TestMetadata("single_snippet.repl.kts")
  public void testSingle_snippet_repl() {
    runTest("plugins/scripting/scripting-tests/testData/diagnostics/repl/single_snippet.repl.kts");
  }

  @Test
  @TestMetadata("single_snippet_use_before_define.repl.kts")
  public void testSingle_snippet_use_before_define_repl() {
    runTest("plugins/scripting/scripting-tests/testData/diagnostics/repl/single_snippet_use_before_define.repl.kts");
  }
}
