package com.meetall.commodity.search.commoditysearchconsumber.service.impl;


import com.alibaba.fastjson.JSONArray;
import com.meetall.commodity.search.commoditysearchconsumber.feign.CommodityDetail;
import com.meetall.commodity.search.commoditysearchconsumber.pojo.CommodityModel;
import com.meetall.commodity.search.commoditysearchconsumber.service.ICommoditySolrService;
import commoditypojo.CommodityDetails;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service("commoditySolrService")
public class CommoditySolrService implements ICommoditySolrService {

//    @Resource(name = "deptSolrMapper")

    //solr
    private static final String solrUrl="http://39.105.7.229:8983/solr/sunkefan";

    //创建solrClient同时指定超时时间，不指定走默认配置
    private static HttpSolrClient client=new HttpSolrClient.Builder(solrUrl)
            .withConnectionTimeout(10000)
            .withSocketTimeout(60000).build();
    //日志
    private Logger logger = LoggerFactory.getLogger(CommoditySolrService.class);
    private int a = 0;
    private int b = 0;
    @Autowired
    private CommodityDetail commodityDetail;


    @Override
    @Scheduled(fixedRate = 1000*60*5)//5秒  initialDelay 程序启动后延迟
    public String upsolr() throws IOException, SolrServerException {

        String listjson = commodityDetail.CommodityAll();
        System.out.println(listjson);
        List<CommodityDetails> commodityDetails = JSONArray.parseArray(listjson, CommodityDetails.class);

        for (CommodityDetails cd : commodityDetails) {
            SolrInputDocument document = new SolrInputDocument();
            document.addField("id",cd.getCommodityId());
            document.addField("product_name",cd.getProductName());
            document.addField("product_classify",cd.getCommodityClassify());
            document.addField("product_price",cd.getCommodityPrice());
            System.out.println(cd.getCommodityPrice());
            document.addField("product_describe",cd.getCommodityDescribe());
            document.addField("product_image",cd.getImage());
            document.addField("product_sku",cd.getCommoditySkuNameValue());
            client.add(document);
        }
        client.commit();
        System.out.println(111111);
        logger.info("===fixedDelay: 第{}次执行方法", a++);
        return "导入成功!";
    }
//    @Scheduled(fixedRate = 1000)
//    public String aa(){
//        logger.info("===fixedDelay: 第{}次执行方法", b++);
//        return "0";
//    }

    //添加solr索引库或修改索引
    @Override
    public String addAndUpdata(CommodityModel p) throws IOException, SolrServerException {
        //创建文档doc
        SolrInputDocument doc = new SolrInputDocument();
        doc.addField("id",p.getCommodityId());//商品编号
        doc.addField("product_name",p.getProductName());//商品名称
        doc.addField("product_classify",p.getCommodityType());//商品分类
        doc.addField("product_price",p.getCommodityPrice());//商品价格
        doc.addField("product_describe",p.getCommodityDescribe());//
        doc.addField("product_image",p.getImage());
        doc.addField("product_sku",p.getCommoditySku());
        //添加到client
        client.add(doc);
        //索引文档必须commit
        client.commit();
        return "insert";
    }
    //删除solr索引
    @Override
    public String del(String a) throws IOException, SolrServerException {
        //1 通过id 删除
        client.deleteById(a);
        client.commit();
        return "del";
    }
    public String deltwo(String a,String b,String c) throws IOException, SolrServerException {
        //2 通过id List 删除
        ArrayList<String> ids = new ArrayList<String>();
        ids.add(a);
        ids.add(b);
        ids.add(c);
        client.deleteById(ids);
        client.commit();
        return "del";
    }
    public String delthree(CommodityModel p) throws IOException, SolrServerException {
        //3 通过 查询信息删除
        client.deleteByQuery("product_name:"+ p.getProductName());
        // 提交
        client.commit();
        return "del";
    }
}
