package com.yechangqing.demo.java.basic.util;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {
  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < 5; i++) {
      queue.add(i);
    }
    while (queue.size() != 0) {
      System.out.println(queue.poll());
    }
  }
}
