package com.yechangqing.demo.java.springboot.basic;

<<<<<<< Updated upstream
import com.yechangqing.demo.java.springboot.basic.event.EventSource;
import org.junit.Test;
=======
>>>>>>> Stashed changes
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public abstract class ApplicationTest {

<<<<<<< Updated upstream
  @Autowired private ApplicationEventPublisher applicationEventPublisher;

  @Test
  public void eventTest() {
    EventSource event = new EventSource();
    event.setName("name");
    event.setMsg("msg");
    applicationEventPublisher.publishEvent(event);
  }
=======
>>>>>>> Stashed changes
}
