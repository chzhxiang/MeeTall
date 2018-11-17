package com.meetall.commodity.crowdordering.commoditycrowdorderingcomsumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("orderprovder")
public interface GetUserAddress {

}
