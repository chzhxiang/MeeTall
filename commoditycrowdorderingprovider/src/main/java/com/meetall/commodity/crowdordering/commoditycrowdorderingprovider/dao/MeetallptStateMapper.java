package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.MeetallptState;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetallptStateMapper {
    int deleteByPrimaryKey(Integer ptNumber);

    int insert(MeetallptState record);

    int insertSelective(MeetallptState record);

    MeetallptState selectByPrimaryKey(Integer ptNumber);

    int updateByPrimaryKeySelective(MeetallptState record);

    int updateByPrimaryKey(MeetallptState record);
}