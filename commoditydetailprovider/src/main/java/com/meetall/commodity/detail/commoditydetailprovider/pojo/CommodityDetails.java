package com.meetall.commodity.detail.commoditydetailprovider.pojo;

import com.meetall.commodity.detail.commoditydetailprovider.dao.CommodityDetailsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * 商品详情
 */
public class CommodityDetails {
    /**
     * 商品编号
     */
    private Integer commodityId;
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
    private Integer commodityClassify;
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
     * 商品属性名
     *
     */
    private List<String> CommdityAttributeName;

    /**
     *商品属性值
     */
    private List<String> CommodityAttributeValue;

    public List<String> getCommdityAttributeName() {
        return CommdityAttributeName;
    }

    public void setCommdityAttributeName(List<String> commdityAttributeName) {
        CommdityAttributeName = commdityAttributeName;
    }

    public List<String> getCommodityAttributeValue() {
        return CommodityAttributeValue;
    }

    public void setCommodityAttributeValue(List<String> commodityAttributeValue) {
        CommodityAttributeValue = commodityAttributeValue;
    }






    public Double getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Double commodityPrice) {
        this.commodityPrice = commodityPrice;
    }
    public Integer getCommodityId() {
        return commodityId;
    }


    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

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

    public Integer getCommodityClassify() {
        return commodityClassify;
    }

    public void setCommodityClassify(Integer commodityClassify) {
        this.commodityClassify = commodityClassify;
    }

    public String getCommodityDescribe() {
        return commodityDescribe;
    }

    public void setCommodityDescribe(String commodityDescribe) {
        this.commodityDescribe = commodityDescribe;
    }


}
