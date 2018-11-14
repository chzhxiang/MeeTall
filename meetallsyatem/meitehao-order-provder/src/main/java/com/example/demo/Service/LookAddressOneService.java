package com.example.demo.Service;

import com.example.demo.pojo.Address;

public interface LookAddressOneService {
    /**
     * 查看一条地址信息
     * @param addressNumber
     * @return
     */
    Address getoneAddress(String addressNumber);
}
