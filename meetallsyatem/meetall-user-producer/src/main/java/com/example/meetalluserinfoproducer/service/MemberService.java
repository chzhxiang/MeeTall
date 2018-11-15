package com.example.meetalluserinfoproducer.service;

import com.example.meetalluserinfoproducer.entity.Member;
import com.example.meetalluserinfoproducer.result.AjaxResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Member)表服务接口
 *
 * @author makejava
 * @since 2018-11-09 09:26:28
 */
public interface MemberService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Member queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Member> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param member 实例对象
     * @return 实例对象
     */
    AjaxResult insert(Member member);

    /**
     * 修改数据
     *
     * @param member 实例对象
     * @return 实例对象
     */
    Member update(Member member);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * -跟新会员积分
     * @param user_id
     * @param money
     * @return
     */
    AjaxResult updateIntegral(Integer user_id, double money);

    /**
     * 查询个人积分
     * @param user_id
     * @return
     */
    int selectIntegralById(Integer user_id);
}