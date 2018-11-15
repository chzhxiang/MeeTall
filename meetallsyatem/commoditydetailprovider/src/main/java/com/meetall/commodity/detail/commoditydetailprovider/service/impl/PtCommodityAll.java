package com.meetall.commodity.detail.commoditydetailprovider.service.impl;


import com.alibaba.fastjson.JSON;
import com.meetall.commodity.detail.commoditydetailprovider.dao.CommodityAttributeNameDao;
import com.meetall.commodity.detail.commoditydetailprovider.dao.CommodityAttributeValueDao;
import com.meetall.commodity.detail.commoditydetailprovider.dao.CommodityDetailsDao;
import com.meetall.commodity.detail.commoditydetailprovider.dao.CommodityattributerelationDao;
import com.meetall.commodity.detail.commoditydetailprovider.pojo.CommodityDetails;
import com.meetall.commodity.detail.commoditydetailprovider.pojo.Commodityattributerelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 拼团商品集合
 */
@SuppressWarnings("ALL")
@Service("ptCommodityAll")
public class PtCommodityAll {
    @Autowired
    private CommodityDetailsDao commodityDetailsDao;
    /**
     * 属性名dao层
     */
    @Autowired
    private CommodityAttributeNameDao commodityAttributeNameDao;
    /**
     * 属性值dao层
     */
    @Autowired
    private CommodityAttributeValueDao commodityAttributeValueDao;
    /**
     * 商品属性关系
     */
    @Autowired
    private CommodityattributerelationDao commodityattributerelationDao;

    public String CommodityAll(){
        List<CommodityDetails> a = commodityDetailsDao.selectpt();
        int i = 0;
        List<String> name = new ArrayList<>();
        List<String> value = new ArrayList<>();
        for (CommodityDetails c : a) {
            /**
             * 添加商品价格
             */
            Map<String,List<String>> map = new HashMap<>();

            List<String> CommodityAttributeName = new ArrayList<>();
            int shopid = c.getCommodityId();
            c.setCommodityPrice(commodityDetailsDao.GetCommodityprice(shopid));
            List<Commodityattributerelation> attributeNameValue = commodityattributerelationDao.getAttributeNameValue(shopid);
            /**
             * 查询商品的属性名集合
             */
            List<Integer> name1 = commodityattributerelationDao.getName(shopid);
            /**-
             * 查询商品的属性值集合
             */
            List<Integer> value1 = commodityattributerelationDao.getValue(shopid);

            for (Integer attributename :name1){
                List<Integer> values = commodityattributerelationDao.getValues(shopid,attributename);
                List<String> CommodityAttributeValue = new ArrayList<>();
                /**
                 * 通过属性名id去查询属性名
                 */
                for (Integer attributevalue:values) {
                    CommodityAttributeValue.add(commodityAttributeValueDao.getAttributeValue(attributevalue));
                }
                map.put(commodityAttributeNameDao.getAttributeName(attributename), CommodityAttributeValue);
            }
            c.setCommoditySkuNameVAlue(map);
        }
        return JSON.toJSONString(a);
    }

}
