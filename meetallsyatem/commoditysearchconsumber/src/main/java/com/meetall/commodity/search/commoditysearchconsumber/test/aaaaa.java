package com.meetall.commodity.search.commoditysearchconsumber.test;

import com.alibaba.fastjson.JSON;
import com.meetall.commodity.search.commoditysearchconsumber.feign.CommodityDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class aaaaa {
    @Autowired
    private CommodityDetail commodityDetail;

    public void a(){
        String a = JSON.toJSONString(commodityDetail.CommodityAll());
        System.out.println(a);
    }
}
