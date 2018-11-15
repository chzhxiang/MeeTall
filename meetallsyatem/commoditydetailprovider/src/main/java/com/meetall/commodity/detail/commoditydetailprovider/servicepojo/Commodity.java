package com.meetall.commodity.detail.commoditydetailprovider.servicepojo;

/**
 * 业务实体类
 */
public class Commodity {
    /**
     * 商品编号
     */
    private Integer commodityId;
    /**
     * 图片
     */
    private String img;
    /**
     *商品描述
     */
    private String commodityDescribe;
    /**
     * 商品分类
     */
    private String commodityClassify;
    /**
     * 商品库存
     */
    private Integer commodityStock;
    /**
     * 商品价格
     */
    private Double commodityPrice;

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCommodityDescribe() {
        return commodityDescribe;
    }

    public void setCommodityDescribe(String commodityDescribe) {
        this.commodityDescribe = commodityDescribe;
    }

    public String getCommodityClassify() {
        return commodityClassify;
    }

    public void setCommodityClassify(String commodityClassify) {
        this.commodityClassify = commodityClassify;
    }

    public Integer getCommodityStock() {
        return commodityStock;
    }

    public void setCommodityStock(Integer commodityStock) {
        this.commodityStock = commodityStock;
    }

    public Double getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Double commodityPrice) {
        this.commodityPrice = commodityPrice;
    }
}
