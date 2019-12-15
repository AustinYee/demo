package com.yechangqing.demo.java.springboot.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "user", uniqueConstraints = {@UniqueConstraint(columnNames = {"userName", "organization"})})
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 20)
    private String userName;

    @Column(length = 20)
    private String organization;

    @Column(length = 20)
    private Integer age;

    @Column(length = 30)
    private String email;

    @Column(length = 11)
    private String mobile;

    @Column(length = 30)
    private String address;

    @Column(unique = true)
    private String idCardNum;
}
