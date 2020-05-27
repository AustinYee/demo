package com.yechangqing.demo.java.springboot.test.infrastructure.repository.impl;

import com.yechangqing.demo.java.springboot.test.domain.model.DemoModel;
import com.yechangqing.demo.java.springboot.test.domain.repository.MyBatisRepository;

public class MybatisRepositoryImpl implements MyBatisRepository {


  @Override
  public boolean save(DemoModel demoModel) {
    return false;
  }
}
