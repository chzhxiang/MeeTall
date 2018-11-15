package com.meetall.commodity.crowdordering.commoditycrowdorderingcomsumer.feign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 获取所有参与拼团商品的编号信息
 */

@FeignClient(name = "cloud-commodity-datail-provlder")
public interface GetAllPtgood {
    /**
     * 拿到所有的参与拼团商品
     * @return
     */
    @RequestMapping("/getallptgood")
    public String getAllPtGoods();

    /**
     * 拿到商品信息
     */
    @RequestMapping("/getcommodityalls")
    public String getcommodityID(@RequestParam("CommodityId") Integer CommodityId);
}
