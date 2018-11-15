package com.example.demo.Service.impl;

import com.alibaba.fastjson.JSON;
import com.example.demo.Service.LookAddressListService;
import com.example.demo.dao.AddressMapper;
import com.example.demo.pojo.Address;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("lookAddressList")
public class LookAddressListServiceImpl implements LookAddressListService {
    @Autowired
    private AddressMapper addressMapper;
    @Override
    public List<Address> getaddlist(int userid) {
        List<Address> getlist = addressMapper.getaddlist(userid);
        for (Address address:getlist) {
            System.out.println(address.getCity());
        }
        return getlist;
    }
}
