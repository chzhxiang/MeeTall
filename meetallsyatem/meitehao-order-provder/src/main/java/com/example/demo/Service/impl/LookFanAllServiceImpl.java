package com.example.demo.Service.impl;

import com.alibaba.fastjson.JSON;
import com.example.demo.Service.LookFanAllService;
import com.example.demo.dao.FanMapper;
import com.example.demo.pojo.Fan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("lookfanall")
public class LookFanAllServiceImpl implements LookFanAllService {
    @Autowired
    private FanMapper fanMapper;
    @Override
    public String getfanall(int userid) {
        List<Fan> getalltui = fanMapper.getalltui(userid);
        return JSON.toJSONString(getalltui);

    }
}
