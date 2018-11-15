package com.meetall.commodity.search.commoditysearchconsumber.dao.impl;

import com.meetall.commodity.search.commoditysearchconsumber.dao.ShowSolr;
import com.meetall.commodity.search.commoditysearchconsumber.pojo.CommodityModel;
import com.meetall.commodity.search.commoditysearchconsumber.pojo.CommoditySearch;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class search implements ShowSolr {
    private static final String solrUrl="http://39.105.7.229:8983/solr/sunkefan";

    //创建solrClient同时指定超时时间，不指定走默认配置
    private static HttpSolrClient client=new HttpSolrClient.Builder(solrUrl)
            .withConnectionTimeout(10000)
            .withSocketTimeout(60000).build();


    @Override
    public List<CommodityModel> searchProduct(CommoditySearch commoditySearch) throws Exception {

        SolrQuery solrQuery = new SolrQuery();
        //设置关键字
        solrQuery.setQuery(commoditySearch.getQueryString());
        //设置默认搜索域
        solrQuery.set("df", "product_keywords");
        //设置过滤条件
        if(null != commoditySearch.getCommodityName() && !"".equals(commoditySearch.getCommodityName())){
            solrQuery.set("fq", "product_name:" + commoditySearch.getCommodityName());
        }
        if(null != commoditySearch.getCommodityprice() && !"".equals(commoditySearch.getCommodityprice())){
            //0-99   500-*  对价格进行过滤
            String[] p = commoditySearch.getCommodityprice().split("-");
            solrQuery.set("fq", "product_price:[" + p[0] + " TO " + p[1] + "]");
        }
        // 价格排序
        if ("1".equals(commoditySearch.getSort())) {
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
        //solrQuery.setHighlight(true);
        // 指定高亮域
/*        solrQuery.addHighlightField("goods_title");
        solrQuery.addHighlightField("goods_sell_point");
        solrQuery.addHighlightField("goods_cid");*/
        // 前缀
/*        solrQuery.setHighlightSimplePre("<span style='color:red'>");
        solrQuery.setHighlightSimplePost("</span>");*/
        // 执行查询
        QueryResponse response = client.query(solrQuery);
        // 文档结果集
        SolrDocumentList docs = response.getResults();
        //Map<String, Map<String, List<String>>> highlighting = response.getHighlighting();
        List<CommodityModel> SearchGoodsModel = new ArrayList<>();
        System.out.println(docs.size() + "总次数");
        for (SolrDocument doc : docs) {
            System.out.println("cishu");
            CommodityModel sg = new CommodityModel();
            sg.setCommodityId((String) doc.get("id"));
            sg.setCommodityPrice((Double) doc.get("product_price"));
            sg.setImage((String) doc.get("product_image"));
            sg.setProductName((String) doc.get("product_name"));
//            productModel.setDescription((String) doc.get("product_description"));
//            productModel.setType((String) doc.get("product_type"));
            /*Map<String, List<String>> map = highlighting.get((String) doc.get("id"));
            List<String> list = map.get("product_name");
            List<String> list1 = map.get("product_price");
            List<String > list2 = map.get("id");*/
            /*if (list != null){
                //如果能匹配上说明，名称中存在与用户高亮相关的内容，使用高亮
                sg.setGoodsTitle(list.get(0));
            }else {
                //当与用户高亮的相关内容匹配不上，就不使用高亮，直接展示商品名称
                sg.setGoodsTitle((String) doc.get("goods_title"));
            }
            if (list1 != null){
                sg.setGoodsSellPoint(list1.get(0));
            }else {
                sg.setGoodsSellPoint((String) doc.get("goods_sell_point"));
            }
            if (list2 != null){
                sg.setGoodsCType(list2.get(0));
            }else {
                sg.setGoodsCType((String) doc.get("goods_cid"));
            }*/
            SearchGoodsModel.add(sg);
        }
        return SearchGoodsModel;
    }
}
