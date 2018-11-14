package com.example.demo.dao;

import com.example.demo.pojo.Liu;

public interface LiuMapper {
    int deleteByPrimaryKey(String liunumber);

    int insert(Liu record);

    int insertSelective(Liu record);

    Liu selectByPrimaryKey(String liunumber);

    int updateByPrimaryKeySelective(Liu record);

    int updateByPrimaryKey(Liu record);
}