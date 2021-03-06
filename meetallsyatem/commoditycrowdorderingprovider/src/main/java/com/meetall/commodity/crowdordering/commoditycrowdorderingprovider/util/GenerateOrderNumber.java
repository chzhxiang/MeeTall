package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.util;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class GenerateOrderNumber {
    public static String createOrder(){
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
