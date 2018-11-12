package com.example.meetalluserinfoproducer.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * (Member)实体类
 *
 * @author makejava
 * @since 2018-11-09 09:26:20
 */
@ApiModel(value = "member")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Member implements Serializable {
    private static final long serialVersionUID = -10194974089967155L;
    
    private Integer id;
    //用户id
    private Integer userId;
    //是否是会员：0普通用户，1会员
    private String member;
    //积分
    private Integer integral;
    //卡号
    private Integer card;
    
    private String member1;
    
    private String member2;
    
    private String member3;


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

    public String getMember1() {
        return member1;
    }

    public void setMember1(String member1) {
        this.member1 = member1;
    }

    public String getMember2() {
        return member2;
    }

    public void setMember2(String member2) {
        this.member2 = member2;
    }

    public String getMember3() {
        return member3;
    }

    public void setMember3(String member3) {
        this.member3 = member3;
    }

}