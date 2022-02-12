package com.example.endowment.domain;

import java.util.ArrayList;
import java.util.List;

public class EuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EuserExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNull() {
            addCriterion("idNumber is null");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNotNull() {
            addCriterion("idNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumberEqualTo(String value) {
            addCriterion("idNumber =", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotEqualTo(String value) {
            addCriterion("idNumber <>", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThan(String value) {
            addCriterion("idNumber >", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("idNumber >=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThan(String value) {
            addCriterion("idNumber <", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThanOrEqualTo(String value) {
            addCriterion("idNumber <=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLike(String value) {
            addCriterion("idNumber like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotLike(String value) {
            addCriterion("idNumber not like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberIn(List<String> values) {
            addCriterion("idNumber in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotIn(List<String> values) {
            addCriterion("idNumber not in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberBetween(String value1, String value2) {
            addCriterion("idNumber between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotBetween(String value1, String value2) {
            addCriterion("idNumber not between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andDisabilityIsNull() {
            addCriterion("disability is null");
            return (Criteria) this;
        }

        public Criteria andDisabilityIsNotNull() {
            addCriterion("disability is not null");
            return (Criteria) this;
        }

        public Criteria andDisabilityEqualTo(String value) {
            addCriterion("disability =", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityNotEqualTo(String value) {
            addCriterion("disability <>", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityGreaterThan(String value) {
            addCriterion("disability >", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityGreaterThanOrEqualTo(String value) {
            addCriterion("disability >=", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityLessThan(String value) {
            addCriterion("disability <", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityLessThanOrEqualTo(String value) {
            addCriterion("disability <=", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityLike(String value) {
            addCriterion("disability like", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityNotLike(String value) {
            addCriterion("disability not like", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityIn(List<String> values) {
            addCriterion("disability in", values, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityNotIn(List<String> values) {
            addCriterion("disability not in", values, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityBetween(String value1, String value2) {
            addCriterion("disability between", value1, value2, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityNotBetween(String value1, String value2) {
            addCriterion("disability not between", value1, value2, "disability");
            return (Criteria) this;
        }

        public Criteria andFamilyplanningIsNull() {
            addCriterion("familyPlanning is null");
            return (Criteria) this;
        }

        public Criteria andFamilyplanningIsNotNull() {
            addCriterion("familyPlanning is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyplanningEqualTo(String value) {
            addCriterion("familyPlanning =", value, "familyplanning");
            return (Criteria) this;
        }

        public Criteria andFamilyplanningNotEqualTo(String value) {
            addCriterion("familyPlanning <>", value, "familyplanning");
            return (Criteria) this;
        }

        public Criteria andFamilyplanningGreaterThan(String value) {
            addCriterion("familyPlanning >", value, "familyplanning");
            return (Criteria) this;
        }

        public Criteria andFamilyplanningGreaterThanOrEqualTo(String value) {
            addCriterion("familyPlanning >=", value, "familyplanning");
            return (Criteria) this;
        }

        public Criteria andFamilyplanningLessThan(String value) {
            addCriterion("familyPlanning <", value, "familyplanning");
            return (Criteria) this;
        }

        public Criteria andFamilyplanningLessThanOrEqualTo(String value) {
            addCriterion("familyPlanning <=", value, "familyplanning");
            return (Criteria) this;
        }

        public Criteria andFamilyplanningLike(String value) {
            addCriterion("familyPlanning like", value, "familyplanning");
            return (Criteria) this;
        }

        public Criteria andFamilyplanningNotLike(String value) {
            addCriterion("familyPlanning not like", value, "familyplanning");
            return (Criteria) this;
        }

        public Criteria andFamilyplanningIn(List<String> values) {
            addCriterion("familyPlanning in", values, "familyplanning");
            return (Criteria) this;
        }

        public Criteria andFamilyplanningNotIn(List<String> values) {
            addCriterion("familyPlanning not in", values, "familyplanning");
            return (Criteria) this;
        }

        public Criteria andFamilyplanningBetween(String value1, String value2) {
            addCriterion("familyPlanning between", value1, value2, "familyplanning");
            return (Criteria) this;
        }

        public Criteria andFamilyplanningNotBetween(String value1, String value2) {
            addCriterion("familyPlanning not between", value1, value2, "familyplanning");
            return (Criteria) this;
        }

        public Criteria andPovertyIsNull() {
            addCriterion("poverty is null");
            return (Criteria) this;
        }

        public Criteria andPovertyIsNotNull() {
            addCriterion("poverty is not null");
            return (Criteria) this;
        }

        public Criteria andPovertyEqualTo(String value) {
            addCriterion("poverty =", value, "poverty");
            return (Criteria) this;
        }

        public Criteria andPovertyNotEqualTo(String value) {
            addCriterion("poverty <>", value, "poverty");
            return (Criteria) this;
        }

        public Criteria andPovertyGreaterThan(String value) {
            addCriterion("poverty >", value, "poverty");
            return (Criteria) this;
        }

        public Criteria andPovertyGreaterThanOrEqualTo(String value) {
            addCriterion("poverty >=", value, "poverty");
            return (Criteria) this;
        }

        public Criteria andPovertyLessThan(String value) {
            addCriterion("poverty <", value, "poverty");
            return (Criteria) this;
        }

        public Criteria andPovertyLessThanOrEqualTo(String value) {
            addCriterion("poverty <=", value, "poverty");
            return (Criteria) this;
        }

        public Criteria andPovertyLike(String value) {
            addCriterion("poverty like", value, "poverty");
            return (Criteria) this;
        }

        public Criteria andPovertyNotLike(String value) {
            addCriterion("poverty not like", value, "poverty");
            return (Criteria) this;
        }

        public Criteria andPovertyIn(List<String> values) {
            addCriterion("poverty in", values, "poverty");
            return (Criteria) this;
        }

        public Criteria andPovertyNotIn(List<String> values) {
            addCriterion("poverty not in", values, "poverty");
            return (Criteria) this;
        }

        public Criteria andPovertyBetween(String value1, String value2) {
            addCriterion("poverty between", value1, value2, "poverty");
            return (Criteria) this;
        }

        public Criteria andPovertyNotBetween(String value1, String value2) {
            addCriterion("poverty not between", value1, value2, "poverty");
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