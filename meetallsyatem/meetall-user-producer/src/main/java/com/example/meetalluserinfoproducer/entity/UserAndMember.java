package com.example.meetalluserinfoproducer.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAndMember  implements Serializable {
   // ----------member表--------------
    //用户id
    private Integer userId;
    //是否是会员：0普通用户，1会员
    private String member;
    //积分
    private Integer integral;
    //卡号
    private Integer card;

    //-----------user表--------------
    private Integer id;
    //网名
    private String screenName;
    //真实姓名
    private String userName;
    //年龄
    private Integer userAge;
    //性别
    private Integer userSex;
    //电话号
    private Integer phone;
    //头像地址
    private String headurl;
    //收货地址id
    private Integer profileId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getCard() {
        return card;
    }

    public void setCard(Integer card) {
        this.card = card;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl;
    }

    public Integer getProfileId() {
        return profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }
}
