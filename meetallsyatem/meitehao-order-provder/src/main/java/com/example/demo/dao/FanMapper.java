package com.example.demo.dao;

import com.example.demo.pojo.Fan;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FanMapper {
    int deleteByPrimaryKey(String returnnumber);

    int insert(Fan record);

    int insertSelective(Fan record);

    Fan selectByPrimaryKey(String returnnumber);

    int updateByPrimaryKeySelective(Fan record);

    int updateByPrimaryKey(Fan record);

    /**
     * 根据用户查看用户的全部信息
     * @param userid
     * @return
     */
    List<Fan> getalltui(@Param("uid") int userid);
}