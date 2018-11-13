package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.controller;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.service.impl.LookMyPtImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 查询我的拼团信息
 */
@SuppressWarnings("ALL")
@RestController
public class SelectMyPtInfo {

    @Autowired
    private LookMyPtImpl lookMyPt;


    /**
     * 查看我正在拼团的信息结合
     */
    @RequestMapping("/getmybebingpt")
    public String lookMyBeBeingPt(){
        lookMyPt.GetAllMyPt(1);
        return null;
    }

    /**
     * 查看我拼团成功的订单
     */
    @RequestMapping("/getmysucceedpt")
    public String lookMySuccneedPt(){

        return null;
    }
}
