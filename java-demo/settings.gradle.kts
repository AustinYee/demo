rootProject.name = "java-demo"
include(
  "gradle-demo:consumer",
  "gradle-demo:module-demo",
  "gradle-demo:module-demo1",
  "gradle-demo:module-demo2",
  ":netty-demo",
  ":springboot-demo:springboot-jpa",
  ":springboot-demo:springboot-mybatis",
  ":springboot-demo:springboot-basic",
  ":springboot-demo:springboot-redis",
  ":springboot-demo:springboot-kafka",
  ":springboot-demo:springboot-mongo",
  ":springboot-demo:springboot-web",
  ":springboot-demo:springboot-aop",
  ":springboot-demo:springboot-oauth",
  ":springcloud-demo:springcloud-eureka"
)
