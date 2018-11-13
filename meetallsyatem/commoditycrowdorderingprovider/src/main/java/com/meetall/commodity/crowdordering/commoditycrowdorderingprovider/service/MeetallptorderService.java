package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.service;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetallptorder;
import java.util.List;

/**
 * (Meetallptorder)表服务接口
 *
 * @author makejava
 * @since 2018-11-12 11:50:47
 */
public interface MeetallptorderService {

    /**
     * 通过ID查询单条数据
     *
     * @param ptOrderNumber 主键
     * @return 实例对象
     */
    Meetallptorder queryById(String ptOrderNumber);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Meetallptorder> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param meetallptorder 实例对象
     * @return 实例对象
     */
    Meetallptorder insert(Meetallptorder meetallptorder);

    /**
     * 修改数据
     *
     * @param meetallptorder 实例对象
     * @return 实例对象
     */
    Meetallptorder update(Meetallptorder meetallptorder);

    /**
     * 通过主键删除数据
     *
     * @param ptOrderNumber 主键
     * @return 是否成功
     */
    boolean deleteById(String ptOrderNumber);

}