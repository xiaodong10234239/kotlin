/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fe10.test.cases.generated.cases.components.resolver;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fe10.test.configurator.AnalysisApiFe10TestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.resolver.AbstractResolveCandidatesByFileTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/resolver/allByPsi")
@TestDataPath("$PROJECT_ROOT")
public class Fe10IdeNormalAnalysisSourceModuleResolveCandidatesByFileTestGenerated extends AbstractResolveCandidatesByFileTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFe10TestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fe10,
        TestModuleKind.Source,
        AnalysisSessionMode.Normal,
        AnalysisApiMode.Ide
      )
    );
  }

  @Test
  public void testAllFilesPresentInAllByPsi() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/resolver/allByPsi"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("annotatedClasses.kt")
  public void testAnnotatedClasses() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/annotatedClasses.kt");
  }

  @Test
  @TestMetadata("annotatedExpressions.kt")
  public void testAnnotatedExpressions() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/annotatedExpressions.kt");
  }

  @Test
  @TestMetadata("annotatedFunction.kt")
  public void testAnnotatedFunction() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/annotatedFunction.kt");
  }

  @Test
  @TestMetadata("annotatedProperty.kt")
  public void testAnnotatedProperty() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/annotatedProperty.kt");
  }

  @Test
  @TestMetadata("annotations.kt")
  public void testAnnotations() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/annotations.kt");
  }

  @Test
  @TestMetadata("annotationsWithoutCall.kt")
  public void testAnnotationsWithoutCall() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/annotationsWithoutCall.kt");
  }

  @Test
  @TestMetadata("arrayAccess.kt")
  public void testArrayAccess() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/arrayAccess.kt");
  }

  @Test
  @TestMetadata("callChain.kt")
  public void testCallChain() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/callChain.kt");
  }

  @Test
  @TestMetadata("callableReference.kt")
  public void testCallableReference() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/callableReference.kt");
  }

  @Test
  @TestMetadata("compare.kt")
  public void testCompare() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/compare.kt");
  }

  @Test
  @TestMetadata("constructors.kt")
  public void testConstructors() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/constructors.kt");
  }

  @Test
  @TestMetadata("contains.kt")
  public void testContains() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/contains.kt");
  }

  @Test
  @TestMetadata("delegatedFieldNestedName.kt")
  public void testDelegatedFieldNestedName() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/delegatedFieldNestedName.kt");
  }

  @Test
  @TestMetadata("delegatedProperty.kt")
  public void testDelegatedProperty() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/delegatedProperty.kt");
  }

  @Test
  @TestMetadata("elvis.kt")
  public void testElvis() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/elvis.kt");
  }

  @Test
  @TestMetadata("enum.kt")
  public void testEnum() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/enum.kt");
  }

  @Test
  @TestMetadata("equals.kt")
  public void testEquals() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/equals.kt");
  }

  @Test
  @TestMetadata("forWithIterator.kt")
  public void testForWithIterator() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/forWithIterator.kt");
  }

  @Test
  @TestMetadata("forWithRange.kt")
  public void testForWithRange() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/forWithRange.kt");
  }

  @Test
  @TestMetadata("infixFunction.kt")
  public void testInfixFunction() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/infixFunction.kt");
  }

  @Test
  @TestMetadata("invoke.kt")
  public void testInvoke() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/invoke.kt");
  }

  @Test
  @TestMetadata("labels.kt")
  public void testLabels() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/labels.kt");
  }

  @Test
  @TestMetadata("lambdaParameters.kt")
  public void testLambdaParameters() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/lambdaParameters.kt");
  }

  @Test
  @TestMetadata("multiEquals.kt")
  public void testMultiEquals() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/multiEquals.kt");
  }

  @Test
  @TestMetadata("providedDelegate.kt")
  public void testProvidedDelegate() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/providedDelegate.kt");
  }

  @Test
  @TestMetadata("return.kt")
  public void testReturn() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/return.kt");
  }

  @Test
  @TestMetadata("staticImports.kt")
  public void testStaticImports() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/staticImports.kt");
  }

  @Test
  @TestMetadata("syntheticProperty.kt")
  public void testSyntheticProperty() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/syntheticProperty.kt");
  }

  @Test
  @TestMetadata("this.kt")
  public void testThis() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/this.kt");
  }

  @Test
  @TestMetadata("typeParameters.kt")
  public void testTypeParameters() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/typeParameters.kt");
  }

  @Test
  @TestMetadata("types.kt")
  public void testTypes() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/types.kt");
  }

  @Test
  @TestMetadata("unaryOperators.kt")
  public void testUnaryOperators() {
    runTest("analysis/analysis-api/testData/components/resolver/allByPsi/unaryOperators.kt");
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/resolver/allByPsi/imports")
  @TestDataPath("$PROJECT_ROOT")
  public class Imports {
    @Test
    public void testAllFilesPresentInImports() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/resolver/allByPsi/imports"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("enumEntry.kt")
    public void testEnumEntry() {
      runTest("analysis/analysis-api/testData/components/resolver/allByPsi/imports/enumEntry.kt");
    }

    @Test
    @TestMetadata("javaClass.kt")
    public void testJavaClass() {
      runTest("analysis/analysis-api/testData/components/resolver/allByPsi/imports/javaClass.kt");
    }

    @Test
    @TestMetadata("javaClassWithBaseClass.kt")
    public void testJavaClassWithBaseClass() {
      runTest("analysis/analysis-api/testData/components/resolver/allByPsi/imports/javaClassWithBaseClass.kt");
    }

    @Test
    @TestMetadata("javaClass_rootPackage.kt")
    public void testJavaClass_rootPackage() {
      runTest("analysis/analysis-api/testData/components/resolver/allByPsi/imports/javaClass_rootPackage.kt");
    }

    @Test
    @TestMetadata("simple.kt")
    public void testSimple() {
      runTest("analysis/analysis-api/testData/components/resolver/allByPsi/imports/simple.kt");
    }

    @Test
    @TestMetadata("star.kt")
    public void testStar() {
      runTest("analysis/analysis-api/testData/components/resolver/allByPsi/imports/star.kt");
    }

    @Test
    @TestMetadata("topLevelObject.kt")
    public void testTopLevelObject() {
      runTest("analysis/analysis-api/testData/components/resolver/allByPsi/imports/topLevelObject.kt");
    }

    @Test
    @TestMetadata("topLevelObjectWithBaseClass.kt")
    public void testTopLevelObjectWithBaseClass() {
      runTest("analysis/analysis-api/testData/components/resolver/allByPsi/imports/topLevelObjectWithBaseClass.kt");
    }

    @Test
    @TestMetadata("topLevelObject_rootPackage.kt")
    public void testTopLevelObject_rootPackage() {
      runTest("analysis/analysis-api/testData/components/resolver/allByPsi/imports/topLevelObject_rootPackage.kt");
    }
  }
}
