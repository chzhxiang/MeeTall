package com.example.meetallseckillproducer.rabbitmq;

import com.example.meetallseckillproducer.pojo.GoodsAndOrder;
import com.example.meetallseckillproducer.pojo.SeckillId;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@Component
public class SeckillMQProducer {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    /**
     * mq发送消息
     * @param seckillId
     * @throws Exception
     */
    public void send(SeckillId seckillId) throws Exception{
        byte[] bytes=getBytesFromObject(seckillId);
        rabbitTemplate.convertAndSend("seckill",bytes);
    }
    //对象转化为字节码
    public  byte[] getBytesFromObject(Serializable obj) throws Exception {
        if (obj == null) {
            return null;
        }
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(obj);
        return bo.toByteArray();
    }

}
