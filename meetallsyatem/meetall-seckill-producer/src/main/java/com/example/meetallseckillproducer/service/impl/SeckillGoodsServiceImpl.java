package com.example.meetallseckillproducer.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.meetallseckillproducer.dao.SeckillGoodsDao;
import com.example.meetallseckillproducer.pojo.SeckillGoods;
import com.example.meetallseckillproducer.result.AjaxResult;
import com.example.meetallseckillproducer.service.SeckillGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
@Service
public class SeckillGoodsServiceImpl implements SeckillGoodsService {

    @Autowired
    private SeckillGoodsDao seckillGoodsDao;

    /**
     * 用于查询所有秒杀商品
     * @return
     */
    @Override
    public List<SeckillGoods> getAll(Timestamp start_date) {

        return seckillGoodsDao.getAll(start_date);
    }

    /**
     * 查询所有该时间结束的秒杀商品
     * @param end_date
     * @return
     */
    @Override
    public List<SeckillGoods> getEnd(Timestamp end_date) {
        return seckillGoodsDao.getEnd(end_date);
    }

    /**
     * 插入秒杀商品
     * @param goods
     * @return
     */

    @Override
    public int insertSeckillGoods(SeckillGoods goods) {

        return seckillGoodsDao.insertSeckillGoods(goods);
    }

    /**
     * 通过商品id查询单个商品数量
     * @param goodsId
     * @return
     */
    @Override
    public AjaxResult selectById(int goodsId) {
        SeckillGoods seckillGoods = seckillGoodsDao.selectById(goodsId);
        if (seckillGoods == null){
            return AjaxResult.error("该商品不加入秒杀");
        }
        String jsonGoods = JSON.toJSONString(seckillGoods);

        return AjaxResult.success(jsonGoods);
    }

    /**
     * 跟新库存
     * @param stock_count
     * @param goods_id
     * @return
     */
    @Override
    public int updateGoodsStockCount(Integer stock_count, Integer goods_id) {
        return seckillGoodsDao.updateGoodsStockCount(stock_count,goods_id);
    }
}
