package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetalluserpt;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetalluserptMapper {

    int deleteByPrimaryKey(Integer ptId);

    int insert(Meetalluserpt record);

    int insertSelective(Meetalluserpt record);

    Meetalluserpt selectByPrimaryKey(Integer ptId);

    int updateByPrimaryKeySelective(Meetalluserpt record);

    int updateByPrimaryKey(Meetalluserpt record);
}