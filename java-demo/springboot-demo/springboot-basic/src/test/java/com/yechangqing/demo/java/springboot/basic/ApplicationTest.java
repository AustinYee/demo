package com.yechangqing.demo.java.springboot.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {

  @Autowired private ApplicationEventPublisher applicationEventPublisher;

  @Test
  public void eventTest() {
    EventSource event = new EventSource();
    event.setName("name");
    event.setMsg("msg");
    applicationEventPublisher.publishEvent(event);
  }
}
