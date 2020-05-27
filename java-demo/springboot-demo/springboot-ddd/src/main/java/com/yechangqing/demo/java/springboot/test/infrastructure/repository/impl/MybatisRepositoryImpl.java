package com.yechangqing.demo.java.springboot.test.infrastructure.repository.impl;

import com.yechangqing.demo.java.springboot.test.domain.model.DemoModel;
import com.yechangqing.demo.java.springboot.test.domain.repository.MyBatisRepository;
import com.yechangqing.demo.java.springboot.test.infrastructure.entity.DemoEntity;
import com.yechangqing.demo.java.springboot.test.infrastructure.mapper.DemoMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisRepositoryImpl implements MyBatisRepository {

  private final DemoMapper demoMapper;

  public MybatisRepositoryImpl(DemoMapper demoMapper) {
    this.demoMapper = demoMapper;
  }

  @Override
  public boolean save(DemoModel demoModel) {
    var entitty = new DemoEntity();
    BeanUtils.copyProperties(demoModel, entitty);
    return demoMapper.save(entitty);
  }
}
