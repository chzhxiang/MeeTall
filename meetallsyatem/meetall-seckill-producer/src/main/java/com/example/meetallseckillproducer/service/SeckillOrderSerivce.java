package com.example.meetallseckillproducer.service;

import com.example.meetallseckillproducer.pojo.GoodsAndOrder;
import com.example.meetallseckillproducer.pojo.SeckillGoods;
import com.example.meetallseckillproducer.pojo.SeckillOrder;
import org.apache.ibatis.annotations.Param;

public interface SeckillOrderSerivce {

    String selectByUserIdAndGoodsId(int userId,int goodsId);

    //用户秒杀记录
    int insertSeckillOrder( SeckillOrder seckillOrder);

    //秒杀流程
    String seckill(GoodsAndOrder goodsAndOrder) throws Exception;

    //跟新订单状态
    String statusOrder(int userId,int goodsId,String state);

    //订单过期，删除订单信息
    String delOrder(@Param("userId") int userId,@Param("goodsId") int goodsId);
}
