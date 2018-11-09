package com.meetall.commodity.detail.commoditydetailprovider.controller;

import com.alibaba.fastjson.JSON;
import com.meetall.commodity.detail.commoditydetailprovider.dao.*;
import com.meetall.commodity.detail.commoditydetailprovider.pojo.CommodityDetails;
import com.meetall.commodity.detail.commoditydetailprovider.pojo.CommoditySku;
import com.meetall.commodity.detail.commoditydetailprovider.pojo.Commodityattributerelation;
import com.meetall.commodity.detail.commoditydetailprovider.service.impl.CommodityattributerelationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@SuppressWarnings("ALL")
@RestController
public class test {
    @Resource
    private CommoditySkuDao commoditySkuDao;

    public CommoditySkuDao getCommoditySkuDao() {
        return commoditySkuDao;
    }

    public void setCommoditySkuDao(CommoditySkuDao commoditySkuDao) {
        this.commoditySkuDao = commoditySkuDao;
    }
    @Autowired
    private CommodityDetailsDao commodityDetailsDao;
    @RequestMapping("/re")
    public String a(){
        String a = JSON.toJSONString(commodityDetailsDao.GetCommodityprice(10001));
        return a;
    }


    /**
     * 查询商品全部信息  包括商品介绍名称，价格(最低价格)
     * @return
     */


    @RequestMapping("/qw")
    public String aa(@RequestBody CommodityDetails commodityDetails){
        System.out.println(commodityDetails.getCommodityDescribe());
        return "";
    }


    @Autowired
    CommodityAttributeNameDao commodityAttributeNameDao;
    @RequestMapping("/tre")
    public String wqwq(){
        commodityAttributeNameDao.getAttributeNumber("颜色");
        return "1";
    }

    /**
     * 查询商品属性
     */
    @Autowired
    CommodityattributerelationDao commodityattributerelationDao;
    @RequestMapping("/attr")
    public String wqewqeqw(){
        List<Commodityattributerelation> attributeNameValue = commodityattributerelationDao.getAttributeNameValue(10001);
        for (Commodityattributerelation c : attributeNameValue){
            System.out.println(c.getCommodityAttributeNameNumber());
            System.out.println(c.getCommodityAttributeValueNumber());
        }
        String a[] = {"",""};
        a[a.length] = "a";
        return JSON.toJSONString(commodityattributerelationDao.getAttributeNameValue(10001));
    }

    @Autowired
    private CommodityattributerelationServiceImpl commodityattributerelationService;
    @RequestMapping("/poi")
    public String asda(){
        return commodityattributerelationService.CommodityAll();
       //  JSON.toJSONString(commodityattributerelationDao.getName(10001));
    }
}
