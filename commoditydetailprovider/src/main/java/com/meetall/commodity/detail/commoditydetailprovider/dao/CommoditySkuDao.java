package com.meetall.commodity.detail.commoditydetailprovider.dao;


import com.meetall.commodity.detail.commoditydetailprovider.pojo.CommoditySku;
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
    CommoditySku getPriceStock(@Param("commodityNumber") Integer commodityNumber,@Param("commoditySkuAttribute") String commoditySkuAttribute);

    /**
     *
     */

}
