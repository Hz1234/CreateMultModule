package com.example.day01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("info")
    public String testInfo(){
        return "hello springBoot Info";
    }
}
