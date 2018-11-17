package com.meetall.commodity.search.commoditysearchconsumber.controller;

import com.alibaba.fastjson.JSON;
import com.meetall.commodity.search.commoditysearchconsumber.pojo.CommodityModel;
import com.meetall.commodity.search.commoditysearchconsumber.pojo.CommoditySearch;
import com.meetall.commodity.search.commoditysearchconsumber.service.impl.SearchProductImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping
@Api(value = "全文搜索", description = "lalala")
public class SearchProductController {
    @Autowired
    private SearchProductImpl searchProductImpl ;

    /**
     * 对于搜索的处理，包括关键字，价格，类别，还有排序方式
     * @param productSearch
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/list")
    public String searchProduct(CommoditySearch productSearch , Model model) throws Exception{
        //获取到检索的所有结果
        List<CommodityModel> searchProducts = searchProductImpl.searchProduct(productSearch);
        //设置回显内容
        model.addAttribute("productModels", searchProducts);
        model.addAttribute("queryString", productSearch.getQueryString());
        model.addAttribute("CommodityName", productSearch.getCommodityName());
        model.addAttribute("Commodityprice", productSearch.getCommodityprice());
        model.addAttribute("sort", productSearch.getSort());
        return "product_list";
    }
    @ApiOperation(value= "全文搜索" , notes="全文搜索")
    @RequestMapping(value = "/abc")
    @ResponseBody
    public String a(@RequestBody CommoditySearch productSearch) throws Exception {
        List<CommodityModel> searchProducts = searchProductImpl.searchProduct(productSearch);
        return JSON.toJSONString(searchProducts);
    }
}
