allprojects {
  apply(plugin = "org.springframework.boot")
  apply(plugin = "io.spring.dependency-management")

  dependencies {
    compile("org.springframework.boot", "spring-boot-starter") {
      exclude(group = "org.springframework.boot", module = "spring-boot-starter-logging")
    }
    compile("org.springframework.boot", "spring-boot-starter-test")
    testCompile("junit", "junit", "4.12")
  }
  configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
  }
}
