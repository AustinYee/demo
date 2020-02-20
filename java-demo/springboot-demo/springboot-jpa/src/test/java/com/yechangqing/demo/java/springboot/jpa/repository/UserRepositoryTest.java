package com.yechangqing.demo.java.springboot.jpa.repository;

import com.yechangqing.demo.java.springboot.jpa.SpringbootApplicationTest;
import com.yechangqing.demo.java.springboot.jpa.dao.UserRepository;
import com.yechangqing.demo.java.springboot.jpa.entity.UserEntity;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryTest extends SpringbootApplicationTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void save(){
        UserEntity user = new UserEntity();
        user.setUserName("changqing");
        user.setEmail("a@b.com");
        userRepository.save(user);
        Long result =  user.getId();
        System.out.println(result);
    }

}
