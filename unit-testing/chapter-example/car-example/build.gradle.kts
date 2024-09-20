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

}

tasks.test {
    useJUnitPlatform()
}