package com.meetall.config.meetallconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MeetallconfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeetallconfigserverApplication.class, args);
    }
}
