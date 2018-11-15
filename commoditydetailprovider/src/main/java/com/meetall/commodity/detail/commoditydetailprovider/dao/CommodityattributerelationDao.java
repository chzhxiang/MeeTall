package com.meetall.commodity.detail.commoditydetailprovider.dao;

import com.meetall.commodity.detail.commoditydetailprovider.pojo.Commodityattributerelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Commodityattributerelation)商品属性关系表数据库访问层
 *
 * @author makejava
 * @since 2018-11-08 10:09:04
 */
public interface CommodityattributerelationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Commodityattributerelation queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Commodityattributerelation> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param commodityattributerelation 实例对象
     * @return 对象列表
     */
    List<Commodityattributerelation> queryAll(Commodityattributerelation commodityattributerelation);

    /**
     * 新增数据
     *
     * @param commodityattributerelation 实例对象
     * @return 影响行数
     */
    int insert(Commodityattributerelation commodityattributerelation);

    /**
     * 修改数据
     *
     * @param commodityattributerelation 实例对象
     * @return 影响行数
     */
    int update(Commodityattributerelation commodityattributerelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 通过商品编号查询属性名和属性值编号
     */
    List<Commodityattributerelation> getAttributeNameValue(Integer commodityNumber);

    /**
     * 查询商品的属性名
     */
    List<Integer> getName(Integer commodityNumber);

    /**
     * 查询商品的属性值
     */
    List<Integer> getValue(Integer commodityNumber);

    /**
     * 查询商品的属性编号和属性名的 属性值集合
     */
    List<Integer> getValues(@Param("commodityNumber") Integer commodityNumber,@Param("attributeName") Integer attributeName);
}