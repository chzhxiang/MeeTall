package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.service.impl;


import com.alibaba.fastjson.JSON;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao.MeetallptStateMapper;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao.MeetallptorderDao;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao.MeetalluserptMapper;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.MeetallptState;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetallptorder;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetalluserpt;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.service.LaunchCrowdordering;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.util.GenerateOrderNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 发起拼团
 */
@SuppressWarnings("ALL")
@Service("launchCrowdorderingImpl")
public class LaunchCrowdorderingImpl implements LaunchCrowdordering {
    /**
     * 订单表dao层
     */
    @Autowired
    private MeetallptorderDao meetallptorderDao;

    /**
     * 拼团用户表dao层
     */
    @Autowired
    private MeetalluserptMapper meetalluserptMapper;

    @Autowired
    private MeetallptStateMapper meetallptStateMapper;

    public String UserLaunchCrowdordering(Meetalluserpt meetalluserpt,Meetallptorder meetallptorder){
        Map<String,String> map = new HashMap<>();
        if (true){//判断是否支付成功
            //接受随机生成的订单编号
            String orderNumber = GenerateOrderNumber.createOrder();
            double ptordermoney = meetallptorder.getPtOriginalPrice() * 0.8;
            meetallptorder.setPtOrderNumber(orderNumber);//订单编号
            meetallptorder.setUserId(1);//用户id-//通过登录状态获取用户id
            meetallptorder.setPtGroupNumber(110021);//拼团编号-
            meetallptorder.setPtCommodityId(10001);//商品id
            meetallptorder.setPtPrice(ptordermoney);//拼团后的价格-
            meetallptorder.setPtOrderMoney(ptordermoney);//订单的交易价格
            meetallptorder.setPtOrderState(0);//0新订单
            meetallptorder.setPtPayState(0);//已支付
            meetallptorder.setPtDeliverymanner(1);//提货方式 1物流
            meetallptorder.setPtCreateTime(new Date());//订单创建时间
            meetallptorder.setPtOriginalPrice(70.0);//原价
            meetallptorder.setPtPayMoney("50.0");//支付金额
            meetallptorderDao.insert(meetallptorder);//插入订单表数据

            //用户拼团表信息
            meetalluserpt.setPtUserId(1);//用户id
            meetalluserpt.setPtOrderNumber(orderNumber);//添加订单编号
            meetalluserpt.setConsignee("啦啦啦");//收货人
            meetalluserpt.setContactNumber("17603452718");//联系电话
            meetalluserpt.setGroupTime(new Date());//参团时间
            meetalluserpt.setIfgroupLeader("0");//1是团长
            meetalluserpt.setShippingAddress("山西长治");//地址
            meetalluserpt.setPtNumber(110021);//拼团编号
            meetalluserptMapper.insert(meetalluserpt);

            MeetallptState meetallptState = new MeetallptState();
            meetallptState.setPtGoodsNumber(10001);//拼团商品编号
            meetallptState.setPtNumber(110021);//拼团编号
            meetallptState.setPtNumberOfPeople(1);//拼团人数
            meetallptState.setPtState(0);//拼团状态0 已开团
            meetallptStateMapper.insert(meetallptState);
            map.put("info","200");
        }else{
            map.put("info","支付失败");
        }

        return JSON.toJSONString(map);
    }

}
