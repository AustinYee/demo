package com.yechangqing.demo.java.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private static String applicationName;


    @Value("${spring.application.name}")
    public void setApplicationName(String name){
        applicationName = name;
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println(applicationName);
    }
}

