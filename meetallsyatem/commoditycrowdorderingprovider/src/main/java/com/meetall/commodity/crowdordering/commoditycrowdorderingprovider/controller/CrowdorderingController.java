package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.controller;


import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetallptorder;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetalluserpt;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.service.impl.LaunchCrowdorderingImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 发起拼团
 */
@RestController
public class CrowdorderingController {


    @Autowired
    private LaunchCrowdorderingImpl launchCrowdordering;

    /**
     * 单个用户发起拼团
     */
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
