package com.meetall.commodity.details.commoditydetailsconsumber.geign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "cloud-commodity-datail-provlder")
public interface feignsssssss {
    @RequestMapping(value = "/getcommodityall",method = RequestMethod.GET)
    public String CommodityAll();
    @RequestMapping("/miaoshacommodity")
    public String MiaoShaCommodity();
}
