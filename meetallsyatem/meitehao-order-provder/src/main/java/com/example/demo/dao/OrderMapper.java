package com.example.demo.dao;

import com.example.demo.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(String ordernumber);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String ordernumber);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    /**
     * 查全部
     * @return
     */
    List<Order> getall(@Param("userid") int userid,@Param("zt") int delectzt);

    /**
     * 查看特定状态的订单信息集合
     * @param userid
     * @param state
     * @return
     */
    List<Order> getstate(@Param("userid") int userid,@Param("delect") int delect,@Param("zt") int state);

    /**
     * 查看所有的订单信息
     * @param zt
     * @return
     */
    List<Order> getallorder(@Param("zt") int zt);
}