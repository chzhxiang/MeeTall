package com.example.demo.Service;

import com.example.demo.pojo.Address;
import com.example.demo.pojo.User;

public interface AddRedisListService {
    /**
     * 传入用户信息和订单信息生成订单
     * @param listOrder
     * @param   address
     * @return
     */
    String addredislist(String listOrder,  Address address);
}
