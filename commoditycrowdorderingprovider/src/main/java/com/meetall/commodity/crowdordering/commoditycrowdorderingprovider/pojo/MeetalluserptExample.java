package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeetalluserptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetalluserptExample() {
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

        public Criteria andPtIdIsNull() {
            addCriterion("pt_id is null");
            return (Criteria) this;
        }

        public Criteria andPtIdIsNotNull() {
            addCriterion("pt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPtIdEqualTo(Integer value) {
            addCriterion("pt_id =", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotEqualTo(Integer value) {
            addCriterion("pt_id <>", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdGreaterThan(Integer value) {
            addCriterion("pt_id >", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_id >=", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdLessThan(Integer value) {
            addCriterion("pt_id <", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdLessThanOrEqualTo(Integer value) {
            addCriterion("pt_id <=", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdIn(List<Integer> values) {
            addCriterion("pt_id in", values, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotIn(List<Integer> values) {
            addCriterion("pt_id not in", values, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdBetween(Integer value1, Integer value2) {
            addCriterion("pt_id between", value1, value2, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_id not between", value1, value2, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtUserIdIsNull() {
            addCriterion("pt_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPtUserIdIsNotNull() {
            addCriterion("pt_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPtUserIdEqualTo(Integer value) {
            addCriterion("pt_user_id =", value, "ptUserId");
            return (Criteria) this;
        }

        public Criteria andPtUserIdNotEqualTo(Integer value) {
            addCriterion("pt_user_id <>", value, "ptUserId");
            return (Criteria) this;
        }

        public Criteria andPtUserIdGreaterThan(Integer value) {
            addCriterion("pt_user_id >", value, "ptUserId");
            return (Criteria) this;
        }

        public Criteria andPtUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_user_id >=", value, "ptUserId");
            return (Criteria) this;
        }

        public Criteria andPtUserIdLessThan(Integer value) {
            addCriterion("pt_user_id <", value, "ptUserId");
            return (Criteria) this;
        }

        public Criteria andPtUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("pt_user_id <=", value, "ptUserId");
            return (Criteria) this;
        }

        public Criteria andPtUserIdIn(List<Integer> values) {
            addCriterion("pt_user_id in", values, "ptUserId");
            return (Criteria) this;
        }

        public Criteria andPtUserIdNotIn(List<Integer> values) {
            addCriterion("pt_user_id not in", values, "ptUserId");
            return (Criteria) this;
        }

        public Criteria andPtUserIdBetween(Integer value1, Integer value2) {
            addCriterion("pt_user_id between", value1, value2, "ptUserId");
            return (Criteria) this;
        }

        public Criteria andPtUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_user_id not between", value1, value2, "ptUserId");
            return (Criteria) this;
        }

        public Criteria andPtOrderNumberIsNull() {
            addCriterion("pt_order_number is null");
            return (Criteria) this;
        }

        public Criteria andPtOrderNumberIsNotNull() {
            addCriterion("pt_order_number is not null");
            return (Criteria) this;
        }

        public Criteria andPtOrderNumberEqualTo(Integer value) {
            addCriterion("pt_order_number =", value, "ptOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPtOrderNumberNotEqualTo(Integer value) {
            addCriterion("pt_order_number <>", value, "ptOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPtOrderNumberGreaterThan(Integer value) {
            addCriterion("pt_order_number >", value, "ptOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPtOrderNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_order_number >=", value, "ptOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPtOrderNumberLessThan(Integer value) {
            addCriterion("pt_order_number <", value, "ptOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPtOrderNumberLessThanOrEqualTo(Integer value) {
            addCriterion("pt_order_number <=", value, "ptOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPtOrderNumberIn(List<Integer> values) {
            addCriterion("pt_order_number in", values, "ptOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPtOrderNumberNotIn(List<Integer> values) {
            addCriterion("pt_order_number not in", values, "ptOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPtOrderNumberBetween(Integer value1, Integer value2) {
            addCriterion("pt_order_number between", value1, value2, "ptOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPtOrderNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_order_number not between", value1, value2, "ptOrderNumber");
            return (Criteria) this;
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

        public Criteria andPaymentsIsNull() {
            addCriterion("payments is null");
            return (Criteria) this;
        }

        public Criteria andPaymentsIsNotNull() {
            addCriterion("payments is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentsEqualTo(Double value) {
            addCriterion("payments =", value, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsNotEqualTo(Double value) {
            addCriterion("payments <>", value, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsGreaterThan(Double value) {
            addCriterion("payments >", value, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsGreaterThanOrEqualTo(Double value) {
            addCriterion("payments >=", value, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsLessThan(Double value) {
            addCriterion("payments <", value, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsLessThanOrEqualTo(Double value) {
            addCriterion("payments <=", value, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsIn(List<Double> values) {
            addCriterion("payments in", values, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsNotIn(List<Double> values) {
            addCriterion("payments not in", values, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsBetween(Double value1, Double value2) {
            addCriterion("payments between", value1, value2, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsNotBetween(Double value1, Double value2) {
            addCriterion("payments not between", value1, value2, "payments");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNull() {
            addCriterion("contact_number is null");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNotNull() {
            addCriterion("contact_number is not null");
            return (Criteria) this;
        }

        public Criteria andContactNumberEqualTo(String value) {
            addCriterion("contact_number =", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotEqualTo(String value) {
            addCriterion("contact_number <>", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThan(String value) {
            addCriterion("contact_number >", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThanOrEqualTo(String value) {
            addCriterion("contact_number >=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThan(String value) {
            addCriterion("contact_number <", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThanOrEqualTo(String value) {
            addCriterion("contact_number <=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLike(String value) {
            addCriterion("contact_number like", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotLike(String value) {
            addCriterion("contact_number not like", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberIn(List<String> values) {
            addCriterion("contact_number in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotIn(List<String> values) {
            addCriterion("contact_number not in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberBetween(String value1, String value2) {
            addCriterion("contact_number between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotBetween(String value1, String value2) {
            addCriterion("contact_number not between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIsNull() {
            addCriterion("shipping_address is null");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIsNotNull() {
            addCriterion("shipping_address is not null");
            return (Criteria) this;
        }

        public Criteria andShippingAddressEqualTo(String value) {
            addCriterion("shipping_address =", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotEqualTo(String value) {
            addCriterion("shipping_address <>", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressGreaterThan(String value) {
            addCriterion("shipping_address >", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_address >=", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLessThan(String value) {
            addCriterion("shipping_address <", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLessThanOrEqualTo(String value) {
            addCriterion("shipping_address <=", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLike(String value) {
            addCriterion("shipping_address like", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotLike(String value) {
            addCriterion("shipping_address not like", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIn(List<String> values) {
            addCriterion("shipping_address in", values, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotIn(List<String> values) {
            addCriterion("shipping_address not in", values, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressBetween(String value1, String value2) {
            addCriterion("shipping_address between", value1, value2, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotBetween(String value1, String value2) {
            addCriterion("shipping_address not between", value1, value2, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andGroupTimeIsNull() {
            addCriterion("group_time is null");
            return (Criteria) this;
        }

        public Criteria andGroupTimeIsNotNull() {
            addCriterion("group_time is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTimeEqualTo(Date value) {
            addCriterion("group_time =", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeNotEqualTo(Date value) {
            addCriterion("group_time <>", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeGreaterThan(Date value) {
            addCriterion("group_time >", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("group_time >=", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeLessThan(Date value) {
            addCriterion("group_time <", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeLessThanOrEqualTo(Date value) {
            addCriterion("group_time <=", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeIn(List<Date> values) {
            addCriterion("group_time in", values, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeNotIn(List<Date> values) {
            addCriterion("group_time not in", values, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeBetween(Date value1, Date value2) {
            addCriterion("group_time between", value1, value2, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeNotBetween(Date value1, Date value2) {
            addCriterion("group_time not between", value1, value2, "groupTime");
            return (Criteria) this;
        }

        public Criteria andIfgroupLeaderIsNull() {
            addCriterion("ifgroup_leader is null");
            return (Criteria) this;
        }

        public Criteria andIfgroupLeaderIsNotNull() {
            addCriterion("ifgroup_leader is not null");
            return (Criteria) this;
        }

        public Criteria andIfgroupLeaderEqualTo(String value) {
            addCriterion("ifgroup_leader =", value, "ifgroupLeader");
            return (Criteria) this;
        }

        public Criteria andIfgroupLeaderNotEqualTo(String value) {
            addCriterion("ifgroup_leader <>", value, "ifgroupLeader");
            return (Criteria) this;
        }

        public Criteria andIfgroupLeaderGreaterThan(String value) {
            addCriterion("ifgroup_leader >", value, "ifgroupLeader");
            return (Criteria) this;
        }

        public Criteria andIfgroupLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("ifgroup_leader >=", value, "ifgroupLeader");
            return (Criteria) this;
        }

        public Criteria andIfgroupLeaderLessThan(String value) {
            addCriterion("ifgroup_leader <", value, "ifgroupLeader");
            return (Criteria) this;
        }

        public Criteria andIfgroupLeaderLessThanOrEqualTo(String value) {
            addCriterion("ifgroup_leader <=", value, "ifgroupLeader");
            return (Criteria) this;
        }

        public Criteria andIfgroupLeaderLike(String value) {
            addCriterion("ifgroup_leader like", value, "ifgroupLeader");
            return (Criteria) this;
        }

        public Criteria andIfgroupLeaderNotLike(String value) {
            addCriterion("ifgroup_leader not like", value, "ifgroupLeader");
            return (Criteria) this;
        }

        public Criteria andIfgroupLeaderIn(List<String> values) {
            addCriterion("ifgroup_leader in", values, "ifgroupLeader");
            return (Criteria) this;
        }

        public Criteria andIfgroupLeaderNotIn(List<String> values) {
            addCriterion("ifgroup_leader not in", values, "ifgroupLeader");
            return (Criteria) this;
        }

        public Criteria andIfgroupLeaderBetween(String value1, String value2) {
            addCriterion("ifgroup_leader between", value1, value2, "ifgroupLeader");
            return (Criteria) this;
        }

        public Criteria andIfgroupLeaderNotBetween(String value1, String value2) {
            addCriterion("ifgroup_leader not between", value1, value2, "ifgroupLeader");
            return (Criteria) this;
        }

        public Criteria andGroupTimeEndIsNull() {
            addCriterion("group_time_end is null");
            return (Criteria) this;
        }

        public Criteria andGroupTimeEndIsNotNull() {
            addCriterion("group_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTimeEndEqualTo(Date value) {
            addCriterion("group_time_end =", value, "groupTimeEnd");
            return (Criteria) this;
        }

        public Criteria andGroupTimeEndNotEqualTo(Date value) {
            addCriterion("group_time_end <>", value, "groupTimeEnd");
            return (Criteria) this;
        }

        public Criteria andGroupTimeEndGreaterThan(Date value) {
            addCriterion("group_time_end >", value, "groupTimeEnd");
            return (Criteria) this;
        }

        public Criteria andGroupTimeEndGreaterThanOrEqualTo(Date value) {
            addCriterion("group_time_end >=", value, "groupTimeEnd");
            return (Criteria) this;
        }

        public Criteria andGroupTimeEndLessThan(Date value) {
            addCriterion("group_time_end <", value, "groupTimeEnd");
            return (Criteria) this;
        }

        public Criteria andGroupTimeEndLessThanOrEqualTo(Date value) {
            addCriterion("group_time_end <=", value, "groupTimeEnd");
            return (Criteria) this;
        }

        public Criteria andGroupTimeEndIn(List<Date> values) {
            addCriterion("group_time_end in", values, "groupTimeEnd");
            return (Criteria) this;
        }

        public Criteria andGroupTimeEndNotIn(List<Date> values) {
            addCriterion("group_time_end not in", values, "groupTimeEnd");
            return (Criteria) this;
        }

        public Criteria andGroupTimeEndBetween(Date value1, Date value2) {
            addCriterion("group_time_end between", value1, value2, "groupTimeEnd");
            return (Criteria) this;
        }

        public Criteria andGroupTimeEndNotBetween(Date value1, Date value2) {
            addCriterion("group_time_end not between", value1, value2, "groupTimeEnd");
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