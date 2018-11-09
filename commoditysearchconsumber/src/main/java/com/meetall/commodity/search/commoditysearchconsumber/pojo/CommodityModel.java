package com.meetall.commodity.search.commoditysearchconsumber.pojo;
/**
 * 商品实体
 */
public class CommodityModel {


    private String image;
    /**
     * 图片
     */

    private String productName;
    /**
     * 商品名称
     */

    private String commodityDescribe;
    /**
     * commodity_describe
     * 商品描述
     */

    private Double commodityPrice;
    /**
     * 商品价格
     * （商品展示通过sku查询
     * ）
     */

    private String commodityId;
    /**
     * 商品编号
     */

    private String commodityType;
    /**
     * 商品类型
     */

    private String commoditySku;
    /**
     * 商品规格
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCommodityDescribe() {
        return commodityDescribe;
    }

    public void setCommodityDescribe(String commodityDescribe) {
        this.commodityDescribe = commodityDescribe;
    }

    public Double getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Double commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType;
    }

    public String getCommoditySku() {
        return commoditySku;
    }

    public void setCommoditySku(String commoditySku) {
        this.commoditySku = commoditySku;
    }
}
