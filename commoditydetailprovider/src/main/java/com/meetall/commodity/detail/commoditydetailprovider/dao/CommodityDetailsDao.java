package com.meetall.commodity.detail.commoditydetailprovider.dao;

import com.meetall.commodity.detail.commoditydetailprovider.pojo.CommodityDetails;

import java.util.List;

/**
 * 商品详情
 */
public interface CommodityDetailsDao {
    /**
     * 通过商品编号查询商品属性（商品名称，商品描述，商品图片）
     */
    List<CommodityDetails> getAll(Integer commodityId);

    
}
