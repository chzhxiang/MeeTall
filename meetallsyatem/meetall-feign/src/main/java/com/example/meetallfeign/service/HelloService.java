package com.example.meetallfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "seckill-producer")
public interface HelloService {
    @RequestMapping("/getAll")
    public String test();
}
