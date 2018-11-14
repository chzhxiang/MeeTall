package com.example.meetalluserinfoproducer.service;

import com.example.meetalluserinfoproducer.entity.User;
import com.example.meetalluserinfoproducer.entity.UserAndMember;
import com.example.meetalluserinfoproducer.result.AjaxResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2018-11-09 09:26:29
 */
public interface UserService{

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserAndMember queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    AjaxResult insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    boolean update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * 修改用户网名
     * @param id
     * @param screenName
     * @return
     */
    int updateScreenName(Integer id, String screenName);

}