package com.meetall.commodity.detail.commoditydetailprovider.dao;

import org.apache.ibatis.annotations.Param;

/**
 * 商品属性名
 */
public interface CommodityAttributeNameDao {

    /**
     * 商品属性名查询对应id
     */
    int getAttributeNumber(@Param("attributeName") String attributeName);

    /**
     * 通过属性名id查询商品属性名
     */
    String getAttributeName(@Param("attributeNameNumber") Integer attributeNameNumber);
}
