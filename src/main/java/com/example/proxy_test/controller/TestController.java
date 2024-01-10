package com.example.proxy_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "success";
    }

    @GetMapping("/1")
    public String one(){
        return "1번 서버용 메소드";
    }

}
