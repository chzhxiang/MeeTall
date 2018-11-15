package com.example.shopingcartconsumer.pojo;

public class Cart {
    //商品id
    private Integer shopid;
    //店铺名称
    private String store;
    //商品价格
    private Double shopdoller;
    //商品数量
    private Integer shopnumber;
    //商品总数
    private Integer shoptotal;
    //商品sku属性
    private String shopsku;
    //商品名称
    private String shopname;
    //用户id
    private Integer userid;
    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public Double getShopdoller() {
        return shopdoller;
    }

    public void setShopdoller(Double shopdoller) {
        this.shopdoller = shopdoller;
    }

    public Integer getShopnumber() {
        return shopnumber;
    }

    public void setShopnumber(Integer shopnumber) {
        this.shopnumber = shopnumber;
    }

    public Integer getShoptotal() {
        return shoptotal;
    }

    public void setShoptotal(Integer shoptotal) {
        this.shoptotal = shoptotal;
    }

    public String getShopsku() {
        return shopsku;
    }

    public void setShopsku(String shopsku) {
        this.shopsku = shopsku;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }



}
