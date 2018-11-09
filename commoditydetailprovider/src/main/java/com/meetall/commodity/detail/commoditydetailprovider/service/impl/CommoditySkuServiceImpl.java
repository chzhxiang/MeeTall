package com.meetall.commodity.detail.commoditydetailprovider.service.impl;

import com.alibaba.fastjson.JSON;
import com.meetall.commodity.detail.commoditydetailprovider.dao.CommodityAttributeNameDao;
import com.meetall.commodity.detail.commoditydetailprovider.dao.CommodityAttributeValueDao;
import com.meetall.commodity.detail.commoditydetailprovider.dao.CommoditySkuDao;
import com.meetall.commodity.detail.commoditydetailprovider.service.CommoditySkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("ALL")
@Service("commoditySkuServiceImpl")
public class CommoditySkuServiceImpl implements CommoditySkuService {
    @Autowired
    private CommoditySkuDao commoditySkuDao;

    /**
     * 商品属性名查询id
     */
    @Autowired
    private CommodityAttributeNameDao commodityAttributeNameDao;
    /**
     * 商品属性值查询id
     */
    @Autowired
    private CommodityAttributeValueDao commodityAttributeValueDao;
    /**
     * 查询商品库存
     * @param commodityNumber   商品编号
     * @param attributeName     商品属性名
     * @param attributeValue    商品属性值
     * @return
     */
    public String CommodityStock(Integer commodityNumber,String attributeName[],String attributeValue[]){
        int name = attributeName.length;
        String all = "";
        String Start = "[";
        for (int i = 0;i <= name-1;i++){
            String douhao = ",";
            if (i==0){
                douhao = "";
            }
            String a = attributeName[i];
            String left = String.valueOf(commodityAttributeNameDao.getAttributeNumber(a));
            String b = attributeValue[i];
            String right = String.valueOf(commodityAttributeValueDao.getAttributeValueNumber(b));
            all = all + douhao +  left + ":" + right ;
        }
        String last = Start + all + "]";
        System.out.println(last);

        int stock = commoditySkuDao.getStock(commodityNumber, last);

        return String.valueOf(stock);
    }

}
