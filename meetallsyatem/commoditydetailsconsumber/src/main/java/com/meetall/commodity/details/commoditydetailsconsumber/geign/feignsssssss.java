package com.meetall.commodity.details.commoditydetailsconsumber.geign;


import com.meetall.commodity.details.commoditydetailsconsumber.hystrix.testgystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "cloud-commodity-datail-provlder",fallback = testgystrix.class)
public interface feignsssssss {
    @RequestMapping(value = "/getcommodityall",method = RequestMethod.GET)
    public String CommodityAll();
    @RequestMapping("/miaoshacommodity")
    public String MiaoShaCommodity();
}
