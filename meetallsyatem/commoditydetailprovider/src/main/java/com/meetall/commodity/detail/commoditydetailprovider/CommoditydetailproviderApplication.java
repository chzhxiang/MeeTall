package com.meetall.commodity.detail.commoditydetailprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@MapperScan("com.meetall.commodity.detail.commoditydetailprovider.*")
public class CommoditydetailproviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommoditydetailproviderApplication.class, args);
    }
}
