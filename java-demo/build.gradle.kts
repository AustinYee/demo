buildscript {
  repositories {
    maven("http://maven.aliyun.com/nexus/content/groups/public/")
    jcenter()
    mavenCentral()
  }

  dependencies {
    classpath("org.springframework.boot", "spring-boot-gradle-plugin", "2.2.0.RELEASE")
    classpath("io.freefair.gradle", "lombok-plugin", "3.2.1")
    classpath("com.diffplug.spotless", "spotless-plugin-gradle", "3.25.0")
  }
}

plugins {
  java
<<<<<<< Updated upstream
  idea
  `java-library`
  `maven-publish`
=======
>>>>>>> Stashed changes
}



group = "com.yechangqing"
version = "1.0.0-SNAPSHOT"

allprojects {
  apply(plugin = "java")
  apply(plugin = "java-library")
  repositories {
    maven("http://maven.aliyun.com/nexus/content/groups/public/")
    mavenCentral()
  }
}
