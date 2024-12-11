/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.js.test.ir

import org.jetbrains.kotlin.js.test.JsAdditionalSourceProvider
import org.jetbrains.kotlin.js.test.JsFailingTestSuppressor
import org.jetbrains.kotlin.js.test.handlers.*
import org.jetbrains.kotlin.platform.js.JsPlatforms
import org.jetbrains.kotlin.test.Constructor
import org.jetbrains.kotlin.test.TargetBackend
import org.jetbrains.kotlin.test.backend.BlackBoxCodegenSuppressor
import org.jetbrains.kotlin.test.backend.handlers.*
import org.jetbrains.kotlin.test.builders.*
import org.jetbrains.kotlin.test.directives.DiagnosticsDirectives
import org.jetbrains.kotlin.test.directives.DiagnosticsDirectives.DIAGNOSTICS
import org.jetbrains.kotlin.test.directives.JsEnvironmentConfigurationDirectives
import org.jetbrains.kotlin.test.directives.LanguageSettingsDirectives
import org.jetbrains.kotlin.test.directives.model.ValueDirective
import org.jetbrains.kotlin.test.frontend.classic.handlers.ClassicDiagnosticsHandler
import org.jetbrains.kotlin.test.frontend.fir.handlers.FirDiagnosticsHandler
import org.jetbrains.kotlin.test.model.*
import org.jetbrains.kotlin.test.runners.AbstractKotlinCompilerWithTargetBackendTest
import org.jetbrains.kotlin.test.runners.codegen.commonClassicFrontendHandlersForCodegenTest
import org.jetbrains.kotlin.test.services.LibraryProvider
import org.jetbrains.kotlin.test.services.configuration.CommonEnvironmentConfigurator
import org.jetbrains.kotlin.test.services.configuration.JsEnvironmentConfigurator
import org.jetbrains.kotlin.test.services.sourceProviders.CoroutineHelpersSourceFilesProvider
import org.jetbrains.kotlin.utils.bind
import java.lang.Boolean.getBoolean

