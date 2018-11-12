package com.example.meetallseckillproducer.pojo;


import java.io.Serializable;
import java.sql.Timestamp;

public class SeckillGoods implements Serializable {

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
}

