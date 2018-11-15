package com.meetall.commodity.search.commoditysearchconsumber.pojo;

/**
 * 搜索商品的实体类
 */
public class CommoditySearch {
    private String CommodityName;
    /**商品名称
     *
     */
    private String Commodityprice;
    /**价格
     *
     */
    private String sort;
    /**排序类型
     *
     */
    private String queryString;
    /**关键字
     *
     */
    private String CommodityDescription;
    /**商品描述
     *
     */
    private String CommodityType;
    /**商品类型
     *
     */
    public String getCommodityName() {
        return CommodityName;
    }

    public void setCommodityName(String commodityName) {
        CommodityName = commodityName;
    }

    public String getCommodityprice() {
        return Commodityprice;
    }

    public void setCommodityprice(String commodityprice) {
        Commodityprice = commodityprice;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getCommodityDescription() {
        return CommodityDescription;
    }

    public void setCommodityDescription(String commodityDescription) {
        CommodityDescription = commodityDescription;
    }

    public String getCommodityType() {
        return CommodityType;
    }

    public void setCommodityType(String commodityType) {
        CommodityType = commodityType;
    }
}
