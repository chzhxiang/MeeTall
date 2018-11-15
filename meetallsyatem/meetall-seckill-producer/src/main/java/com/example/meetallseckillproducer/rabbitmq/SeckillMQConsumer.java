package com.example.meetallseckillproducer.rabbitmq;

import com.example.meetallseckillproducer.pojo.GoodsAndOrder;
import com.example.meetallseckillproducer.pojo.SeckillId;
import com.example.meetallseckillproducer.pojo.SeckillOrder;
import com.example.meetallseckillproducer.service.SeckillOrderSerivce;
import com.example.meetallseckillproducer.util.RedisUtil;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import sun.plugin2.message.Message;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.nio.channels.Channel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Component
public class SeckillMQConsumer {

    @Autowired
    private RedisUtil redisUtil;

    private SeckillOrder seckillOrder;

    @Autowired
    private SeckillOrderSerivce seckillOrderSerivce;

    /**
     * 消费队列
     * @param bytes
     * @throws Exception
     */
    @RabbitListener(queues = "seckill")
    public void process(byte[] bytes) throws Exception{
        SeckillOrder seckillOrder = new SeckillOrder();
        //1.字节码转化为对象
        SeckillId seckillId = (SeckillId) getObjectFromBytes(bytes);
        //2.判断redis库存是否买完了
        Integer Goods_id = seckillId.getGoods_id();
        Integer orderUser_id = seckillId.getUser_id();
        Integer counts = (Integer) redisUtil.hget("seckill", seckillId.getGoods_id() + "");
        if (counts < 1){
            return;
        }
        //3.redis减库存
        double count = redisUtil.hdecr("seckill", ""+seckillId.getGoods_id(),1);
        //4.将订单信息插入数据库
        seckillOrder.setGoods_id(Goods_id);
        seckillOrder.setOrder_id(getOrderIdByUUId());
        seckillOrder.setUser_id(orderUser_id);
        seckillOrderSerivce.insertSeckillOrder(seckillOrder);
    }

    //字节码转化为对象
    public  Object getObjectFromBytes(byte[] objBytes) throws Exception {
        if (objBytes == null || objBytes.length == 0) {
            return null;
        }
        ByteArrayInputStream bi = new ByteArrayInputStream(objBytes);
        ObjectInputStream oi = new ObjectInputStream(bi);
        return oi.readObject();
    }
    //生成订单号
    public static String getOrderIdByUUId() {
        Date date=new Date();
        DateFormat format = new SimpleDateFormat("yyyyMMdd");
        String time = format.format(date);
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {//有可能是负数
            hashCodeV = -hashCodeV;
        }
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正数型
        return time + String.format("%011d", hashCodeV);
    }


}
