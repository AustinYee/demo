package com.yechangqing.demo.java.springboot.mongo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("student")
public class Student {
  private Integer id;
  private int age;
  private String name;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    String sb = "{" + "\"id\":" +
      id +
      ",\"age\":" +
      age +
      ",\"name\":\"" +
      name + '\"' +
      '}';
    return sb;
  }
}
