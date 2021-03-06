package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.service.impl;

import com.alibaba.fastjson.JSON;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao.MeetallptStateMapper;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao.MeetallptorderDao;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.dao.MeetalluserptMapper;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetallptorder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 查看我的拼团信息
 */
@SuppressWarnings("ALL")
@Service("lookMyPtImpl")
public class LookMyPtImpl {
    /**
     *  拼团状态表
     */
    @Autowired
    private MeetallptStateMapper meetallptStateMapper;

    /**
     * 用户拼团表
     */
    @Autowired
    private MeetalluserptMapper meetalluserptMapper;

    /**
     * 拼团订单表
     */
    @Autowired
    private MeetallptorderDao meetallptorderDao;


    /**
     * 查看我所有的正在拼团的订单
     * @return
     * @param userId 用户 id
     *
     */
    public String GetAllMyPt(Integer userId){
        //先拿到这个用户得到所有拼团单号
        List<Integer> allPtNumber = meetalluserptMapper.getAllPtNumber(userId);
        List<Meetallptorder> meetallptorderList = new ArrayList<>();
        for (Integer i :allPtNumber){
            if (allPtNumber!=null){
                //查询拼团状态是正在开团
                if(meetallptStateMapper.selectPtState(i)==0){
                    System.out.println(i);
                    System.out.println(userId);

                    Meetallptorder meetallptorder = meetallptorderDao.GetAllOrderInfo(i, userId);
                    meetallptorderList.add(meetallptorder);
                    //System.out.println(JSON.toJSONString(meetallptorder));
                }
            }
        }
        String last = JSON.toJSONString(meetallptorderList);
        System.out.println(last);
        return last;
    }
    /**
     * 查看我所有拼团成功的订单
     * @param userId
     * @return
     */
    public String GetAllPtSucceed(Integer userId){
        //先拿到这个用户得到所有拼团单号
        List<Integer> allPtNumber = meetalluserptMapper.getAllPtNumber(userId);
        List<Meetallptorder> meetallptorderList = new ArrayList<>();
        for (Integer i :allPtNumber){
            if (allPtNumber!=null){
                //查询拼团状态是拼团成功
                if(meetallptStateMapper.selectPtState(i)==1){
                    System.out.println(i);
                    System.out.println(userId);
                    Meetallptorder meetallptorder = meetallptorderDao.GetAllOrderInfo(i, userId);
                    //System.out.println(JSON.toJSONString(meetallptorder));
                    meetallptorderList.add(meetallptorder);
                }
            }
        }
        String last = JSON.toJSONString(meetallptorderList);
        return last;
    }

    /**
     * 查看我单个拼团的信息
     */
    public String LookMySinglePtInfo(Integer ptNumber,Integer userId){
        Meetallptorder meetallptorder = meetallptorderDao.GetAllOrderInfo(ptNumber, userId);
        System.out.println(JSON.toJSONString(meetallptorder));
        return JSON.toJSONString(meetallptorder);
    }


}
