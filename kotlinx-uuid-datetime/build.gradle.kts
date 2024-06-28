/*
 * Copyright 2020-2021 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 * Copyright 2021 hfhbd and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    id("kotlinMPP")
    id("publish")
    id("dokkaLicensee")
}

kotlin.sourceSets {
    commonMain {
        dependencies {
            api(projects.kotlinxUuidCore)
            api(libs.datetime)
        }
    }
    commonTest {
        dependencies {
            implementation(kotlin("test"))
        }
    }
}
