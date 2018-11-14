package com.example.demo.Service.impl;

import com.alibaba.fastjson.JSON;
import com.example.demo.Service.LookAddressListService;
import com.example.demo.Service.LookAddressOneService;
import com.example.demo.Service.UpdateAddressService;
import com.example.demo.dao.AddressMapper;
import com.example.demo.pojo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("updateAddress")
public class UpdaeAddressServiceImpl implements UpdateAddressService {
    @Autowired
    private AddressMapper addressMapper;
    @Resource(name = "lookAddressList")
    private LookAddressListService lookAddressListService;
    @Override
    public String updateAddress(Address address) {
        String re = null;
        String addnumber = address.getAddressnumber();
        Address address1 = addressMapper.selectByPrimaryKey(addnumber);
        if (address1.getCity().equals(address.getCity())&&address1.getArea().equals(address.getArea())&&address1.getStreet().equals(address.getStreet())){
            re = JSON.toJSONString(addressMapper.getaddlist(address.getUserid()));
            return re;
        }else {

            int i = addressMapper.updateByPrimaryKeySelective(address);
            System.out.println(i);
            if (i == 1){
                return JSON.toJSONString(addressMapper.getaddlist(address1.getUserid()));
            }else {
                return "修改失败";
            }
        }
    }
}
