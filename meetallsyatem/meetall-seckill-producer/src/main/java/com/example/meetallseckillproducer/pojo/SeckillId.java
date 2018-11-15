package com.example.meetallseckillproducer.pojo;

import java.io.Serializable;

public class SeckillId implements Serializable {
    private Integer goods_id;

    private Integer user_id;

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
