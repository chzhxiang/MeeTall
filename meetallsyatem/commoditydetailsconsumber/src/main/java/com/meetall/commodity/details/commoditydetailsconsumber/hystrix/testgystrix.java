package com.meetall.commodity.details.commoditydetailsconsumber.hystrix;

import com.meetall.commodity.details.commoditydetailsconsumber.geign.feignsssssss;
import org.springframework.stereotype.Component;

@Component
public class testgystrix implements feignsssssss {

    @Override
    public String CommodityAll() {
        return "hahaha";
    }

    @Override
    public String MiaoShaCommodity() {
        return "laji";
    }
}
