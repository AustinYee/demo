subprojects {
  apply(plugin = "org.springframework.boot")
  apply(plugin = "io.spring.dependency-management")

  dependencies {
    compile("org.springframework.boot", "spring-boot-starter")
    compile("org.springframework.boot", "spring-boot-starter-test")
    testCompile("org.junit.jupiter", "junit-jupiter-api", "5.6.0")
  }
  configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
  }
}
