package com.meetall.commodity.commoditymanage.pojo;

import java.io.Serializable;

/**
 * (Commodityattributerelation)商品属性关系表实体类
 *
 * @author makejava
 * @since 2018-11-08 10:09:03
 */
public class Commodityattributerelation implements Serializable {

    private static final long serialVersionUID = 414040613453143680L;
    //自增id列
    private Integer id;
    //商品编号
    private Integer commodityNumber;
    //商品属性名编号
    private Integer commodityAttributeNameNumber;
    //商品属性值编号
    private Integer commodityAttributeValueNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommodityNumber() {
        return commodityNumber;
    }

    public void setCommodityNumber(Integer commodityNumber) {
        this.commodityNumber = commodityNumber;
    }

    public Integer getCommodityAttributeNameNumber() {
        return commodityAttributeNameNumber;
    }

    public void setCommodityAttributeNameNumber(Integer commodityAttributeNameNumber) {
        this.commodityAttributeNameNumber = commodityAttributeNameNumber;
    }

    public Integer getCommodityAttributeValueNumber() {
        return commodityAttributeValueNumber;
    }

    public void setCommodityAttributeValueNumber(Integer commodityAttributeValueNumber) {
        this.commodityAttributeValueNumber = commodityAttributeValueNumber;
    }

}