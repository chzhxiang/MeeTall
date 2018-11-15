package com.meetall.commodity.search.commoditysearchconsumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = SolrAutoConfiguration.class)
@EnableFeignClients
@EnableDiscoveryClient
@EnableScheduling
public class CommoditysearchconsumberApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommoditysearchconsumberApplication.class, args);
    }
}
