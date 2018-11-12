package com.example.meetallseckillproducer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableEurekaClient
@EnableScheduling
public class MeetallSeckillProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeetallSeckillProducerApplication.class, args);
    }
}
