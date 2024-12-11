/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.containingDeclarationProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fir.test.configurators.AnalysisApiFirTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.containingDeclarationProvider.AbstractContainingDeclarationProviderByReferenceTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeNormalAnalysisSourceModuleContainingDeclarationProviderByReferenceTestGenerated extends AbstractContainingDeclarationProviderByReferenceTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fir,
        TestModuleKind.Source,
        AnalysisSessionMode.Normal,
        AnalysisApiMode.Ide
      )
    );
  }

  @Test
  public void testAllFilesPresentInContainingDeclarationByReference() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("codeFragmentFromInside.kt")
  public void testCodeFragmentFromInside() {
    runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/codeFragmentFromInside.kt");
  }

  @Test
  @TestMetadata("foreignValue.kt")
  public void testForeignValue() {
    runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/foreignValue.kt");
  }

  @Test
  @TestMetadata("foreignValueScript.kt")
  public void testForeignValueScript() {
    runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/foreignValueScript.kt");
  }

  @Test
  @TestMetadata("localFunction.kt")
  public void testLocalFunction() {
    runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/localFunction.kt");
  }

  @Test
  @TestMetadata("localFunctionFromInside.kt")
  public void testLocalFunctionFromInside() {
    runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/localFunctionFromInside.kt");
  }

  @Test
  @TestMetadata("nestedClass.kt")
  public void testNestedClass() {
    runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/nestedClass.kt");
  }

  @Test
  @TestMetadata("nestedClassFromInside.kt")
  public void testNestedClassFromInside() {
    runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/nestedClassFromInside.kt");
  }

  @Test
  @TestMetadata("propertyAccessor.kt")
  public void testPropertyAccessor() {
    runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/propertyAccessor.kt");
  }

  @Test
  @TestMetadata("propertyAccessorFromInside.kt")
  public void testPropertyAccessorFromInside() {
    runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/propertyAccessorFromInside.kt");
  }

  @Test
  @TestMetadata("propertyField.kt")
  public void testPropertyField() {
    runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/propertyField.kt");
  }

  @Test
  @TestMetadata("simple.kt")
  public void testSimple() {
    runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/simple.kt");
  }

  @Test
  @TestMetadata("topLevelFunctionFromInside.kt")
  public void testTopLevelFunctionFromInside() {
    runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/topLevelFunctionFromInside.kt");
  }

  @Test
  @TestMetadata("typeAliasedConstructor.kt")
  public void testTypeAliasedConstructor() {
    runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/typeAliasedConstructor.kt");
  }

  @Test
  @TestMetadata("typeAliasedConstructorParameter.kt")
  public void testTypeAliasedConstructorParameter() {
    runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/typeAliasedConstructorParameter.kt");
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated")
  @TestDataPath("$PROJECT_ROOT")
  public class DataClassGenerated {
    @Test
    public void testAllFilesPresentInDataClassGenerated() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/codeFragment")
    @TestDataPath("$PROJECT_ROOT")
    public class CodeFragment {
      @Test
      public void testAllFilesPresentInCodeFragment() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/codeFragment"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @Test
      @TestMetadata("dataClassComponent.kt")
      public void testDataClassComponent() {
        runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/codeFragment/dataClassComponent.kt");
      }

      @Test
      @TestMetadata("dataClassCopy.kt")
      public void testDataClassCopy() {
        runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/codeFragment/dataClassCopy.kt");
      }

      @Test
      @TestMetadata("dataClassCopyParameter.kt")
      public void testDataClassCopyParameter() {
        runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/codeFragment/dataClassCopyParameter.kt");
      }

      @Test
      @TestMetadata("dataClassEquals.kt")
      public void testDataClassEquals() {
        runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/codeFragment/dataClassEquals.kt");
      }

      @Test
      @TestMetadata("dataObjectEquals.kt")
      public void testDataObjectEquals() {
        runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/codeFragment/dataObjectEquals.kt");
      }

      @Test
      @TestMetadata("dataObjectToString.kt")
      public void testDataObjectToString() {
        runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/codeFragment/dataObjectToString.kt");
      }
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/library")
    @TestDataPath("$PROJECT_ROOT")
    public class Library {
      @Test
      public void testAllFilesPresentInLibrary() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/library"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @Test
      @TestMetadata("dataClassComponent.kt")
      public void testDataClassComponent() {
        runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/library/dataClassComponent.kt");
      }

      @Test
      @TestMetadata("dataClassCopy.kt")
      public void testDataClassCopy() {
        runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/library/dataClassCopy.kt");
      }

      @Test
      @TestMetadata("dataClassCopyParameter.kt")
      public void testDataClassCopyParameter() {
        runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/library/dataClassCopyParameter.kt");
      }

      @Test
      @TestMetadata("dataClassEquals.kt")
      public void testDataClassEquals() {
        runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/library/dataClassEquals.kt");
      }

      @Test
      @TestMetadata("dataObjectEquals.kt")
      public void testDataObjectEquals() {
        runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/library/dataObjectEquals.kt");
      }

      @Test
      @TestMetadata("dataObjectToString.kt")
      public void testDataObjectToString() {
        runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/library/dataObjectToString.kt");
      }
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/source")
    @TestDataPath("$PROJECT_ROOT")
    public class Source {
      @Test
      public void testAllFilesPresentInSource() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/source"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @Test
      @TestMetadata("dataClassComponent.kt")
      public void testDataClassComponent() {
        runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/source/dataClassComponent.kt");
      }

      @Test
      @TestMetadata("dataClassCopy.kt")
      public void testDataClassCopy() {
        runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/source/dataClassCopy.kt");
      }

      @Test
      @TestMetadata("dataClassCopyParameter.kt")
      public void testDataClassCopyParameter() {
        runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/source/dataClassCopyParameter.kt");
      }

      @Test
      @TestMetadata("dataClassEquals.kt")
      public void testDataClassEquals() {
        runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/source/dataClassEquals.kt");
      }

      @Test
      @TestMetadata("dataObjectEquals.kt")
      public void testDataObjectEquals() {
        runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/source/dataObjectEquals.kt");
      }

      @Test
      @TestMetadata("dataObjectToString.kt")
      public void testDataObjectToString() {
        runTest("analysis/analysis-api/testData/components/containingDeclarationProvider/containingDeclarationByReference/dataClassGenerated/source/dataObjectToString.kt");
      }
    }
  }
}
