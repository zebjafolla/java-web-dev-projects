import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.dependencies as dependencies1

plugins {
    id("java")
}

group = "org.launchcode"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}