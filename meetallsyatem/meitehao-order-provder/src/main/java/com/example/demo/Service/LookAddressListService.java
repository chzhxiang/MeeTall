package com.example.demo.Service;

import com.example.demo.pojo.Address;
import com.example.demo.pojo.User;

import java.util.List;

public interface LookAddressListService {
    /**
     * 查看用户地址集合
     * @param userid
     * @return
     */
    List<Address> getaddlist(int userid);
}
