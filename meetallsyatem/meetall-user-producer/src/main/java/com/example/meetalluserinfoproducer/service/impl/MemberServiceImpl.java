package com.example.meetalluserinfoproducer.service.impl;

import com.example.meetalluserinfoproducer.entity.Member;
import com.example.meetalluserinfoproducer.dao.MemberDao;
import com.example.meetalluserinfoproducer.result.AjaxResult;
import com.example.meetalluserinfoproducer.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.example.meetalluserinfoproducer.result.AjaxResult.error;
import static com.example.meetalluserinfoproducer.result.AjaxResult.success;

/**
 * (Member)表服务实现类
 *
 * @author makejava
 * @since 2018-11-09 09:26:28
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService {
    @Resource
    private MemberDao memberDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Member queryById(Integer id) {
        return this.memberDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Member> queryAllByLimit(int offset, int limit) {
        return this.memberDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param member 实例对象
     * @return 实例对象
     */
    @Override
    public AjaxResult insert(Member member) {
        int insert = this.memberDao.insert(member);
        if (insert == 1){
            return success();
        }
        return error();
    }

    /**
     * 修改数据
     *
     * @param member 实例对象
     * @return 实例对象
     */
    @Override
    public Member update(Member member) {
        this.memberDao.update(member);
        return this.queryById(member.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.memberDao.deleteById(id) > 0;
    }

    /**
     * 跟新会员积分
     * @param user_id
     * @param money
     * @return
     */
    @Override
    public AjaxResult updateIntegral(Integer user_id, double money) {
        double floor = Math.floor(money);
        int i = memberDao.updateIntegral(user_id, floor);
        if (i == 1){
            return success();
        }
        return error(String.valueOf(user_id));
    }
}