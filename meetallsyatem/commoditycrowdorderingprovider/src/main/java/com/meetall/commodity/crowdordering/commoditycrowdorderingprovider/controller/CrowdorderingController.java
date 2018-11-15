package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.controller;


import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetallptorder;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetalluserpt;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.service.impl.LaunchCrowdorderingImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 发起拼团
 */
@RestController
@RequestMapping
@Api(value = "123456", description = "测试")
public class CrowdorderingController {


    @Autowired
    private LaunchCrowdorderingImpl launchCrowdordering;

    /**
     * 单个用户发起拼团
     */
    @ApiOperation(value="123",notes="123",httpMethod = "POST")
    //@ApiImplicitParam(dataType = "User",name = "user",value = "用户信息",required = true)
    @RequestMapping("/LaunchCrowdordering")
    public String Launch(Meetalluserpt meetalluserpt, Meetallptorder meetallptorder){
        launchCrowdordering.UserLaunchCrowdordering(meetalluserpt,meetallptorder);
        return null;
    }
    /**
     * 查看该商品的所有拼团信息
     */



    /**
     * 加入别人团
     */


    /**
     * 查看我的拼团信息
     */


    /**
     * 参与拼团的全部商品
     */


    /**
     *
     */

}
