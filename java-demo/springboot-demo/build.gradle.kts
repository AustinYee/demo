plugins {
    java
    `maven-publish`
}

buildscript {
    repositories {
        maven("http://maven.aliyun.com/nexus/content/groups/public/")
        jcenter()
        mavenCentral()
    }

    dependencies {
        classpath("org.springframework.boot", "spring-boot-gradle-plugin", "2.1.6.RELEASE")
        classpath("io.freefair.gradle", "lombok-plugin", "3.2.1")
    }
}



group = "com.yechangqing"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val springBootVersion = "2.1.6.RELEASE"

dependencies {
    apply(plugin = "org.springframework.boot")
    compile("org.springframework.boot", "spring-boot-starter", springBootVersion)
    compile("org.springframework.boot", "spring-boot-starter-test", springBootVersion)
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

