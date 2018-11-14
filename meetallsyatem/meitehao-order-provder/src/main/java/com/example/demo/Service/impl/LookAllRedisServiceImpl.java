package com.example.demo.Service.impl;

import com.alibaba.fastjson.JSON;
import com.example.demo.Service.LookAllRedisService;
import com.example.demo.pojo.Order;
import com.example.demo.redisUtil.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;


@Service("lookRedis")
public class LookAllRedisServiceImpl implements LookAllRedisService {
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public String getRedis(String userId) {
        String re = null;
        List<Order> list = new ArrayList<>();
        Map<Object, Object> hmget = redisUtil.hmget(userId);
        if (hmget == null){
            re = "没有订单";
        }else {
            Set<Object> integers = hmget.keySet();
            for (Object i : integers) {
                if(hmget.get(i) instanceof Order){
                    Order order1 = (Order) hmget.get(i);
                    list.add(order1);
                }
            }
            re = JSON.toJSONString(list);
        }
        return re;
    }
}
