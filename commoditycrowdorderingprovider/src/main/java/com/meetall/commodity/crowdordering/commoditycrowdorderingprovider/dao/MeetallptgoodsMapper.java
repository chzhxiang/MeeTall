package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetallptgoods;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.MeetallptgoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetallptgoodsMapper {
    int countByExample(MeetallptgoodsExample example);

    int deleteByExample(MeetallptgoodsExample example);

    int deleteByPrimaryKey(Integer ptGoodsId);

    int insert(Meetallptgoods record);

    int insertSelective(Meetallptgoods record);

    List<Meetallptgoods> selectByExample(MeetallptgoodsExample example);

    Meetallptgoods selectByPrimaryKey(Integer ptGoodsId);

    int updateByExampleSelective(@Param("record") Meetallptgoods record, @Param("example") MeetallptgoodsExample example);

    int updateByExample(@Param("record") Meetallptgoods record, @Param("example") MeetallptgoodsExample example);

    int updateByPrimaryKeySelective(Meetallptgoods record);

    int updateByPrimaryKey(Meetallptgoods record);
}