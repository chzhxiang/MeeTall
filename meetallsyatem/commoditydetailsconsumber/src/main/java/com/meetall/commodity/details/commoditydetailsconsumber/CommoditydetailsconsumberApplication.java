package com.meetall.commodity.details.commoditydetailsconsumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CommoditydetailsconsumberApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommoditydetailsconsumberApplication.class, args);
    }
}
