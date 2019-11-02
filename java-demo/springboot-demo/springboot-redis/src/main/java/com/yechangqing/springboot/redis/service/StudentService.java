package com.yechangqing.springboot.redis.service;

import com.yechangqing.springboot.redis.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    public RedisTemplate redisTemplate;

}
