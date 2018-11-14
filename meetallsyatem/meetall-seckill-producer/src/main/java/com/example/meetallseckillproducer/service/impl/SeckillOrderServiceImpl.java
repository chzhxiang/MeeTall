package com.example.meetallseckillproducer.service.impl;

import com.example.meetallseckillproducer.dao.SeckillOrderDao;
import com.example.meetallseckillproducer.pojo.GoodsAndOrder;
import com.example.meetallseckillproducer.pojo.SeckillGoods;
import com.example.meetallseckillproducer.pojo.SeckillId;
import com.example.meetallseckillproducer.pojo.SeckillOrder;
import com.example.meetallseckillproducer.rabbitmq.SeckillMQProducer;
import com.example.meetallseckillproducer.result.AjaxResult;
import com.example.meetallseckillproducer.service.SeckillGoodsService;
import com.example.meetallseckillproducer.service.SeckillOrderSerivce;
import com.example.meetallseckillproducer.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.meetallseckillproducer.result.AjaxResult.error;
import static com.example.meetallseckillproducer.result.AjaxResult.success;

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
    public AjaxResult selectByUserIdAndGoodsId(int userId, int goodsId) {
        SeckillOrder seckillOrder = seckillOrderDao.selectByUserIdAndGoodsId(userId, goodsId);
        //不为空表示秒杀成功
        if (seckillOrder != null){
            //返回订单号
            return success(seckillOrder.getOrder_id());
        }else {
            //判断是否有库存
            Integer seckill = (Integer) redisUtil.hget("seckill", goodsId + "");
            if (seckill < 1){
                return error(0,"卖完了");
            }else {
                return success("排队中");
            }

        }
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
     * @param seckillId
     * @return
     * @throws Exception
     */
    public AjaxResult seckill(SeckillId seckillId) throws Exception{
        //1.判断是否有库存
        Integer count = (Integer) redisUtil.hget("seckill", seckillId.getGoods_id() + "");
        if (count < 1){
            return error(1,"秒杀结束了");
        }
       // 2.判断该用户是否秒杀过该商品
        SeckillOrder seckillGoods = seckillOrderDao.selectByUserIdAndGoodsId(seckillId.getUser_id(),seckillId.getGoods_id());
        if (seckillGoods != null){
            return error(1,"您已经参加过该活动了");
        }
       // 3.进入消息队列，redis减库存,下订单，写入秒杀订单
        seckillMQProducer.send(seckillId);
        return success("秒杀成功，请付款");
    }

    /**
     * 跟新订单状态
     * @param userId
     * @param goodsId
     * @param state
     * @return
     */
    @Override
    public AjaxResult statusOrder(int userId, int goodsId, String state) {
        if (state != null && state.equals("0")){
            int i = seckillOrderDao.statusOrder(userId, goodsId, state);
            if (i == 1){
                //1下单成功
                return success("下单成功");
            }else {
                //传入参数有误
                return error(1,"订单不存在");
            }

        }else {
            redisUtil.hincr("seckill",goodsId+"",1);
            String s = delOrder(userId, goodsId);
            if ("1".equals(s)){

                //-1订单失效
                return error(1,"订单失效");
            }
            //删除失败，传入参数有误
            return error(1,"删除失败，传入参数有误");
        }
    }

    @Override
    public String delOrder(int userId, int goodsId) {
        int i = seckillOrderDao.delOrder(userId, goodsId);
        if (i == 1){
            return "1";
        }else {
            return "-1";
        }
    }
}
