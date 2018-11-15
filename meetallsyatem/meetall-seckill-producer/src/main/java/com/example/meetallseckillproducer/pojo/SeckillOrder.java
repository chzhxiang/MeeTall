package com.example.meetallseckillproducer.pojo;

import java.io.Serializable;

public class SeckillOrder implements Serializable {
    private Integer id;
    //用户id
    private Integer user_id;
    //订单号
    private String order_id;
    //秒杀商品id
    private Integer goods_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }


    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }
}
