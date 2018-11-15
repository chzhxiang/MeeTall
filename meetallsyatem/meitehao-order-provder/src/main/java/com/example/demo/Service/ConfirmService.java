package com.example.demo.Service;

import com.example.demo.pojo.Order;
import commoditypojo.CommodityDetails;

public interface ConfirmService {
    /**
     * 根据用户id判断有没有地址信息
     * @param orderList
     * @return
     */
    String getconf(String orderList);
}
