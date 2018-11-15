package com.meetall.commodity.detail.commoditydetailprovider.service.impl;

import com.alibaba.fastjson.JSON;
import com.meetall.commodity.detail.commoditydetailprovider.dao.CommodityDetailsDao;
import com.meetall.commodity.detail.commoditydetailprovider.service.CommodityDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品详情服务实现类
 */
@SuppressWarnings("ALL")
@Service("commodityDetailsServiceImpl")
public class CommodityDetailsServiceImpl implements CommodityDetailsService {

    @Autowired
    private CommodityDetailsDao commodityDetailsDao;
    /**
     * 查询商品详细信息
     * @param commodityId商品编号
     * @return
     */
    public String commodityAllInfo(Integer commodityId){
        return JSON.toJSONString(commodityDetailsDao.getAllId(commodityId));
    }


}
