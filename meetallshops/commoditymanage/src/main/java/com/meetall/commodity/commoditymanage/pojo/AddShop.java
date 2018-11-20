package com.meetall.commodity.commoditymanage.pojo;

public class AddShop {
    /**
     * 图片
     */
    private String image;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品分类
     */
    private String commodityClassify;

    /**
     * commodity_describe
     * 商品描述
     */
    private String commodityDescribe;

    /**
     * 商品价格
     */
    private Double commodityPrice;

    /**
     * sku属性名
     */
    private String attributeName[];

    /**
     * sku属性值
     */
    private String attributeValue[];

    /**
     * 价格
     */
    private Double price[];

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

    public String getCommodityClassify() {
        return commodityClassify;
    }

    public void setCommodityClassify(String commodityClassify) {
        this.commodityClassify = commodityClassify;
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

    public String[] getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String[] attributeName) {
        this.attributeName = attributeName;
    }

    public String[] getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String[] attributeValue) {
        this.attributeValue = attributeValue;
    }

    public Double[] getPrice() {
        return price;
    }

    public void setPrice(Double[] price) {
        this.price = price;
    }
}
