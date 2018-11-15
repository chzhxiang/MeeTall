package com.example.meetallseckillproducer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableScheduling
@EnableSwagger2
public class MeetallSeckillProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeetallSeckillProducerApplication.class, args);
    }
}
