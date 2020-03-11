package com.yechangqing.demo.java.basic.util;

import java.util.ArrayList;

/** ArrayList源码探索 */
public class ArrayListDemo {

  public static void main(String[] args) {
    ArrayList<Object> list = new ArrayList<>();
    list.add(7);
    list.remove(Integer.valueOf(1));

    for (Object obj : list) {
      System.out.println(obj);
    }
  }
}
