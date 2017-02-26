package com.bsoft.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GyIdentityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GyIdentityExample() {
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

        public Criteria andBmcIsNull() {
            addCriterion("BMC is null");
            return (Criteria) this;
        }

        public Criteria andBmcIsNotNull() {
            addCriterion("BMC is not null");
            return (Criteria) this;
        }

        public Criteria andBmcEqualTo(String value) {
            addCriterion("BMC =", value, "bmc");
            return (Criteria) this;
        }

        public Criteria andBmcNotEqualTo(String value) {
            addCriterion("BMC <>", value, "bmc");
            return (Criteria) this;
        }

        public Criteria andBmcGreaterThan(String value) {
            addCriterion("BMC >", value, "bmc");
            return (Criteria) this;
        }

        public Criteria andBmcGreaterThanOrEqualTo(String value) {
            addCriterion("BMC >=", value, "bmc");
            return (Criteria) this;
        }

        public Criteria andBmcLessThan(String value) {
            addCriterion("BMC <", value, "bmc");
            return (Criteria) this;
        }

        public Criteria andBmcLessThanOrEqualTo(String value) {
            addCriterion("BMC <=", value, "bmc");
            return (Criteria) this;
        }

        public Criteria andBmcLike(String value) {
            addCriterion("BMC like", value, "bmc");
            return (Criteria) this;
        }

        public Criteria andBmcNotLike(String value) {
            addCriterion("BMC not like", value, "bmc");
            return (Criteria) this;
        }

        public Criteria andBmcIn(List<String> values) {
            addCriterion("BMC in", values, "bmc");
            return (Criteria) this;
        }

        public Criteria andBmcNotIn(List<String> values) {
            addCriterion("BMC not in", values, "bmc");
            return (Criteria) this;
        }

        public Criteria andBmcBetween(String value1, String value2) {
            addCriterion("BMC between", value1, value2, "bmc");
            return (Criteria) this;
        }

        public Criteria andBmcNotBetween(String value1, String value2) {
            addCriterion("BMC not between", value1, value2, "bmc");
            return (Criteria) this;
        }

        public Criteria andDqzIsNull() {
            addCriterion("DQZ is null");
            return (Criteria) this;
        }

        public Criteria andDqzIsNotNull() {
            addCriterion("DQZ is not null");
            return (Criteria) this;
        }

        public Criteria andDqzEqualTo(Long value) {
            addCriterion("DQZ =", value, "dqz");
            return (Criteria) this;
        }

        public Criteria andDqzNotEqualTo(Long value) {
            addCriterion("DQZ <>", value, "dqz");
            return (Criteria) this;
        }

        public Criteria andDqzGreaterThan(Long value) {
            addCriterion("DQZ >", value, "dqz");
            return (Criteria) this;
        }

        public Criteria andDqzGreaterThanOrEqualTo(Long value) {
            addCriterion("DQZ >=", value, "dqz");
            return (Criteria) this;
        }

        public Criteria andDqzLessThan(Long value) {
            addCriterion("DQZ <", value, "dqz");
            return (Criteria) this;
        }

        public Criteria andDqzLessThanOrEqualTo(Long value) {
            addCriterion("DQZ <=", value, "dqz");
            return (Criteria) this;
        }

        public Criteria andDqzIn(List<Long> values) {
            addCriterion("DQZ in", values, "dqz");
            return (Criteria) this;
        }

        public Criteria andDqzNotIn(List<Long> values) {
            addCriterion("DQZ not in", values, "dqz");
            return (Criteria) this;
        }

        public Criteria andDqzBetween(Long value1, Long value2) {
            addCriterion("DQZ between", value1, value2, "dqz");
            return (Criteria) this;
        }

        public Criteria andDqzNotBetween(Long value1, Long value2) {
            addCriterion("DQZ not between", value1, value2, "dqz");
            return (Criteria) this;
        }

        public Criteria andCszIsNull() {
            addCriterion("CSZ is null");
            return (Criteria) this;
        }

        public Criteria andCszIsNotNull() {
            addCriterion("CSZ is not null");
            return (Criteria) this;
        }

        public Criteria andCszEqualTo(BigDecimal value) {
            addCriterion("CSZ =", value, "csz");
            return (Criteria) this;
        }

        public Criteria andCszNotEqualTo(BigDecimal value) {
            addCriterion("CSZ <>", value, "csz");
            return (Criteria) this;
        }

        public Criteria andCszGreaterThan(BigDecimal value) {
            addCriterion("CSZ >", value, "csz");
            return (Criteria) this;
        }

        public Criteria andCszGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CSZ >=", value, "csz");
            return (Criteria) this;
        }

        public Criteria andCszLessThan(BigDecimal value) {
            addCriterion("CSZ <", value, "csz");
            return (Criteria) this;
        }

        public Criteria andCszLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CSZ <=", value, "csz");
            return (Criteria) this;
        }

        public Criteria andCszIn(List<BigDecimal> values) {
            addCriterion("CSZ in", values, "csz");
            return (Criteria) this;
        }

        public Criteria andCszNotIn(List<BigDecimal> values) {
            addCriterion("CSZ not in", values, "csz");
            return (Criteria) this;
        }

        public Criteria andCszBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSZ between", value1, value2, "csz");
            return (Criteria) this;
        }

        public Criteria andCszNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSZ not between", value1, value2, "csz");
            return (Criteria) this;
        }

        public Criteria andDzzIsNull() {
            addCriterion("DZZ is null");
            return (Criteria) this;
        }

        public Criteria andDzzIsNotNull() {
            addCriterion("DZZ is not null");
            return (Criteria) this;
        }

        public Criteria andDzzEqualTo(BigDecimal value) {
            addCriterion("DZZ =", value, "dzz");
            return (Criteria) this;
        }

        public Criteria andDzzNotEqualTo(BigDecimal value) {
            addCriterion("DZZ <>", value, "dzz");
            return (Criteria) this;
        }

        public Criteria andDzzGreaterThan(BigDecimal value) {
            addCriterion("DZZ >", value, "dzz");
            return (Criteria) this;
        }

        public Criteria andDzzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DZZ >=", value, "dzz");
            return (Criteria) this;
        }

        public Criteria andDzzLessThan(BigDecimal value) {
            addCriterion("DZZ <", value, "dzz");
            return (Criteria) this;
        }

        public Criteria andDzzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DZZ <=", value, "dzz");
            return (Criteria) this;
        }

        public Criteria andDzzIn(List<BigDecimal> values) {
            addCriterion("DZZ in", values, "dzz");
            return (Criteria) this;
        }

        public Criteria andDzzNotIn(List<BigDecimal> values) {
            addCriterion("DZZ not in", values, "dzz");
            return (Criteria) this;
        }

        public Criteria andDzzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DZZ between", value1, value2, "dzz");
            return (Criteria) this;
        }

        public Criteria andDzzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DZZ not between", value1, value2, "dzz");
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