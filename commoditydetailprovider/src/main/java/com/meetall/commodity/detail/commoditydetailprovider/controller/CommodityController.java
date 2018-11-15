package com.meetall.commodity.detail.commoditydetailprovider.controller;

import com.alibaba.fastjson.JSON;
import com.meetall.commodity.detail.commoditydetailprovider.dao.CommodityDetailsDao;
import com.meetall.commodity.detail.commoditydetailprovider.pojo.CommodityDetails;
import com.meetall.commodity.detail.commoditydetailprovider.service.impl.CommodityDetailsServiceImpl;
import com.meetall.commodity.detail.commoditydetailprovider.service.impl.CommoditySkuServiceImpl;
import com.meetall.commodity.detail.commoditydetailprovider.service.impl.CommodityattributerelationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
     * 查询商品库存和价格
     */
    @RequestMapping("/selectcommoditystock")
    public String CommodityStock(@RequestParam("commodityId")Integer commodityId, @RequestParam("attributename") String attributename[],@RequestParam("attributevalue") String attributevalue[]){
        return commoditySkuService.CommodityStock(commodityId,attributename,attributevalue);
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
    @RequestMapping("/selectcommoditysku")
    public String GetCommoditySkuAttribute(@RequestParam("commodityId") Integer commodityId){
        return null;
    }

    @Autowired
    private CommodityDetailsDao commodityDetailsDao;
    /**
     * 查询商品全部信息  包括商品介绍名称，价格(最低价格)
     * @return

    @RequestMapping(value = "/getcommodityall",method = RequestMethod.GET)
    public String CommodityAll(){
        List<CommodityDetails> a = commodityDetailsDao.getAll();
        for (CommodityDetails c : a) {
            c.setCommodityPrice(commodityDetailsDao.GetCommodityprice(c.getCommodityId()));
        }
        return JSON.toJSONString(a);
    }
    */
    /**
     * 查询到商品所有的信息，商品名称，分类编号，商品id，商品价格，商品sku属性数组集合，商品图片
     */
    @Autowired
    private CommodityattributerelationServiceImpl commodityattributerelationService;
    @RequestMapping("/getcommodityall")
    public String getcommodityall(){
        return commodityattributerelationService.CommodityAll();
    }

    /**
     * 通过商品id查询商品的信息
     * @param comid
     * @return
     */
    @RequestMapping("/getcommodityalls")
    public String getcommodityID(@RequestParam("CommodityId") Integer CommodityId){
        return commodityattributerelationService.CommodityIdSku(CommodityId);
    }

    /**
     * 通过商品分类查询该类的所有商品
     */


    /**
     * 查询参与拼团的商品
     */
    @RequestMapping("/getallptgood")
    public String getAllPtGoods(){
        return JSON.toJSONString(commodityDetailsDao.getAllPtGoods());
    }


    /**
     * 查询参与秒杀的商品
     */
    @RequestMapping("/getallmiaosha")
    public String getAllMiaosha(){
        return JSON.toJSONString(commodityDetailsDao.getAllMiaosha());
    }

}
