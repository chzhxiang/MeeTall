package crodordering;

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
    private String ptOrderNumber;

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
     * 拼团编号
     */
    private Integer ptNumber;

    /**
     * 是否是团长（0不是，1是）
     */
    private String ifgroupLeader;

    public Integer getPtNumber() {
        return ptNumber;
    }

    public void setPtNumber(Integer ptNumber) {
        this.ptNumber = ptNumber;
    }

    public String getPtOrderNumber() {
        return ptOrderNumber;
    }

    public void setPtOrderNumber(String ptOrderNumber) {
        this.ptOrderNumber = ptOrderNumber;
    }

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
}