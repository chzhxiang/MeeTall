package com.meetall.commodity.search.commoditysearchconsumber.dao;


import com.meetall.commodity.search.commoditysearchconsumber.pojo.CommodityModel;

import java.util.List;


public interface CommoditySolrMapper {
    //更新solr
    List<CommodityModel> all();
    //新增
    int inset(CommodityModel p);
    //修改
    int updata(CommodityModel p);
    //删除
    int del(int pid);
}
