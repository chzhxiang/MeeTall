package com.meetall.commodity.details.commoditydetailsconsumber.controller;

import com.meetall.commodity.details.commoditydetailsconsumber.geign.feignsssssss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @Autowired
    private feignsssssss feigns;

    @RequestMapping("/q")
    public String a(){


        return feigns.CommodityAll();
    }

    @RequestMapping(value = "/wq",method = RequestMethod.GET)
    public String aaa(){
        return feigns.MiaoShaCommodity();
    }
}
