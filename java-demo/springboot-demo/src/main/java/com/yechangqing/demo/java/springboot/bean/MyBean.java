package com.yechangqing.demo.java.springboot.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Bean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init bean");
    }
}
