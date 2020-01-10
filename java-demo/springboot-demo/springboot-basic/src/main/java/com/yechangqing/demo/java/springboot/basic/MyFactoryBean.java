package com.yechangqing.demo.java.springboot.basic;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

public class MyFactoryBean implements FactoryBean<Product> {

    @Autowired
    private Product2 product2;

    @Override
    public Product getObject() throws Exception {
        product2.test();
        return new Product();
    }

    @Override
    public Class<?> getObjectType() {
        return Product.class;
    }
}
