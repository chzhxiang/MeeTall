package com.example.meetallseckillproducer.dao;

import com.example.meetallseckillproducer.pojo.SeckillGoods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Mapper
@Repository
public  interface SeckillGoodsDao {
    //查询所有该时间开启的秒杀商品
    List<SeckillGoods> getAll(@Param("start_date") Timestamp start_date);

    //查询所有该时间结束的秒杀商品
    List<SeckillGoods> getEnd(@Param("end_date")Timestamp end_date);

    //插入秒杀商品
    int insertSeckillGoods(@Param("goods") SeckillGoods goods);

    //通过商品id查询单个商品数量
    SeckillGoods selectById(@Param("goods_id")int goodsId);

    //跟新库存
    int updateGoodsStockCount(@Param("stock_count")Integer stock_count,@Param("goods_id")Integer goods_id);
}
