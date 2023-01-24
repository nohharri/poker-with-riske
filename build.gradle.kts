import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kotlinWrappersVersion = "1.0.0-pre.466"


plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose") version "1.3.0-rc01"
}

group "com.pwr"
version "1.0-SNAPSHOT"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

fun kotlinw(target: String): String = "org.jetbrains.kotlin-wrappers:kotlin-$target"

kotlin {
    js(IR) {
        browser {
            testTask {
                testLogging.showStandardStreams = true
                useKarma {
                    useChromeHeadless()
                    useFirefox()
                }
            }
        }
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
//                implementation("androidx.annotation:annotation:1.5.0")
                implementation(compose.web.core)
                implementation(compose.runtime)
                implementation(kotlinw("react-router-dom"))
                //                implementation("androidx.compose.ui:ui:1.3.2")
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}

// This block must be placed after the kotlin block
dependencies {
    "jsMainImplementation"(enforcedPlatform(kotlinw("wrappers-bom:1.0.0-pre.341")))
}