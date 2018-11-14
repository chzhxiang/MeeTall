package com.example.meetalluserinfoproducer.controller;

import com.alibaba.fastjson.JSON;
import com.example.meetalluserinfoproducer.entity.Member;
import com.example.meetalluserinfoproducer.result.AjaxResult;
import com.example.meetalluserinfoproducer.service.MemberService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Member)表控制层
 *
 * @author makejava
 * @since 2018-11-09 09:26:29
 */
@RestController
@RequestMapping("member")
public class MemberController {
    /**
     * 服务对象
     */
    @Resource
    private MemberService memberService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "查询会员积分",notes = "根据用户id查询会员积分")
    @ApiParam(value = "用户id")
    @GetMapping("selectOne")
    public AjaxResult selectOne(@RequestParam(value = "id") Integer id) {
        Member member = this.memberService.queryById(id);
        if (member == null){
            return AjaxResult.error(-1,"该用户不存在");
        }
        String jsonMember = JSON.toJSONString(member);
        return AjaxResult.success(jsonMember);
    }

    /**
     * 跟新会员积分，用户每次消费需要跟新的数据
     * @param userId
     * @param money
     * @return
     */
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "userId",paramType = "query",value = "用户id"),
            @ApiImplicitParam(name = "money",paramType = "query",value = "消费金额")
    })
    @ApiOperation(value = "跟新会员积分",notes = "根据传入的money，算出要增加的积分")
    @GetMapping("updateIntegral")
    public AjaxResult updateIntegral(@RequestParam Integer userId,@RequestParam double money){
        return memberService.updateIntegral(userId,money);
    }

    /**
     * 新增会员
     * @param member
     * @return
     */
    @ApiOperation(value = "新增会员",notes = "根据用户id，会员卡，插入会员信息")
    @PostMapping("insertMember")
    public AjaxResult insertMember(@RequestBody Member member){
        return memberService.insert(member);
    }

}