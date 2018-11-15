package com.example.demo.Service.impl;

import com.alibaba.fastjson.JSON;
import com.example.demo.Service.LookStateOrderService;
import com.example.demo.dao.OrderMapper;
import com.example.demo.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("loolorderstate")
public class LookStateOrderServiceImpl implements LookStateOrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public String getstataorder(int userid, int orderstate) {
        List<Order> getstate = orderMapper.getstate(userid,0, orderstate);
        return JSON.toJSONString(getstate);
    }
}
