package com.example.meitehaoorderconsumer.controller;


import com.example.meitehaoorderconsumer.cousumer.ConsumerLogin;
import com.example.meitehaoorderconsumer.cousumer.OrderNumberConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private ConsumerLogin consumerLogin;
    @Autowired
    private OrderNumberConsumer orderNumberConsumer;
    @RequestMapping("/lll")
    public String ll(){
        return consumerLogin.login();
    }
    @RequestMapping("/orderNumber")
    public String getnumber(){
        return orderNumberConsumer.getnumber();
    }
}
