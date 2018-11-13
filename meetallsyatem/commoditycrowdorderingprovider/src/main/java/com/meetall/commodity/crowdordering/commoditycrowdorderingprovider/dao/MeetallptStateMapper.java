package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.MeetallptState;

import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 拼团状态表
 */
public interface MeetallptStateMapper {
    int deleteByPrimaryKey(Integer ptNumber);

    int insert(MeetallptState record);

    int insertSelective(MeetallptState record);

    MeetallptState selectByPrimaryKey(Integer ptNumber);

    int updateByPrimaryKeySelective(MeetallptState record);

    int updateByPrimaryKey(MeetallptState record);

    /**
     * 通过拼团编号查询拼团的状态
     */
    int selectPtState(Integer ptNumber);

    /**
     * 通过拼团编号修改拼团的状态
     */
    int updatePtState(Integer ptNumber);
}