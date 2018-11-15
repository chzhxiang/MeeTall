package com.example.meetalluserinfoproducer.controller;

import com.example.meetalluserinfoproducer.result.AjaxResult;
import com.example.meetalluserinfoproducer.service.IntegralLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "积分记录")
public class IntegralLogController {

    @Autowired
    private IntegralLogService integralLogService;

    @ApiOperation(value = "查询积分记录")
    @RequestMapping(value = "/selectRecord",method = RequestMethod.POST)
    public AjaxResult selectByUserId(Integer user_id){
        return integralLogService.selectByUserId(user_id);
    }

}
