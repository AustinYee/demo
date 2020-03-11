package com.yechangqing.demo.java.basic.mixture;

public class NumberDemo {
  /**
   * result:
   *
   * <p>1010 101 10100 101 11111111111111111111111111110110 11111111111111111111111111111011
   * 11111111111111111111111111101100 1111111111111111111111111111011
   */
  private static void shiftOperate() {
    int x = 10;
    System.out.println(Integer.toBinaryString(x));
    System.out.println(Integer.toBinaryString(x >> 1));
    System.out.println(Integer.toBinaryString(x << 1));
    System.out.println(Integer.toBinaryString(x >>> 1));
    x = -10;
    System.out.println(Integer.toBinaryString(x));
    System.out.println(Integer.toBinaryString(x >> 10));
    System.out.println(Integer.toBinaryString(x << 1));
    System.out.println(Integer.toBinaryString(x >>> 10));
  }

  public static void main(String[] args) {
    shiftOperate();
  }
}
