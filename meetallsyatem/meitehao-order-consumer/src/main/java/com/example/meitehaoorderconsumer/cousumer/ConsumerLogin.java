package com.example.meitehaoorderconsumer.cousumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "orderprovder")
public interface ConsumerLogin {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login();
}
