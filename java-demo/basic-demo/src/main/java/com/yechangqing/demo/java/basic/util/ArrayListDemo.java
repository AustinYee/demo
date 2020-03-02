package com.yechangqing.demo.java.basic.util;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

  public static void main(String[] args) {
    ArrayList<Object> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
    list.add(7);
    list.remove(Integer.valueOf(1));

    for (Object obj : list) {
      System.out.println(obj);
    }
  }
}
