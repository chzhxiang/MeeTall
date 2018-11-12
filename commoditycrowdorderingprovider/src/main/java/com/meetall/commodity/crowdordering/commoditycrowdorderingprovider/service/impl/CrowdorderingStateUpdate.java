package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.service.impl;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * 拼团状态定时更新类
 */
public class CrowdorderingStateUpdate {

    /**
     * 拼团状态每12小时查询一次
     */
    @Scheduled(cron = "0 0 8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23 * * ?")
    public void ptState(){

    }
}
