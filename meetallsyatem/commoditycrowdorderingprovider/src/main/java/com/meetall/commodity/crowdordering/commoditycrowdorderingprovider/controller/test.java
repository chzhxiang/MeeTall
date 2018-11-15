package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.controller;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Api(value = "1231", description = "测试")
public class test {

    @Autowired
    private RedisUtil redisUtil;
    @ApiOperation(value="123",notes="123",httpMethod = "POST")
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
