package com.yechangqing.demo.java.springboot.test.application.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 *
 */
public class NoExtraDependenciesServiceUTest {
  private final NoExtraDependenciesService noExtraDependenciesService = new NoExtraDependenciesService();

  @Test
  public void test() {
    var result = noExtraDependenciesService.test(1);
    System.out.println(result);
    Assertions.assertTrue(result);
  }
}
