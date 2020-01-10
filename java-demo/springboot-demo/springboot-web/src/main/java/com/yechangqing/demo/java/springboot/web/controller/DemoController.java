package com.yechangqing.demo.java.springboot.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/test1")
    public String test1() throws InterruptedException {
        throw new RuntimeException("error");
    }

    @GetMapping("/test2")
    public String test2() throws InterruptedException {
        return "success";
    }
}
