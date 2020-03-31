package com.yechangqing.demo.java.springboot.basic.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class TestBean implements InitializingBean, BeanPostProcessor {
  public TestBean() {
    System.out.println("Construction function");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("InitializingBean afterPropertiesSet");
  }

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    return bean;
  }
}
