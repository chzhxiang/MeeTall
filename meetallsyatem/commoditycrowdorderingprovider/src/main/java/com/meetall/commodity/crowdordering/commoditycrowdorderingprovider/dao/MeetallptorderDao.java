package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetallptorder;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Meetallptorder)拼团订单表数据库访问层
 *
 * @author makejava
 * @since 2018-11-12 11:50:46
 */
public interface MeetallptorderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param ptOrderNumber 主键
     * @return 实例对象
     */
    Meetallptorder queryById(Integer ptOrderNumber);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Meetallptorder> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param meetallptorder 实例对象
     * @return 对象列表
     */
    List<Meetallptorder> queryAll(Meetallptorder meetallptorder);

    /**
     * 新增数据
     *
     * @param meetallptorder 实例对象
     * @return 影响行数
     */
    int insert(Meetallptorder meetallptorder);

    /**
     * 修改数据
     *
     * @param meetallptorder 实例对象
     * @return 影响行数
     */
    int update(Meetallptorder meetallptorder);

    /**
     * 通过主键删除数据
     *
     * @param ptOrderNumber 主键
     * @return 影响行数
     */
    int deleteById(Integer ptOrderNumber);

}