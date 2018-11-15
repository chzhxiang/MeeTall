package com.meetall.commodity.search.commoditysearchconsumber.dao;

import com.meetall.commodity.search.commoditysearchconsumber.pojo.CommodityModel;
import com.meetall.commodity.search.commoditysearchconsumber.pojo.CommoditySearch;

import java.util.List;

public interface ShowSolr {
    List<CommodityModel> searchProduct(CommoditySearch commoditySearch) throws Exception;
}
