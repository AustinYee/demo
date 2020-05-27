package com.yechangqing.demo.java.springboot.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

  @GetMapping("test/{code}:test")
  public String test(@PathVariable("code") String code){
    return code;
  }
}
