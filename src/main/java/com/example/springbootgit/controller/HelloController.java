package com.example.springbootgit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/index")
    public String startSpringBoot(){
        return "hello springboot github";
    }
<<<<<<< HEAD
=======

    @RequestMapping("/hello")
    public  String sayHello(){
        return  "This is hello methodsayhello";
    }
>>>>>>> 9427b07 (Initial commit)
}
