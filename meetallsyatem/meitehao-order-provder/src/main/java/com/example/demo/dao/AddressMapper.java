package com.example.demo.dao;

import com.example.demo.pojo.Address;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AddressMapper {
    int deleteByPrimaryKey(String addressnumber);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(String addressnumber);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    /**
     * 查询有没有地址如果没有的话拿回来一个默认地址
     * @param userid
     * @return
     */
    Address getAddress(@Param("user") Integer userid, @Param("moren") Integer moren);



    /**
     * 查看用户地址集合
     * @param userid
     * @return
     */
    List<Address> getaddlist(@Param("userid") int userid);
}