package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetallpt;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.MeetallptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetallptMapper {
    int countByExample(MeetallptExample example);

    int deleteByExample(MeetallptExample example);

    int deleteByPrimaryKey(Integer ptNumber);

    int insert(Meetallpt record);

    int insertSelective(Meetallpt record);

    List<Meetallpt> selectByExample(MeetallptExample example);

    Meetallpt selectByPrimaryKey(Integer ptNumber);

    int updateByExampleSelective(@Param("record") Meetallpt record, @Param("example") MeetallptExample example);

    int updateByExample(@Param("record") Meetallpt record, @Param("example") MeetallptExample example);

    int updateByPrimaryKeySelective(Meetallpt record);

    int updateByPrimaryKey(Meetallpt record);
}