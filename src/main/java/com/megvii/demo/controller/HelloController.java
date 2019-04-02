package com.megvii.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/grate")
    public String grate(String name){
        return "Hi, " + name + ", How are you?";
    }

}
