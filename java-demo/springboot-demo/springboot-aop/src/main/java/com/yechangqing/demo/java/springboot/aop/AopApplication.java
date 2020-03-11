package com.yechangqing.demo.java.springboot.aop;

import com.yechangqing.demo.java.springboot.aop.service.ServiceDemo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopApplication implements CommandLineRunner {

  private final ServiceDemo serviceDemo;

  public AopApplication(ServiceDemo serviceDemo) {
    this.serviceDemo = serviceDemo;
  }

  public static void main(String[] args) {
    new SpringApplication(AopApplication.class).run(args);
  }

  @Override
  public void run(String... args) {
    System.out.println(serviceDemo);
  }
}
