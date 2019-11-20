repositories {
  mavenCentral()
}

dependencies {
  compile("org.springframework.boot", "spring-boot-starter-web")
  implementation("org.springframework.kafka", "spring-kafka", "2.2.4.RELEASE")
}
