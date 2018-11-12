package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.service.impl;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * 拼团状态定时更新类
 */
public class CrowdorderingStateUpdate {

    /**
     * 拼团状态每12小时查询一次
     */
    @Scheduled(cron = "0 0 0-12 * * ?")
    public void ptState(){

    }
}
