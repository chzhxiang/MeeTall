package com.example.meetallseckillproducer.controller;

import com.alibaba.fastjson.JSON;
import com.example.meetallseckillproducer.pojo.GoodsAndOrder;
import com.example.meetallseckillproducer.pojo.SeckillGoods;
import com.example.meetallseckillproducer.pojo.SeckillId;
import com.example.meetallseckillproducer.result.AjaxResult;
import com.example.meetallseckillproducer.service.SeckillGoodsService;
import com.example.meetallseckillproducer.service.SeckillOrderSerivce;
import com.example.meetallseckillproducer.util.CookieUtil;
import com.example.meetallseckillproducer.util.DateGenerate;
import com.example.meetallseckillproducer.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.List;

@RestController
@Api(value = "秒杀系统")
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
    public String getAll(){
        List<SeckillGoods> all = seckillGoodsService.getAll(Timestamp.valueOf(DateGenerate.getStringDate()));
        String s = JSON.toJSONString(all);
        System.out.println(s);
        return s;

    }

    @ApiOperation(value = "查询单个商品",notes = "根据id查询商品")
    //@ApiImplicitParam(name = "goods_id",value = "商品id",dataType = "query")
    @RequestMapping(value = "/getOne",method = RequestMethod.POST)
    public AjaxResult selectById(@RequestParam(value = "goods_id") Integer goods_id){
        return seckillGoodsService.selectById(goods_id);
    }

    /**
     * 秒杀下单、减库存
     * @param seckillId 秒杀商品、秒杀用户
     * @param request
     * @return
     * @throws Exception
     */
    @ApiOperation(value = "秒杀商品",notes = "必须包含秒杀用户id，商品id")
    @RequestMapping(value = "/seckill",method = RequestMethod.POST)
    public AjaxResult seckill(@RequestBody SeckillId seckillId, HttpServletRequest request)throws Exception{
        //1.判断是否登录
//        String ck = CookieUtil.readLoginToken(request);
//        String token = (String) redisUtil.hget(String.valueOf(goodsAndOrder.getId()),"user_id");
//        if (ck != token){
//            return "login";
//        }

        return seckillOrderSerivce.seckill(seckillId);
    }

    /**
     * 查询秒杀结果
     * @param user_id
     * @param goods_id
     * @return
     */
    @ApiOperation(value = "查询是否秒杀成功")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "user_id",paramType = "query",value ="用户id"),
            @ApiImplicitParam(name = "goods_id",paramType = "query",value = "商品id")
    })
    @RequestMapping(value = "/seckillResult",method = RequestMethod.POST)
    public AjaxResult seckillResult(@RequestParam(value = "user_id") Integer user_id, @RequestParam(name = "goods_id" ) Integer goods_id){
        System.out.println(user_id);
        return seckillOrderSerivce.selectByUserIdAndGoodsId(user_id, goods_id);
    }

    /**
     * 订单过期，库存删除订单信息，redis加库存
     * @param user_id
     * @param goods_id
     * @param code
     * @return
     */
    @ApiOperation(value = "修改订单状态",notes = "支付成功后，修改订单状态")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "user_id",paramType = "query",value = "用户id"),
            @ApiImplicitParam(name = "goods_id",paramType = "query",value = "商品id"),
            @ApiImplicitParam(name = "code",paramType = "query", value = "支付状态码")
    })
    @RequestMapping(value = "/payResult",method = RequestMethod.POST)
    public AjaxResult payResult(@RequestParam(value = "user_id") Integer user_id,
                            @RequestParam(value = "goods_id") Integer goods_id,
                            @RequestParam(value = "code") String code){
        System.out.println(user_id + "---" + goods_id + " -+-+-+" + code);
        return seckillOrderSerivce.statusOrder(user_id,goods_id,code);
    }



    //1.根据商品id展示商品数据
    //2.查询所有秒杀商品



}
