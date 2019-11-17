package com.yechangqing.demo.java.springboot.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    public RedisTemplate redisTemplate;

}
