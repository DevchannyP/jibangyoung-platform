dependencies {
    implementation(libs.spring.boot.starter.web)
    implementation(libs.spring.boot.starter.security)
    implementation(libs.spring.boot.starter.data.jpa)
    implementation(libs.spring.boot.starter.data.redis)
    implementation(libs.spring.boot.starter.batch)
    implementation(libs.spring.boot.starter.oauth2.client)

    implementation(libs.jjwt.api)
    runtimeOnly(libs.jjwt.impl)
    runtimeOnly(libs.jjwt.jackson)

    implementation(libs.jackson.module.kotlin)
    implementation(libs.guava)
    implementation(libs.commons.codec)
    implementation(libs.bouncycastle)

    implementation(libs.springdoc.openapi)
    implementation(libs.aws.s3)
    implementation(libs.elasticsearch.java)
    implementation(libs.jsoup)

    implementation(libs.shedlock.spring)
    implementation(libs.shedlock.jdbc)

    implementation(libs.querydsl.jpa)
    kapt(libs.querydsl.apt)

    testImplementation(libs.spring.boot.starter.test)
    testImplementation(libs.mockito.core)
    testImplementation(libs.kotlin.test.junit5)
}
