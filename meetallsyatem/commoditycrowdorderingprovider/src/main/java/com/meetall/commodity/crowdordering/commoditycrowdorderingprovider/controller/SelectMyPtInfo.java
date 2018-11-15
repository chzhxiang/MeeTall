package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.controller;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.service.impl.LookMyPtImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 查询我的拼团信息
 */
@SuppressWarnings("ALL")
@RestController
@RequestMapping
@Api(value = "", description = "测试")
public class SelectMyPtInfo {

    @Autowired
    private LookMyPtImpl lookMyPt;


    /**
     * 查看我正在拼团的信息订单集合
     */
    @ApiOperation(value="123",notes="123",httpMethod = "POST")
    @RequestMapping("/getmybebingpt")
    public String lookMyBeBeingPt(@RequestParam("userId") Integer userId){
        return lookMyPt.GetAllMyPt(1);
    }

    /**
     * 查看我拼团成功的订单集合
     */
    @ApiOperation(value="123",notes="123",httpMethod = "POST")
    @RequestMapping("/getmysucceedpt")
    public String lookMySuccneedPt(@RequestParam("userId") Integer userId){
        return lookMyPt.GetAllPtSucceed(userId);
    }

    /**
     * 查看我单条拼团信息
     * @param ptNumber 拼团编号
     * @param userId 用户id
     */
    @ApiOperation(value="123",notes="123",httpMethod = "POST")
    @RequestMapping("/lookmysingleptorder")
    public String lookMySinglePtOrder(@RequestParam("ptNumber") Integer ptNumber, @RequestParam("userId") Integer userId){
        return lookMyPt.LookMySinglePtInfo(ptNumber,userId);
    }

}
