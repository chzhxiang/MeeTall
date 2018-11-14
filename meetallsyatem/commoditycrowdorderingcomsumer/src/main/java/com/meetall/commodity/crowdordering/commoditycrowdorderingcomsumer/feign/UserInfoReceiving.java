package com.meetall.commodity.crowdordering.commoditycrowdorderingcomsumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户收货信息获取
 */
@FeignClient("orderprovder")
public interface UserInfoReceiving {
    @RequestMapping("getaddlist")
    public String getaddl(@RequestParam int userid);
}
