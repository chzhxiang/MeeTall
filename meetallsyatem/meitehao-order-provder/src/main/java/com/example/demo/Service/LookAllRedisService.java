package com.example.demo.Service;

import com.example.demo.pojo.Order;
import com.example.demo.pojo.User;

import java.util.List;

public interface LookAllRedisService {
    /**
     * 查询redis中的订单集合分页显示
     * @param userId
     * @return
     */
    String getRedis(String userId);
}
