package com.example.demo.Service.impl;

import com.example.demo.Service.AddAddressService;
import com.example.demo.Service.OrderNumber;
import com.example.demo.dao.AddressMapper;
import com.example.demo.pojo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("addAddress")
public class AddAddressServiceImpl implements AddAddressService {
    @Autowired
    private AddressMapper addressMapper;
    @Resource(name = "orderNumberUtil")
    private OrderNumber orderNumber;
    @Override
    public String add(Address address) {
        System.out.println(address.getCity());
        if (address.getCity() == null&&address.getArea()== null&&address.getStreet()==null){
            return "输入不能为空";

        }else {
            address.setAddressnumber(orderNumber.getorderNumber());
            int insert = addressMapper.insert(address);
            if (insert == 1){
                return "添加成功";
            }else {
                return "修改失败";
            }
        }
    }
}
