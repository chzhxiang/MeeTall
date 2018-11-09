package com.meetall.commodity.detail.commoditydetailprovider.controller;

import com.alibaba.fastjson.JSON;
import com.meetall.commodity.detail.commoditydetailprovider.dao.CommodityDetailsDao;
import com.meetall.commodity.detail.commoditydetailprovider.pojo.CommodityDetails;
import com.meetall.commodity.detail.commoditydetailprovider.service.impl.CommodityDetailsServiceImpl;
import com.meetall.commodity.detail.commoditydetailprovider.service.impl.CommoditySkuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@SuppressWarnings("ALL")
@RestController
public class CommodityController {

    @Resource(name = "commoditySkuServiceImpl")
    CommoditySkuServiceImpl commoditySkuService;

    public CommoditySkuServiceImpl getCommoditySkuService() {
        return commoditySkuService;
    }
    public void setCommoditySkuService(CommoditySkuServiceImpl commoditySkuService) {
        this.commoditySkuService = commoditySkuService;
    }
    @Resource(name = "commodityDetailsServiceImpl")
    CommodityDetailsServiceImpl commodityDetailsService;
    public CommodityDetailsServiceImpl getCommodityDetailsService() {
        return commodityDetailsService;
    }

    public void setCommodityDetailsService(CommodityDetailsServiceImpl commodityDetailsService) {
        this.commodityDetailsService = commodityDetailsService;
    }

    /**
     * 查询商品库存
     */
    @RequestMapping("/selectcommoditystock")
    public String CommodityStock(@RequestParam("attributename") String attributename[],@RequestParam("attributevalue") String attributevalue[]){
        return commoditySkuService.CommodityStock(10001,attributename,attributevalue);
    }
    /**
     * 根据商品编号查询商品信息
     */
    @RequestMapping("/selectcommodityall")
    public String CommodityAllInfo(@RequestParam("commodityId") Integer commodityId){
        return commodityDetailsService.commodityAllInfo(commodityId);
    }

    /**
     * 根据商品编号查询该商品所有的sku字段信息
     */
    @RequestMapping("selectcommoditysku")
    public String GetCommoditySkuAttribute(@RequestParam("commodityId") Integer commodityId){
        return null;
    }

    @Autowired
    private CommodityDetailsDao commodityDetailsDao;
    /**
     * 查询商品全部信息  包括商品介绍名称，价格(最低价格)
     * @return
     */
    @RequestMapping(value = "/getcommodityall",method = RequestMethod.GET)
    public String CommodityAll(){
        List<CommodityDetails> a = commodityDetailsDao.getAll();
        for (CommodityDetails c : a) {
            c.setCommodityPrice(commodityDetailsDao.GetCommodityprice(c.getCommodityId()));
        }
        return JSON.toJSONString(a);
    }
}
