package com.meetall.commodity.detail.commoditydetailprovider.dao;

import com.meetall.commodity.detail.commoditydetailprovider.pojo.CommodityDetails;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品详情
 */
public interface CommodityDetailsDao {
    /**
     * 通过商品编号查询商品属性（商品名称，商品描述，商品图片）
     */
    CommodityDetails getAllId(@Param("commodityId") Integer commodityId);

    /**
     * 查询所有商品
     */
    List<CommodityDetails> getAll();

    /**
     * 查询所有拼团商品
     */
    List<CommodityDetails> selectpt();

    /**
     * 查询所有秒杀商品
     */
    List<CommodityDetails> selectMiaosha();

    /**
     * 查询指定商品的sku
     */
    CommodityDetails getCommodityIdSku(Integer commodityId);

    /**
     * 查询商品价格
     */
    Double GetCommodityprice(Integer commodityId);

    /**
     * 查询参与拼团的商品
     */
    List<Integer> getAllPtGoods();

    /**
     * 查询参与秒杀的商品编号
     */
    List<Integer> getAllMiaosha();

}
