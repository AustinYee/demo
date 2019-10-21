package com.yechangqing.demo.java.basic.util;

import java.lang.reflect.Field;
import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(21);
        map.put("10", 20);
        map.put("10", 30);
        Class clazz = map.getClass();
        try {
            Field f = clazz.getDeclaredField("threshold");
            f.setAccessible(true);
            System.out.println("threshold: " + f.get(map));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(map.get("10"));
    }
}
