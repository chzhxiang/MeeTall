package com.meetall.commodity.details.commoditydetailsconsumber.controller;

import com.meetall.commodity.details.commoditydetailsconsumber.geign.feignsssssss;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping
public class test {
    @Resource
    private feignsssssss feigns;

    public feignsssssss getFeigns() {
        return feigns;
    }

    public void setFeigns(feignsssssss feigns) {
        this.feigns = feigns;
    }

    @RequestMapping("/q")
    public String a(){
        return feigns.CommodityAll();
    }
    @RequestMapping(value = "/wq",method = RequestMethod.GET)
    public String aaa(HttpServletResponse response){

        response.setHeader("Access-Control-Allow-Origin", "*");
        return feigns.MiaoShaCommodity();
    }
}
