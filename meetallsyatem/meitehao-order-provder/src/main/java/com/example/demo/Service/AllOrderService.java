package com.example.demo.Service;

import com.example.demo.pojo.Order;

public interface AllOrderService {
    /**
     * 查看订单集合
     * @param userid
     * @return
     */
    String getall(int userid);
}
