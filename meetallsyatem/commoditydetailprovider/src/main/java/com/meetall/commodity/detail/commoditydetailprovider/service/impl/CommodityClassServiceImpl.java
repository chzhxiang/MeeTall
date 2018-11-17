package com.meetall.commodity.detail.commoditydetailprovider.service.impl;

import com.alibaba.fastjson.JSON;
import com.meetall.commodity.detail.commoditydetailprovider.dao.*;
import com.meetall.commodity.detail.commoditydetailprovider.pojo.CommodityDetails;
import com.meetall.commodity.detail.commoditydetailprovider.pojo.Commodityattributerelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 查看分类的所有商品
 */
@SuppressWarnings("ALL")
@Service("commodityClassServiceImpl")
public class CommodityClassServiceImpl {
    @Autowired
    private CommodityClassifyDao commodityClassifyDao;

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
    @Resource
    private CommodityattributerelationDao commodityattributerelationDao;


    public String commodityClassfy(String commodityClassfy){
        Integer commodityClassifyNumber = commodityClassifyDao.getCommodityClassifyNumber(commodityClassfy);
//        commodityClassifyDao.
        List<Integer> allClassfy = commodityDetailsDao.getAllClassfy(commodityClassifyNumber);
        List<CommodityDetails> commodityDetailsList = new ArrayList<>();

        for (Integer i :allClassfy) {
            Map<String,List<String>> map = new HashMap<>();
            //商品编号查询商品信息
            CommodityDetails allId = commodityDetailsDao.getAllId(i);
            allId.setCommodityPrice(commodityDetailsDao.GetCommodityprice(i));
            List<Commodityattributerelation> attributeNameValue = commodityattributerelationDao.getAttributeNameValue(i);
            /**
             * 查询商品的属性名集合
             */
            List<Integer> name1 = commodityattributerelationDao.getName(i);
            /**-
             * 查询商品的属性值集合
             */
            List<Integer> value1 = commodityattributerelationDao.getValue(i);

            for (Integer attributename :name1){
                List<Integer> values = commodityattributerelationDao.getValues(i,attributename);
                List<String> CommodityAttributeValue = new ArrayList<>();
                /**
                 * 通过属性名id去查询属性名
                 */
                for (Integer attributevalue:values) {
                    CommodityAttributeValue.add(commodityAttributeValueDao.getAttributeValue(attributevalue));
                }
                map.put(commodityAttributeNameDao.getAttributeName(attributename), CommodityAttributeValue);
            }
            allId.setCommoditySkuNameVAlue(map);
            commodityDetailsList.add(allId);
        }

        return JSON.toJSONString(commodityDetailsList);
    }
}
