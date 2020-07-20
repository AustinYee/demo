import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "1.3.41"
  id("com.google.protobuf") version "0.8.10"
}

group = "com.yechangqing"
version = "1.0.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7")
  implementation(kotlin("stdlib-jdk8"))
}

tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "1.8"
}
