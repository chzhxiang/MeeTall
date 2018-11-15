package com.meetall.commodity.crowdordering.commoditycrowdorderingcomsumer.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.meetall.commodity.crowdordering.commoditycrowdorderingcomsumer.feign.GetAllPtgood;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
@Api(value = "1231", description = "测试")

public class PtGoods {
    @Autowired
    private GetAllPtgood getAllPtgood;
    /**
     *拿到所有拼团商品的所有信息
     */
    @ApiOperation(value = "123",notes = "allala")
    @RequestMapping("/getAllPtGoodsInfo")
    public String getAllpt(){
        String allPtGoods = getAllPtgood.getAllPtGoods();
        List<Integer> allPtGoodList = JSONArray.parseArray(allPtGoods,Integer.class);
        List<String> goodsInfo = new ArrayList<>();
     //   List<CommodityDetails> commodityDetails = JSONArray.parseArray(listjson, CommodityDetails.class);
        for (Integer i:allPtGoodList){
            goodsInfo.add(getAllPtgood.getcommodityID(i));
        }
        return JSON.toJSONString(goodsInfo);
    }
}
