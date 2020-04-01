package com.yechangqing.demo.java.springboot.basic.service;

import com.yechangqing.demo.java.springboot.basic.event.EventOne;
import com.yechangqing.demo.java.springboot.basic.event.EventTwo;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventHandler {

    @EventListener
    public void handle(EventOne source){
        System.out.println(source);
    }

    @EventListener
    public void handle(EventTwo source){
        System.out.println(source);
    }
}
