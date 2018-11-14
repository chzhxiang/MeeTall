package com.example.demo.Service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.demo.Service.AddRedisListService;
import com.example.demo.Service.DaoService;
import com.example.demo.Service.OrderNumber;
import com.example.demo.pojo.Address;
import com.example.demo.pojo.Order;

import com.example.demo.redisUtil.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service("addredislist")
public class AddRedisListServiceImpl implements AddRedisListService {
    @Autowired
    private RedisUtil redisUtil;
    @Resource(name = "orderNumberUtil")
    private OrderNumber orderNumber;
    @Override
    public String addredislist(String listOrder, Address address) {
        System.out.println(listOrder);
        List<Order> list = JSONArray.parseArray(listOrder, Order.class);
        System.out.println(list);
        List<DaoService> list1 = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        String userid1 = null;
        for (Order order:list) {
            System.out.println(1);
            order.setOrdernumber(orderNumber.getorderNumber());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;
            try {
                date = sdf.parse(sdf.format(new Date()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            order.setOrdcreatetime(date);
            order.setOrderstate(0);
            order.setShoptotaldoller(order.getShopdoller()*order.getShopnumber());
            //生成订单信息
            userid1 = String.valueOf(order.getUserid());
            System.out.println(userid1);
            map.put(order.getOrdernumber(),order);
            //添加返回集合
            DaoService daoService = new DaoService();
            //地址信息
            daoService.setAddress(address.getCity()+address.getArea()+address.getStreet());
            //订单创建时间
            daoService.setCreatDate(order.getOrdcreatetime());
            //商品价格
            daoService.setDoller(order.getShopdoller());
            //商品数量
            daoService.setNumber(order.getShopnumber());
            //商品id
            daoService.setShopId(order.getShopid());
            //订单编号
            daoService.setOrdreNumber(order.getOrdernumber());
            //用户id
            daoService.setUserId(order.getUserid());
            //商品总价
            daoService.setShupTotalNumber(order.getShoptotaldoller());
            daoService.setOrdreZt("未付款");
            list1.add(daoService);
        }
        redisUtil.hmset(userid1,map);
        System.out.println(list1);
        return JSON.toJSONString(list1);

    }
}
