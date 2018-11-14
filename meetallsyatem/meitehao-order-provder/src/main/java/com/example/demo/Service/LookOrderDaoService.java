package com.example.demo.Service;

import com.example.demo.pojo.Look;

import java.util.List;

public interface LookOrderDaoService {
    List<Look> getlook(int orderState,int userid);
}
