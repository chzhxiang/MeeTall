package com.meetall.commodity.crowdordering.commoditycrowdorderingcomsumer.controller;

import com.meetall.commodity.crowdordering.commoditycrowdorderingcomsumer.feign.UserInfoReceiving;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @Autowired
    private UserInfoReceiving userInfoReceiving;

    @RequestMapping("/zxcvb")
    public String aa(){
        return userInfoReceiving.getaddl(1);
    }
}
