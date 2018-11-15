package com.example.demo.orderControlller;

import com.alibaba.fastjson.JSON;
import com.example.demo.Service.*;
import com.example.demo.pojo.Address;
import com.example.demo.pojo.Fan;
import com.example.demo.pojo.Order;
import com.example.demo.pojo.User;
import io.swagger.annotations.ApiOperation;
import org.aspectj.weaver.ast.Or;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ConFirmController {
    @Resource(name = "conf")
    private ConfirmService confirmService;
    @Resource(name = "addredislist")
    private AddRedisListService addRedisListService;
    @Resource(name = "getone")
    private LookRedisService lookRedisService;
    @Resource(name = "lookRedis")
    private LookAllRedisService payRedisService;
    @Resource(name = "lookAddressList")
    private LookAddressListService lookAddressListService;
    @Resource(name = "getaddressOne")
    private LookAddressOneService lookAddressOneService;
    @Resource(name = "addAddress")
    private AddAddressService addAddressService;
    @Resource(name = "updateAddress")
    private UpdateAddressService updateAddressService;
    @Resource(name = "delectorder")
    private DelectRedisOrderService delectRedisOrderService;
    @Resource(name = "allorder")
    private AllOrderService allOrderService;
    @Resource(name = "delectdaoOrder")
    private DelectDaoOrderService delectDaoOrderService;
    @Resource(name = "loolorderstate")
    private LookStateOrderService lookStateOrderService;
    @Resource(name = "lookall")
    private LookAllOrderService lookAllOrderService;
    @Resource(name = "lookfanall")
    private LookFanAllService lookFanAllService;
    @Resource(name = "lookfanone")
    private LookFanOneService lookFanOneService;
    @Resource(name = "fan")
    private FanService fanService;
    //确认提交
    @ApiOperation(value = "点击确认查询默认地址不产生订单直接返回")
    @RequestMapping("queren")
    public String conf(@RequestParam("orderlist") String s1){
        return confirmService.getconf(s1);
    }
    //提交到redis中
    @ApiOperation(value = "传递地址对象和order对象集合提交到redis中")
    @RequestMapping(value = "comit",method = RequestMethod.POST)
    public String comit(@RequestBody Address address,@RequestParam String orderlist){

        return addRedisListService.addredislist(orderlist,address);

    }
    //查看一个redis订单的具体信息
    @ApiOperation(value = "传入用户id和订单编号获取一条订单信息")
    @RequestMapping("one")
    public String getont(@RequestParam String userid,@RequestParam String orderNumber){
        return lookRedisService.getordre(orderNumber,userid);
    }
    //查看redis中用户信息集合
    @ApiOperation(value = "传入用户id查询redis中未付款的订单的集合")
    @RequestMapping("getlist")
    public String getredis(@RequestParam String userid){
        return payRedisService.getRedis(userid);
    }

    //查看用户地址集合
    @ApiOperation(value = "传入用户id查看用户地址集合")
    @RequestMapping("getaddlist")
    public String getaddl(@RequestParam int userid){
        List<Address> getaddlist = lookAddressListService.getaddlist(userid);
        return JSON.toJSONString(getaddlist);

    }
    //查看一个地址信息
    @ApiOperation(value = "传入地址编号查看一条地址信息")
    @RequestMapping("getaddone")
    public String getoneAddress(@RequestParam String addNumber){
        Address address = lookAddressOneService.getoneAddress(addNumber);
        return JSON.toJSONString(address);
    }
    //添加地址信息
    @ApiOperation(value = "传入地址对象添加地址信息")
    @RequestMapping("addadd")
    public String addaddress(@RequestBody Address address){
        String add = addAddressService.add(address);
        return add;
    }
    //修改地址信息
    @ApiOperation(value = "动态修改传入一个地址对象")
    @RequestMapping("updatead")
    public String updateAddress(@RequestBody Address address){
        return updateAddressService.updateAddress(address);
    }
    //删除redis中一条订单信息
    @ApiOperation(value = "传入用户id和订单号删除一条订单信息")
    @RequestMapping("delectredis")
    public String delectredis(@RequestParam String orderNumber,@RequestParam String userid){
        return delectRedisOrderService.delectredis(orderNumber,userid);
    }
    //查看用户的订单集合
    @ApiOperation(value = "查看数据库的用户订单集合")
    @RequestMapping("lookall")
    public String getorderall(@RequestParam int userid){
        return allOrderService.getall(userid);
    }
    //删除订单
    @ApiOperation(value = "传入订单信息进行订单的删除")
    @RequestMapping("delectroder")
    public String delectorder(@RequestBody Order order){
        return delectDaoOrderService.delectorderdao(order);
    }
    //查看指定状态订单1表示已付款2表示待发货3表示待收货
    @ApiOperation(value = "根据用户id和状态进行订单的查询")
    @RequestMapping("lookOstate")
    public String loolstateorder(@RequestParam int userid,@RequestParam int zt){
        System.out.println(userid);
        System.out.println(zt);
        return lookStateOrderService.getstataorder(userid,zt);
    }
    //传入用户对象集合显示所有的存在rendis中和在数据库的订单信息
    @ApiOperation(value = "传入user对象list集合进行所有订单的查询")
    @RequestMapping("lookallorder")
    public String getallorder(@RequestParam String userlist){

        return lookAllOrderService.getall(userlist);
    }
    @ApiOperation(value = "根据用户id查询用户的退单信息")
    @RequestMapping("getfanall")
    public String getfanall(@RequestParam int userid){
        return lookFanAllService.getfanall(userid);
    }
    @ApiOperation(value = "根据退单id查看退单的具体信息")
    @RequestMapping("getfanone")
    public String getfanone(@RequestParam String fanNumber){
        return lookFanOneService.getone(fanNumber);
    }
    @ApiOperation(value = "拿到地址对象和对单对象集合显示进行添加")
    @RequestMapping("addfan")
    public String addfan(@RequestBody Address address,@RequestParam String tuilist){
        System.out.println(address.getUserid());
        System.out.println(tuilist);
        return fanService.fanhui(address,tuilist);
    }
    @RequestMapping("com")
    public String comit(){
        List<Order> list = new ArrayList<>();
        Order order = new Order();
        order.setUserid(1);
        order.setShopdoller(10.0);
        order.setShopnumber(3);
        order.setShopid(1);
        order.setRedundant("kuzixiezi");
        list.add(order);
        String s = JSON.toJSONString(list);
        System.out.println(s);
        Address address = new Address();
        address.setCity("beijing");
        address.setArea("shang");
        address.setStreet("beijing");
        return addRedisListService.addredislist(s,address);
    }
    @RequestMapping("userlist")
    public String userid(){
        User user = new User();
        user.setUserId(1);
        List<User> list = new ArrayList<>();
        list.add(user);
        String s = JSON.toJSONString(list);
        System.out.println(s);
        return lookAllOrderService.getall(s);
    }
    @RequestMapping("tui")
    public String tui(){
        List<Fan> list = new ArrayList<>();
        Fan fan = new Fan();
        fan.setOrdernumber("2018111300259758633");
        fan.setUserid(1);
        fan.setRenumber(3);
        fan.setShopid(1);
        fan.setRedundant("zheshishenshangpin");
        fan.setReturnreason("buxihuan");
        fan.setRenumber(10);
        fan.setReturntype(0);
        list.add(fan);
        String s = JSON.toJSONString(list);
        System.out.println(s);
        Address address = new Address();
        address.setAddressnumber("2018111200231799898");
        address.setCity("beijing");
        address.setArea("shang");
        address.setStreet("beijing");
        address.setConsumernamer("consume");
        address.setConsumerphoto("1214578");
        return JSON.toJSONString(fanService.fanhui(address,s));
    }
}
