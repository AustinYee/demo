package com.yechangqing.demo.java.springboot.test.application.service;

import com.yechangqing.demo.java.springboot.test.domain.repository.MyBatisRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class WithOtherDependenciesServiceTest {

  @Mock
  public MyBatisRepository myBatisRepository;

  @InjectMocks
  public WithOtherDependenciesService withOtherDependenciesService;

  @BeforeEach
  public void before(){
    Mockito.doReturn(true).when(myBatisRepository).save(Mockito.any());
  }

  @Test
  public void Test(){
    var result = withOtherDependenciesService.test();
    System.out.println(result);
  }
}
