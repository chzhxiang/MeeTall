package com.meetall.commodity.crowdordering.commoditycrowdorderingcomsumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 用户发起拼单
 */
@FeignClient(name = "cloud-commodity-crowdordering-provlder")
public interface LaunchCrowdordering {

}
