package com.example.demo.Service.impl;

import com.alibaba.fastjson.JSON;
import com.example.demo.Service.LookFanOneService;
import com.example.demo.dao.FanMapper;
import com.example.demo.pojo.Fan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("lookfanone")
public class LookFanOneServiceImpl implements LookFanOneService {
    @Autowired
    private FanMapper fanMapper;
    @Override
    public String getone(String fanNumber) {
        Fan fan = fanMapper.selectByPrimaryKey(fanNumber);
        return JSON.toJSONString(fan);

    }
}
