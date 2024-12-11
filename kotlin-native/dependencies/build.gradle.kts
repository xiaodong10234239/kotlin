/*
 * Copyright 2010-2023 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

import org.jetbrains.kotlin.konan.target.TargetWithSanitizer
import org.jetbrains.kotlin.konan.target.allTargetsWithSanitizers
import org.jetbrains.kotlin.konan.util.DependencyDirectories

plugins {
    id("native-dependencies-downloader")
    id("native-dependencies")
}

nativeDependenciesDownloader {
    repositoryURL.set("https://cache-redirector.jetbrains.com/download.jetbrains.com/kotlin/native")
    println("kotlinBuildProperties.konanDataDir=${DependencyDirectories.getDependenciesRoot(kotlinBuildProperties.konanDataDir).path}")
    dependenciesDirectory.set(DependencyDirectories.getDependenciesRoot(kotlinBuildProperties.konanDataDir))

//    platformManager.allTargetsWithSanitizers.map {
//        println("family2=${it.target.family.name}")
//        if (it.target.family.name != "OHOS") {
//            this.target(it, {})
//        }
//
//
//    }

    allTargets {
    }.forEach {

    }


}


/**
 * Download all dependencies.
 */
val update by tasks.registering {
    platformManager.allTargetsWithSanitizers.forEach {
        dependsOn(nativeDependencies.targetDependency(it))
    }
}

// TODO: This sort of task probably belongs to :kotlin-native
val rmDotKonan by tasks.registering(Delete::class) {
    val dir = System.getenv("KONAN_DATA_DIR") ?: "${System.getProperty("user.home")}/.konan"
    delete(dir)
}
