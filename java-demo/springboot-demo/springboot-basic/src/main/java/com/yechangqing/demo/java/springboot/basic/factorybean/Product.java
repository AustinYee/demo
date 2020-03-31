package com.yechangqing.demo.java.springboot.basic.factorybean;

import org.springframework.beans.factory.annotation.Value;

public class Product {
  @Value("app.id:null")
  private String appId;
}
