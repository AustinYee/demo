package com.yechangqing.demo.java.springboot.basic.service;

import com.yechangqing.demo.java.springboot.basic.Event;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventHandler {

    @EventListener
    public void handle(Event event){
        System.out.println(event);
    }
}
