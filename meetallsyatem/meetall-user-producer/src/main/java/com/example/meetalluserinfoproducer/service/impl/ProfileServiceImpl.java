package com.example.meetalluserinfoproducer.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.meetalluserinfoproducer.entity.Profile;
import com.example.meetalluserinfoproducer.dao.ProfileDao;
import com.example.meetalluserinfoproducer.result.AjaxResult;
import com.example.meetalluserinfoproducer.service.ProfileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.example.meetalluserinfoproducer.result.AjaxResult.error;
import static com.example.meetalluserinfoproducer.result.AjaxResult.success;

/**
 * (Profile)表服务实现类
 *
 * @author makejava
 * @since 2018-11-09 09:26:29
 */
@Service("profileService")
public class ProfileServiceImpl implements ProfileService {

    @Resource
    private ProfileDao profileDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Profile queryById(Integer id) {
        return this.profileDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Profile> queryAllByLimit(int offset, int limit) {
        return this.profileDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param profile 实例对象
     * @return 实例对象
     */
    @Override
    public AjaxResult insert(Profile profile) {
        int insert = this.profileDao.insert(profile);
        if (insert == 1){
            return success();
        }
        return error();
    }

    /**
     * 修改数据
     *
     * @param profile 实例对象
     * @return 实例对象
     */
    @Override
    public Profile update(Profile profile) {
        this.profileDao.update(profile);
        return this.queryById(profile.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.profileDao.deleteById(id) > 0;
    }

    /**
     * 根据用户id查询收货地址
     * @param userId
     * @return
     */
    @Override
    public AjaxResult getAllByUserid(Integer userId) {
        List<Profile> allByUserid = profileDao.getAllByUserid(userId);
        if (allByUserid.isEmpty()){
            return error();
        }
        String s = JSON.toJSONString(allByUserid);
        return success(s);

    }
}