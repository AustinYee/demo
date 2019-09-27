plugins {
    java
}

group = "com.yechangqing"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}
val springBootVersion = "2.1.6.RELEASE"

dependencies {
  compile("org.springframework.boot", "spring-boot-starter", springBootVersion)
  testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
