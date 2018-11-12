package com.example.meetalluserinfoproducer.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * (Profile)实体类
 *
 * @author makejava
 * @since 2018-11-09 09:26:29
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Profile implements Serializable {
    private static final long serialVersionUID = -81416477629415081L;
    
    private Integer id;
    //用户id
    private Integer userId;
    //所在地区
    private String area;
    //详细地址
    private String detailedAddress;
    //收货人姓名
    private String userName;
    //收货人电话
    private String userPhone;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

}