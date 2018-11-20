package com.meetall.commodity.detail.commoditydetailprovider.controller;

import com.meetall.commodity.detail.commoditydetailprovider.service.impl.CommodityattributerelationServiceImpl;
import com.meetall.commodity.detail.commoditydetailprovider.service.impl.MiaoshaCommodityAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 秒杀所有商品
 */
@RestController
public class MiaoShaCommodityController {
    @Autowired
    private MiaoshaCommodityAll miaoshaCommodityAll;


    @Autowired
    private CommodityattributerelationServiceImpl commodityattributerelationService;
    /**
     * 获得所有秒杀商品
     * @return
     */
    @RequestMapping(value = "/miaoshacommodity")
    public String MiaoShaCommodity(){
        return miaoshaCommodityAll.CommodityAll();
    }

    /**
     * 批量查询数据
     */
    @RequestMapping(value = "/batchQuery")
    public String batchQuery(List<Integer> integerList){
        return commodityattributerelationService.batchQuery(integerList);
    }
}
