package com.example.demo.Service.impl;

import com.alibaba.fastjson.JSON;
import com.example.demo.Service.DelectRedisOrderService;
import com.example.demo.pojo.Order;
import com.example.demo.redisUtil.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service("delectorder")
public class DelectRedisServiceImpl implements DelectRedisOrderService {
    @Autowired
    private RedisUtil redisUtil;

    @Override
    public String delectredis(String orderNumber, String userid) {
        redisUtil.hdel(userid,orderNumber);
        String re = null;
        List<Order> list = new ArrayList<>();
        Map<Object, Object> hmget = redisUtil.hmget(userid);
        Set<Object> integers = hmget.keySet();
        for (Object i : integers) {
            if(hmget.get(i) instanceof Order){
                Order order1 = (Order) hmget.get(i);
                list.add(order1);
            }
        }
        re = JSON.toJSONString(list);
        return re;
    }
}
