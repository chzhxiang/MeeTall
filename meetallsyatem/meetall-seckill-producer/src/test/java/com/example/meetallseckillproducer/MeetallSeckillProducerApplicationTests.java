package com.example.meetallseckillproducer;

import com.alibaba.druid.filter.config.ConfigTools;
import com.example.meetallseckillproducer.pojo.GoodsAndOrder;
import com.example.meetallseckillproducer.util.DateGenerate;
import com.example.meetallseckillproducer.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MeetallSeckillProducerApplicationTests {
    @Autowired
    RedisUtil redisUtil;
    @Test
    public void contextLoads() throws Exception {
//        Timestamp timestamp = Timestamp.valueOf(DateGenerate.getStringDate());
//        System.out.println(timestamp + "现在的时间");
//        GoodsAndOrder goodsAndOrder = new GoodsAndOrder();
//        goodsAndOrder.setGoods_id(1);
//        goodsAndOrder.setId(1);
//        goodsAndOrder.setOrder_id(1410080408);
//        goodsAndOrder.setOrderGoods_id(1);
//        goodsAndOrder.setOrderUser_id(1);
//        goodsAndOrder.setOrderId(1);
//        goodsAndOrder.setSeckill_price(100.0);
//        goodsAndOrder.setStock_count(100);
//        redisUtil.hset( "test", goodsAndOrder.getGoods_id() + "",goodsAndOrder);
//
//        redisUtil.hset("count",goodsAndOrder.getGoods_id() + "",50);
//        System.out.println("123");
        String password = "Sunkefan123..";
        ConfigTools.main(new String[]{password});
    }
}
