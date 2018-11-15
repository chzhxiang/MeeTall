package com.example.demo.orderControlller;



import com.alibaba.fastjson.JSON;
import com.example.demo.consumer.FirstConsumer;
import com.example.demo.pojo.Order;
import com.example.demo.send.FirstSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author zhuzhe
 * @date 2018/5/25 16:00
 * @email 1529949535@qq.com
 */
@RestController
public class SendController {

    @Autowired
    private FirstSender firstSender;

    @Autowired
    private FirstConsumer firstConsumer;

    public FirstSender getFirstSender() {
        return firstSender;
    }

    public void setFirstSender(FirstSender firstSender) {
        this.firstSender = firstSender;
    }

    public FirstConsumer getFirstConsumer() {
        return firstConsumer;
    }

    public void setFirstConsumer(FirstConsumer firstConsumer) {
        this.firstConsumer = firstConsumer;
    }



    @GetMapping("/send")
    public String send(String message){
        /**
         * UUID.randomUUID().toString()是javaJDK提供的一个自动生成主键的方法。
         * UUID(Universally Unique Identifier)全局唯一标识符,
         * 是指在一台机器上生成的数字，它保证对在同一时空中的所有机器都是唯一的，
         * 是由一个十六位的数字组成,表现出来的形式。
         * 由以下几部分的组合：
         * 当前日期和时间
         * (UUID的第一个部分与时间有关，如果你在生成一个UUID之后，
         * 过几秒又生成一个UUID，则第一个部分不 同，其余相同)
         * 时钟序列，全局唯一的IEEE机器识别号
         * （如果有网卡，从网卡获得，没有网卡以其他方式获得）
         * UUID的唯一缺陷在于生成的结果串会比较长。
         */
        String uuid = UUID.randomUUID().toString();

        firstSender.send(uuid,message);
        return uuid;
    }
    @RequestMapping("pay")
    public String pay(){
        String uuid = UUID.randomUUID().toString();
        Order order = new Order();
        order.setOrdernumber("2018111501163850888");
        order.setUserid(1);
        order.setTimedoller(100.0);
        order.setPaytype("支付宝");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(sdf.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        order.setPaytime(date);
        order.setPaysuccend("支付单号");

        List<Order> list = new ArrayList<>();
        list.add(order);
        String s = JSON.toJSONString(list);
        firstSender.send(uuid,s);
        return "支付成功";
    }
}
