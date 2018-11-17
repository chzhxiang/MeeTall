package com.meetall.zull.meetallzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MeetallzuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeetallzuulApplication.class, args);
    }
}
