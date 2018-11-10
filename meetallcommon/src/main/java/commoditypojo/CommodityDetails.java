package commoditypojo;

import java.util.List;
import java.util.Map;


/**
 * 商品详情
 */
public class CommodityDetails {
    /**
     * 商品编号
     */
    private Integer commodityId;
    /**
     * 图片
     */
    private String image;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品分类
     */
    private Integer commodityClassify;
    /**
     * commodity_describe
     * 商品描述
     */
    private String commodityDescribe;


    /**
     * 商品价格
     */
    private Double commodityPrice;


    /**
     * 放入商品属性名和商品属性值
     */
    private Map<String,List<String>> CommoditySkuNameValue;


    public Map<String, List<String>> getCommoditySkuNameValue() {
        return CommoditySkuNameValue;
    }

    public void setCommoditySkuNameVAlue(Map<String, List<String>> commoditySkuNameValue) {
        CommoditySkuNameValue = commoditySkuNameValue;
    }






    public Double getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Double commodityPrice) {
        this.commodityPrice = commodityPrice;
    }
    public Integer getCommodityId() {
        return commodityId;
    }


    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getCommodityClassify() {
        return commodityClassify;
    }

    public void setCommodityClassify(Integer commodityClassify) {
        this.commodityClassify = commodityClassify;
    }

    public String getCommodityDescribe() {
        return commodityDescribe;
    }

    public void setCommodityDescribe(String commodityDescribe) {
        this.commodityDescribe = commodityDescribe;
    }


}
