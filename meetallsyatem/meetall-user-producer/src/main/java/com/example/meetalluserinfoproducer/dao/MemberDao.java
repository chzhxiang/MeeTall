package com.example.meetalluserinfoproducer.dao;

import com.example.meetalluserinfoproducer.entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Member)表数据库访问层
 *
 * @author makejava
 * @since 2018-11-09 09:26:27
 */
@Mapper
@Repository
public interface MemberDao {

    /**
     * 通过userID查询单条数据
     *
     * @param userID 用户id
     * @return 实例对象
     */
    Member queryById(Integer userID);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Member> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param member 实例对象
     * @return 对象列表
     */
    List<Member> queryAll(Member member);

    /**
     * 新增数据
     *
     * @param member 实例对象
     * @return 影响行数
     */
    int insert(Member member);

    /**
     * 修改数据
     *
     * @param member 实例对象
     * @return 影响行数
     */
    int update(Member member);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * -跟新会员积分
     * @param user_id
     * @param money
     * @return
     */
    int updateIntegral(@Param("user_id") Integer user_id,@Param("money") double money);
}