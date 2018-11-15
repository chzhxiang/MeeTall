package com.example.meetalluserinfoproducer.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.io.Serializable;

/**
 * (IntegralLog)实体类
 *
 * @author makejava
 * @since 2018-11-14 09:47:30
 */
public class IntegralLog implements Serializable {
    private static final long serialVersionUID = 396389046099732915L;
    
    private Integer id;
    
    private Integer userId;
    //操作记录
    private String record;
    //当前积分\
    private Integer currentIntegral;
    //操作时间
    protected Timestamp recordTime;


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

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public Integer getCurrentIntegral() {
        return currentIntegral;
    }

    public void setCurrentIntegral(Integer currentIntegral) {
        this.currentIntegral = currentIntegral;
    }

    public void setRecordTime(Timestamp recordTime) {
        this.recordTime = recordTime;
    }

    public Timestamp getRecordTime() {
        return recordTime;
    }
}