package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetallptgoods;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetallptgoodsMapper {

    int deleteByPrimaryKey(Integer ptGoodsId);

    int insert(Meetallptgoods record);

    int insertSelective(Meetallptgoods record);

    Meetallptgoods selectByPrimaryKey(Integer ptGoodsId);


    int updateByPrimaryKeySelective(Meetallptgoods record);

    int updateByPrimaryKey(Meetallptgoods record);
}