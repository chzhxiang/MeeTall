package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableEurekaClient
@EnableScheduling
@MapperScan("com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.*")
public class CommoditycrowdorderingproviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommoditycrowdorderingproviderApplication.class, args);
    }
}
