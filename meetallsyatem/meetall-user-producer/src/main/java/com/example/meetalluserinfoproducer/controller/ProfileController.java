package com.example.meetalluserinfoproducer.controller;

import com.example.meetalluserinfoproducer.entity.Profile;
import com.example.meetalluserinfoproducer.result.AjaxResult;
import com.example.meetalluserinfoproducer.service.ProfileService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Profile)表控制层
 *
 * @author makejava
 * @since 2018-11-09 09:26:29
 */
@RestController
@RequestMapping("profile")
public class ProfileController {
    /**
     * 服务对象
     */
    @Resource
    private ProfileService profileService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Profile selectOne(Integer id) {
        return this.profileService.queryById(id);
    }

    @GetMapping("getAll")
    public AjaxResult getAll(Integer userId){
        return profileService.getAllByUserid(userId);
    }

    @GetMapping("insertProfile")
    public AjaxResult insertProfile(Profile profile){
        return profileService.insert(profile);
    }

}