package com.meetall.commodity.detail.commoditydetailprovider.service.pojo;

import java.util.List;

public class CommodityAttributeService {
    /**
     * 商品id
     */
    private Integer CommodityId;

    /**
     * 商品属性名
     */
    private String CommodityAttributeName;

    /**
     * 商品属性值
     */
    private String CommodityAttributeValue;

    /**
     * 查询出来放入的集合
     */
    List<CommodityAttributeService> commodityAttributeServiceList;

    public Integer getCommodityId() {
        return CommodityId;
    }

    public void setCommodityId(Integer commodityId) {
        CommodityId = commodityId;
    }

    public String getCommodityAttributeName() {
        return CommodityAttributeName;
    }

    public void setCommodityAttributeName(String commodityAttributeName) {
        CommodityAttributeName = commodityAttributeName;
    }

    public String getCommodityAttributeValue() {
        return CommodityAttributeValue;
    }

    public void setCommodityAttributeValue(String commodityAttributeValue) {
        CommodityAttributeValue = commodityAttributeValue;
    }

    public List<CommodityAttributeService> getCommodityAttributeServiceList() {
        return commodityAttributeServiceList;
    }

    public void setCommodityAttributeServiceList(List<CommodityAttributeService> commodityAttributeServiceList) {
        this.commodityAttributeServiceList = commodityAttributeServiceList;
    }
}
