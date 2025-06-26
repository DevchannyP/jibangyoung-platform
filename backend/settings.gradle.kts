rootProject.name = "jibangyoung-backend"

include(
    "modules:auth", "modules:user", "modules:policy",
    "core:common", "core:security", "core:exception", "core:support", "core:annotation",
    "config", "JobScheduler", "app"
)

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from(files("gradle/libs.versions.toml"))
        }
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
