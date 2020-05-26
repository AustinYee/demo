rootProject.name = "java-demo"
include(
        "gradle-demo:consumer",
        "gradle-demo:module-demo",
        "gradle-demo:module-demo1",
        "gradle-demo:module-demo2",
        ":springboot-demo:springboot-jpa",
        ":springboot-demo:springboot-mybatis",
        ":springboot-demo:springboot-basic",
        ":springboot-demo:springboot-redis",
        ":springboot-demo:springboot-kafka",
        ":springboot-demo:springboot-mongo",
        ":springboot-demo:springboot-web",
        ":springboot-demo:springboot-aop",
        ":springboot-demo:springboot-sharding-jdbc",
        ":springcloud-demo:springcloud-eureka",
        "basic",
        "mycat-demo",
        "netty-demo",
        "java-advance",
        "kotlin-demo",
        "groovy-demo"

)
