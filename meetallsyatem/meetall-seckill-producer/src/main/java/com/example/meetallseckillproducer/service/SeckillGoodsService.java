package com.example.meetallseckillproducer.service;

import com.example.meetallseckillproducer.pojo.SeckillGoods;
import com.example.meetallseckillproducer.result.AjaxResult;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;

public interface SeckillGoodsService {

    //查询所有秒杀商品
    List<SeckillGoods> getAll(Timestamp start_date);

    List<SeckillGoods> getEnd(@Param("end_date")Timestamp end_date);

    //插入秒杀商品
    int insertSeckillGoods( SeckillGoods goods);

    //通过商品id查询单个商品数量
    AjaxResult selectById(int goodsId);

    //减库存，放入redis
    int updateGoodsStockCount(Integer stock_count,Integer goods_id);
}
