package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetalluserpt;

import java.util.List;


/**
 * 用户拼团表
 */
public interface MeetalluserptMapper {



    int insert(Meetalluserpt record);



    /**
     * 生成用户拼团表
     */
    int insertUserpt(Meetalluserpt record);

    /**
     * 查询用户所有的拼团编号
     */
    List<Integer> getAllPtNumber(Integer userId);
}