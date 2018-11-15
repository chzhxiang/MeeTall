package com.example.demo.Service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.demo.Service.LookAllOrderService;
import com.example.demo.dao.OrderMapper;
import com.example.demo.pojo.Look;
import com.example.demo.pojo.Order;
import com.example.demo.pojo.User;
import com.example.demo.redisUtil.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service("lookall")
public class LookAllOrderServiceImpl implements LookAllOrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public String getall(String userlist) {
        List<Order> getallorder = orderMapper.getallorder(0);
        List<User> list = JSONArray.parseArray(userlist, User.class);
        for (User user:list) {
            String s = String.valueOf(user.getUserId());
            Map<Object, Object> hmget = redisUtil.hmget(s);
            Set<Object> integers = hmget.keySet();
            for (Object i : integers) {
                if(hmget.get(i) instanceof Order){
                    Order order1 = (Order) hmget.get(i);
                    getallorder.add(order1);
                }
            }
        }
        String s = JSON.toJSONString(getallorder);
        return s;
    }
}
