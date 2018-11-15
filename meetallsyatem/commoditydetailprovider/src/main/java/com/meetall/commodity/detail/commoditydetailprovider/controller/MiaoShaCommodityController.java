package com.meetall.commodity.detail.commoditydetailprovider.controller;

import com.meetall.commodity.detail.commoditydetailprovider.service.impl.MiaoshaCommodityAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 秒杀所有商品
 */
@RestController
public class MiaoShaCommodityController {
    @Autowired
    private MiaoshaCommodityAll miaoshaCommodityAll;

    @RequestMapping("/miaoshacommodity")
    public String MiaoShaCommodity(){
        return miaoshaCommodityAll.CommodityAll();
    }

}
