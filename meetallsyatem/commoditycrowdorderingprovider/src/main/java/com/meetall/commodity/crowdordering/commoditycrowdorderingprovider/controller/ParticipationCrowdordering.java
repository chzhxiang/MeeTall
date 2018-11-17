package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.controller;

import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetallptorder;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo.Meetalluserpt;
import com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.service.impl.AddRollImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 参与拼团
 */
@SuppressWarnings("ALL")
@RestController
@RequestMapping("/aaa")
@Api(value = "加入别人团", description = "加入别人团-测试")
public class ParticipationCrowdordering {


    @Autowired
    private AddRollImpl addRoll;
    /**
     * 加入别人团
     */
    @ApiOperation(value="加入别人团",notes="加入别人团")
    @RequestMapping(value = "/addRoll")
    public String AddRoll(@RequestBody Meetallptorder meetallptorder, @RequestBody Meetalluserpt meetalluserpt){
        addRoll.AddRoll(meetallptorder,meetalluserpt);
        return null;
    }

    @ApiOperation(value="123",notes="123",httpMethod = "POST")
    @RequestMapping("/addRolls")
    public String AddRolls(){
        addRoll.a();
        return null;
    }






}
