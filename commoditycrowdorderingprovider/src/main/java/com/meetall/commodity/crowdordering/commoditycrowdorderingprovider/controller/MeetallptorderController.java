package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.controller;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetallptorder;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.service.MeetallptorderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Meetallptorder)表控制层
 *
 * @author makejava
 * @since 2018-11-12 11:50:48
 */
@RestController
@RequestMapping("meetallptorder")
public class MeetallptorderController {
    /**
     * 服务对象
     */
    @Resource
    private MeetallptorderService meetallptorderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Meetallptorder selectOne(Integer id) {
        return this.meetallptorderService.queryById(id);
    }


}