rootProject.name = "java-demo"
include(
    ":springboot-demo:hystrix",
    ":springboot-demo:springboot-demo",
    ":springboot-demo:springboot-jpa",
    ":springboot-demo:springboot-basic",
    ":springboot-demo:springboot-redis",
    ":springboot-demo:springboot-kafka",
    ":springboot-demo:springboot-web",
    ":springboot-demo:lib-demo",
    "basic-demo",
    "mycat-demo",
    "netty-demo"
)
