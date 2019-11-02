package com.yechangqing.springboot.redis.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge1() {
        return age1;
    }

    public void setAge1(Integer age) {
        this.age1 = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name:'" + name + ',' + ", age1:" + age1 + '}';
    }
}
