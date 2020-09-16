/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0.
 */

description = "AWS client runtime support for generated service clients"
extra["displayName"] = "Software :: AWS :: KotlinSdk :: Client Runtime"
extra["moduleName"] = "software.aws.kotlinsdk"


val smithyKotlinClientRtVersion: String by project

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                api("software.aws.smithy.kotlin:client-rt-core:$smithyKotlinClientRtVersion")
            }
        }
    }
}