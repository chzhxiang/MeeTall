package com.meetall.commodity.search.commoditysearchconsumber.dao.impl;


import com.alibaba.fastjson.JSON;
import com.meetall.commodity.search.commoditysearchconsumber.pojo.CommodityModel;
import com.meetall.commodity.search.commoditysearchconsumber.pojo.CommoditySearch;
import org.apache.solr.client.solrj.SolrQuery.*;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.params.ModifiableSolrParams;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class SearchProductDaoImpl{

    private static final String solrUrl="http://39.105.7.229:8983/solr/sunkefan";

    //创建solrClient同时指定超时时间，不指定走默认配置
    private static HttpSolrClient client=new HttpSolrClient.Builder(solrUrl)
            .withConnectionTimeout(10000)
            .withSocketTimeout(60000).build();


    public List<CommodityModel> searchProduct(CommoditySearch productSearch) throws Exception {
        System.out.println(productSearch.getCommodityName());

        ModifiableSolrParams params = new ModifiableSolrParams();
        SolrQuery solrQuery = new SolrQuery();
        //设置关键字
        solrQuery.setQuery(productSearch.getQueryString());
        //设置默认搜索域
        solrQuery.set("df", "product_keywords");
        //设置过滤条件
       // if(null != productSearch.getCommodityName() && !"".equals(productSearch.getCommodityName())){
        solrQuery.addFilterQuery("fq", "product_name:" + productSearch.getCommodityName());
        params.add("fq", "product_name:" + productSearch.getCommodityName());
        System.out.println(productSearch.getCommodityName() + "123456");
        if(null != productSearch.getCommodityprice() && !"".equals(productSearch.getCommodityprice())){
            //0-99   500-*  对价格进行过滤
            String[] p = productSearch.getCommodityprice().split("-");
            solrQuery.set("fq", "product_price:[" + p[0] + " TO " + p[1] + "]");
            System.out.println("111111111111111");
        }
        // 价格排序
        if ("1".equals(productSearch.getSort())) {
            solrQuery.addSort("product_price", ORDER.desc);
        } else {
            solrQuery.addSort("product_price", ORDER.asc);
        }
        // 分页
        solrQuery.setStart(0);//第几行开始
        solrQuery.setRows(16);//一页显示多少行
        // 只查询指定域
        solrQuery.set("fl", "id,product_name,product_price,product_classify,product_describe,product_sku,product_image");
        // 高亮
        // 打开开关
        solrQuery.setHighlight(true);
        // 指定高亮域
/*        solrQuery.addHighlightField("product_name");
        solrQuery.addHighlightField("product_describe");
        solrQuery.addHighlightField("product_sku");*/
        // 前缀
/*        solrQuery.setHighlightSimplePre("<span style='color:red'>");
        solrQuery.setHighlightSimplePost("</span>");*/
        // 执行查询
        QueryResponse response = client.query(params);
        // 文档结果集
        SolrDocumentList docs = response.getResults();
        System.out.println(JSON.toJSONString(docs));
        Map<String, Map<String, List<String>>> highlighting = response.getHighlighting();
        List<CommodityModel> productModels = new ArrayList<>();
        for (SolrDocument doc : docs) {
            CommodityModel productModel = new CommodityModel();
            productModel.setCommodityId((String) doc.get("id"));
            productModel.setCommodityPrice((Double) doc.get("product_price"));
            productModel.setImage((String) doc.get("product_image"));
            productModel.setProductName((String)doc.get("product_name"));
            System.out.println((String)doc.get("product_name"));
//            productModel.setDescription((String) doc.get("product_description"));
//            productModel.setType((String) doc.get("product_type"));
            Map<String, List<String>> map = highlighting.get((String) doc.get("id"));
            List<String> list = map.get("id");
            List<String> list1 = map.get("product_price");
            List<String> list2 = map.get("product_image");
            if (list != null){
                //如果能匹配上说明，名称中存在与用户高亮相关的内容，使用高亮
                productModel.setProductName(list.get(0));
            }else {
                //当与用户高亮的相关内容匹配不上，就不使用高亮，直接展示商品名称
                productModel.setProductName((String) doc.get("product_name"));
            }
            if (list1 != null){
                productModel.setCommodityDescribe(list1.get(0));
            }else {
                productModel.setCommodityDescribe((String) doc.get("product_describe"));
            }
            if (list2 != null){
                productModel.setCommodityType(list2.get(0));
            }else {
                productModel.setCommodityType((String) doc.get("product_sku"));
            }
            productModels.add(productModel);
        }
        return productModels;
    }
}
