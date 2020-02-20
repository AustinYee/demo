package com.yechangqing.demo.java.basic;

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"")
            .append(name).append('\"');
        sb.append(",\"age\":")
            .append(age);
        sb.append('}');
        return sb.toString();
    }
}

public class RefDemo {


    public static void main(String[] args) {
        Student a = new Student("changqing", 21);
        Student b = a;
        a.age = 22;
        System.out.print(b);
    }
}
