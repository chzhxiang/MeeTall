package com.example.demo.Service.impl;

import com.alibaba.fastjson.JSON;
import com.example.demo.Service.LookRedisService;
import com.example.demo.pojo.Order;
import com.example.demo.redisUtil.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

@Service("getone")
public class LookRedisServiceImpl implements LookRedisService {
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public String getordre(String ordreNumber,String userid) {
        String re = null;
        Map<Object, Object> hmget = redisUtil.hmget(userid);
        System.out.println(hmget);
        Set<Object> integers = hmget.keySet();
        for (Object i : integers) {
            if(hmget.get(i) instanceof Order){
                Order order1 = (Order) hmget.get(i);
                if (order1.getOrdernumber().equals(ordreNumber)){
                    System.out.println(order1.getUserid());
                    re =  JSON.toJSONString(order1);
                    System.out.println(re);
                }
            }

        }
        return re;
    }
}
