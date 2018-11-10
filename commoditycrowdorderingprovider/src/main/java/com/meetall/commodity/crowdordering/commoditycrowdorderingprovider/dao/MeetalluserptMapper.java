package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetalluserpt;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.MeetalluserptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetalluserptMapper {
    int countByExample(MeetalluserptExample example);

    int deleteByExample(MeetalluserptExample example);

    int deleteByPrimaryKey(Integer ptId);

    int insert(Meetalluserpt record);

    int insertSelective(Meetalluserpt record);

    List<Meetalluserpt> selectByExample(MeetalluserptExample example);

    Meetalluserpt selectByPrimaryKey(Integer ptId);

    int updateByExampleSelective(@Param("record") Meetalluserpt record, @Param("example") MeetalluserptExample example);

    int updateByExample(@Param("record") Meetalluserpt record, @Param("example") MeetalluserptExample example);

    int updateByPrimaryKeySelective(Meetalluserpt record);

    int updateByPrimaryKey(Meetalluserpt record);
}