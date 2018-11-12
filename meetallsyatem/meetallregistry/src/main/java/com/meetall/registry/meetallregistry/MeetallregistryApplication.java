package com.meetall.registry.meetallregistry;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MeetallregistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeetallregistryApplication.class, args);
    }
}
