buildscript {
  repositories {
    maven("http://maven.aliyun.com/nexus/content/groups/public/")
    jcenter()
    mavenCentral()
  }

  dependencies {
    classpath("org.springframework.boot", "spring-boot-gradle-plugin", "2.1.6.RELEASE")
    classpath("io.freefair.gradle", "lombok-plugin", "3.2.1")
    classpath("com.diffplug.spotless", "spotless-plugin-gradle", "3.25.0")

  }
}

plugins {
  java
  idea
  `maven-publish`
}

group = "com.yechangqing"
version = "1.0.0-SNAPSHOT"



allprojects {
  apply(plugin = "java")
  apply(plugin = "org.springframework.boot")
  apply(plugin = "io.spring.dependency-management")
  repositories {
    maven("http://maven.aliyun.com/nexus/content/groups/public/")
    mavenCentral()
  }

  dependencies {
    compile("org.springframework.boot", "spring-boot-starter")
    compile("org.springframework.boot", "spring-boot-starter-test")
    testCompile("junit", "junit", "4.12")
  }
  configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
  }
}


