package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableWebMvc
@EnableSwagger2
@MapperScan("com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.*")
public class CommoditycrowdorderingproviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommoditycrowdorderingproviderApplication.class, args);
    }
}
