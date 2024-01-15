package com.example.proxy_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


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

    @GetMapping("/jump")
    public String junp(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://52.79.61.197:8080/test";

        String responseBody = restTemplate.getForObject(url, String.class);
        return responseBody.toString();
    }

}
