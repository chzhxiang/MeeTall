package com.example.demo.dao;

import com.example.demo.pojo.Look;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LookMapper {
    int insert(Look record);

    int insertSelective(Look record);


    List<Look> getlook(@Param("userid") int userid, @Param("state") int orderstate);
}