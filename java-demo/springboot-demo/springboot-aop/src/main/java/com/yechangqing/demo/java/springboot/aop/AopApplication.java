package com.yechangqing.demo.java.springboot.aop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan("com.yechangqing.demo.java.springboot.aop")
@SpringBootConfiguration
public class AopApplication implements CommandLineRunner {

  public static void main(String[] args) {
    new SpringApplication(AopApplication.class).run(args);
  }

  @Override
  public void run(String... args) {
  }
}
