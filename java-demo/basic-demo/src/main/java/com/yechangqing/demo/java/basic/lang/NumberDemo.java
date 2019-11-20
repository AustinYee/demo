package com.yechangqing.demo.java.basic.lang;

public class NumberDemo {
    /**
     * result:
     *
     * 1010
     * 101
     * 10100
     * 101
     * 11111111111111111111111111110110
     * 11111111111111111111111111111011
     * 11111111111111111111111111101100
     * 1111111111111111111111111111011
     */
    private static void shiftOperate() {
        int x = 10;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(x >> 1));
        System.out.println(Integer.toBinaryString(x << 1));
        System.out.println(Integer.toBinaryString(x >>> 1));
        x = -10;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(x >> 1));
        System.out.println(Integer.toBinaryString(x << 1));
        System.out.println(Integer.toBinaryString(x >>> 1));
    }

    public static void main(String[] args) {
        shiftOperate();
    }
}
