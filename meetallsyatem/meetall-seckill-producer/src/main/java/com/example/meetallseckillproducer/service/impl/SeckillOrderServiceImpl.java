package com.example.meetallseckillproducer.service.impl;

import com.example.meetallseckillproducer.dao.SeckillOrderDao;
import com.example.meetallseckillproducer.pojo.GoodsAndOrder;
import com.example.meetallseckillproducer.pojo.SeckillGoods;
import com.example.meetallseckillproducer.pojo.SeckillOrder;
import com.example.meetallseckillproducer.rabbitmq.SeckillMQProducer;
import com.example.meetallseckillproducer.service.SeckillGoodsService;
import com.example.meetallseckillproducer.service.SeckillOrderSerivce;
import com.example.meetallseckillproducer.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SeckillOrderServiceImpl implements SeckillOrderSerivce {

    @Autowired
    private SeckillOrderDao seckillOrderDao;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private SeckillMQProducer seckillMQProducer;

    /**
     * 查询用户是否秒杀到
     * @param userId
     * @param goodsId
     * @return
     */
    @Override
    public String selectByUserIdAndGoodsId(int userId, int goodsId) {
        SeckillOrder seckillOrder = seckillOrderDao.selectByUserIdAndGoodsId(userId, goodsId);
        //不为空表示秒杀成功
        if (seckillOrder != null){
            //返回订单号
            return seckillOrder.getOrder_id();
        }else {
            boolean isOver=getGoodsOver(goodsId);
            if (isOver){
                //1表示排队中
                return "1";
            }else {
                //0表示买完了
                return "0";
            }
        }
    }
    /**
     * 判断是否为true也就是卖完了
     * @param goodsId
     * @return
     */
    private boolean getGoodsOver(Integer goods_id) {
        boolean isOver;
        Integer seckill = (Integer) redisUtil.hget("seckill", goods_id + "");
        if (seckill < 1){
            isOver = false;
        }else {
            isOver = true;
        }
        return isOver;
    }

    /**
     * 插入订单
     * @param seckillOrder
     * @return
     */
    @Override
    public int insertSeckillOrder(SeckillOrder seckillOrder) {

        return seckillOrderDao.insertSeckillOrder(seckillOrder);
    }

    /**
     * 秒杀流程
     * @param goodsAndOrder
     * @return
     * @throws Exception
     */
    public String seckill(GoodsAndOrder goodsAndOrder) throws Exception{
        //1.判断是否有库存
        Integer count = (Integer) redisUtil.hget("seckill", goodsAndOrder.getGoods_id() + "");
        System.out.println(count);
        if (count < 1){
            return "秒杀结束";
        }
        Integer user_id = goodsAndOrder.getOrderUser_id();
        Integer goods_id = goodsAndOrder.getGoods_id();
       // 2.判断该用户是否秒杀过该商品
        SeckillOrder seckillGoods = seckillOrderDao.selectByUserIdAndGoodsId(user_id, goods_id);
        if (seckillGoods != null){
            return "您已经参加过该活动";
        }else{
            System.out.println(user_id+"+"+goods_id);
        }
       // 3.进入消息队列，redis减库存,下订单，写入秒杀订单
        seckillMQProducer.send(goodsAndOrder);
        return "秒杀成功，请付款";
    }

    /**
     * 跟新订单状态
     * @param userId
     * @param goodsId
     * @param state
     * @return
     */
    @Override
    public String statusOrder(int userId, int goodsId, String state) {
        if (state != null && state.equals("1")){
            int i = seckillOrderDao.statusOrder(userId, goodsId, state);
            if (i == 1){
                //1下单成功
                return "0";
            }else {
                //传入参数有误
                return "-2";
            }

        }else {
            redisUtil.hincr("seckill",goodsId+"",1);
            String s = delOrder(userId, goodsId);
            if (s.equals("-1")){
                //删除失败，传入参数有误
                return "-2";
            }
            //-1订单失效
            return "-1";
        }
    }

    @Override
    public String delOrder(int userId, int goodsId) {
        int i = seckillOrderDao.delOrder(userId, goodsId);
        if (i == 1){
            return "0";
        }else {
            return "-1";
        }
    }
}
