plugins {
    kotlin("jvm") version "1.8.0"
}

group = "in.co.kingmaker.hackerrank"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}