package com.example.demo.Service;

import com.example.demo.pojo.Order;

public interface LookRedisService {
    /**
     * 查询指定的订单
     * @param ordreNumber
     * @return
     */
    String getordre(String ordreNumber,String userid);
}
