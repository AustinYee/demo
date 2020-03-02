package com.yechangqing.demo.java.basic;

public class RefDemo {
    private static class Student {
        private String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "{" + "\"name\":\"" +
                name + '\"' +
                ",\"age\":" +
                age +
                '}';
        }
    }

    public static void main(String[] args) {
        Student a = new Student("changqing", 21);
        Student b = a;
        a.age = 22;
        // {"name":"changqing","age":22}
        System.out.print(b);
    }
}
