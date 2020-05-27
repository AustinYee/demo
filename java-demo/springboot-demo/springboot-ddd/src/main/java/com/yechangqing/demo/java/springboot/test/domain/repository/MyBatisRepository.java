package com.yechangqing.demo.java.springboot.test.domain.repository;


import com.yechangqing.demo.java.springboot.test.domain.model.DemoModel;

public interface MyBatisRepository {
  boolean save(DemoModel demoModel);
}
