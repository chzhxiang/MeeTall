package com.meetall.commodity.commoditymanage.pojo;

/**
 * 商品sku类
 */
public class CommoditySku {

    /**
     * 商品sku编号
     */
    private Integer commoditySkuNumber;

    /**
     * 商品编号
     */
    private Integer commodityNumber;

    /**
     * 商品sku属性
     */
    private String commoditySkuAttribute;

    /**
     * 商品价格
     * select MIN(commodity_price) from commoditySku where commodity_number=10001
     */
    private Double commodityPrice;

    /**
     * 商品库存
     */
    private Integer commodityStock;

    public Integer getCommoditySkuNumber() {
        return commoditySkuNumber;
    }

    public void setCommoditySkuNumber(Integer commoditySkuNumber) {
        this.commoditySkuNumber = commoditySkuNumber;
    }

    public Integer getCommodityNumber() {
        return commodityNumber;
    }

    public void setCommodityNumber(Integer commodityNumber) {
        this.commodityNumber = commodityNumber;
    }

    public String getCommoditySkuAttribute() {
        return commoditySkuAttribute;
    }

    public void setCommoditySkuAttribute(String commoditySkuAttribute) {
        this.commoditySkuAttribute = commoditySkuAttribute;
    }

    public Double getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Double commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public Integer getCommodityStock() {
        return commodityStock;
    }

    public void setCommodityStock(Integer commodityStock) {
        this.commodityStock = commodityStock;
    }
}
