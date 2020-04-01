package com.yechangqing.demo.java.springboot.mybatis.respository;

import com.yechangqing.demo.java.springboot.mybatis.ApplicationTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MybatisPlusRepositoryTest extends ApplicationTest {

  @Autowired private MybatisPlusRepository mybatisPlusRepository;

  @Test
  public void update() {
    mybatisPlusRepository.update(2, 3);
  }
}
