package com.example.shopingcartconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableCaching
@EnableSwagger2
public class ShopingcartconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopingcartconsumerApplication.class, args);
    }
}
