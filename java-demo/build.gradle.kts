buildscript {
  repositories {
    mavenLocal()
    maven("https://maven.aliyun.com/repository/spring")
    maven("https://maven.aliyun.com/repository/spring-plugin")
    maven("https://maven.aliyun.com/repository/public")
    mavenCentral()
    jcenter()
  }

  dependencies {
    classpath("org.springframework.boot", "spring-boot-gradle-plugin", "2.3.0.RELEASE")
    classpath("io.freefair.gradle", "lombok-plugin", "3.2.1")
    classpath("com.diffplug.spotless", "spotless-plugin-gradle", "3.25.0")
  }
}

plugins {
  idea
  `java-library`
  `maven-publish`
}

group = "com.yechangqing"
version = "1.0.0-SNAPSHOT"

allprojects {
  apply(plugin = "java")
  apply(plugin = "java-library")
  repositories {
    mavenLocal()
    maven("https://maven.aliyun.com/repository/spring")
    maven("https://maven.aliyun.com/repository/spring-plugin")
    maven("https://maven.aliyun.com/repository/public")
    mavenCentral()
    jcenter()
  }
  tasks.test{
    useJUnitPlatform()
  }
}
