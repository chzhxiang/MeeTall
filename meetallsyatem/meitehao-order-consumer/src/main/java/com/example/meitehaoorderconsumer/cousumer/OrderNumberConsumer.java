package com.example.meitehaoorderconsumer.cousumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@FeignClient(name = "orderprovder")
public interface OrderNumberConsumer {
    @RequestMapping(value = "/getnumber",method = RequestMethod.GET)
    public String getnumber();
}
