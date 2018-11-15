package com.example.meetallseckillproducer.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class GoodsAndOrder implements Serializable {
    //---------goods------------

    private Integer id;
    //秒杀商品id
    private Integer goods_id;
    //秒杀商品价格
    private Double seckill_price;
    //秒杀商品数量
    private Integer stock_count;
    //秒杀开始时间
    private Timestamp start_date;
    //秒杀结束时间
    private Timestamp end_date;

    //--------------------------
    //----------order-----------

    private Integer orderId;
    //用户id
    private Integer orderUser_id;
    //订单号
    private Integer order_id;
    //秒杀商品id
    private Integer orderGoods_id;

    //-----------------------------

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Double getSeckill_price() {
        return seckill_price;
    }

    public void setSeckill_price(Double seckill_price) {
        this.seckill_price = seckill_price;
    }

    public Integer getStock_count() {
        return stock_count;
    }

    public void setStock_count(Integer stock_count) {
        this.stock_count = stock_count;
    }

    public Timestamp getStart_date() {
        return start_date;
    }

    public void setStart_date(Timestamp start_date) {
        this.start_date = start_date;
    }

    public Timestamp getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Timestamp end_date) {
        this.end_date = end_date;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderUser_id() {
        return orderUser_id;
    }

    public void setOrderUser_id(Integer orderUser_id) {
        this.orderUser_id = orderUser_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getOrderGoods_id() {
        return orderGoods_id;
    }

    public void setOrderGoods_id(Integer orderGoods_id) {
        this.orderGoods_id = orderGoods_id;
    }
}
