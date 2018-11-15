package com.example.meetalluserinfoproducer.service;

import com.example.meetalluserinfoproducer.entity.Profile;
import com.example.meetalluserinfoproducer.result.AjaxResult;

import java.util.List;

/**
 * (Profile)表服务接口
 *
 * @author makejava
 * @since 2018-11-09 09:26:29
 */
public interface ProfileService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Profile queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Profile> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param profile 实例对象
     * @return 实例对象
     */
    AjaxResult insert(Profile profile);

    /**
     * 修改数据
     *
     * @param profile 实例对象
     * @return 实例对象
     */
    Profile update(Profile profile);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * 根据用户id查询收货地址
     * @param userId
     * @return
     */
    AjaxResult getAllByUserid(Integer userId);

}