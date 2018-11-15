package com.example.meetalluserinfoproducer.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.meetalluserinfoproducer.entity.IntegralLog;
import com.example.meetalluserinfoproducer.dao.IntegralLogDao;
import com.example.meetalluserinfoproducer.result.AjaxResult;
import com.example.meetalluserinfoproducer.service.IntegralLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (IntegralLog)表服务实现类
 *
 * @author makejava
 * @since 2018-11-14 09:47:30
 */
@Service("integralLogService")
public class IntegralLogServiceImpl implements IntegralLogService {
    @Resource
    private IntegralLogDao integralLogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public IntegralLog queryById(Integer id) {
        return this.integralLogDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<IntegralLog> queryAllByLimit(int offset, int limit) {
        return this.integralLogDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param integralLog 实例对象
     * @return 实例对象
     */
    @Override
    public IntegralLog insert(IntegralLog integralLog) {
        this.integralLogDao.insert(integralLog);
        return integralLog;
    }

    /**
     * 修改数据
     *
     * @param integralLog 实例对象
     * @return 实例对象
     */
    @Override
    public IntegralLog update(IntegralLog integralLog) {
        this.integralLogDao.update(integralLog);
        return this.queryById(integralLog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.integralLogDao.deleteById(id) > 0;
    }

    @Override
    public AjaxResult selectByUserId(Integer user_id) {
        String s = JSON.toJSONString(integralLogDao.selectByUserId(user_id));
        return AjaxResult.success(s);
    }
}