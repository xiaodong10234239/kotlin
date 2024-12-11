/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fe10.test.cases.generated.cases.components.typeRelationChecker;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.typeRelationChecker.AbstractSubtypingTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality")
@TestDataPath("$PROJECT_ROOT")
public class Fe10IdeNormalAnalysisSourceModuleSubtypingTestGenerated extends AbstractSubtypingTest {
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
  @TestMetadata("ActualizedSuperclass.kt")
  public void testActualizedSuperclass() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/ActualizedSuperclass.kt");
  }

  @Test
  public void testAllFilesPresentInSubtypingAndEquality() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("AnimalListError_HumanList.kt")
  public void testAnimalListError_HumanList() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/AnimalListError_HumanList.kt");
  }

  @Test
  @TestMetadata("AnimalList_HumanList.kt")
  public void testAnimalList_HumanList() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/AnimalList_HumanList.kt");
  }

  @Test
  @TestMetadata("Animal_Human.kt")
  public void testAnimal_Human() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/Animal_Human.kt");
  }

  @Test
  @TestMetadata("Animal_HumanError.kt")
  public void testAnimal_HumanError() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/Animal_HumanError.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_O_A.kt")
  public void testComplexHierarchy_O_A() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/ComplexHierarchy_O_A.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_O_D.kt")
  public void testComplexHierarchy_O_D() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/ComplexHierarchy_O_D.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_O_F.kt")
  public void testComplexHierarchy_O_F() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/ComplexHierarchy_O_F.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_O_NestedA.kt")
  public void testComplexHierarchy_O_NestedA() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/ComplexHierarchy_O_NestedA.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_Y_A.kt")
  public void testComplexHierarchy_Y_A() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/ComplexHierarchy_Y_A.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_Y_D.kt")
  public void testComplexHierarchy_Y_D() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/ComplexHierarchy_Y_D.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_Y_F.kt")
  public void testComplexHierarchy_Y_F() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/ComplexHierarchy_Y_F.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_Y_NestedA.kt")
  public void testComplexHierarchy_Y_NestedA() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/ComplexHierarchy_Y_NestedA.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_Z_A.kt")
  public void testComplexHierarchy_Z_A() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/ComplexHierarchy_Z_A.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_Z_D.kt")
  public void testComplexHierarchy_Z_D() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/ComplexHierarchy_Z_D.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_Z_F.kt")
  public void testComplexHierarchy_Z_F() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/ComplexHierarchy_Z_F.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_Z_NestedA.kt")
  public void testComplexHierarchy_Z_NestedA() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/ComplexHierarchy_Z_NestedA.kt");
  }

  @Test
  @TestMetadata("FlexibleList_Iterable.kt")
  public void testFlexibleList_Iterable() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/FlexibleList_Iterable.kt");
  }

  @Test
  @TestMetadata("FlexibleList_List.kt")
  public void testFlexibleList_List() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/FlexibleList_List.kt");
  }

  @Test
  @TestMetadata("FlexibleList_MutableList.kt")
  public void testFlexibleList_MutableList() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/FlexibleList_MutableList.kt");
  }

  @Test
  @TestMetadata("FunctionType_Function.kt")
  public void testFunctionType_Function() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/FunctionType_Function.kt");
  }

  @Test
  @TestMetadata("HumanListError_AnimalList.kt")
  public void testHumanListError_AnimalList() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/HumanListError_AnimalList.kt");
  }

  @Test
  @TestMetadata("HumanList_AnimalList.kt")
  public void testHumanList_AnimalList() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/HumanList_AnimalList.kt");
  }

  @Test
  @TestMetadata("HumanList_HumanList.kt")
  public void testHumanList_HumanList() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/HumanList_HumanList.kt");
  }

  @Test
  @TestMetadata("HumanList_HumanListError.kt")
  public void testHumanList_HumanListError() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/HumanList_HumanListError.kt");
  }

  @Test
  @TestMetadata("Human_Animal.kt")
  public void testHuman_Animal() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/Human_Animal.kt");
  }

  @Test
  @TestMetadata("Human_AnimalError.kt")
  public void testHuman_AnimalError() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/Human_AnimalError.kt");
  }

  @Test
  @TestMetadata("Human_Human.kt")
  public void testHuman_Human() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/Human_Human.kt");
  }

  @Test
  @TestMetadata("Human_HumanError.kt")
  public void testHuman_HumanError() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/Human_HumanError.kt");
  }

  @Test
  @TestMetadata("Human_NullableHuman.kt")
  public void testHuman_NullableHuman() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/Human_NullableHuman.kt");
  }

  @Test
  @TestMetadata("Human_PrivateAnimal.kt")
  public void testHuman_PrivateAnimal() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/Human_PrivateAnimal.kt");
  }

  @Test
  @TestMetadata("Int_Int.kt")
  public void testInt_Int() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/Int_Int.kt");
  }

  @Test
  @TestMetadata("Int_String.kt")
  public void testInt_String() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/Int_String.kt");
  }

  @Test
  @TestMetadata("IntersectionType_AMarker.kt")
  public void testIntersectionType_AMarker() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/IntersectionType_AMarker.kt");
  }

  @Test
  @TestMetadata("IntersectionType_BMarker.kt")
  public void testIntersectionType_BMarker() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/IntersectionType_BMarker.kt");
  }

  @Test
  @TestMetadata("Iterable_List.kt")
  public void testIterable_List() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/Iterable_List.kt");
  }

  @Test
  @TestMetadata("ListAlias_Iterable.kt")
  public void testListAlias_Iterable() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/ListAlias_Iterable.kt");
  }

  @Test
  @TestMetadata("ListTypeParameterDefinitelyNotNull_Iterable.kt")
  public void testListTypeParameterDefinitelyNotNull_Iterable() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/ListTypeParameterDefinitelyNotNull_Iterable.kt");
  }

  @Test
  @TestMetadata("ListTypeParameter_Iterable.kt")
  public void testListTypeParameter_Iterable() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/ListTypeParameter_Iterable.kt");
  }

  @Test
  @TestMetadata("ListTypeParameter_IterableAlias.kt")
  public void testListTypeParameter_IterableAlias() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/ListTypeParameter_IterableAlias.kt");
  }

  @Test
  @TestMetadata("List_ActualIterableAlias.kt")
  public void testList_ActualIterableAlias() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/List_ActualIterableAlias.kt");
  }

  @Test
  @TestMetadata("List_Iterable.kt")
  public void testList_Iterable() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/List_Iterable.kt");
  }

  @Test
  @TestMetadata("List_IterableAlias.kt")
  public void testList_IterableAlias() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/List_IterableAlias.kt");
  }

  @Test
  @TestMetadata("List_List.kt")
  public void testList_List() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/List_List.kt");
  }

  @Test
  @TestMetadata("List_NestedIterableAlias.kt")
  public void testList_NestedIterableAlias() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/List_NestedIterableAlias.kt");
  }

  @Test
  @TestMetadata("List_NullableIterable.kt")
  public void testList_NullableIterable() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/List_NullableIterable.kt");
  }

  @Test
  @TestMetadata("List_NullableList.kt")
  public void testList_NullableList() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/List_NullableList.kt");
  }

  @Test
  @TestMetadata("List_Unknown.kt")
  public void testList_Unknown() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/List_Unknown.kt");
  }

  @Test
  @TestMetadata("List_UnknownExpansion.kt")
  public void testList_UnknownExpansion() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/List_UnknownExpansion.kt");
  }

  @Test
  @TestMetadata("NestedListAlias_Iterable.kt")
  public void testNestedListAlias_Iterable() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/NestedListAlias_Iterable.kt");
  }

  @Test
  @TestMetadata("NullableHuman_Human.kt")
  public void testNullableHuman_Human() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/NullableHuman_Human.kt");
  }

  @Test
  @TestMetadata("NullableHuman_NullableHuman.kt")
  public void testNullableHuman_NullableHuman() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/NullableHuman_NullableHuman.kt");
  }

  @Test
  @TestMetadata("NullableList_Iterable.kt")
  public void testNullableList_Iterable() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/NullableList_Iterable.kt");
  }

  @Test
  @TestMetadata("NullableList_List.kt")
  public void testNullableList_List() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/NullableList_List.kt");
  }

  @Test
  @TestMetadata("NullableList_NullableIterable.kt")
  public void testNullableList_NullableIterable() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/NullableList_NullableIterable.kt");
  }

  @Test
  @TestMetadata("NullableList_NullableList.kt")
  public void testNullableList_NullableList() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/NullableList_NullableList.kt");
  }

  @Test
  @TestMetadata("StringBuilderTypeAlias.kt")
  public void testStringBuilderTypeAlias() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/StringBuilderTypeAlias.kt");
  }

  @Test
  @TestMetadata("TypeArguments_O_Bar.kt")
  public void testTypeArguments_O_Bar() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/TypeArguments_O_Bar.kt");
  }

  @Test
  @TestMetadata("TypeArguments_O_Baz.kt")
  public void testTypeArguments_O_Baz() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/TypeArguments_O_Baz.kt");
  }

  @Test
  @TestMetadata("TypeArguments_O_Foo.kt")
  public void testTypeArguments_O_Foo() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/TypeArguments_O_Foo.kt");
  }

  @Test
  @TestMetadata("TypeArguments_O_Thing.kt")
  public void testTypeArguments_O_Thing() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/TypeArguments_O_Thing.kt");
  }

  @Test
  @TestMetadata("TypeArguments_Y_Bar.kt")
  public void testTypeArguments_Y_Bar() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/TypeArguments_Y_Bar.kt");
  }

  @Test
  @TestMetadata("TypeArguments_Y_Baz.kt")
  public void testTypeArguments_Y_Baz() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/TypeArguments_Y_Baz.kt");
  }

  @Test
  @TestMetadata("TypeArguments_Y_Foo.kt")
  public void testTypeArguments_Y_Foo() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/TypeArguments_Y_Foo.kt");
  }

  @Test
  @TestMetadata("TypeArguments_Y_Thing.kt")
  public void testTypeArguments_Y_Thing() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/TypeArguments_Y_Thing.kt");
  }

  @Test
  @TestMetadata("TypeArguments_Z_Bar.kt")
  public void testTypeArguments_Z_Bar() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/TypeArguments_Z_Bar.kt");
  }

  @Test
  @TestMetadata("TypeArguments_Z_Baz.kt")
  public void testTypeArguments_Z_Baz() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/TypeArguments_Z_Baz.kt");
  }

  @Test
  @TestMetadata("TypeArguments_Z_Foo.kt")
  public void testTypeArguments_Z_Foo() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/TypeArguments_Z_Foo.kt");
  }

  @Test
  @TestMetadata("TypeArguments_Z_Thing.kt")
  public void testTypeArguments_Z_Thing() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/TypeArguments_Z_Thing.kt");
  }

  @Test
  @TestMetadata("UnboundedTypeParameter_Iterable.kt")
  public void testUnboundedTypeParameter_Iterable() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/UnboundedTypeParameter_Iterable.kt");
  }

  @Test
  @TestMetadata("Unknown_List.kt")
  public void testUnknown_List() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/Unknown_List.kt");
  }

  @Test
  @TestMetadata("Unknown_ListAlias.kt")
  public void testUnknown_ListAlias() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/subtypingAndEquality/Unknown_ListAlias.kt");
  }
}
