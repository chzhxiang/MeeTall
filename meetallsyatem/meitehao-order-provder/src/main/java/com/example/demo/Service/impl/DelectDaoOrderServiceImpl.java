package com.example.demo.Service.impl;

import com.alibaba.fastjson.JSON;
import com.example.demo.Service.DelectDaoOrderService;
import com.example.demo.dao.OrderMapper;
import com.example.demo.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("delectdaoOrder")
public class DelectDaoOrderServiceImpl implements DelectDaoOrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public String delectorderdao(Order order) {
        int i = orderMapper.updateByPrimaryKeySelective(order);
        System.out.println(i);
        if (i == 1){
            List<Order> getall = orderMapper.getall(order.getUserid(),0);
            return JSON.toJSONString(getall);
        }else {
            return "删除失败";
        }
    }
}
