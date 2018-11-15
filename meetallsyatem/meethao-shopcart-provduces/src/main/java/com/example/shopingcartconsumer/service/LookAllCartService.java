package com.example.shopingcartconsumer.service;

import com.example.shopingcartconsumer.pojo.Cart;

import java.util.List;

public interface LookAllCartService {
    /**
     * 根据用户id查看
     * @param userid
     * @return
     */
    List<Cart> getall(int userid);
}
