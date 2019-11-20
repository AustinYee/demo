package com.yechangqing.demo.java.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {


    public static void main(String[] args) {
        List array = new ArrayList<>(20);
        for (int i = 0; i < 15; i++) {
            array.add(i);
        }

        AtomicInteger x = new AtomicInteger(0);
        array.parallelStream().forEach(it -> {
            System.out.println(it);
            x.getAndIncrement();
        });

        System.out.println(x.intValue());
    }
}
