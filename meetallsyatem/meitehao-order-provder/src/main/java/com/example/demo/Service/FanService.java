package com.example.demo.Service;

import com.example.demo.pojo.Address;
import com.example.demo.pojo.Order;

public interface FanService {
    /**
     * 传入地址信息退单
     * @param address
     * @param fanlist
     * @return
     */
    String fanhui(Address address,String fanlist);
}
