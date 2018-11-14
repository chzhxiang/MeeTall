package com.example.demo.Service.impl;

import com.example.demo.Service.LookOrderDaoService;
import com.example.demo.dao.LookMapper;
import com.example.demo.pojo.Look;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("look")
public class LookOrderDaoServiceImpl implements LookOrderDaoService {
    @Autowired
    private LookMapper lookMapper;

    public LookMapper getLookMapper() {
        return lookMapper;
    }

    public void setLookMapper(LookMapper lookMapper) {
        this.lookMapper = lookMapper;
    }

    @Override
    public List<Look> getlook(int orderState, int userid) {
        lookMapper.getlook(userid,orderState);
        return lookMapper.getlook(userid,orderState);
    }
}
