package com.yechangqing.demo.java.lib.component;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class MyComponent implements InitializingBean {

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("Init component");
  }
}
