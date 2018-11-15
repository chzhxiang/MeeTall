package com.meetall.commodity.detail.commoditydetailprovider.service.impl;

import com.alibaba.fastjson.JSON;
import com.meetall.commodity.detail.commoditydetailprovider.dao.CommodityAttributeNameDao;
import com.meetall.commodity.detail.commoditydetailprovider.dao.CommodityAttributeValueDao;
import com.meetall.commodity.detail.commoditydetailprovider.dao.CommodityDetailsDao;
import com.meetall.commodity.detail.commoditydetailprovider.dao.CommodityattributerelationDao;
import com.meetall.commodity.detail.commoditydetailprovider.pojo.CommodityDetails;
import com.meetall.commodity.detail.commoditydetailprovider.pojo.Commodityattributerelation;
import com.meetall.commodity.detail.commoditydetailprovider.service.CommodityattributerelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Commodityattributerelation)商品属性关系表服务实现类
 *
 * @author makejava
 * @since 2018-11-08 10:09:06
 */
@SuppressWarnings("ALL")
@Service("commodityattributerelationServiceImpl")
public class CommodityattributerelationServiceImpl implements CommodityattributerelationService {
    /**
     * 商品属性关系
     */
    @Resource
    private CommodityattributerelationDao commodityattributerelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Commodityattributerelation queryById(Integer id) {
        return this.commodityattributerelationDao.queryById(id);
    }
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Commodityattributerelation> queryAllByLimit(int offset, int limit) {
        return this.commodityattributerelationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param commodityattributerelation 实例对象
     * @return 实例对象
     */
    @Override
    public Commodityattributerelation insert(Commodityattributerelation commodityattributerelation) {
        this.commodityattributerelationDao.insert(commodityattributerelation);
        return commodityattributerelation;
    }

    /**
     * 修改数据
     *
     * @param commodityattributerelation 实例对象
     * @return 实例对象
     */
    @Override
    public Commodityattributerelation update(Commodityattributerelation commodityattributerelation) {
        this.commodityattributerelationDao.update(commodityattributerelation);
        return this.queryById(commodityattributerelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.commodityattributerelationDao.deleteById(id) > 0;
    }

    /**
     * 属性名dao层
     */
    @Autowired
    private CommodityAttributeNameDao commodityAttributeNameDao;
    /**
     * 属性值dao层
     */
    @Autowired
    private CommodityAttributeValueDao commodityAttributeValueDao;


    /**
     * 通过商品编号查询商品的String  Sku 信息
     * @param CommodityId 主键
     * @return
     */
    @Override
    public Commodityattributerelation GetCommoditySku(Integer CommodityId) {
        List<Commodityattributerelation> attributeNameValue = commodityattributerelationDao.getAttributeNameValue(CommodityId);
        for (Commodityattributerelation commodityattributerelation:attributeNameValue){
            String attributeName =  commodityAttributeNameDao.getAttributeName(commodityattributerelation.getCommodityAttributeNameNumber());
            //商品属性的属性名
            String attributeValue = commodityAttributeValueDao.getAttributeValue(commodityattributerelation.getCommodityAttributeValueNumber());
            //商品属性值
        }
        //属性值id
        return null;
    }

    @Autowired
    private CommodityDetailsDao commodityDetailsDao;

    /**
     * 商品所有信息，名称，详情，sku的集合属性，价格等
     * @return
     */
    public String CommodityAll(){
        List<CommodityDetails> a = commodityDetailsDao.getAll();
        int i = 0;
        List<String> name = new ArrayList<>();
        List<String> value = new ArrayList<>();
        for (CommodityDetails c : a) {
            /**
             * 添加商品价格
             */
            Map<String,List<String>> map = new HashMap<>();

            List<String> CommodityAttributeName = new ArrayList<>();
            int shopid = c.getCommodityId();
            c.setCommodityPrice(commodityDetailsDao.GetCommodityprice(shopid));
            List<Commodityattributerelation> attributeNameValue = commodityattributerelationDao.getAttributeNameValue(shopid);
            /**
             * 查询商品的属性名集合
             */
            List<Integer> name1 = commodityattributerelationDao.getName(shopid);
            /**-
             * 查询商品的属性值集合
             */
            List<Integer> value1 = commodityattributerelationDao.getValue(shopid);

            for (Integer attributename :name1){
                List<Integer> values = commodityattributerelationDao.getValues(shopid,attributename);
                List<String> CommodityAttributeValue = new ArrayList<>();
                /**
                 * 通过属性名id去查询属性名
                 */
                for (Integer attributevalue:values) {
                    CommodityAttributeValue.add(commodityAttributeValueDao.getAttributeValue(attributevalue));
                }
                map.put(commodityAttributeNameDao.getAttributeName(attributename), CommodityAttributeValue);
            }
            c.setCommoditySkuNameVAlue(map);
        }
        return JSON.toJSONString(a);
    }


    /**
     * 通过商品id查询商品的sku数组集合
     */
    public String CommodityIdSku(Integer CommodityId){
        CommodityDetails c = commodityDetailsDao.getCommodityIdSku(CommodityId);
        Map<String,List<String>> map = new HashMap<>();
        List<String> CommodityAttributeName = new ArrayList<>();
        int shopid = c.getCommodityId();
        c.setCommodityPrice(commodityDetailsDao.GetCommodityprice(shopid));
        List<Commodityattributerelation> attributeNameValue = commodityattributerelationDao.getAttributeNameValue(shopid);
        /**
         * 查询商品的属性名集合
         */
        List<Integer> name1 = commodityattributerelationDao.getName(shopid);
        /**-
         * 查询商品的属性值集合
         */
        List<Integer> value1 = commodityattributerelationDao.getValue(shopid);
        for (Integer attributename :name1){
            List<Integer> values = commodityattributerelationDao.getValues(shopid,attributename);
            List<String> CommodityAttributeValue = new ArrayList<>();
            /**
             * 通过属性名id去查询属性名
             */
            for (Integer attributevalue:values) {
                CommodityAttributeValue.add(commodityAttributeValueDao.getAttributeValue(attributevalue));
            }
            map.put(commodityAttributeNameDao.getAttributeName(attributename), CommodityAttributeValue);
        }
        c.setCommoditySkuNameVAlue(map);
        return JSON.toJSONString(c);
    }




}