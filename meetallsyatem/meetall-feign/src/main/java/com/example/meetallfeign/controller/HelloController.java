package com.example.meetallfeign.controller;

import com.example.meetallfeign.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @RequestMapping("/getAll")
    @HystrixCommand(fallbackMethod = "fallback")
    public String test(){
        return helloService.test();
    }
    public String fallback(){
        return "出错了";
    }
}
