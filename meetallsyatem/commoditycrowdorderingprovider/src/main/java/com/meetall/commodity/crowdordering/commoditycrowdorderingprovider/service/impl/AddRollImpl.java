package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.service.impl;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao.MeetallptStateMapper;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao.MeetallptorderDao;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao.MeetalluserptMapper;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetallptorder;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetalluserpt;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.service.AddRoll;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.util.GenerateOrderNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 加入别人的拼团
 */
@SuppressWarnings("ALL")
@Service("addRollImpl")
public class AddRollImpl implements AddRoll {

    /**
     * 查看拼团状态
     */
    @Autowired
    private MeetallptStateMapper meetallptStateMapper;

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

    /**
     *  加入别人的团
     * @param ptGroupNumber 拼团编号
     * @param userId 用户id
     * @return
     */
    public String AddRoll(Meetallptorder meetallptorder,Meetalluserpt meetalluserpt){
        //随机生成的订单编号
        String orderNumber = GenerateOrderNumber.createOrder();
        Map<String,String> map  = new HashMap<>();
        int ptstate = meetallptStateMapper.selectPtState(meetalluserpt.getPtNumber());
        String a = null;
        if (ptstate==0){
            if (true){//判断支付结果 支付成功生成订单，不成功不生成订单
                //生成订单
/*                Meetallptorder meetallptorder = new Meetallptorder();
                meetallptorder.setPtOrderNumber(orderNumber);//拼团订单编号-
                meetallptorder.setPtPayState(0);//支付状态 0已支付-
                meetallptorder.setPtCreateTime(new Date());//订单创建时间
                meetallptorder.setPtDeliverymanner(1);//1 物流自取-
                meetallptorder.setPtPrice(50.0);//拼团价格-
                meetallptorder.setPtOriginalPrice(70.0);//原价
                meetallptorder.setPtOrderMoney(50.0);//订单金额-
                meetallptorder.setUserId(userId);//用户id-
                meetallptorder.setPtGroupNumber(ptGroupNumber);//拼团编号-
                meetallptorder.setPtCommodityId(10001);//商品编号-
                meetallptorder.setPtOrderState(0);//0新订单-
                meetallptorder.setPtPayMoney("50.0");//支付金额*/
                int insert = meetallptorderDao.insert(meetallptorder);

                //新增用户拼团表
                /*Meetalluserpt meetalluserpt = new Meetalluserpt();
                meetalluserpt.setPtUserId(1);//用户id
                meetalluserpt.setPtOrderNumber(orderNumber);//添加订单编号
                meetalluserpt.setConsignee("啦啦啦");//收货人
                meetalluserpt.setContactNumber("17603452718");//联系电话
                meetalluserpt.setGroupTime(new Date());//参团时间
                meetalluserpt.setIfgroupLeader("0");//1是团长
                meetalluserpt.setShippingAddress("山西长治");//地址
                meetalluserpt.setPtNumber(ptGroupNumber);//拼团编号*/
                meetalluserptMapper.insert(meetalluserpt);

                //更改拼团状态和人数
                meetallptStateMapper.updatePtState(meetalluserpt.getPtNumber());
                map.put("info","拼团成功");
            }else {//支付失败，将订单存入redis

            }
        } else {
            map.put("info","拼团失败");
        }
        return "1212";
    }


    public String a(){
        int ptstate = meetallptStateMapper.selectPtState(123456);
        System.out.println(ptstate);
        return null;
    }
}
