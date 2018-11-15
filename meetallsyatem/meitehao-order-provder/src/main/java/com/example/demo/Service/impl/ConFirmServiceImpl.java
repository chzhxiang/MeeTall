package com.example.demo.Service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.demo.Service.ConfirmService;
import com.example.demo.Service.DaoService;
import com.example.demo.dao.AddressMapper;
import com.example.demo.pojo.Address;

import com.example.demo.pojo.Order;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("conf")
public class ConFirmServiceImpl implements ConfirmService {
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public String getconf(String orderList) {
        System.out.println(orderList);
        List<Order> list = JSONArray.parseArray(orderList, Order.class);
        int moren = 0;
        List<DaoService> list1 = new ArrayList<>();
        int userid = 0;
        for (Order order:list) {
            userid = order.getUserid();
            Address address = addressMapper.getAddress(userid,moren);
            if (address != null){
                DaoService daoService = new DaoService();
                daoService.setAddress(address.getCity()+address.getArea()
                        +address.getStreet());
                daoService.setNumber(order.getShopnumber());
                daoService.setShopId(order.getShopid());
                daoService.setDoller(order.getShopdoller());
                daoService.setShupTotalNumber(order.getShopdoller()*order.getShopnumber());
                daoService.setUserId(order.getUserid());
                list1.add(daoService);
            }
        }
        return JSON.toJSONString(list1);
    }
}
