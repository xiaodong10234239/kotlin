/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.symbolDeclarationOverridesProvider;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.symbolDeclarationOverridesProvider.AbstractOverriddenDeclarationProviderTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeDependentAnalysisSourceModuleOverriddenDeclarationProviderTestGenerated extends AbstractOverriddenDeclarationProviderTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fir,
        TestModuleKind.Source,
        AnalysisSessionMode.Dependent,
        AnalysisApiMode.Ide
      )
    );
  }

  @Test
  public void testAllFilesPresentInOverriddenSymbols() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("arraylistSubtype.kt")
  public void testArraylistSubtype() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/arraylistSubtype.kt");
  }

  @Test
  @TestMetadata("backingField.kt")
  public void testBackingField() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/backingField.kt");
  }

  @Test
  @TestMetadata("delegateOverrideWithImplicitTypeInsideAnonymousObject.kt")
  public void testDelegateOverrideWithImplicitTypeInsideAnonymousObject() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/delegateOverrideWithImplicitTypeInsideAnonymousObject.kt");
  }

  @Test
  @TestMetadata("delegateOverrideWithoutImplicitTypeInsideAnonymousObject.kt")
  public void testDelegateOverrideWithoutImplicitTypeInsideAnonymousObject() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/delegateOverrideWithoutImplicitTypeInsideAnonymousObject.kt");
  }

  @Test
  @TestMetadata("inAnonymousClass.kt")
  public void testInAnonymousClass() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/inAnonymousClass.kt");
  }

  @Test
  @TestMetadata("inLocalClass.kt")
  public void testInLocalClass() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/inLocalClass.kt");
  }

  @Test
  @TestMetadata("inOtherFile.kt")
  public void testInOtherFile() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/inOtherFile.kt");
  }

  @Test
  @TestMetadata("intersectionOverride.kt")
  public void testIntersectionOverride() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/intersectionOverride.kt");
  }

  @Test
  @TestMetadata("intersectionOverride2.kt")
  public void testIntersectionOverride2() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/intersectionOverride2.kt");
  }

  @Test
  @TestMetadata("intersectionOverride3.kt")
  public void testIntersectionOverride3() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/intersectionOverride3.kt");
  }

  @Test
  @TestMetadata("intersectionOverrideWithImplicitTypeInsideAnonymousObject.kt")
  public void testIntersectionOverrideWithImplicitTypeInsideAnonymousObject() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/intersectionOverrideWithImplicitTypeInsideAnonymousObject.kt");
  }

  @Test
  @TestMetadata("intersectionOverrideWithSubstitution.kt")
  public void testIntersectionOverrideWithSubstitution() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/intersectionOverrideWithSubstitution.kt");
  }

  @Test
  @TestMetadata("intersectionOverrideWithoutImplicitTypeInsideAnonymousObject.kt")
  public void testIntersectionOverrideWithoutImplicitTypeInsideAnonymousObject() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/intersectionOverrideWithoutImplicitTypeInsideAnonymousObject.kt");
  }

  @Test
  @TestMetadata("javaAccessors.kt")
  public void testJavaAccessors() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/javaAccessors.kt");
  }

  @Test
  @TestMetadata("linkedHashSet.kt")
  public void testLinkedHashSet() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/linkedHashSet.kt");
  }

  @Test
  @TestMetadata("multipleInterfaces.kt")
  public void testMultipleInterfaces() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/multipleInterfaces.kt");
  }

  @Test
  @TestMetadata("onEnumEntry.kt")
  public void testOnEnumEntry() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/onEnumEntry.kt");
  }

  @Test
  @TestMetadata("parameterWithGeneratedProperty.kt")
  public void testParameterWithGeneratedProperty() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/parameterWithGeneratedProperty.kt");
  }

  @Test
  @TestMetadata("sequenceOfOverrides.kt")
  public void testSequenceOfOverrides() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/sequenceOfOverrides.kt");
  }

  @Test
  @TestMetadata("substitutionOverrideFunctionDelegate.kt")
  public void testSubstitutionOverrideFunctionDelegate() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/substitutionOverrideFunctionDelegate.kt");
  }

  @Test
  @TestMetadata("substitutionOverrideFunctionParameter.kt")
  public void testSubstitutionOverrideFunctionParameter() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/substitutionOverrideFunctionParameter.kt");
  }

  @Test
  @TestMetadata("substitutionOverrideFunctionReturnType.kt")
  public void testSubstitutionOverrideFunctionReturnType() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/substitutionOverrideFunctionReturnType.kt");
  }

  @Test
  @TestMetadata("substitutionOverrideFunctionTransitive.kt")
  public void testSubstitutionOverrideFunctionTransitive() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/substitutionOverrideFunctionTransitive.kt");
  }

  @Test
  @TestMetadata("substitutionOverrideFunctionTransitiveSameType.kt")
  public void testSubstitutionOverrideFunctionTransitiveSameType() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/substitutionOverrideFunctionTransitiveSameType.kt");
  }

  @Test
  @TestMetadata("substitutionOverrideProperty.kt")
  public void testSubstitutionOverrideProperty() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/substitutionOverrideProperty.kt");
  }

  @Test
  @TestMetadata("substitutionOverridePropertyDelegate.kt")
  public void testSubstitutionOverridePropertyDelegate() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/substitutionOverridePropertyDelegate.kt");
  }

  @Test
  @TestMetadata("substitutionOverridePropertyTransitive.kt")
  public void testSubstitutionOverridePropertyTransitive() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/substitutionOverridePropertyTransitive.kt");
  }

  @Test
  @TestMetadata("substitutionOverridePropertyTransitiveSameType.kt")
  public void testSubstitutionOverridePropertyTransitiveSameType() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/substitutionOverridePropertyTransitiveSameType.kt");
  }

  @Test
  @TestMetadata("substitutionOverrideWithImplicitTypeInsideAnonymousObject.kt")
  public void testSubstitutionOverrideWithImplicitTypeInsideAnonymousObject() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/substitutionOverrideWithImplicitTypeInsideAnonymousObject.kt");
  }

  @Test
  @TestMetadata("substitutionOverrideWithoutImplicitTypeInsideAnonymousObject.kt")
  public void testSubstitutionOverrideWithoutImplicitTypeInsideAnonymousObject() {
    runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/substitutionOverrideWithoutImplicitTypeInsideAnonymousObject.kt");
  }
}
