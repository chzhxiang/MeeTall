package com.example.demo.Service;

import com.example.demo.pojo.Address;
import com.example.demo.pojo.Order;

import java.util.Date;

public class DaoService {
    //商品名称
    private String name;
    //商品地址
    private String address;
    //商品属性
    private String color;
    //商品数量
    private Integer number;
    //商品价格
    private Double doller;
    //订单编号
    private String ordreNumber;
    //商品总价
    private Double shupTotalNumber;
    //商品id
    private Integer shopId;
    //用户id
    private Integer userId;
    //订单创建时间
    private Date creatTime;
    private String ordreZt;

    public String getOrdreZt() {
        return ordreZt;
    }

    public void setOrdreZt(String ordreZt) {
        this.ordreZt = ordreZt;
    }



    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Double getShupTotalNumber() {
        return shupTotalNumber;
    }

    public void setShupTotalNumber(Double shupTotalNumber) {
        this.shupTotalNumber = shupTotalNumber;
    }

    private Date creatDate;

    public String getOrdreNumber() {
        return ordreNumber;
    }

    public void setOrdreNumber(String ordreNumber) {
        this.ordreNumber = ordreNumber;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getDoller() {
        return doller;
    }

    public void setDoller(Double doller) {
        this.doller = doller;
    }
}
