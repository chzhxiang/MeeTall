package com.example.meetallseckillconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MeetallSeckillConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeetallSeckillConsumerApplication.class, args);
    }
}
