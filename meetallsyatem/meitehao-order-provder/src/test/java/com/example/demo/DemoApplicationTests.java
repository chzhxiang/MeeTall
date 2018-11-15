package com.example.demo;

import com.example.demo.pojo.Order;
import com.example.demo.redisUtil.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void contextLoads() {
        List<Order11> st = new ArrayList<>();
        Order11 o = new Order11();
        o.setUserid(111);
        st.add(o);
        redisUtil.lSet("AAA",st);
        List<Object> objects = redisUtil.lGet("AAA", 0, 1);
        for (Object oo :objects) {

            System.out.println(oo);

            if(oo instanceof Order11){
                Order11 order = (Order11)oo;
                System.out.println(order.getShopid());
                System.out.println("777777777");
            }else{
                System.out.println("ddfdsfdsf");
            }
        }
    }

}
