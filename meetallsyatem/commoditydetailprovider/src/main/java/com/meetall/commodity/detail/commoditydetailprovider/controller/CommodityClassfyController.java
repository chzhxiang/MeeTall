package com.meetall.commodity.detail.commoditydetailprovider.controller;

import com.alibaba.fastjson.JSON;
import com.meetall.commodity.detail.commoditydetailprovider.service.impl.CommodityClassServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通过商品分类名称查询所有商品
 */
@SuppressWarnings("ALL")
@RestController
public class CommodityClassfyController {
    @Autowired
    private CommodityClassServiceImpl commodityClassService;

    /**
     * 通过分类名称查询所有的商品
     * @param name 分类名称
     * @return
     */
    @RequestMapping("/commodityClassfy")
    public String commodityClassfy(@RequestParam("name") String name){
        return commodityClassService.commodityClassfy(name);
    }

}
