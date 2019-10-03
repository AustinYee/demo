package com.yechangqing.demo.java.springboot.bean;

import org.springframework.beans.factory.InitializingBean;

public class MyXMLBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init XML bean");
    }
}
