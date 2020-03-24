import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.31"
}

group = "com.yechangqing.demo"
version = "1.0.0-SNAPSHOT"

repositories {
    maven("http://maven.aliyun.com/nexus/content/groups/public/")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}