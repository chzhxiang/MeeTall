package com.meetall.commodity.detail.commoditydetailprovider.controller;


import com.meetall.commodity.detail.commoditydetailprovider.service.impl.PtCommodityAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 所有参与拼团的商品
 */
@RestController
public class PtCommodityAllController {
    @Autowired
    private PtCommodityAll ptCommodityAll;

    @RequestMapping("/ptcomdity")
    public String ptCommodityAll(){
        return ptCommodityAll.CommodityAll();
    }
}
