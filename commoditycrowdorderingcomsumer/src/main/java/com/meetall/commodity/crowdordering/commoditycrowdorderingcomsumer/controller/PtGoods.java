package com.meetall.commodity.crowdordering.commoditycrowdorderingcomsumer.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.meetall.commodity.crowdordering.commoditycrowdorderingcomsumer.feign.GetAllPtgood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PtGoods {
    @Autowired
    private GetAllPtgood getAllPtgood;
    /**
     *拿到所有拼团商品的所有信息
     */
    @RequestMapping("getAllPtGoodsInfo")
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
