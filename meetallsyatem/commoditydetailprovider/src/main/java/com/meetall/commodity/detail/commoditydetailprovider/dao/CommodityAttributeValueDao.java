package com.meetall.commodity.detail.commoditydetailprovider.dao;

import org.apache.ibatis.annotations.Param;

/**
 * 商品属性值
 */
public interface CommodityAttributeValueDao {

    /**
     * 属性值查询对应的属性id
     */

    int getAttributeValueNumber(@Param("Attributevalue") String Attributevalue);

    /**
     *  通过属性值id查询属性值
     */
    String getAttributeValue(@Param("attributeValueNumber") Integer attributeValueNumber);
}
