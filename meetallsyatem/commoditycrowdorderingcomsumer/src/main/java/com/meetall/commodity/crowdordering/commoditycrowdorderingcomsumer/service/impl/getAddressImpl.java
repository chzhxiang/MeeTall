package com.meetall.commodity.crowdordering.commoditycrowdorderingcomsumer.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.meetall.commodity.crowdordering.commoditycrowdorderingcomsumer.feign.UserInfoReceiving;
import com.meetall.commodity.crowdordering.commoditycrowdorderingcomsumer.service.getAddress;
import order.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("getAddressImpl")
public class getAddressImpl implements getAddress {
    @Autowired
    private UserInfoReceiving userInfoReceiving;

    /**
     * 获取用户地址信息集合
     * @param userId
     * @return
     */
    public String abc(Integer userId) {
        String a = userInfoReceiving.getaddl(userId);
        List<Address> addressList = JSONArray.parseArray(a,Address.class);
        return null;
    }

}
