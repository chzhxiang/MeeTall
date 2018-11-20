package com.meetall.commodity.commoditymanage.dao;


import com.meetall.commodity.commoditymanage.pojo.CommoditySku;
import org.apache.ibatis.annotations.Param;

/**
 * 商品sku类
 */
public interface CommoditySkuDao {
    /**
     * 查询商品价格，库存
     * @param ('commodityNumber')参数商品编号
     * @param 'commoditySkuAttribute' 参数sku的属性
     */
    CommoditySku getPriceStock(@Param("commodityNumber") Integer commodityNumber, @Param("commoditySkuAttribute") String commoditySkuAttribute);

    /**
     *查询商品库存
     */
    int getStock(@Param("commodityNumber") Integer commodityNumber, @Param("commoditySkuAttribute") String commoditySkuAttribute);

}
