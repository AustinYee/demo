package com.yechangqing.demo.java.springboot.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class Application implements CommandLineRunner {

  @Autowired private Product product;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public MyFactoryBean create() throws Exception {
    return new MyFactoryBean();
  }

  @Override
  public void run(String... args) throws Exception {
    product.test();
  }
}
