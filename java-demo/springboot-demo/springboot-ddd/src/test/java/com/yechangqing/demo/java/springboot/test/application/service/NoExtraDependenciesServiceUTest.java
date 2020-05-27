package com.yechangqing.demo.java.springboot.test.application.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = NoExtraDependenciesService.class)
public class NoExtraDependenciesServiceTest {
  @Autowired
  private NoExtraDependenciesService noExtraDependenciesService;

  @Test
  public void test() {
    var result = noExtraDependenciesService.test(1);
    System.out.println(result);
    Assertions.assertTrue(result);
  }
}
