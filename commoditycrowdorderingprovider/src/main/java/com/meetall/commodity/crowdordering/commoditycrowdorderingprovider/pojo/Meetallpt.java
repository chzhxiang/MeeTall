package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo;

/**
 * 拼团状态表
 */
public class Meetallpt {
    /**
     * 拼团编号
     */
    private Integer ptNumber;

    /**
     * 拼单商品编号
     */
    private Integer ptGoodsNumber;

    /**
     * 拼团状态（0正在拼团1，拼团成功，2拼团失败）
     */
    private Integer ptState;

    /**
     * 拼团人数
     */
    private Integer ptNumberOfPeople;

    public Integer getPtNumber() {
        return ptNumber;
    }

    public void setPtNumber(Integer ptNumber) {
        this.ptNumber = ptNumber;
    }

    public Integer getPtGoodsNumber() {
        return ptGoodsNumber;
    }

    public void setPtGoodsNumber(Integer ptGoodsNumber) {
        this.ptGoodsNumber = ptGoodsNumber;
    }

    public Integer getPtState() {
        return ptState;
    }

    public void setPtState(Integer ptState) {
        this.ptState = ptState;
    }

    public Integer getPtNumberOfPeople() {
        return ptNumberOfPeople;
    }

    public void setPtNumberOfPeople(Integer ptNumberOfPeople) {
        this.ptNumberOfPeople = ptNumberOfPeople;
    }
}