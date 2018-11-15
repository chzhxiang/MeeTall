package order;

public class Address {
    //地址编号
    private String addressnumber;
    //用户id
    private Integer userid;
    //城市
    private String city;
    //地区
    private String area;
    //街道
    private String street;
    //邮政编码
    private Integer zip;
    //是不是默认地址
    private Integer moren;
    //接受者名字
    private String consumernamer;
    //接受者电话
    private String consumerphoto;

    private String redundant;

    private String redundant1;

    public String getAddressnumber() {
        return addressnumber;
    }

    public void setAddressnumber(String addressnumber) {
        this.addressnumber = addressnumber;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public Integer getMoren() {
        return moren;
    }

    public void setMoren(Integer moren) {
        this.moren = moren;
    }

    public String getConsumernamer() {
        return consumernamer;
    }

    public void setConsumernamer(String consumernamer) {
        this.consumernamer = consumernamer;
    }

    public String getConsumerphoto() {
        return consumerphoto;
    }

    public void setConsumerphoto(String consumerphoto) {
        this.consumerphoto = consumerphoto;
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