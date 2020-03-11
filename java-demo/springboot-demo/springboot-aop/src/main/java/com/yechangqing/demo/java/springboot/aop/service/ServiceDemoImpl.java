package com.yechangqing.demo.java.springboot.aop.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceDemoImpl implements ServiceDemo {
  public void aopTest() {
    System.out.println("Aop test");
  }
}
