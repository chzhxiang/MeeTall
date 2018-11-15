package com.example.demo.pojo;

import java.util.Date;

public class Fan {
    //退单编号
    private String returnnumber;
    //关联订单
    private String ordernumber;
    //收货人地址拿到所有的地址信息拼接
    private String consumeraddress;
    //收货人名字
    private String consumername;
    //收货人电话
    private String sonsumerphoto;
    //退货类型
    private Integer returntype;
    //退货金额
    private Double returndoller;
    //退货申请时间
    private Date returnapplytime;
    //退货处理时间
    private Date renturndealtime;
    //退货原因
    private String returnreason;
    //物流单号
    private String liunumber;
    //用户id
    private Integer userid;
    //商品id
    private Integer shopid;
    //地址编号
    private String address;
    //退货商品信息sku拼接
    private String redundant;

    private String redundant1;
    //退货数量
    private Integer renumber;
    //退单状态
    private Integer returnzt;

    public String getReturnnumber() {
        return returnnumber;
    }

    public void setReturnnumber(String returnnumber) {
        this.returnnumber = returnnumber;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getConsumeraddress() {
        return consumeraddress;
    }

    public void setConsumeraddress(String consumeraddress) {
        this.consumeraddress = consumeraddress;
    }

    public String getConsumername() {
        return consumername;
    }

    public void setConsumername(String consumername) {
        this.consumername = consumername;
    }

    public String getSonsumerphoto() {
        return sonsumerphoto;
    }

    public void setSonsumerphoto(String sonsumerphoto) {
        this.sonsumerphoto = sonsumerphoto;
    }

    public Integer getReturntype() {
        return returntype;
    }

    public void setReturntype(Integer returntype) {
        this.returntype = returntype;
    }

    public Double getReturndoller() {
        return returndoller;
    }

    public void setReturndoller(Double returndoller) {
        this.returndoller = returndoller;
    }

    public Date getReturnapplytime() {
        return returnapplytime;
    }

    public void setReturnapplytime(Date returnapplytime) {
        this.returnapplytime = returnapplytime;
    }

    public Date getRenturndealtime() {
        return renturndealtime;
    }

    public void setRenturndealtime(Date renturndealtime) {
        this.renturndealtime = renturndealtime;
    }

    public String getReturnreason() {
        return returnreason;
    }

    public void setReturnreason(String returnreason) {
        this.returnreason = returnreason;
    }

    public String getLiunumber() {
        return liunumber;
    }

    public void setLiunumber(String liunumber) {
        this.liunumber = liunumber;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRedundant() {
        return redundant;
    }

    public void setRedundant(String redundant) {
        this.redundant = redundant;
    }

    public String getRedundant1() {
        return redundant1;
    }

    public void setRedundant1(String redundant1) {
        this.redundant1 = redundant1;
    }

    public Integer getRenumber() {
        return renumber;
    }

    public void setRenumber(Integer renumber) {
        this.renumber = renumber;
    }

    public Integer getReturnzt() {
        return returnzt;
    }

    public void setReturnzt(Integer returnzt) {
        this.returnzt = returnzt;
    }
}