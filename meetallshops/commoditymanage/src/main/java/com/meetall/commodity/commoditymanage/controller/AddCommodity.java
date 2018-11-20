package com.meetall.commodity.commoditymanage.controller;


import com.meetall.commodity.commoditymanage.pojo.AddShop;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddCommodity {
    /**
     * 新增商品，商品分类，商品详情，商品id，商品图片，商品名称
     * 同时增加商品的sku
     */
    @RequestMapping("/addshop")
    public String addshop(@RequestBody AddShop addShop){

        return null;
    }
    /**
     *商品sku的价格，库存设置
     */

    /**
     *
     */

}
