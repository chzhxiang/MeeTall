package com.example.demo.Service.impl;

import com.alibaba.fastjson.JSONArray;
import com.example.demo.Service.FanService;
import com.example.demo.Service.OrderNumber;
import com.example.demo.dao.AddressMapper;
import com.example.demo.dao.FanMapper;
import com.example.demo.dao.OrderMapper;
import com.example.demo.pojo.Address;
import com.example.demo.pojo.Fan;
import com.example.demo.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service("fan")
public class FanServiceImpl implements FanService {
    @Autowired
    private FanMapper fanMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Resource(name = "orderNumberUtil")
    private OrderNumber orderNumber;

    @Override
    public String fanhui(Address address,String fanlist) {
        System.out.println(fanlist);
        List<Fan> list = JSONArray.parseArray(fanlist, Fan.class);
        String s = null;
        if (list == null){
            return "添加失败";
        }else {
            for (Fan fan:list) {
                fan.setAddress(address.getAddressnumber());
                fan.setConsumername(address.getConsumernamer());
                fan.setConsumeraddress(address.getCity()+address.getArea()+address.getStreet());
                fan.setSonsumerphoto(address.getConsumerphoto());
                fan.setReturnnumber(orderNumber.getorderNumber());
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                Date date = null;
                try {
                    date = sdf.parse(sdf.format(new Date()));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                fan.setReturnapplytime(date);
                Order order = orderMapper.selectByPrimaryKey(fan.getOrdernumber());
                Order order1 = new Order();
                order1.setOrderstate(3);

                order1.setOrdernumber(fan.getOrdernumber());
                System.out.println(fan.getOrdernumber());
                orderMapper.updateByPrimaryKeySelective(order1);
                Double d = order.getShopdoller();
                fan.setReturndoller(d*fan.getRenumber());
                //0表示审核中1表示已处理
                fan.setReturnzt(0);

                System.out.println("zhuangtai");

                int insert = fanMapper.insertSelective(fan);
                if (insert == 0){
                    s = "稍后再试";
                }else {
                    s = "添加成功";
                }
            }
            return s;
        }

    }
}
