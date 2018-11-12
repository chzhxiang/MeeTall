package com.example.meetallseckillproducer.seckill_quartz.job;

import com.example.meetallseckillproducer.pojo.SeckillGoods;
import com.example.meetallseckillproducer.service.SeckillGoodsService;
import com.example.meetallseckillproducer.util.DateGenerate;
import com.example.meetallseckillproducer.util.RedisUtil;
import org.apache.ibatis.annotations.Param;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import redis.clients.jedis.Jedis;

import java.sql.Timestamp;
import java.util.List;

@Component
public class DelSeckillInfo implements Job {

    @Autowired
    private SeckillGoodsService seckillGoodsService;

    @Autowired
    private RedisUtil redisUtil;

    /**
     * 定时删除数据，并将剩余库存存入库存
     * @param jobExecutionContext
     * @throws JobExecutionException
     */
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //
        List<SeckillGoods> all = seckillGoodsService.getEnd(Timestamp.valueOf(DateGenerate.getStringDate()));
        if (all == null){
            System.out.println("del没数据");
            return;
        }
        for (SeckillGoods seckillGoods : all){
            boolean hHasKey = redisUtil.hHasKey("seckill", seckillGoods.getGoods_id() + "");
            if (hHasKey){
                Integer count = (Integer) redisUtil.hget("seckill", seckillGoods.getGoods_id() + "");
                seckillGoodsService.updateGoodsStockCount(-count,seckillGoods.getGoods_id());
                redisUtil.hdel("seckill",seckillGoods.getGoods_id());
            }

        }
    }
}
