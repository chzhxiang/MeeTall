package com.example.demo.Service.impl;

import com.alibaba.fastjson.JSON;
import com.example.demo.Service.AllOrderService;
import com.example.demo.dao.OrderMapper;
import com.example.demo.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("allorder")
public class AllOrderServiceImpl implements AllOrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public String getall(int userid) {
        List<Order> getall = orderMapper.getall(userid,0);
        return JSON.toJSONString(getall);
    }
}
