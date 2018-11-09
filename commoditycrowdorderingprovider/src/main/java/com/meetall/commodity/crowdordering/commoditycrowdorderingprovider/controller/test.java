package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.controller;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/aaa")
    @ResponseBody
    public String a(){

        redisUtil.set("abc","123456");
        //redisUtil.remove("a1111");
        String b = (String) redisUtil.get("abc");
        System.out.println(b);
        return b;
    }
}
