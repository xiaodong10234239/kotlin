/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.resolve.extensions

import com.intellij.openapi.Disposable
import com.intellij.psi.search.GlobalSearchScope
import org.jetbrains.kotlin.analysis.api.KaExperimentalApi
import org.jetbrains.kotlin.name.FqName

/**
 * Provides a list of Kotlin files which contain additional generated declarations for resolution.
 *
 * It is created by [KaResolveExtensionProvider].
 *
 * All member implementations should:
 * - consider caching the results for subsequent invocations.
 * - be lightweight and not build the whole file structure inside.
 * - not use Kotlin resolve inside, as these functions are called during session initialization, so Analysis API access is forbidden.
 *
 * #### Lifecycle Management
 *
 * A [KaResolveExtension] is tied to the lifetime of its module's analysis session. It is created by [KaResolveExtensionProvider] during
 * creation of an analysis session, and disposed after the analysis session has been invalidated.
 *
 * [KaResolveExtension] implements the [Disposable] interface. The resolve extension can then act as a parent disposable, e.g. for a message
 * bus connection.
 *
 * You *must not* implement [KaResolveExtension]s as module-level services, due to the following reasons:
 *
 * 1. The IntelliJ platform SDK [discourages](https://plugins.jetbrains.com/docs/intellij/plugin-services.html#types) the use of
 *    module-level services due to memory consumption. In particular, resolve extensions implemented as module-level services live longer
 *    than their corresponding analysis session, so the resolve extension would not be garbage collected after its corresponding analysis
 *    session has been invalidated.
 * 2. The module-level service living longer than the analysis session increases the risk of caching invalidated entities in a resolve
 *    extension.
 * 3. Because the [KaResolveExtension] is a [Disposable], if implemented as a module-level service, the service would be disposed too early
 *    during invalidation of the corresponding analysis session.
 *
 * @see KaResolveExtensionFile
 * @see KaResolveExtensionProvider
 */
@KaExperimentalApi
public abstract class KaResolveExtension : Disposable {
    /**
     * Get the list of files that should be generated for the module. Returned files should contain valid Kotlin code.
     *
     * If the content of these files becomes invalid (e.g., because the source declarations they were based on changed), the
     * [KaResolveExtension] must publish an out-of-block modification event via the Analysis API message bus:
     * `KotlinModificationTopics.MODULE_OUT_OF_BLOCK_MODIFICATION`.
     *
     * To react to changes in Kotlin sources, [KaResolveExtension] may subscribe to Analysis API modification topics:
     * `KotlinModificationTopics`. If the [KaResolveExtension] both subscribes to and publishes modification events, care needs to be taken
     * that no cycles are introduced. In general, the [KaResolveExtension] should never publish an event for a module A in a listener for
     * the same module A.
     *
     * An out-of-block modification event for the [KaResolveExtension]'s associated module does not need to be published in response to an
     * out-of-block modification event for the same module, because the original event suffices for invalidation.
     *
     * @see KaResolveExtensionFile
     * @see KaResolveExtension
     */
    public abstract fun getKtFiles(): List<KaResolveExtensionFile>

    /**
     * Returns the set of packages that are contained in the files provided by [getKtFiles].
     *
     * The returned package set should be a strict set of all file packages,
     * so `for-all pckg: pckg in getContainedPackages() <=> exists file: file in getKtFiles() && file.getFilePackageName() == pckg`
     *
     * @see KaResolveExtension
     */
    public abstract fun getContainedPackages(): Set<FqName>

    /**
     * Returns the scope of files that should be shadowed by the files provided by [getKtFiles].
     *
     * Any files in the module that are included in this scope will be removed from analysis results. This allows the files provided by
     * [getKtFiles] to cleanly replace those files from the module.
     *
     * If this resolve extension is being used to generate declarations that would normally be provided by sources generated by an external
     * build task, such as a resource compiler or annotation processor, the resolve extension should provide a scope here that covers those
     * externally generated sources. This will prevent collisions between the definitions provided by [getKtFiles] and those provided by the
     * (potentially stale) externally generated sources.
     */
    public open fun getShadowedScope(): GlobalSearchScope = GlobalSearchScope.EMPTY_SCOPE

    override fun dispose() {
    }
}
