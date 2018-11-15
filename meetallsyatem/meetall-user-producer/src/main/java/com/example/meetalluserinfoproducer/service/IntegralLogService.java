package com.example.meetalluserinfoproducer.service;

import com.example.meetalluserinfoproducer.entity.IntegralLog;
import com.example.meetalluserinfoproducer.result.AjaxResult;

import java.util.List;

/**
 * (IntegralLog)表服务接口
 *
 * @author makejava
 * @since 2018-11-14 09:47:30
 */
public interface IntegralLogService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    IntegralLog queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<IntegralLog> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param integralLog 实例对象
     * @return 实例对象
     */
    IntegralLog insert(IntegralLog integralLog);

    /**
     * 修改数据
     *
     * @param integralLog 实例对象
     * @return 实例对象
     */
    IntegralLog update(IntegralLog integralLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * 查询用户的所有积分记录
     * @param user_id
     * @return
     */
    AjaxResult selectByUserId(Integer user_id);

}