package com.example.meetalluserinfoproducer.controller;

import com.alibaba.fastjson.JSON;
import com.example.meetalluserinfoproducer.entity.User;
import com.example.meetalluserinfoproducer.entity.UserAndMember;
import com.example.meetalluserinfoproducer.result.AjaxResult;
import com.example.meetalluserinfoproducer.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import static com.example.meetalluserinfoproducer.result.AjaxResult.error;
import static com.example.meetalluserinfoproducer.result.AjaxResult.success;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2018-11-09 09:26:29
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param userId 主键
     * @return 单条数据
     */
    @ApiOperation(value = "显示个人信息",notes = "根据用户id查询个人信息")
    @ApiImplicitParam(name = "userId",paramType = "query",value = "用户id")
    @GetMapping("selectOne")
    public AjaxResult selectOne(@RequestParam Integer userId) {
        String s = JSON.toJSONString(userService.queryById(userId));
        if (null != s){
            return success(s);
        }else {
            return error(s);
        }
    }

    @ApiOperation(value = "跟新用户信息",notes = "上传用户修改后的信息")
    @RequestMapping(value = "update",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public AjaxResult updateUserInfo(@RequestBody User user){
        System.out.println(user.getId() + user.getUserAge() + user.getScreenName());
        boolean update = userService.update(user);
        if (update){
            return success();
        }else {
            return error();
        }
    }

    @ApiOperation(value = "新增用户")
    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public AjaxResult insertNemUser(@RequestBody User user){
        return userService.insert(user);
    }
}