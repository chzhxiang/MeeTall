package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo;

import java.util.ArrayList;
import java.util.List;

public class MeetallptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetallptExample() {
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

        public Criteria andPtNumberIsNull() {
            addCriterion("pt_number is null");
            return (Criteria) this;
        }

        public Criteria andPtNumberIsNotNull() {
            addCriterion("pt_number is not null");
            return (Criteria) this;
        }

        public Criteria andPtNumberEqualTo(Integer value) {
            addCriterion("pt_number =", value, "ptNumber");
            return (Criteria) this;
        }

        public Criteria andPtNumberNotEqualTo(Integer value) {
            addCriterion("pt_number <>", value, "ptNumber");
            return (Criteria) this;
        }

        public Criteria andPtNumberGreaterThan(Integer value) {
            addCriterion("pt_number >", value, "ptNumber");
            return (Criteria) this;
        }

        public Criteria andPtNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_number >=", value, "ptNumber");
            return (Criteria) this;
        }

        public Criteria andPtNumberLessThan(Integer value) {
            addCriterion("pt_number <", value, "ptNumber");
            return (Criteria) this;
        }

        public Criteria andPtNumberLessThanOrEqualTo(Integer value) {
            addCriterion("pt_number <=", value, "ptNumber");
            return (Criteria) this;
        }

        public Criteria andPtNumberIn(List<Integer> values) {
            addCriterion("pt_number in", values, "ptNumber");
            return (Criteria) this;
        }

        public Criteria andPtNumberNotIn(List<Integer> values) {
            addCriterion("pt_number not in", values, "ptNumber");
            return (Criteria) this;
        }

        public Criteria andPtNumberBetween(Integer value1, Integer value2) {
            addCriterion("pt_number between", value1, value2, "ptNumber");
            return (Criteria) this;
        }

        public Criteria andPtNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_number not between", value1, value2, "ptNumber");
            return (Criteria) this;
        }

        public Criteria andPtGoodsNumberIsNull() {
            addCriterion("pt_goods_number is null");
            return (Criteria) this;
        }

        public Criteria andPtGoodsNumberIsNotNull() {
            addCriterion("pt_goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andPtGoodsNumberEqualTo(Integer value) {
            addCriterion("pt_goods_number =", value, "ptGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andPtGoodsNumberNotEqualTo(Integer value) {
            addCriterion("pt_goods_number <>", value, "ptGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andPtGoodsNumberGreaterThan(Integer value) {
            addCriterion("pt_goods_number >", value, "ptGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andPtGoodsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_goods_number >=", value, "ptGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andPtGoodsNumberLessThan(Integer value) {
            addCriterion("pt_goods_number <", value, "ptGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andPtGoodsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("pt_goods_number <=", value, "ptGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andPtGoodsNumberIn(List<Integer> values) {
            addCriterion("pt_goods_number in", values, "ptGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andPtGoodsNumberNotIn(List<Integer> values) {
            addCriterion("pt_goods_number not in", values, "ptGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andPtGoodsNumberBetween(Integer value1, Integer value2) {
            addCriterion("pt_goods_number between", value1, value2, "ptGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andPtGoodsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_goods_number not between", value1, value2, "ptGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andPtStateIsNull() {
            addCriterion("pt_state is null");
            return (Criteria) this;
        }

        public Criteria andPtStateIsNotNull() {
            addCriterion("pt_state is not null");
            return (Criteria) this;
        }

        public Criteria andPtStateEqualTo(Integer value) {
            addCriterion("pt_state =", value, "ptState");
            return (Criteria) this;
        }

        public Criteria andPtStateNotEqualTo(Integer value) {
            addCriterion("pt_state <>", value, "ptState");
            return (Criteria) this;
        }

        public Criteria andPtStateGreaterThan(Integer value) {
            addCriterion("pt_state >", value, "ptState");
            return (Criteria) this;
        }

        public Criteria andPtStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_state >=", value, "ptState");
            return (Criteria) this;
        }

        public Criteria andPtStateLessThan(Integer value) {
            addCriterion("pt_state <", value, "ptState");
            return (Criteria) this;
        }

        public Criteria andPtStateLessThanOrEqualTo(Integer value) {
            addCriterion("pt_state <=", value, "ptState");
            return (Criteria) this;
        }

        public Criteria andPtStateIn(List<Integer> values) {
            addCriterion("pt_state in", values, "ptState");
            return (Criteria) this;
        }

        public Criteria andPtStateNotIn(List<Integer> values) {
            addCriterion("pt_state not in", values, "ptState");
            return (Criteria) this;
        }

        public Criteria andPtStateBetween(Integer value1, Integer value2) {
            addCriterion("pt_state between", value1, value2, "ptState");
            return (Criteria) this;
        }

        public Criteria andPtStateNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_state not between", value1, value2, "ptState");
            return (Criteria) this;
        }

        public Criteria andPtNumberOfPeopleIsNull() {
            addCriterion("pt_number_of_people is null");
            return (Criteria) this;
        }

        public Criteria andPtNumberOfPeopleIsNotNull() {
            addCriterion("pt_number_of_people is not null");
            return (Criteria) this;
        }

        public Criteria andPtNumberOfPeopleEqualTo(Integer value) {
            addCriterion("pt_number_of_people =", value, "ptNumberOfPeople");
            return (Criteria) this;
        }

        public Criteria andPtNumberOfPeopleNotEqualTo(Integer value) {
            addCriterion("pt_number_of_people <>", value, "ptNumberOfPeople");
            return (Criteria) this;
        }

        public Criteria andPtNumberOfPeopleGreaterThan(Integer value) {
            addCriterion("pt_number_of_people >", value, "ptNumberOfPeople");
            return (Criteria) this;
        }

        public Criteria andPtNumberOfPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_number_of_people >=", value, "ptNumberOfPeople");
            return (Criteria) this;
        }

        public Criteria andPtNumberOfPeopleLessThan(Integer value) {
            addCriterion("pt_number_of_people <", value, "ptNumberOfPeople");
            return (Criteria) this;
        }

        public Criteria andPtNumberOfPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("pt_number_of_people <=", value, "ptNumberOfPeople");
            return (Criteria) this;
        }

        public Criteria andPtNumberOfPeopleIn(List<Integer> values) {
            addCriterion("pt_number_of_people in", values, "ptNumberOfPeople");
            return (Criteria) this;
        }

        public Criteria andPtNumberOfPeopleNotIn(List<Integer> values) {
            addCriterion("pt_number_of_people not in", values, "ptNumberOfPeople");
            return (Criteria) this;
        }

        public Criteria andPtNumberOfPeopleBetween(Integer value1, Integer value2) {
            addCriterion("pt_number_of_people between", value1, value2, "ptNumberOfPeople");
            return (Criteria) this;
        }

        public Criteria andPtNumberOfPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_number_of_people not between", value1, value2, "ptNumberOfPeople");
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