package commoditypojo;


/**
 * 商品分类
 */
public class CommodityClassify {
    private Integer commodityClassifyNumber;
    /**
     * 商品分类编号
     */
    private String classifyName;
    /**
     * 商品分类名称
     */
    public Integer getCommodityClassifyNumber() {
        return commodityClassifyNumber;
    }

    public void setCommodityClassifyNumber(Integer commodityClassifyNumber) {
        this.commodityClassifyNumber = commodityClassifyNumber;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }
}
