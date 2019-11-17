package com.yechangqing.demo.java.springboot.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Application {

    private static KafkaTemplate<String, String> staticKafkaTemplate;

    @Autowired
    public void setKafkaTemplate(KafkaTemplate<String, String> kafkaTemplate) {
        staticKafkaTemplate = kafkaTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        new Thread(() -> {
            for (int i = 1; i < 100; i++) {
                if (i % 2 == 1) {
                    staticKafkaTemplate.send("test", null, System.currentTimeMillis(), null, "test");
                } else {
                    staticKafkaTemplate.send("test", "test");
                }
                System.out.println("发送成功");
            }
        }).start();
    }

}
