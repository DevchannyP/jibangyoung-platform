rootProject.name = "jibangyoung-backend"

// ✅ 하위 모듈 include
include(
    "modules:auth",
    "modules:user",
    "modules:policy",
    "core:common",
    "core:security",
    "core:exception",
    "core:support",
    "core:annotation",
    "config",
    "JobScheduler", // 또는 "job-scheduler"
    "app"
)

// ✅ 플러그인 해석 위치
pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

// ✅ 의존성/버전 관리
dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

    versionCatalogs {
        create("myLibs") {
            from(files("gradle/libs.versions.toml"))
        }
    }
}

// ✅ Gradle toolchain 자동 설정 (JDK 관리용)
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
