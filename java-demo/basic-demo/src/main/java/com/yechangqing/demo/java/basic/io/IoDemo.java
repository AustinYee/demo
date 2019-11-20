package com.yechangqing.demo.java.basic.io;

import java.io.*;

public class IoDemo {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter(new File("./test"), true);
            fileWriter.append("test");
            fileWriter.write("test");

            BufferedReader reader = new BufferedReader(new FileReader("./test"));
            for(String str = null; (str = reader.readLine()) != null; ){
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
