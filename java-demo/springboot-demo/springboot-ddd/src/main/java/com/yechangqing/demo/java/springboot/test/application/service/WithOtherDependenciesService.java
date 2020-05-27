package com.yechangqing.demo.java.springboot.test.application.service;

import com.yechangqing.demo.java.springboot.test.domain.model.DemoModel;
import com.yechangqing.demo.java.springboot.test.domain.repository.MyBatisRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class WithOtherDependenciesService {
  private final MyBatisRepository myBatisRepository;

  public WithOtherDependenciesService(MyBatisRepository myBatisRepository) {
    this.myBatisRepository = myBatisRepository;
  }

  public boolean test() {
    var model = new DemoModel(1, "changqing", 11, LocalDate.now());
    return myBatisRepository.save(model);
  }
}
