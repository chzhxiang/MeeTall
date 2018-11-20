package com.meetall.commodity.commoditymanage.dao;


import com.meetall.commodity.commoditymanage.pojo.CommodityClassify;

import java.util.List;

/**
 * 商品分类
 */
public interface CommodityClassifyDao {
    /**
     * 查询有哪些商品分类
     *
     */
    List<CommodityClassify> getAll();

    Integer getCommodityClassifyNumber(String classifyName);

}
