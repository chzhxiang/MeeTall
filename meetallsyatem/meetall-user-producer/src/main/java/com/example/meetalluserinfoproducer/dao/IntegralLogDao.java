package com.example.meetalluserinfoproducer.dao;

import com.example.meetalluserinfoproducer.entity.IntegralLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (IntegralLog)表数据库访问层
 *
 * @author makejava
 * @since 2018-11-14 09:47:30
 */
@Mapper
@Repository
public interface IntegralLogDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    IntegralLog queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<IntegralLog> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param integralLog 实例对象
     * @return 对象列表
     */
    List<IntegralLog> queryAll(IntegralLog integralLog);

    /**
     * 新增数据
     *
     * @param integralLog 实例对象
     * @return 影响行数
     */
    int insert(IntegralLog integralLog);

    /**
     * 修改数据
     *
     * @param integralLog 实例对象
     * @return 影响行数
     */
    int update(IntegralLog integralLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 查询用户的所有积分记录
     * @param user_id
     * @return
     */
    List<IntegralLog> selectByUserId(Integer user_id);

}