package com.example.demo.Service.impl;


import com.example.demo.Service.LookAddressOneService;
import com.example.demo.dao.AddressMapper;
import com.example.demo.pojo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("getaddressOne")
public class LookAddressOneServiceImpl implements LookAddressOneService {
    @Autowired
    private AddressMapper addressMapper;
    @Override
    public Address getoneAddress(String addressNumber) {
        Address address = addressMapper.selectByPrimaryKey(addressNumber);
        System.out.println(address.getCity());
        return address;
    }
}
