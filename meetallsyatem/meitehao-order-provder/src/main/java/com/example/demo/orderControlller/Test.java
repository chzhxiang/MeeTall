package com.example.demo.orderControlller;

import com.example.demo.dao.*;
import com.example.demo.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private LiuMapper liuMapper;
    @Autowired
    private AddressMapper addressMapper;
    @Autowired
    private FanMapper fanMapper;
    @Autowired
    private LookMapper lookMapper;
    @RequestMapping("in")
    public int get(){
//        Order order = new Order();
//        order.setOrdernumber("124578");
//        return orderMapper.insert(order);
//        Liu liu = new Liu();
//        liu.setLiunumber("112245");
//        return liuMapper.insert(liu);
//        Address address = new Address();
//        address.setAddressnumber("121112");
//        return addressMapper.insert(address);
//        Fan fan = new Fan();
//        fan.setReturnnumber("21212");
//        return fanMapper.insert(fan);
        Look look = new Look();
        look.setShopname("1212112121");
        look.setOrdernumber("5454545121");
        return lookMapper.insert(look);
    }
    @RequestMapping("a")
    public String gege(){
        Address address = addressMapper.getAddress(1, 0);
        return address.getCity();
    }
}
