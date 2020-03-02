rootProject.name = "java-demo"
include(
    ":springboot-demo:springboot-jpa",
    ":springboot-demo:springboot-basic",
    ":springboot-demo:springboot-redis",
    ":springboot-demo:springboot-kafka",
    ":springboot-demo:springboot-mongo",
    ":springboot-demo:springboot-web",
    ":springboot-demo:module-demo",
    ":springcloud-demo:springcloud-eureka",
    "basic-demo",
    "mycat-demo",
    "netty-demo"
)