abstract class AbstractJsBlackBoxCodegenTestBase<R : ResultingArtifact.FrontendOutput<R>, I : ResultingArtifact.BackendInput<I>, A : ResultingArtifact.Binary<A>>(
    val targetFrontend: FrontendKind<R>,
    targetBackend: TargetBackend,
    private val pathToTestDir: String,
    private val testGroupOutputDirPrefix: String,
) : AbstractKotlinCompilerWithTargetBackendTest(targetBackend) {
    abstract val frontendFacade: Constructor<FrontendFacade<R>>
    abstract val frontendToBackendConverter: Constructor<Frontend2BackendConverter<R, I>>
    abstract val irInliningFacade: Constructor<IrInliningFacade<I>>
    abstract val backendFacade: Constructor<BackendFacade<I, A>>
    abstract val afterBackendFacade: Constructor<AbstractTestFacade<A, BinaryArtifacts.Js>>?
    abstract val recompileFacade: Constructor<AbstractTestFacade<BinaryArtifacts.Js, BinaryArtifacts.Js>>

    override fun TestConfigurationBuilder.configuration() {
        commonConfigurationForJsBlackBoxCodegenTest()
        jsArtifactsHandlersStep {
            useHandlers(
                ::NodeJsGeneratorHandler,
                ::JsBoxRunner,
                ::JsAstHandler
            )
        }
    }

    protected fun TestConfigurationBuilder.commonConfigurationForJsBlackBoxCodegenTest(customIgnoreDirective: ValueDirective<TargetBackend>? = null) {
        commonConfigurationForJsCodegenTest(targetFrontend, frontendFacade, frontendToBackendConverter, irInliningFacade, backendFacade, customIgnoreDirective)

        val pathToRootOutputDir = System.getProperty("kotlin.js.test.root.out.dir") ?: error("'kotlin.js.test.root.out.dir' is not set")
        defaultDirectives {
            JsEnvironmentConfigurationDirectives.PATH_TO_ROOT_OUTPUT_DIR with pathToRootOutputDir
            JsEnvironmentConfigurationDirectives.PATH_TO_TEST_DIR with pathToTestDir
            JsEnvironmentConfigurationDirectives.TEST_GROUP_OUTPUT_DIR_PREFIX with testGroupOutputDirPrefix
            +JsEnvironmentConfigurationDirectives.GENERATE_NODE_JS_RUNNER
            if (getBoolean("kotlin.js.ir.skipRegularMode")) +JsEnvironmentConfigurationDirectives.SKIP_REGULAR_MODE
        }

        useAdditionalSourceProviders(
            ::JsAdditionalSourceProvider,
            ::CoroutineHelpersSourceFilesProvider,
        )

        forTestsNotMatching(
            "compiler/testData/codegen/box/diagnostics/functions/tailRecursion/*" or
                    "compiler/testData/diagnostics/*"
        ) {
            defaultDirectives {
                DIAGNOSTICS with "-warnings"
            }
        }

        enableMetaInfoHandler()

        configureIrHandlersStep {
            useHandlers(::IrMangledNameAndSignatureDumpHandler)
        }

        afterBackendFacade?.let { facadeStep(it) }
        facadeStep(recompileFacade)
        jsArtifactsHandlersStep {
            useHandlers(
                ::JsSourceMapPathRewriter,
                ::JsSyntheticAccessorsDumpHandler,
            )
        }

        useAfterAnalysisCheckers(
            ::JsArtifactsDumpHandler
        )

        forTestsMatching("compiler/testData/codegen/box/involvesIrInterpreter/*") {
            enableMetaInfoHandler()
            configureKlibArtifactsHandlersStep {
                useHandlers(::KlibInterpreterDumpHandler)
            }
            configureJsArtifactsHandlersStep {
                useHandlers(::JsIrInterpreterDumpHandler)
            }
        }

        forTestsMatching("compiler/testData/codegen/box/properties/backingField/*") {
            defaultDirectives {
                LanguageSettingsDirectives.LANGUAGE with "+ExplicitBackingFields"
            }
        }
    }
}

@Suppress("reformat")
fun <
    R : ResultingArtifact.FrontendOutput<R>,
    I : ResultingArtifact.BackendInput<I>,
    A : ResultingArtifact.Binary<A>
> TestConfigurationBuilder.commonConfigurationForJsCodegenTest(
    targetFrontend: FrontendKind<R>,
    frontendFacade: Constructor<FrontendFacade<R>>,
    frontendToBackendConverter: Constructor<Frontend2BackendConverter<R, I>>,
    irInliningFacade: Constructor<IrInliningFacade<I>>,
    backendFacade: Constructor<BackendFacade<I, A>>,
    customIgnoreDirective: ValueDirective<TargetBackend>? = null,
) {
    globalDefaults {
        frontend = targetFrontend
        targetPlatform = JsPlatforms.defaultJsPlatform
        dependencyKind = DependencyKind.Binary
    }

    defaultDirectives {
        +DiagnosticsDirectives.REPORT_ONLY_EXPLICITLY_DEFINED_DEBUG_INFO
    }

    useConfigurators(
        ::CommonEnvironmentConfigurator,
        ::JsEnvironmentConfigurator,
    )

    useAdditionalService(::LibraryProvider)

    useAfterAnalysisCheckers(
        ::JsFailingTestSuppressor,
        ::BlackBoxCodegenSuppressor.bind(customIgnoreDirective),
    )

    facadeStep(frontendFacade)
    classicFrontendHandlersStep {
        commonClassicFrontendHandlersForCodegenTest()
        useHandlers(::ClassicDiagnosticsHandler)
    }

    firHandlersStep {
        useHandlers(::FirDiagnosticsHandler)
    }

    facadeStep(frontendToBackendConverter)
    irHandlersStep()

    facadeStep(irInliningFacade)

    facadeStep(backendFacade)
    klibArtifactsHandlersStep {
        useHandlers(::KlibBackendDiagnosticsHandler)
    }
}
