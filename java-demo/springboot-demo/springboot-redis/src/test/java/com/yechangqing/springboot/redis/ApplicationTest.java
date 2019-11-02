package com.yechangqing.springboot.redis;

import com.yechangqing.springboot.redis.entity.Student;
import com.yechangqing.springboot.redis.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class ApplicationTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void test(){
        Student s = new Student();
        s.setName("aa");
        Student result = studentService.test(s, "bbaa");
    }

}
