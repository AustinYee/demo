package com.yechangqing.demo.java.basic.mixture;

class Parent {}

class Child extends Parent {}

public class ObjectDemo {
  public static void main(String[] args) {
    Parent obj = new Child();
    System.out.println(obj);
    System.out.println(obj.getClass().getName());
    System.out.println(obj.getClass().getTypeName());
  }
}
