package pintuan;

public class Meetallptgoods {
    /**
     * 商品自增id
     */
    private Integer ptGoodsId;

    /**
     * 商品名称
     */
    private String ptGoodName;

    /**
     * 商品详情
     */
    private String ptGoodsDeatails;

    /**
     * 商品价格
     */
    private Double ptGoodsPrices;

    /**
     * 拼团价格
     */
    private String ptPrices;

    public Integer getPtGoodsId() {
        return ptGoodsId;
    }

    public void setPtGoodsId(Integer ptGoodsId) {
        this.ptGoodsId = ptGoodsId;
    }

    public String getPtGoodName() {
        return ptGoodName;
    }

    public void setPtGoodName(String ptGoodName) {
        this.ptGoodName = ptGoodName == null ? null : ptGoodName.trim();
    }

    public String getPtGoodsDeatails() {
        return ptGoodsDeatails;
    }

    public void setPtGoodsDeatails(String ptGoodsDeatails) {
        this.ptGoodsDeatails = ptGoodsDeatails == null ? null : ptGoodsDeatails.trim();
    }

    public Double getPtGoodsPrices() {
        return ptGoodsPrices;
    }

    public void setPtGoodsPrices(Double ptGoodsPrices) {
        this.ptGoodsPrices = ptGoodsPrices;
    }

    public String getPtPrices() {
        return ptPrices;
    }

    public void setPtPrices(String ptPrices) {
        this.ptPrices = ptPrices == null ? null : ptPrices.trim();
    }
}