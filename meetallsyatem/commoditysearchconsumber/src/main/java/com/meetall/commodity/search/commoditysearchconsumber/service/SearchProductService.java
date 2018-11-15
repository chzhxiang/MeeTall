package com.meetall.commodity.search.commoditysearchconsumber.service;



import com.meetall.commodity.search.commoditysearchconsumber.pojo.CommodityModel;
import com.meetall.commodity.search.commoditysearchconsumber.pojo.CommoditySearch;

import java.util.List;

public interface SearchProductService {
    public List<CommodityModel> searchProduct(CommoditySearch CommoditySearch) throws Exception;
}
