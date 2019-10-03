package com.yechangqing.demo.java.basic.lang;

class Parent {

}

class Child extends Parent {

}

public class ObjectDemo {
    public static void main(String[] args) {
        Parent obj = new Child();
        System.out.println(obj.getClass().getName());
    }
}
