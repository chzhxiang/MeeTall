package com.meetall.commodity.search.commoditysearchconsumber.service;



import com.meetall.commodity.search.commoditysearchconsumber.pojo.CommodityModel;
import org.apache.solr.client.solrj.SolrServerException;

import java.io.IOException;

public interface ICommoditySolrService {
    //solr更新数据
    String upsolr() throws IOException, SolrServerException;
    //新增索引或修改
    String addAndUpdata(CommodityModel p) throws IOException, SolrServerException;
    //删除solr索引
    String del(String a) throws IOException, SolrServerException;

    String deltwo(String a, String b, String c) throws IOException, SolrServerException;

    String delthree(CommodityModel p) throws IOException, SolrServerException;
}
