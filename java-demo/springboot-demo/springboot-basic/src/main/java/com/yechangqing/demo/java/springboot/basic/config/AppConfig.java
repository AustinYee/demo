package com.yechangqing.demo.java.springboot.basic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public AppFactoryBean app() throws Exception {
    return new AppFactoryBean();
  }
}
