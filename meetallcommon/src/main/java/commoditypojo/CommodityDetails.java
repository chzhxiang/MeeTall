package commoditypojo;

/**
 * 商品详情
 */
public class CommodityDetails {

    private Integer commodityId;
    /**
     * 商品编号
     */
    private String image;
    /**
     * 图片
     */
    private String productName;
    /**
     * 商品名称
     */
    private Integer commodityClassify;
    /**
     * 商品分类
     */
    private String commodityDescribe;
    /**
     * commodity_describe
     * 商品描述
     */
    private Double commosityPrice;

    /**
     * 商品价格
     * @return
     */
    public Double getCommosityPrice() {
        return commosityPrice;
    }

    public void setCommosityPrice(Double commosityPrice) {
        this.commosityPrice = commosityPrice;
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
