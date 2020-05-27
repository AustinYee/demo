package com.yechangqing.demo.java.springboot.test.application.service;

import org.springframework.stereotype.Service;

@Service
public class NoExtraDependenciesService {
  public boolean test(int n) {
    return n % 2 == 1;
  }
}




