package com.yechangqing.demo.java.basic.lang;

/** Class源码探索 */
public class ClassDemo {

  private static void printArrayClass() {
    Integer[] array = new Integer[10];
    Integer a = 3;
    System.out.println(array.getClass().getName());
    System.out.println(a.getClass().getName());
  }

  public static void main(String[] args) {
    printArrayClass();
  }
}
