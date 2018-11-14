package com.example.demo.Service.impl;

import com.example.demo.Service.OrderNumber;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
@Service("orderNumberUtil")
public class OrderNumberImpl implements OrderNumber {
    @Override
    public String getorderNumber() {
        Date date=new Date();
        DateFormat format = new SimpleDateFormat("yyyyMMdd");
        String time = format.format(date);
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {
            hashCodeV = -hashCodeV;
        }
        return time + String.format("%011d", hashCodeV);
    }
}
