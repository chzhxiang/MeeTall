package com.meetall.commodity.detail.commoditydetailprovider.dao;

import com.meetall.commodity.detail.commoditydetailprovider.pojo.CommodityClassify;
import org.apache.ibatis.annotations.Select;

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
