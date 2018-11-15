package com.example.demo.Service;

public interface DelectRedisOrderService {
    /**
     * 根据订单进行删除
     * @param orderNumber
     * @return
     */
    String delectredis(String orderNumber,String userid);
}
