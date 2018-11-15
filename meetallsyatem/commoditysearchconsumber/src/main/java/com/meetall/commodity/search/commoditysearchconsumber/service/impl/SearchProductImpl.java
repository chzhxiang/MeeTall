package com.meetall.commodity.search.commoditysearchconsumber.service.impl;

import com.meetall.commodity.search.commoditysearchconsumber.dao.impl.SearchProductDaoImpl;
import com.meetall.commodity.search.commoditysearchconsumber.pojo.CommodityModel;
import com.meetall.commodity.search.commoditysearchconsumber.pojo.CommoditySearch;
import com.meetall.commodity.search.commoditysearchconsumber.service.SearchProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("searchProductImpl")
public class SearchProductImpl implements SearchProductService {

    @Resource
    private SearchProductDaoImpl searchProductDaoImpl;

    public SearchProductDaoImpl getSearchProductDaoImpl() {
        return searchProductDaoImpl;
    }

    public void setSearchProductDaoImpl(SearchProductDaoImpl searchProductDaoImpl) {
        this.searchProductDaoImpl = searchProductDaoImpl;
    }

    @Override
        public List<CommodityModel> searchProduct(CommoditySearch commoditySearch) throws Exception {
            return searchProductDaoImpl.searchProduct(commoditySearch);
        }
    }
