package com.meetall.commodity.search.commoditysearchconsumber.feign;

import commoditypojo.CommodityDetails;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("cloud-commodity-datail-provlder")
public interface CommodityDetail {
    @RequestMapping(value = "/getcommodityall",method = RequestMethod.GET)
    public String CommodityAll();
}
