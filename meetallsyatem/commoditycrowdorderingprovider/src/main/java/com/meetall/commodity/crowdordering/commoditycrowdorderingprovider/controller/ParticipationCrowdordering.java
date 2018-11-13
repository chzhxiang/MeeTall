package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.controller;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.service.impl.AddRollImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 参与拼团
 */
@SuppressWarnings("ALL")
@RestController
public class ParticipationCrowdordering {


    @Autowired
    private AddRollImpl addRoll;
    /**
     * 加入别人团
     */
    @RequestMapping("/addRoll")
    public String AddRoll(Integer ptGroupNumber,Integer userId){
        addRoll.AddRoll(123456,1);
        return null;
    }
    @RequestMapping("/addRolls")
    public String AddRolls(){
        addRoll.a();
        return null;
    }
}
