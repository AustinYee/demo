subprojects {
  apply(plugin = "org.springframework.boot")
  apply(plugin = "io.spring.dependency-management")

  dependencies {
    api("org.springframework.boot", "spring-boot-starter")
    api("org.springframework.boot", "spring-boot-starter-test")
    testImplementation("org.junit.jupiter", "junit-jupiter-api", "5.6.0")
  }
  configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
  }
}
