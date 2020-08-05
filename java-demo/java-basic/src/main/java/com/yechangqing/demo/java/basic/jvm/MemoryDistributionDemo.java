package com.yechangqing.demo.java.basic.jvm;

import java.util.ArrayList;
import java.util.List;

public class MemoryDistributionDemo {

  private List<String> list = new ArrayList<>();

  public void add(String str){
    list.add(str);
  }

  public static void main(String[] args) {
    var test = new MemoryDistributionDemo();
    while(true){
      test.add("Hello");
    }
  }
}
