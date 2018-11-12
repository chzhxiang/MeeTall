package com.example.meetallseckillproducer.controller;

import com.alibaba.fastjson.JSON;
import com.example.meetallseckillproducer.pojo.GoodsAndOrder;
import com.example.meetallseckillproducer.pojo.SeckillGoods;
import com.example.meetallseckillproducer.service.SeckillGoodsService;
import com.example.meetallseckillproducer.service.SeckillOrderSerivce;
import com.example.meetallseckillproducer.util.CookieUtil;
import com.example.meetallseckillproducer.util.DateGenerate;
import com.example.meetallseckillproducer.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.List;

@RestController
public class SeckillController {

    @Autowired
    private SeckillOrderSerivce seckillOrderSerivce;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private CookieUtil cookieUtil;

    @Autowired
    private SeckillGoodsService seckillGoodsService;

    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    @ResponseBody
    public String getAll(){
        List<SeckillGoods> all = seckillGoodsService.getAll(Timestamp.valueOf(DateGenerate.getStringDate()));
        String s = JSON.toJSONString(all);
        System.out.println(s);
        return s;

    }

    /**
     * 秒杀下单、减库存
     * @param goodsAndOrder 秒杀商品、秒杀用户
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("/seckill")
    public String seckill(GoodsAndOrder goodsAndOrder, HttpServletRequest request)throws Exception{
        //1.判断是否登录
//        String ck = CookieUtil.readLoginToken(request);
//        String token = (String) redisUtil.hget(String.valueOf(goodsAndOrder.getId()),"user_id");
//        if (ck != token){
//            return "login";
//        }

        return seckillOrderSerivce.seckill(goodsAndOrder);
    }

    /**
     * 查询秒杀结果
     * @param user_id
     * @param goods_id
     * @return
     */
    @RequestMapping(value = "/seckillResult",method = RequestMethod.POST)
    public String seckillResult(Integer user_id,Integer goods_id){
        return seckillOrderSerivce.selectByUserIdAndGoodsId(user_id, goods_id);
    }

    /**
     * 订单过期，库存删除订单信息，redis加库存
     * @param user_id
     * @param goods_id
     * @param code
     * @return
     */
    @RequestMapping(value = "/payResult",method = RequestMethod.POST)
    public String payResult(Integer user_id,Integer goods_id,String code){
        return seckillOrderSerivce.statusOrder(user_id,goods_id,code);
    }

}
