package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo;

import java.util.Date;

/**
 * 用户拼团表
 */
public class Meetalluserpt {
    /**
     * 用户拼团自增表
     */
    private Integer ptId;

    /**
     * 用户ID
     */
    private Integer ptUserId;

    /**
     * 拼单订单编号
     */
    private Integer ptOrderNumber;

    /**
     * 收货人
     */
    private String consignee;

    /**
     * 联系电话
     */
    private String contactNumber;

    /**
     * 收货地址
     */
    private String shippingAddress;

    /**
     * 参与拼团时间
     */
    private Date groupTime;

    /**
     * 是否是团长（0不是，1是）
     */
    private String ifgroupLeader;

    /**
     * 拼团到期时间
     */
    private Date groupTimeEnd;

    public Integer getPtId() {
        return ptId;
    }

    public void setPtId(Integer ptId) {
        this.ptId = ptId;
    }

    public Integer getPtUserId() {
        return ptUserId;
    }

    public void setPtUserId(Integer ptUserId) {
        this.ptUserId = ptUserId;
    }

    public Integer getPtOrderNumber() {
        return ptOrderNumber;
    }

    public void setPtOrderNumber(Integer ptOrderNumber) {
        this.ptOrderNumber = ptOrderNumber;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress == null ? null : shippingAddress.trim();
    }

    public Date getGroupTime() {
        return groupTime;
    }

    public void setGroupTime(Date groupTime) {
        this.groupTime = groupTime;
    }

    public String getIfgroupLeader() {
        return ifgroupLeader;
    }

    public void setIfgroupLeader(String ifgroupLeader) {
        this.ifgroupLeader = ifgroupLeader == null ? null : ifgroupLeader.trim();
    }

    public Date getGroupTimeEnd() {
        return groupTimeEnd;
    }

    public void setGroupTimeEnd(Date groupTimeEnd) {
        this.groupTimeEnd = groupTimeEnd;
    }
}