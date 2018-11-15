package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.service.impl;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao.MeetallptorderDao;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetallptorder;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.service.MeetallptorderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Meetallptorder)拼团订单表服务实现类
 *
 * @author makejava
 * @since 2018-11-12 11:50:47
 */
@Service("meetallptorderService")
public class MeetallptorderServiceImpl implements MeetallptorderService {
    @Resource
    private MeetallptorderDao meetallptorderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param ptOrderNumber 主键
     * @return 实例对象
     */
    @Override
    public Meetallptorder queryById(Integer ptOrderNumber) {
        return this.meetallptorderDao.queryById(ptOrderNumber);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Meetallptorder> queryAllByLimit(int offset, int limit) {
        return this.meetallptorderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param meetallptorder 实例对象
     * @return 实例对象
     */
    @Override
    public Meetallptorder insert(Meetallptorder meetallptorder) {
        this.meetallptorderDao.insert(meetallptorder);
        return meetallptorder;
    }

    /**
     * 修改数据
     *
     * @param meetallptorder 实例对象
     * @return 实例对象
     */
    @Override
    public Meetallptorder update(Meetallptorder meetallptorder) {
        this.meetallptorderDao.update(meetallptorder);
        return this.queryById(meetallptorder.getPtOrderNumber());
    }

    /**
     * 通过主键删除数据
     *
     * @param ptOrderNumber 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer ptOrderNumber) {
        return this.meetallptorderDao.deleteById(ptOrderNumber) > 0;
    }

}