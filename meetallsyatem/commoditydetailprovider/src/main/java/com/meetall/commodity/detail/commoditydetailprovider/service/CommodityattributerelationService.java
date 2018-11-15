package com.meetall.commodity.detail.commoditydetailprovider.service;

import com.meetall.commodity.detail.commoditydetailprovider.pojo.Commodityattributerelation;

import java.util.List;

/**
 * (Commodityattributerelation)表服务接口
 *
 * @author makejava
 * @since 2018-11-08 10:09:05
 */
public interface CommodityattributerelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Commodityattributerelation queryById(Integer id);


    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Commodityattributerelation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param commodityattributerelation 实例对象
     * @return 实例对象
     */
    Commodityattributerelation insert(Commodityattributerelation commodityattributerelation);

    /**
     * 修改数据
     *
     * @param commodityattributerelation 实例对象
     * @return 实例对象
     */
    Commodityattributerelation update(Commodityattributerelation commodityattributerelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * 通过商品编号查询该上的sku信息
     * @param CommodityId 主键
     */
    Commodityattributerelation GetCommoditySku(Integer CommodityId);

}