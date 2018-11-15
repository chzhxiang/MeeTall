package com.meetall.commodity.search.commoditysearchconsumber.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.meetall.commodity.search.commoditysearchconsumber.dao.impl.search;
import com.meetall.commodity.search.commoditysearchconsumber.feign.CommodityDetail;
import com.meetall.commodity.search.commoditysearchconsumber.pojo.CommodityModel;
import com.meetall.commodity.search.commoditysearchconsumber.pojo.CommoditySearch;

import commoditypojo.CommodityDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SuppressWarnings("ALL")
@RestController
public class test {
    @Autowired
    private CommodityDetail commodityDetail;
    @RequestMapping(value = "/a",method = RequestMethod.GET)
    public String a(){
        String listjson = commodityDetail.CommodityAll();
        List<CommodityDetails> object = JSONArray.parseArray(listjson, CommodityDetails.class);
        return commodityDetail.CommodityAll();
    }

    @Autowired
    private search search1;
    @Autowired
    private search searcha;
    @RequestMapping(value="search/list",method = RequestMethod.GET)
    public  String searchProduct(@RequestParam(value = "productSearch")  String productSearch) throws Exception {
        System.out.println("464654611111333");

//        CommoditySearch searchss = JSON.parseObject(productSearch, CommoditySearch.class);
//        System.out.println("4646543333336" + searchss);
//        //获取到检索的所有结果
//        List<CommodityModel> searchGoodsModels = null;
//        try {
//            searchGoodsModels = searcha.searchProduct(searchss);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("4646546");
//        System.out.println(JSON.toJSONString(productSearch));
//        String json = JSON.toJSONString(searchGoodsModels);
//        System.out.println(json);
        CommoditySearch c = new CommoditySearch();
        c.setQueryString(productSearch);
        return JSON.toJSONString(search1.searchProduct(c));
    }



}
