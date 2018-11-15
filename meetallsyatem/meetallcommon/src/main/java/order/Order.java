package order;


import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    //订单编号
    private String ordernumber;
    //实付金额
    private Double timedoller;
    //支付类型
    private String paytype;
    //订单创建时间
    private Date ordcreatetime;
    //订单修改时间
    private Date ordupdatetime;
    //支付时间
    private Date paytime;
    //交易完成时间
    private Date paycompletetime;
    //用户id
    private Integer userid;
    //订单状态
    private Integer orderstate;
    //商品id
    private Integer shopid;
    //商品数量
    private Integer shopnumber;
    //商品总付款
    private Double shoptotaldoller;
    //支付单号
    private String paysuccend;
    //商品金额
    private Double shopdoller;
    //商品sku属性拼接
    private String redundant;

    private String redundant1;
    //订单删除状态
    private Integer delectzt;
    private String duo;
    private String duo1;

    public Integer getDelectzt() {
        return delectzt;
    }

    public void setDelectzt(Integer delectzt) {
        this.delectzt = delectzt;
    }

    public String getDuo() {
        return duo;
    }

    public void setDuo(String duo) {
        this.duo = duo;
    }

    public String getDuo1() {
        return duo1;
    }

    public void setDuo1(String duo1) {
        this.duo1 = duo1;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Double getTimedoller() {
        return timedoller;
    }

    public void setTimedoller(Double timedoller) {
        this.timedoller = timedoller;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    public Date getOrdcreatetime() {
        return ordcreatetime;
    }

    public void setOrdcreatetime(Date ordcreatetime) {
        this.ordcreatetime = ordcreatetime;
    }

    public Date getOrdupdatetime() {
        return ordupdatetime;
    }

    public void setOrdupdatetime(Date ordupdatetime) {
        this.ordupdatetime = ordupdatetime;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Date getPaycompletetime() {
        return paycompletetime;
    }

    public void setPaycompletetime(Date paycompletetime) {
        this.paycompletetime = paycompletetime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getShopnumber() {
        return shopnumber;
    }

    public void setShopnumber(Integer shopnumber) {
        this.shopnumber = shopnumber;
    }

    public Double getShoptotaldoller() {
        return shoptotaldoller;
    }

    public void setShoptotaldoller(Double shoptotaldoller) {
        this.shoptotaldoller = shoptotaldoller;
    }

    public String getPaysuccend() {
        return paysuccend;
    }

    public void setPaysuccend(String paysuccend) {
        this.paysuccend = paysuccend;
    }

    public Double getShopdoller() {
        return shopdoller;
    }

    public void setShopdoller(Double shopdoller) {
        this.shopdoller = shopdoller;
    }

    public String getRedundant() {
        return redundant;
    }

    public void setRedundant(String redundant) {
        this.redundant = redundant;
    }

    public String getRedundant1() {
        return redundant1;
    }

    public void setRedundant1(String redundant1) {
        this.redundant1 = redundant1;
    }
}