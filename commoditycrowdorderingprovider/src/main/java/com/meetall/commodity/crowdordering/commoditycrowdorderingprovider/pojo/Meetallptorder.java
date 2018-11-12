package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Meetallptorder)拼团订单表实体类
 *
 * @author makejava
 * @since 2018-11-12 11:50:43
 */
public class Meetallptorder implements Serializable {
    private static final long serialVersionUID = -83596690305884346L;


    //订单编号
    private Integer ptOrderNumber;

    //组团编号
    private Integer ptGroupNumber;

    //商品id
    private Integer ptCommodityId;

    //拼团价格
    private Double ptPrice;

    //商品原价
    private Double ptOriginalPrice;

    //订单金额
    private Double ptOrderMoney;

    //订单状态（0新订单，1已成交，-1已取消）
    private Integer ptOrderState;

    //支付状态。0已支付，1已退款
    private Integer ptPayState;

    //创建时间
    private Date ptCreateTime;

    //表更新时间
    private Date ptUpdateTime;

    //支付金额
    private String ptPayMoney;

    public void setPtPrice(Double ptPrice) {
        this.ptPrice = ptPrice;
    }

    public Double getPtOriginalPrice() {
        return ptOriginalPrice;
    }

    public void setPtOriginalPrice(Double ptOriginalPrice) {
        this.ptOriginalPrice = ptOriginalPrice;
    }

    public Double getPtOrderMoney() {
        return ptOrderMoney;
    }

    public void setPtOrderMoney(Double ptOrderMoney) {
        this.ptOrderMoney = ptOrderMoney;
    }

    public Integer getPtOrderNumber() {
        return ptOrderNumber;
    }

    public void setPtOrderNumber(Integer ptOrderNumber) {
        this.ptOrderNumber = ptOrderNumber;
    }

    public Integer getPtGroupNumber() {
        return ptGroupNumber;
    }

    public void setPtGroupNumber(Integer ptGroupNumber) {
        this.ptGroupNumber = ptGroupNumber;
    }

    public Integer getPtCommodityId() {
        return ptCommodityId;
    }

    public void setPtCommodityId(Integer ptCommodityId) {
        this.ptCommodityId = ptCommodityId;
    }

    public Object getPtPrice() {
        return ptPrice;
    }

    public Integer getPtOrderState() {
        return ptOrderState;
    }

    public void setPtOrderState(Integer ptOrderState) {
        this.ptOrderState = ptOrderState;
    }

    public Integer getPtPayState() {
        return ptPayState;
    }

    public void setPtPayState(Integer ptPayState) {
        this.ptPayState = ptPayState;
    }

    public Date getPtCreateTime() {
        return ptCreateTime;
    }

    public void setPtCreateTime(Date ptCreateTime) {
        this.ptCreateTime = ptCreateTime;
    }

    public Date getPtUpdateTime() {
        return ptUpdateTime;
    }

    public void setPtUpdateTime(Date ptUpdateTime) {
        this.ptUpdateTime = ptUpdateTime;
    }

    public String getPtPayMoney() {
        return ptPayMoney;
    }

    public void setPtPayMoney(String ptPayMoney) {
        this.ptPayMoney = ptPayMoney;
    }


}