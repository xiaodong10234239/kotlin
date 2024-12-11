/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.standalone.fir.test.cases.generated.cases.components.diagnosticProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.standalone.fir.test.configurators.AnalysisApiFirStandaloneModeTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.diagnosticProvider.AbstractDanglingFileCollectDiagnosticsTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics")
@TestDataPath("$PROJECT_ROOT")
public class FirStandaloneNormalAnalysisSourceModuleDanglingFileCollectDiagnosticsTestGenerated extends AbstractDanglingFileCollectDiagnosticsTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFirStandaloneModeTestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fir,
        TestModuleKind.Source,
        AnalysisSessionMode.Normal,
        AnalysisApiMode.Standalone
      )
    );
  }

  @Test
  public void testAllFilesPresentInDiagnostics() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("annotationWithEnumFromDuplicatedLibrary.kt")
  public void testAnnotationWithEnumFromDuplicatedLibrary() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/annotationWithEnumFromDuplicatedLibrary.kt");
  }

  @Test
  @TestMetadata("danglingAnnotationInMiddle.kt")
  public void testDanglingAnnotationInMiddle() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/danglingAnnotationInMiddle.kt");
  }

  @Test
  @TestMetadata("danglingAnnotationInMiddleWithComment.kt")
  public void testDanglingAnnotationInMiddleWithComment() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/danglingAnnotationInMiddleWithComment.kt");
  }

  @Test
  @TestMetadata("declarationErrors.kt")
  public void testDeclarationErrors() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/declarationErrors.kt");
  }

  @Test
  @TestMetadata("delegationToLibraryInterface.kt")
  public void testDelegationToLibraryInterface() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/delegationToLibraryInterface.kt");
  }

  @Test
  @TestMetadata("deprecationFromLibrary.kt")
  public void testDeprecationFromLibrary() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/deprecationFromLibrary.kt");
  }

  @Test
  @TestMetadata("duplicatedCallableWithImplicitType.kt")
  public void testDuplicatedCallableWithImplicitType() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/duplicatedCallableWithImplicitType.kt");
  }

  @Test
  @TestMetadata("errorsInFunctionalInterfacesInstances.kt")
  public void testErrorsInFunctionalInterfacesInstances() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/errorsInFunctionalInterfacesInstances.kt");
  }

  @Test
  @TestMetadata("externalAnnotations.kt")
  public void testExternalAnnotations() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/externalAnnotations.kt");
  }

  @Test
  @TestMetadata("genericsOnOuterClass.kt")
  public void testGenericsOnOuterClass() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/genericsOnOuterClass.kt");
  }

  @Test
  @TestMetadata("incompleteDelegation.kt")
  public void testIncompleteDelegation() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/incompleteDelegation.kt");
  }

  @Test
  @TestMetadata("incompleteFor.kt")
  public void testIncompleteFor() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/incompleteFor.kt");
  }

  @Test
  @TestMetadata("inferTypeFromGetValueDelegate.kt")
  public void testInferTypeFromGetValueDelegate() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/inferTypeFromGetValueDelegate.kt");
  }

  @Test
  @TestMetadata("inferTypeFromGetValueDelegateLibrary.kt")
  public void testInferTypeFromGetValueDelegateLibrary() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/inferTypeFromGetValueDelegateLibrary.kt");
  }

  @Test
  @TestMetadata("javaInnerClass.kt")
  public void testJavaInnerClass() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/javaInnerClass.kt");
  }

  @Test
  @TestMetadata("javaInnerClassFromAnotherModule.kt")
  public void testJavaInnerClassFromAnotherModule() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/javaInnerClassFromAnotherModule.kt");
  }

  @Test
  @TestMetadata("javaInnerClassFromLibrary.kt")
  public void testJavaInnerClassFromLibrary() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/javaInnerClassFromLibrary.kt");
  }

  @Test
  @TestMetadata("javaNestedClass.kt")
  public void testJavaNestedClass() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/javaNestedClass.kt");
  }

  @Test
  @TestMetadata("javaNestedClassFromAnotherModule.kt")
  public void testJavaNestedClassFromAnotherModule() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/javaNestedClassFromAnotherModule.kt");
  }

  @Test
  @TestMetadata("javaNestedClassFromLibrary.kt")
  public void testJavaNestedClassFromLibrary() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/javaNestedClassFromLibrary.kt");
  }

  @Test
  @TestMetadata("libraryDataClassCopy.kt")
  public void testLibraryDataClassCopy() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/libraryDataClassCopy.kt");
  }

  @Test
  @TestMetadata("libraryDataClassCopyReversedOrder.kt")
  public void testLibraryDataClassCopyReversedOrder() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/libraryDataClassCopyReversedOrder.kt");
  }

  @Test
  @TestMetadata("overrideProtectedClassReturnFromLibrary.kt")
  public void testOverrideProtectedClassReturnFromLibrary() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/overrideProtectedClassReturnFromLibrary.kt");
  }

  @Test
  @TestMetadata("resolutionErrors.kt")
  public void testResolutionErrors() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/resolutionErrors.kt");
  }

  @Test
  @TestMetadata("sameCallableIdFromDependencies.kt")
  public void testSameCallableIdFromDependencies() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/sameCallableIdFromDependencies.kt");
  }

  @Test
  @TestMetadata("typeMismatches.kt")
  public void testTypeMismatches() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/typeMismatches.kt");
  }

  @Test
  @TestMetadata("unresolved.kt")
  public void testUnresolved() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolved.kt");
  }

  @Test
  @TestMetadata("unresolvedAnnotationsOnPropertyFromParameter.kt")
  public void testUnresolvedAnnotationsOnPropertyFromParameter() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedAnnotationsOnPropertyFromParameter.kt");
  }

  @Test
  @TestMetadata("unresolvedReferenceInsideSuperConstructorCall.kt")
  public void testUnresolvedReferenceInsideSuperConstructorCall() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedReferenceInsideSuperConstructorCall.kt");
  }

  @Test
  @TestMetadata("unresolvedReferenceInsideSuperConstructorCallWithLocalFunction.kt")
  public void testUnresolvedReferenceInsideSuperConstructorCallWithLocalFunction() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedReferenceInsideSuperConstructorCallWithLocalFunction.kt");
  }

  @Test
  @TestMetadata("unresolvedReferenceInsideSuperConstructorCallWithPrimaryConstructor.kt")
  public void testUnresolvedReferenceInsideSuperConstructorCallWithPrimaryConstructor() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedReferenceInsideSuperConstructorCallWithPrimaryConstructor.kt");
  }

  @Test
  @TestMetadata("unresolvedReferenceInsideSuperConstructorCallWithSecondaryConstructor.kt")
  public void testUnresolvedReferenceInsideSuperConstructorCallWithSecondaryConstructor() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedReferenceInsideSuperConstructorCallWithSecondaryConstructor.kt");
  }

  @Test
  @TestMetadata("unresolvedReferenceInsideSuperPrimaryConstructorCallWithLocalFunction.kt")
  public void testUnresolvedReferenceInsideSuperPrimaryConstructorCallWithLocalFunction() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedReferenceInsideSuperPrimaryConstructorCallWithLocalFunction.kt");
  }

  @Test
  @TestMetadata("unresolvedSuperConstructorCall.kt")
  public void testUnresolvedSuperConstructorCall() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedSuperConstructorCall.kt");
  }

  @Test
  @TestMetadata("unusedDestructuring.kt")
  public void testUnusedDestructuring() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unusedDestructuring.kt");
  }

  @Test
  @TestMetadata("varargParameterFromLibraryWithFunctionalType.kt")
  public void testVarargParameterFromLibraryWithFunctionalType() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/varargParameterFromLibraryWithFunctionalType.kt");
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression")
  @TestDataPath("$PROJECT_ROOT")
  public class Suppression {
    @Test
    public void testAllFilesPresentInSuppression() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("conflictingOverloadsAtTopLevel.kt")
    public void testConflictingOverloadsAtTopLevel() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/conflictingOverloadsAtTopLevel.kt");
    }

    @Test
    @TestMetadata("conflictingOverloadsAtTopLevel2.kt")
    public void testConflictingOverloadsAtTopLevel2() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/conflictingOverloadsAtTopLevel2.kt");
    }

    @Test
    @TestMetadata("conflictingOverloadsAtTopLevelWithFileSuppression.kt")
    public void testConflictingOverloadsAtTopLevelWithFileSuppression() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/conflictingOverloadsAtTopLevelWithFileSuppression.kt");
    }

    @Test
    @TestMetadata("conflictingOverloadsInClass.kt")
    public void testConflictingOverloadsInClass() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/conflictingOverloadsInClass.kt");
    }

    @Test
    @TestMetadata("conflictingOverloadsInNestedClass.kt")
    public void testConflictingOverloadsInNestedClass() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/conflictingOverloadsInNestedClass.kt");
    }

    @Test
    @TestMetadata("deprecationAtTopLevel.kt")
    public void testDeprecationAtTopLevel() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/deprecationAtTopLevel.kt");
    }

    @Test
    @TestMetadata("globalWarningSuppression.kt")
    public void testGlobalWarningSuppression() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/globalWarningSuppression.kt");
    }
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when")
  @TestDataPath("$PROJECT_ROOT")
  public class When {
    @Test
    public void testAllFilesPresentInWhen() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("sealedClassFromDependencyExhaustive.kt")
    public void testSealedClassFromDependencyExhaustive() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedClassFromDependencyExhaustive.kt");
    }

    @Test
    @TestMetadata("sealedClassFromDependencyMissingCase.kt")
    public void testSealedClassFromDependencyMissingCase() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedClassFromDependencyMissingCase.kt");
    }

    @Test
    @TestMetadata("sealedClassFromLibraryExhaustive.kt")
    public void testSealedClassFromLibraryExhaustive() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedClassFromLibraryExhaustive.kt");
    }

    @Test
    @TestMetadata("sealedClassFromLibraryMissingCase.kt")
    public void testSealedClassFromLibraryMissingCase() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedClassFromLibraryMissingCase.kt");
    }

    @Test
    @TestMetadata("sealedClassSameModuleExhaustive.kt")
    public void testSealedClassSameModuleExhaustive() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedClassSameModuleExhaustive.kt");
    }

    @Test
    @TestMetadata("sealedClassSameModuleMissingCase.kt")
    public void testSealedClassSameModuleMissingCase() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedClassSameModuleMissingCase.kt");
    }

    @Test
    @TestMetadata("sealedInterfaceFromDependencyExhaustive.kt")
    public void testSealedInterfaceFromDependencyExhaustive() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedInterfaceFromDependencyExhaustive.kt");
    }

    @Test
    @TestMetadata("sealedInterfaceFromDependencyMissingCase.kt")
    public void testSealedInterfaceFromDependencyMissingCase() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedInterfaceFromDependencyMissingCase.kt");
    }

    @Test
    @TestMetadata("sealedInterfaceFromLibraryExhaustive.kt")
    public void testSealedInterfaceFromLibraryExhaustive() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedInterfaceFromLibraryExhaustive.kt");
    }

    @Test
    @TestMetadata("sealedInterfaceFromLibraryMissingCase.kt")
    public void testSealedInterfaceFromLibraryMissingCase() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedInterfaceFromLibraryMissingCase.kt");
    }

    @Test
    @TestMetadata("sealedInterfaceSameModuleExhaustive.kt")
    public void testSealedInterfaceSameModuleExhaustive() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedInterfaceSameModuleExhaustive.kt");
    }

    @Test
    @TestMetadata("sealedInterfaceSameModuleMissingCase.kt")
    public void testSealedInterfaceSameModuleMissingCase() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedInterfaceSameModuleMissingCase.kt");
    }
  }
}
