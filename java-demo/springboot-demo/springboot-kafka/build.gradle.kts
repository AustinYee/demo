repositories {
  mavenCentral()
}

dependencies {
  // 这个图个方便 web 里面包括了 jackson 包
  compile("org.springframework.boot", "spring-boot-starter-web")
  implementation("org.springframework.kafka", "spring-kafka", "2.2.4.RELEASE")
}
