package pintuan;

import java.util.ArrayList;
import java.util.List;

public class MeetallptgoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetallptgoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPtGoodsIdIsNull() {
            addCriterion("pt_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andPtGoodsIdIsNotNull() {
            addCriterion("pt_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andPtGoodsIdEqualTo(Integer value) {
            addCriterion("pt_goods_id =", value, "ptGoodsId");
            return (Criteria) this;
        }

        public Criteria andPtGoodsIdNotEqualTo(Integer value) {
            addCriterion("pt_goods_id <>", value, "ptGoodsId");
            return (Criteria) this;
        }

        public Criteria andPtGoodsIdGreaterThan(Integer value) {
            addCriterion("pt_goods_id >", value, "ptGoodsId");
            return (Criteria) this;
        }

        public Criteria andPtGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_goods_id >=", value, "ptGoodsId");
            return (Criteria) this;
        }

        public Criteria andPtGoodsIdLessThan(Integer value) {
            addCriterion("pt_goods_id <", value, "ptGoodsId");
            return (Criteria) this;
        }

        public Criteria andPtGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("pt_goods_id <=", value, "ptGoodsId");
            return (Criteria) this;
        }

        public Criteria andPtGoodsIdIn(List<Integer> values) {
            addCriterion("pt_goods_id in", values, "ptGoodsId");
            return (Criteria) this;
        }

        public Criteria andPtGoodsIdNotIn(List<Integer> values) {
            addCriterion("pt_goods_id not in", values, "ptGoodsId");
            return (Criteria) this;
        }

        public Criteria andPtGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("pt_goods_id between", value1, value2, "ptGoodsId");
            return (Criteria) this;
        }

        public Criteria andPtGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_goods_id not between", value1, value2, "ptGoodsId");
            return (Criteria) this;
        }

        public Criteria andPtGoodNameIsNull() {
            addCriterion("pt_good_name is null");
            return (Criteria) this;
        }

        public Criteria andPtGoodNameIsNotNull() {
            addCriterion("pt_good_name is not null");
            return (Criteria) this;
        }

        public Criteria andPtGoodNameEqualTo(String value) {
            addCriterion("pt_good_name =", value, "ptGoodName");
            return (Criteria) this;
        }

        public Criteria andPtGoodNameNotEqualTo(String value) {
            addCriterion("pt_good_name <>", value, "ptGoodName");
            return (Criteria) this;
        }

        public Criteria andPtGoodNameGreaterThan(String value) {
            addCriterion("pt_good_name >", value, "ptGoodName");
            return (Criteria) this;
        }

        public Criteria andPtGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("pt_good_name >=", value, "ptGoodName");
            return (Criteria) this;
        }

        public Criteria andPtGoodNameLessThan(String value) {
            addCriterion("pt_good_name <", value, "ptGoodName");
            return (Criteria) this;
        }

        public Criteria andPtGoodNameLessThanOrEqualTo(String value) {
            addCriterion("pt_good_name <=", value, "ptGoodName");
            return (Criteria) this;
        }

        public Criteria andPtGoodNameLike(String value) {
            addCriterion("pt_good_name like", value, "ptGoodName");
            return (Criteria) this;
        }

        public Criteria andPtGoodNameNotLike(String value) {
            addCriterion("pt_good_name not like", value, "ptGoodName");
            return (Criteria) this;
        }

        public Criteria andPtGoodNameIn(List<String> values) {
            addCriterion("pt_good_name in", values, "ptGoodName");
            return (Criteria) this;
        }

        public Criteria andPtGoodNameNotIn(List<String> values) {
            addCriterion("pt_good_name not in", values, "ptGoodName");
            return (Criteria) this;
        }

        public Criteria andPtGoodNameBetween(String value1, String value2) {
            addCriterion("pt_good_name between", value1, value2, "ptGoodName");
            return (Criteria) this;
        }

        public Criteria andPtGoodNameNotBetween(String value1, String value2) {
            addCriterion("pt_good_name not between", value1, value2, "ptGoodName");
            return (Criteria) this;
        }

        public Criteria andPtGoodsDeatailsIsNull() {
            addCriterion("pt_goods_deatails is null");
            return (Criteria) this;
        }

        public Criteria andPtGoodsDeatailsIsNotNull() {
            addCriterion("pt_goods_deatails is not null");
            return (Criteria) this;
        }

        public Criteria andPtGoodsDeatailsEqualTo(String value) {
            addCriterion("pt_goods_deatails =", value, "ptGoodsDeatails");
            return (Criteria) this;
        }

        public Criteria andPtGoodsDeatailsNotEqualTo(String value) {
            addCriterion("pt_goods_deatails <>", value, "ptGoodsDeatails");
            return (Criteria) this;
        }

        public Criteria andPtGoodsDeatailsGreaterThan(String value) {
            addCriterion("pt_goods_deatails >", value, "ptGoodsDeatails");
            return (Criteria) this;
        }

        public Criteria andPtGoodsDeatailsGreaterThanOrEqualTo(String value) {
            addCriterion("pt_goods_deatails >=", value, "ptGoodsDeatails");
            return (Criteria) this;
        }

        public Criteria andPtGoodsDeatailsLessThan(String value) {
            addCriterion("pt_goods_deatails <", value, "ptGoodsDeatails");
            return (Criteria) this;
        }

        public Criteria andPtGoodsDeatailsLessThanOrEqualTo(String value) {
            addCriterion("pt_goods_deatails <=", value, "ptGoodsDeatails");
            return (Criteria) this;
        }

        public Criteria andPtGoodsDeatailsLike(String value) {
            addCriterion("pt_goods_deatails like", value, "ptGoodsDeatails");
            return (Criteria) this;
        }

        public Criteria andPtGoodsDeatailsNotLike(String value) {
            addCriterion("pt_goods_deatails not like", value, "ptGoodsDeatails");
            return (Criteria) this;
        }

        public Criteria andPtGoodsDeatailsIn(List<String> values) {
            addCriterion("pt_goods_deatails in", values, "ptGoodsDeatails");
            return (Criteria) this;
        }

        public Criteria andPtGoodsDeatailsNotIn(List<String> values) {
            addCriterion("pt_goods_deatails not in", values, "ptGoodsDeatails");
            return (Criteria) this;
        }

        public Criteria andPtGoodsDeatailsBetween(String value1, String value2) {
            addCriterion("pt_goods_deatails between", value1, value2, "ptGoodsDeatails");
            return (Criteria) this;
        }

        public Criteria andPtGoodsDeatailsNotBetween(String value1, String value2) {
            addCriterion("pt_goods_deatails not between", value1, value2, "ptGoodsDeatails");
            return (Criteria) this;
        }

        public Criteria andPtGoodsPricesIsNull() {
            addCriterion("pt_goods_prices is null");
            return (Criteria) this;
        }

        public Criteria andPtGoodsPricesIsNotNull() {
            addCriterion("pt_goods_prices is not null");
            return (Criteria) this;
        }

        public Criteria andPtGoodsPricesEqualTo(Double value) {
            addCriterion("pt_goods_prices =", value, "ptGoodsPrices");
            return (Criteria) this;
        }

        public Criteria andPtGoodsPricesNotEqualTo(Double value) {
            addCriterion("pt_goods_prices <>", value, "ptGoodsPrices");
            return (Criteria) this;
        }

        public Criteria andPtGoodsPricesGreaterThan(Double value) {
            addCriterion("pt_goods_prices >", value, "ptGoodsPrices");
            return (Criteria) this;
        }

        public Criteria andPtGoodsPricesGreaterThanOrEqualTo(Double value) {
            addCriterion("pt_goods_prices >=", value, "ptGoodsPrices");
            return (Criteria) this;
        }

        public Criteria andPtGoodsPricesLessThan(Double value) {
            addCriterion("pt_goods_prices <", value, "ptGoodsPrices");
            return (Criteria) this;
        }

        public Criteria andPtGoodsPricesLessThanOrEqualTo(Double value) {
            addCriterion("pt_goods_prices <=", value, "ptGoodsPrices");
            return (Criteria) this;
        }

        public Criteria andPtGoodsPricesIn(List<Double> values) {
            addCriterion("pt_goods_prices in", values, "ptGoodsPrices");
            return (Criteria) this;
        }

        public Criteria andPtGoodsPricesNotIn(List<Double> values) {
            addCriterion("pt_goods_prices not in", values, "ptGoodsPrices");
            return (Criteria) this;
        }

        public Criteria andPtGoodsPricesBetween(Double value1, Double value2) {
            addCriterion("pt_goods_prices between", value1, value2, "ptGoodsPrices");
            return (Criteria) this;
        }

        public Criteria andPtGoodsPricesNotBetween(Double value1, Double value2) {
            addCriterion("pt_goods_prices not between", value1, value2, "ptGoodsPrices");
            return (Criteria) this;
        }

        public Criteria andPtPricesIsNull() {
            addCriterion("pt_prices is null");
            return (Criteria) this;
        }

        public Criteria andPtPricesIsNotNull() {
            addCriterion("pt_prices is not null");
            return (Criteria) this;
        }

        public Criteria andPtPricesEqualTo(String value) {
            addCriterion("pt_prices =", value, "ptPrices");
            return (Criteria) this;
        }

        public Criteria andPtPricesNotEqualTo(String value) {
            addCriterion("pt_prices <>", value, "ptPrices");
            return (Criteria) this;
        }

        public Criteria andPtPricesGreaterThan(String value) {
            addCriterion("pt_prices >", value, "ptPrices");
            return (Criteria) this;
        }

        public Criteria andPtPricesGreaterThanOrEqualTo(String value) {
            addCriterion("pt_prices >=", value, "ptPrices");
            return (Criteria) this;
        }

        public Criteria andPtPricesLessThan(String value) {
            addCriterion("pt_prices <", value, "ptPrices");
            return (Criteria) this;
        }

        public Criteria andPtPricesLessThanOrEqualTo(String value) {
            addCriterion("pt_prices <=", value, "ptPrices");
            return (Criteria) this;
        }

        public Criteria andPtPricesLike(String value) {
            addCriterion("pt_prices like", value, "ptPrices");
            return (Criteria) this;
        }

        public Criteria andPtPricesNotLike(String value) {
            addCriterion("pt_prices not like", value, "ptPrices");
            return (Criteria) this;
        }

        public Criteria andPtPricesIn(List<String> values) {
            addCriterion("pt_prices in", values, "ptPrices");
            return (Criteria) this;
        }

        public Criteria andPtPricesNotIn(List<String> values) {
            addCriterion("pt_prices not in", values, "ptPrices");
            return (Criteria) this;
        }

        public Criteria andPtPricesBetween(String value1, String value2) {
            addCriterion("pt_prices between", value1, value2, "ptPrices");
            return (Criteria) this;
        }

        public Criteria andPtPricesNotBetween(String value1, String value2) {
            addCriterion("pt_prices not between", value1, value2, "ptPrices");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}