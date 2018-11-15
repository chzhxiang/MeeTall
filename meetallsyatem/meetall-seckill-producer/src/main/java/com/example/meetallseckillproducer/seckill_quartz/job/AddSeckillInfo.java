package com.example.meetallseckillproducer.seckill_quartz.job;


import com.example.meetallseckillproducer.pojo.SeckillGoods;
import com.example.meetallseckillproducer.service.SeckillGoodsService;
import com.example.meetallseckillproducer.util.DateGenerate;
import com.example.meetallseckillproducer.util.RedisUtil;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import java.sql.Timestamp;
import java.util.List;

@Component
public class AddSeckillInfo implements Job {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private SeckillGoodsService seckillGoodsService;


    /**
     * 定时开启秒杀，添加数据到redis
     * @param jobExecutionContext
     * @throws JobExecutionException
     */
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //获取秒杀数据
        System.out.println(Timestamp.valueOf(DateGenerate.getStringDate()));
        List<SeckillGoods> all = this.seckillGoodsService.getAll(Timestamp.valueOf(DateGenerate.getStringDate()));
        if (all == null){
            System.out.println("add没有数据");
            return;
        }else {
            System.out.println(all.get(1));
        }
        for (SeckillGoods seckillGoods : all){
            redisUtil.hset("seckill",seckillGoods.getGoods_id()+"" ,seckillGoods.getStock_count());
        }
        System.out.println("添加结束");

    }
}
