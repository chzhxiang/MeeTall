package com.example.demo.consumer;



import com.alibaba.fastjson.JSONArray;
import com.example.demo.dao.LookMapper;
import com.example.demo.dao.OrderMapper;

import com.example.demo.pojo.Look;
import com.example.demo.pojo.Order;
import com.example.demo.redisUtil.RedisUtil;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 消息消费者1
 * @author zhuzhe
 * @date 2018/5/25 17:32
 * @email 1529949535@qq.com
 */
@Component
public class FirstConsumer {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private LookMapper lookMapper;
    @Autowired
    private RedisUtil redisUtil;

    @RabbitListener(queues = {"first-queue","second-queue"}, containerFactory = "rabbitListenerContainerFactory")
    public void handleMessage(String message) throws Exception {
        System.out.println(1);
        List<Order> list = JSONArray.parseArray(message, Order.class);

        for (Order order:list) {
            String userid = String.valueOf(order.getUserid());
            String orderNumber = order.getOrdernumber();
            Object hget = redisUtil.hget(userid, orderNumber);
            if(hget instanceof Order){
                Order order1 = (Order) hget;
                order1.setPaytime(order.getPaytime());
                order1.setPaysuccend(order.getPaysuccend());
                order1.setTimedoller(order.getTimedoller());
                order1.setPaytype(order.getPaytype());
                order1.setOrderstate(1);
                orderMapper.insertSelective(order1);
                Look look = new Look();
                look.setShopid(order1.getShopid());
                look.setOrderstate(order1.getOrderstate());
                look.setUserid(order1.getUserid());
                look.setRedundant1(order.getRedundant());
                lookMapper.insert(look);
                String s = String.valueOf(order1.getUserid());
                redisUtil.hdel(s,order.getOrdernumber());
            }
        }
    }
}

