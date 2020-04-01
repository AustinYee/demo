package com.yechangqing.demo.java.springboot.basic;

import com.yechangqing.demo.java.springboot.basic.event.EventOne;
import com.yechangqing.demo.java.springboot.basic.event.EventTwo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

public class ApplicationEventTest extends ApplicationTest {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Test
    public void eventTest() {
        EventOne event = new EventOne();
        applicationEventPublisher.publishEvent(event);
        EventTwo event2 = new EventTwo();
        applicationEventPublisher.publishEvent(event2);
        Assert.assertTrue(true);
    }
}
