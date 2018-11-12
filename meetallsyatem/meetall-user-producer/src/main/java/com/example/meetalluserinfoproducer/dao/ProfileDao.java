package com.example.meetalluserinfoproducer.dao;

import com.example.meetalluserinfoproducer.entity.Profile;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Profile)表数据库访问层
 *
 * @author makejava
 * @since 2018-11-09 09:26:29
 */
@Mapper
@Repository
public interface ProfileDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Profile queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Profile> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param profile 实例对象
     * @return 对象列表
     */
    List<Profile> queryAll(Profile profile);

    /**
     * 新增数据
     *
     * @param profile 实例对象
     * @return 影响行数
     */
    int insert(Profile profile);

    /**
     * 修改数据
     *
     * @param profile 实例对象
     * @return 影响行数
     */
    int update(Profile profile);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 根据用户id查询收货地址
     * @param userId
     * @return
     */
    List<Profile> getAllByUserid(Integer userId);
}