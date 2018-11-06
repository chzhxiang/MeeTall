package com.meetall.commodity.detail.commoditydetailprovider.controller;

import com.alibaba.fastjson.JSON;
import com.meetall.commodity.detail.commoditydetailprovider.dao.CommoditySkuDao;
import com.meetall.commodity.detail.commoditydetailprovider.pojo.CommoditySku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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

    @RequestMapping("/re")
    public String a(){
        String a = JSON.toJSONString(commoditySkuDao.getPriceStock(10001, "[1:1,2:1]"));
        return a;
    }
}
