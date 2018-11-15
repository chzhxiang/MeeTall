package com.example.demo.Service;

public interface LookStateOrderService {
    /**
     * 根据用户和订单状态信息查看集合
     * @param userid
     * @param orderstate
     * @return
     */
    String getstataorder(int userid,int orderstate);
}
