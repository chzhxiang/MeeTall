package com.example.meetallseckillproducer.dao;

import com.example.meetallseckillproducer.pojo.SeckillGoods;
import com.example.meetallseckillproducer.pojo.SeckillOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SeckillOrderDao {
    //查询有没有秒杀记录
    SeckillOrder selectByUserIdAndGoodsId(@Param("userId") int userId,@Param("goodsId") int goodsId);

    //插入用户秒杀记录
    int insertSeckillOrder(@Param("seckillOrder") SeckillOrder seckillOrder);

    //跟新订单状态
    int statusOrder(@Param("userId") int userId,@Param("goodsId") int goodsId,@Param("state") String state);

    //订单过期，删除订单信息
    int delOrder(@Param("userId") int userId,@Param("goodsId") int goodsId);
}
