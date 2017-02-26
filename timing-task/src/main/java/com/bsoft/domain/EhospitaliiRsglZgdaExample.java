package com.bsoft.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EhospitaliiRsglZgdaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EhospitaliiRsglZgdaExample() {
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

        public Criteria andZgidIsNull() {
            addCriterion("ZGID is null");
            return (Criteria) this;
        }

        public Criteria andZgidIsNotNull() {
            addCriterion("ZGID is not null");
            return (Criteria) this;
        }

        public Criteria andZgidEqualTo(String value) {
            addCriterion("ZGID =", value, "zgid");
            return (Criteria) this;
        }

        public Criteria andZgidNotEqualTo(String value) {
            addCriterion("ZGID <>", value, "zgid");
            return (Criteria) this;
        }

        public Criteria andZgidGreaterThan(String value) {
            addCriterion("ZGID >", value, "zgid");
            return (Criteria) this;
        }

        public Criteria andZgidGreaterThanOrEqualTo(String value) {
            addCriterion("ZGID >=", value, "zgid");
            return (Criteria) this;
        }

        public Criteria andZgidLessThan(String value) {
            addCriterion("ZGID <", value, "zgid");
            return (Criteria) this;
        }

        public Criteria andZgidLessThanOrEqualTo(String value) {
            addCriterion("ZGID <=", value, "zgid");
            return (Criteria) this;
        }

        public Criteria andZgidLike(String value) {
            addCriterion("ZGID like", value, "zgid");
            return (Criteria) this;
        }

        public Criteria andZgidNotLike(String value) {
            addCriterion("ZGID not like", value, "zgid");
            return (Criteria) this;
        }

        public Criteria andZgidIn(List<String> values) {
            addCriterion("ZGID in", values, "zgid");
            return (Criteria) this;
        }

        public Criteria andZgidNotIn(List<String> values) {
            addCriterion("ZGID not in", values, "zgid");
            return (Criteria) this;
        }

        public Criteria andZgidBetween(String value1, String value2) {
            addCriterion("ZGID between", value1, value2, "zgid");
            return (Criteria) this;
        }

        public Criteria andZgidNotBetween(String value1, String value2) {
            addCriterion("ZGID not between", value1, value2, "zgid");
            return (Criteria) this;
        }

        public Criteria andZgghIsNull() {
            addCriterion("ZGGH is null");
            return (Criteria) this;
        }

        public Criteria andZgghIsNotNull() {
            addCriterion("ZGGH is not null");
            return (Criteria) this;
        }

        public Criteria andZgghEqualTo(String value) {
            addCriterion("ZGGH =", value, "zggh");
            return (Criteria) this;
        }

        public Criteria andZgghNotEqualTo(String value) {
            addCriterion("ZGGH <>", value, "zggh");
            return (Criteria) this;
        }

        public Criteria andZgghGreaterThan(String value) {
            addCriterion("ZGGH >", value, "zggh");
            return (Criteria) this;
        }

        public Criteria andZgghGreaterThanOrEqualTo(String value) {
            addCriterion("ZGGH >=", value, "zggh");
            return (Criteria) this;
        }

        public Criteria andZgghLessThan(String value) {
            addCriterion("ZGGH <", value, "zggh");
            return (Criteria) this;
        }

        public Criteria andZgghLessThanOrEqualTo(String value) {
            addCriterion("ZGGH <=", value, "zggh");
            return (Criteria) this;
        }

        public Criteria andZgghLike(String value) {
            addCriterion("ZGGH like", value, "zggh");
            return (Criteria) this;
        }

        public Criteria andZgghNotLike(String value) {
            addCriterion("ZGGH not like", value, "zggh");
            return (Criteria) this;
        }

        public Criteria andZgghIn(List<String> values) {
            addCriterion("ZGGH in", values, "zggh");
            return (Criteria) this;
        }

        public Criteria andZgghNotIn(List<String> values) {
            addCriterion("ZGGH not in", values, "zggh");
            return (Criteria) this;
        }

        public Criteria andZgghBetween(String value1, String value2) {
            addCriterion("ZGGH between", value1, value2, "zggh");
            return (Criteria) this;
        }

        public Criteria andZgghNotBetween(String value1, String value2) {
            addCriterion("ZGGH not between", value1, value2, "zggh");
            return (Criteria) this;
        }

        public Criteria andXmIsNull() {
            addCriterion("XM is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("XM is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("XM =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("XM <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("XM >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("XM >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("XM <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("XM <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("XM like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("XM not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("XM in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("XM not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("XM between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("XM not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXbIsNull() {
            addCriterion("XB is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("XB is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(String value) {
            addCriterion("XB =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(String value) {
            addCriterion("XB <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(String value) {
            addCriterion("XB >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(String value) {
            addCriterion("XB >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(String value) {
            addCriterion("XB <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(String value) {
            addCriterion("XB <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLike(String value) {
            addCriterion("XB like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotLike(String value) {
            addCriterion("XB not like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<String> values) {
            addCriterion("XB in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<String> values) {
            addCriterion("XB not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(String value1, String value2) {
            addCriterion("XB between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(String value1, String value2) {
            addCriterion("XB not between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andSrm1IsNull() {
            addCriterion("SRM1 is null");
            return (Criteria) this;
        }

        public Criteria andSrm1IsNotNull() {
            addCriterion("SRM1 is not null");
            return (Criteria) this;
        }

        public Criteria andSrm1EqualTo(String value) {
            addCriterion("SRM1 =", value, "srm1");
            return (Criteria) this;
        }

        public Criteria andSrm1NotEqualTo(String value) {
            addCriterion("SRM1 <>", value, "srm1");
            return (Criteria) this;
        }

        public Criteria andSrm1GreaterThan(String value) {
            addCriterion("SRM1 >", value, "srm1");
            return (Criteria) this;
        }

        public Criteria andSrm1GreaterThanOrEqualTo(String value) {
            addCriterion("SRM1 >=", value, "srm1");
            return (Criteria) this;
        }

        public Criteria andSrm1LessThan(String value) {
            addCriterion("SRM1 <", value, "srm1");
            return (Criteria) this;
        }

        public Criteria andSrm1LessThanOrEqualTo(String value) {
            addCriterion("SRM1 <=", value, "srm1");
            return (Criteria) this;
        }

        public Criteria andSrm1Like(String value) {
            addCriterion("SRM1 like", value, "srm1");
            return (Criteria) this;
        }

        public Criteria andSrm1NotLike(String value) {
            addCriterion("SRM1 not like", value, "srm1");
            return (Criteria) this;
        }

        public Criteria andSrm1In(List<String> values) {
            addCriterion("SRM1 in", values, "srm1");
            return (Criteria) this;
        }

        public Criteria andSrm1NotIn(List<String> values) {
            addCriterion("SRM1 not in", values, "srm1");
            return (Criteria) this;
        }

        public Criteria andSrm1Between(String value1, String value2) {
            addCriterion("SRM1 between", value1, value2, "srm1");
            return (Criteria) this;
        }

        public Criteria andSrm1NotBetween(String value1, String value2) {
            addCriterion("SRM1 not between", value1, value2, "srm1");
            return (Criteria) this;
        }

        public Criteria andDhdhIsNull() {
            addCriterion("DHDH is null");
            return (Criteria) this;
        }

        public Criteria andDhdhIsNotNull() {
            addCriterion("DHDH is not null");
            return (Criteria) this;
        }

        public Criteria andDhdhEqualTo(String value) {
            addCriterion("DHDH =", value, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhNotEqualTo(String value) {
            addCriterion("DHDH <>", value, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhGreaterThan(String value) {
            addCriterion("DHDH >", value, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhGreaterThanOrEqualTo(String value) {
            addCriterion("DHDH >=", value, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhLessThan(String value) {
            addCriterion("DHDH <", value, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhLessThanOrEqualTo(String value) {
            addCriterion("DHDH <=", value, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhLike(String value) {
            addCriterion("DHDH like", value, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhNotLike(String value) {
            addCriterion("DHDH not like", value, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhIn(List<String> values) {
            addCriterion("DHDH in", values, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhNotIn(List<String> values) {
            addCriterion("DHDH not in", values, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhBetween(String value1, String value2) {
            addCriterion("DHDH between", value1, value2, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhNotBetween(String value1, String value2) {
            addCriterion("DHDH not between", value1, value2, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhqhIsNull() {
            addCriterion("DHQH is null");
            return (Criteria) this;
        }

        public Criteria andDhqhIsNotNull() {
            addCriterion("DHQH is not null");
            return (Criteria) this;
        }

        public Criteria andDhqhEqualTo(String value) {
            addCriterion("DHQH =", value, "dhqh");
            return (Criteria) this;
        }

        public Criteria andDhqhNotEqualTo(String value) {
            addCriterion("DHQH <>", value, "dhqh");
            return (Criteria) this;
        }

        public Criteria andDhqhGreaterThan(String value) {
            addCriterion("DHQH >", value, "dhqh");
            return (Criteria) this;
        }

        public Criteria andDhqhGreaterThanOrEqualTo(String value) {
            addCriterion("DHQH >=", value, "dhqh");
            return (Criteria) this;
        }

        public Criteria andDhqhLessThan(String value) {
            addCriterion("DHQH <", value, "dhqh");
            return (Criteria) this;
        }

        public Criteria andDhqhLessThanOrEqualTo(String value) {
            addCriterion("DHQH <=", value, "dhqh");
            return (Criteria) this;
        }

        public Criteria andDhqhLike(String value) {
            addCriterion("DHQH like", value, "dhqh");
            return (Criteria) this;
        }

        public Criteria andDhqhNotLike(String value) {
            addCriterion("DHQH not like", value, "dhqh");
            return (Criteria) this;
        }

        public Criteria andDhqhIn(List<String> values) {
            addCriterion("DHQH in", values, "dhqh");
            return (Criteria) this;
        }

        public Criteria andDhqhNotIn(List<String> values) {
            addCriterion("DHQH not in", values, "dhqh");
            return (Criteria) this;
        }

        public Criteria andDhqhBetween(String value1, String value2) {
            addCriterion("DHQH between", value1, value2, "dhqh");
            return (Criteria) this;
        }

        public Criteria andDhqhNotBetween(String value1, String value2) {
            addCriterion("DHQH not between", value1, value2, "dhqh");
            return (Criteria) this;
        }

        public Criteria andKsidIsNull() {
            addCriterion("KSID is null");
            return (Criteria) this;
        }

        public Criteria andKsidIsNotNull() {
            addCriterion("KSID is not null");
            return (Criteria) this;
        }

        public Criteria andKsidEqualTo(String value) {
            addCriterion("KSID =", value, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidNotEqualTo(String value) {
            addCriterion("KSID <>", value, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidGreaterThan(String value) {
            addCriterion("KSID >", value, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidGreaterThanOrEqualTo(String value) {
            addCriterion("KSID >=", value, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidLessThan(String value) {
            addCriterion("KSID <", value, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidLessThanOrEqualTo(String value) {
            addCriterion("KSID <=", value, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidLike(String value) {
            addCriterion("KSID like", value, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidNotLike(String value) {
            addCriterion("KSID not like", value, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidIn(List<String> values) {
            addCriterion("KSID in", values, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidNotIn(List<String> values) {
            addCriterion("KSID not in", values, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidBetween(String value1, String value2) {
            addCriterion("KSID between", value1, value2, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidNotBetween(String value1, String value2) {
            addCriterion("KSID not between", value1, value2, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsdmIsNull() {
            addCriterion("KSDM is null");
            return (Criteria) this;
        }

        public Criteria andKsdmIsNotNull() {
            addCriterion("KSDM is not null");
            return (Criteria) this;
        }

        public Criteria andKsdmEqualTo(String value) {
            addCriterion("KSDM =", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmNotEqualTo(String value) {
            addCriterion("KSDM <>", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmGreaterThan(String value) {
            addCriterion("KSDM >", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmGreaterThanOrEqualTo(String value) {
            addCriterion("KSDM >=", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmLessThan(String value) {
            addCriterion("KSDM <", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmLessThanOrEqualTo(String value) {
            addCriterion("KSDM <=", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmLike(String value) {
            addCriterion("KSDM like", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmNotLike(String value) {
            addCriterion("KSDM not like", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmIn(List<String> values) {
            addCriterion("KSDM in", values, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmNotIn(List<String> values) {
            addCriterion("KSDM not in", values, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmBetween(String value1, String value2) {
            addCriterion("KSDM between", value1, value2, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmNotBetween(String value1, String value2) {
            addCriterion("KSDM not between", value1, value2, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsmcIsNull() {
            addCriterion("KSMC is null");
            return (Criteria) this;
        }

        public Criteria andKsmcIsNotNull() {
            addCriterion("KSMC is not null");
            return (Criteria) this;
        }

        public Criteria andKsmcEqualTo(String value) {
            addCriterion("KSMC =", value, "ksmc");
            return (Criteria) this;
        }

        public Criteria andKsmcNotEqualTo(String value) {
            addCriterion("KSMC <>", value, "ksmc");
            return (Criteria) this;
        }

        public Criteria andKsmcGreaterThan(String value) {
            addCriterion("KSMC >", value, "ksmc");
            return (Criteria) this;
        }

        public Criteria andKsmcGreaterThanOrEqualTo(String value) {
            addCriterion("KSMC >=", value, "ksmc");
            return (Criteria) this;
        }

        public Criteria andKsmcLessThan(String value) {
            addCriterion("KSMC <", value, "ksmc");
            return (Criteria) this;
        }

        public Criteria andKsmcLessThanOrEqualTo(String value) {
            addCriterion("KSMC <=", value, "ksmc");
            return (Criteria) this;
        }

        public Criteria andKsmcLike(String value) {
            addCriterion("KSMC like", value, "ksmc");
            return (Criteria) this;
        }

        public Criteria andKsmcNotLike(String value) {
            addCriterion("KSMC not like", value, "ksmc");
            return (Criteria) this;
        }

        public Criteria andKsmcIn(List<String> values) {
            addCriterion("KSMC in", values, "ksmc");
            return (Criteria) this;
        }

        public Criteria andKsmcNotIn(List<String> values) {
            addCriterion("KSMC not in", values, "ksmc");
            return (Criteria) this;
        }

        public Criteria andKsmcBetween(String value1, String value2) {
            addCriterion("KSMC between", value1, value2, "ksmc");
            return (Criteria) this;
        }

        public Criteria andKsmcNotBetween(String value1, String value2) {
            addCriterion("KSMC not between", value1, value2, "ksmc");
            return (Criteria) this;
        }

        public Criteria andZyksidIsNull() {
            addCriterion("ZYKSID is null");
            return (Criteria) this;
        }

        public Criteria andZyksidIsNotNull() {
            addCriterion("ZYKSID is not null");
            return (Criteria) this;
        }

        public Criteria andZyksidEqualTo(String value) {
            addCriterion("ZYKSID =", value, "zyksid");
            return (Criteria) this;
        }

        public Criteria andZyksidNotEqualTo(String value) {
            addCriterion("ZYKSID <>", value, "zyksid");
            return (Criteria) this;
        }

        public Criteria andZyksidGreaterThan(String value) {
            addCriterion("ZYKSID >", value, "zyksid");
            return (Criteria) this;
        }

        public Criteria andZyksidGreaterThanOrEqualTo(String value) {
            addCriterion("ZYKSID >=", value, "zyksid");
            return (Criteria) this;
        }

        public Criteria andZyksidLessThan(String value) {
            addCriterion("ZYKSID <", value, "zyksid");
            return (Criteria) this;
        }

        public Criteria andZyksidLessThanOrEqualTo(String value) {
            addCriterion("ZYKSID <=", value, "zyksid");
            return (Criteria) this;
        }

        public Criteria andZyksidLike(String value) {
            addCriterion("ZYKSID like", value, "zyksid");
            return (Criteria) this;
        }

        public Criteria andZyksidNotLike(String value) {
            addCriterion("ZYKSID not like", value, "zyksid");
            return (Criteria) this;
        }

        public Criteria andZyksidIn(List<String> values) {
            addCriterion("ZYKSID in", values, "zyksid");
            return (Criteria) this;
        }

        public Criteria andZyksidNotIn(List<String> values) {
            addCriterion("ZYKSID not in", values, "zyksid");
            return (Criteria) this;
        }

        public Criteria andZyksidBetween(String value1, String value2) {
            addCriterion("ZYKSID between", value1, value2, "zyksid");
            return (Criteria) this;
        }

        public Criteria andZyksidNotBetween(String value1, String value2) {
            addCriterion("ZYKSID not between", value1, value2, "zyksid");
            return (Criteria) this;
        }

        public Criteria andZyksdmIsNull() {
            addCriterion("ZYKSDM is null");
            return (Criteria) this;
        }

        public Criteria andZyksdmIsNotNull() {
            addCriterion("ZYKSDM is not null");
            return (Criteria) this;
        }

        public Criteria andZyksdmEqualTo(String value) {
            addCriterion("ZYKSDM =", value, "zyksdm");
            return (Criteria) this;
        }

        public Criteria andZyksdmNotEqualTo(String value) {
            addCriterion("ZYKSDM <>", value, "zyksdm");
            return (Criteria) this;
        }

        public Criteria andZyksdmGreaterThan(String value) {
            addCriterion("ZYKSDM >", value, "zyksdm");
            return (Criteria) this;
        }

        public Criteria andZyksdmGreaterThanOrEqualTo(String value) {
            addCriterion("ZYKSDM >=", value, "zyksdm");
            return (Criteria) this;
        }

        public Criteria andZyksdmLessThan(String value) {
            addCriterion("ZYKSDM <", value, "zyksdm");
            return (Criteria) this;
        }

        public Criteria andZyksdmLessThanOrEqualTo(String value) {
            addCriterion("ZYKSDM <=", value, "zyksdm");
            return (Criteria) this;
        }

        public Criteria andZyksdmLike(String value) {
            addCriterion("ZYKSDM like", value, "zyksdm");
            return (Criteria) this;
        }

        public Criteria andZyksdmNotLike(String value) {
            addCriterion("ZYKSDM not like", value, "zyksdm");
            return (Criteria) this;
        }

        public Criteria andZyksdmIn(List<String> values) {
            addCriterion("ZYKSDM in", values, "zyksdm");
            return (Criteria) this;
        }

        public Criteria andZyksdmNotIn(List<String> values) {
            addCriterion("ZYKSDM not in", values, "zyksdm");
            return (Criteria) this;
        }

        public Criteria andZyksdmBetween(String value1, String value2) {
            addCriterion("ZYKSDM between", value1, value2, "zyksdm");
            return (Criteria) this;
        }

        public Criteria andZyksdmNotBetween(String value1, String value2) {
            addCriterion("ZYKSDM not between", value1, value2, "zyksdm");
            return (Criteria) this;
        }

        public Criteria andZyksmcIsNull() {
            addCriterion("ZYKSMC is null");
            return (Criteria) this;
        }

        public Criteria andZyksmcIsNotNull() {
            addCriterion("ZYKSMC is not null");
            return (Criteria) this;
        }

        public Criteria andZyksmcEqualTo(String value) {
            addCriterion("ZYKSMC =", value, "zyksmc");
            return (Criteria) this;
        }

        public Criteria andZyksmcNotEqualTo(String value) {
            addCriterion("ZYKSMC <>", value, "zyksmc");
            return (Criteria) this;
        }

        public Criteria andZyksmcGreaterThan(String value) {
            addCriterion("ZYKSMC >", value, "zyksmc");
            return (Criteria) this;
        }

        public Criteria andZyksmcGreaterThanOrEqualTo(String value) {
            addCriterion("ZYKSMC >=", value, "zyksmc");
            return (Criteria) this;
        }

        public Criteria andZyksmcLessThan(String value) {
            addCriterion("ZYKSMC <", value, "zyksmc");
            return (Criteria) this;
        }

        public Criteria andZyksmcLessThanOrEqualTo(String value) {
            addCriterion("ZYKSMC <=", value, "zyksmc");
            return (Criteria) this;
        }

        public Criteria andZyksmcLike(String value) {
            addCriterion("ZYKSMC like", value, "zyksmc");
            return (Criteria) this;
        }

        public Criteria andZyksmcNotLike(String value) {
            addCriterion("ZYKSMC not like", value, "zyksmc");
            return (Criteria) this;
        }

        public Criteria andZyksmcIn(List<String> values) {
            addCriterion("ZYKSMC in", values, "zyksmc");
            return (Criteria) this;
        }

        public Criteria andZyksmcNotIn(List<String> values) {
            addCriterion("ZYKSMC not in", values, "zyksmc");
            return (Criteria) this;
        }

        public Criteria andZyksmcBetween(String value1, String value2) {
            addCriterion("ZYKSMC between", value1, value2, "zyksmc");
            return (Criteria) this;
        }

        public Criteria andZyksmcNotBetween(String value1, String value2) {
            addCriterion("ZYKSMC not between", value1, value2, "zyksmc");
            return (Criteria) this;
        }

        public Criteria andZgflIsNull() {
            addCriterion("ZGFL is null");
            return (Criteria) this;
        }

        public Criteria andZgflIsNotNull() {
            addCriterion("ZGFL is not null");
            return (Criteria) this;
        }

        public Criteria andZgflEqualTo(String value) {
            addCriterion("ZGFL =", value, "zgfl");
            return (Criteria) this;
        }

        public Criteria andZgflNotEqualTo(String value) {
            addCriterion("ZGFL <>", value, "zgfl");
            return (Criteria) this;
        }

        public Criteria andZgflGreaterThan(String value) {
            addCriterion("ZGFL >", value, "zgfl");
            return (Criteria) this;
        }

        public Criteria andZgflGreaterThanOrEqualTo(String value) {
            addCriterion("ZGFL >=", value, "zgfl");
            return (Criteria) this;
        }

        public Criteria andZgflLessThan(String value) {
            addCriterion("ZGFL <", value, "zgfl");
            return (Criteria) this;
        }

        public Criteria andZgflLessThanOrEqualTo(String value) {
            addCriterion("ZGFL <=", value, "zgfl");
            return (Criteria) this;
        }

        public Criteria andZgflLike(String value) {
            addCriterion("ZGFL like", value, "zgfl");
            return (Criteria) this;
        }

        public Criteria andZgflNotLike(String value) {
            addCriterion("ZGFL not like", value, "zgfl");
            return (Criteria) this;
        }

        public Criteria andZgflIn(List<String> values) {
            addCriterion("ZGFL in", values, "zgfl");
            return (Criteria) this;
        }

        public Criteria andZgflNotIn(List<String> values) {
            addCriterion("ZGFL not in", values, "zgfl");
            return (Criteria) this;
        }

        public Criteria andZgflBetween(String value1, String value2) {
            addCriterion("ZGFL between", value1, value2, "zgfl");
            return (Criteria) this;
        }

        public Criteria andZgflNotBetween(String value1, String value2) {
            addCriterion("ZGFL not between", value1, value2, "zgfl");
            return (Criteria) this;
        }

        public Criteria andZgflmcIsNull() {
            addCriterion("ZGFLMC is null");
            return (Criteria) this;
        }

        public Criteria andZgflmcIsNotNull() {
            addCriterion("ZGFLMC is not null");
            return (Criteria) this;
        }

        public Criteria andZgflmcEqualTo(String value) {
            addCriterion("ZGFLMC =", value, "zgflmc");
            return (Criteria) this;
        }

        public Criteria andZgflmcNotEqualTo(String value) {
            addCriterion("ZGFLMC <>", value, "zgflmc");
            return (Criteria) this;
        }

        public Criteria andZgflmcGreaterThan(String value) {
            addCriterion("ZGFLMC >", value, "zgflmc");
            return (Criteria) this;
        }

        public Criteria andZgflmcGreaterThanOrEqualTo(String value) {
            addCriterion("ZGFLMC >=", value, "zgflmc");
            return (Criteria) this;
        }

        public Criteria andZgflmcLessThan(String value) {
            addCriterion("ZGFLMC <", value, "zgflmc");
            return (Criteria) this;
        }

        public Criteria andZgflmcLessThanOrEqualTo(String value) {
            addCriterion("ZGFLMC <=", value, "zgflmc");
            return (Criteria) this;
        }

        public Criteria andZgflmcLike(String value) {
            addCriterion("ZGFLMC like", value, "zgflmc");
            return (Criteria) this;
        }

        public Criteria andZgflmcNotLike(String value) {
            addCriterion("ZGFLMC not like", value, "zgflmc");
            return (Criteria) this;
        }

        public Criteria andZgflmcIn(List<String> values) {
            addCriterion("ZGFLMC in", values, "zgflmc");
            return (Criteria) this;
        }

        public Criteria andZgflmcNotIn(List<String> values) {
            addCriterion("ZGFLMC not in", values, "zgflmc");
            return (Criteria) this;
        }

        public Criteria andZgflmcBetween(String value1, String value2) {
            addCriterion("ZGFLMC between", value1, value2, "zgflmc");
            return (Criteria) this;
        }

        public Criteria andZgflmcNotBetween(String value1, String value2) {
            addCriterion("ZGFLMC not between", value1, value2, "zgflmc");
            return (Criteria) this;
        }

        public Criteria andRyxzIsNull() {
            addCriterion("RYXZ is null");
            return (Criteria) this;
        }

        public Criteria andRyxzIsNotNull() {
            addCriterion("RYXZ is not null");
            return (Criteria) this;
        }

        public Criteria andRyxzEqualTo(String value) {
            addCriterion("RYXZ =", value, "ryxz");
            return (Criteria) this;
        }

        public Criteria andRyxzNotEqualTo(String value) {
            addCriterion("RYXZ <>", value, "ryxz");
            return (Criteria) this;
        }

        public Criteria andRyxzGreaterThan(String value) {
            addCriterion("RYXZ >", value, "ryxz");
            return (Criteria) this;
        }

        public Criteria andRyxzGreaterThanOrEqualTo(String value) {
            addCriterion("RYXZ >=", value, "ryxz");
            return (Criteria) this;
        }

        public Criteria andRyxzLessThan(String value) {
            addCriterion("RYXZ <", value, "ryxz");
            return (Criteria) this;
        }

        public Criteria andRyxzLessThanOrEqualTo(String value) {
            addCriterion("RYXZ <=", value, "ryxz");
            return (Criteria) this;
        }

        public Criteria andRyxzLike(String value) {
            addCriterion("RYXZ like", value, "ryxz");
            return (Criteria) this;
        }

        public Criteria andRyxzNotLike(String value) {
            addCriterion("RYXZ not like", value, "ryxz");
            return (Criteria) this;
        }

        public Criteria andRyxzIn(List<String> values) {
            addCriterion("RYXZ in", values, "ryxz");
            return (Criteria) this;
        }

        public Criteria andRyxzNotIn(List<String> values) {
            addCriterion("RYXZ not in", values, "ryxz");
            return (Criteria) this;
        }

        public Criteria andRyxzBetween(String value1, String value2) {
            addCriterion("RYXZ between", value1, value2, "ryxz");
            return (Criteria) this;
        }

        public Criteria andRyxzNotBetween(String value1, String value2) {
            addCriterion("RYXZ not between", value1, value2, "ryxz");
            return (Criteria) this;
        }

        public Criteria andRyxzmcIsNull() {
            addCriterion("RYXZMC is null");
            return (Criteria) this;
        }

        public Criteria andRyxzmcIsNotNull() {
            addCriterion("RYXZMC is not null");
            return (Criteria) this;
        }

        public Criteria andRyxzmcEqualTo(String value) {
            addCriterion("RYXZMC =", value, "ryxzmc");
            return (Criteria) this;
        }

        public Criteria andRyxzmcNotEqualTo(String value) {
            addCriterion("RYXZMC <>", value, "ryxzmc");
            return (Criteria) this;
        }

        public Criteria andRyxzmcGreaterThan(String value) {
            addCriterion("RYXZMC >", value, "ryxzmc");
            return (Criteria) this;
        }

        public Criteria andRyxzmcGreaterThanOrEqualTo(String value) {
            addCriterion("RYXZMC >=", value, "ryxzmc");
            return (Criteria) this;
        }

        public Criteria andRyxzmcLessThan(String value) {
            addCriterion("RYXZMC <", value, "ryxzmc");
            return (Criteria) this;
        }

        public Criteria andRyxzmcLessThanOrEqualTo(String value) {
            addCriterion("RYXZMC <=", value, "ryxzmc");
            return (Criteria) this;
        }

        public Criteria andRyxzmcLike(String value) {
            addCriterion("RYXZMC like", value, "ryxzmc");
            return (Criteria) this;
        }

        public Criteria andRyxzmcNotLike(String value) {
            addCriterion("RYXZMC not like", value, "ryxzmc");
            return (Criteria) this;
        }

        public Criteria andRyxzmcIn(List<String> values) {
            addCriterion("RYXZMC in", values, "ryxzmc");
            return (Criteria) this;
        }

        public Criteria andRyxzmcNotIn(List<String> values) {
            addCriterion("RYXZMC not in", values, "ryxzmc");
            return (Criteria) this;
        }

        public Criteria andRyxzmcBetween(String value1, String value2) {
            addCriterion("RYXZMC between", value1, value2, "ryxzmc");
            return (Criteria) this;
        }

        public Criteria andRyxzmcNotBetween(String value1, String value2) {
            addCriterion("RYXZMC not between", value1, value2, "ryxzmc");
            return (Criteria) this;
        }

        public Criteria andZcIsNull() {
            addCriterion("ZC is null");
            return (Criteria) this;
        }

        public Criteria andZcIsNotNull() {
            addCriterion("ZC is not null");
            return (Criteria) this;
        }

        public Criteria andZcEqualTo(String value) {
            addCriterion("ZC =", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcNotEqualTo(String value) {
            addCriterion("ZC <>", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcGreaterThan(String value) {
            addCriterion("ZC >", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcGreaterThanOrEqualTo(String value) {
            addCriterion("ZC >=", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcLessThan(String value) {
            addCriterion("ZC <", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcLessThanOrEqualTo(String value) {
            addCriterion("ZC <=", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcLike(String value) {
            addCriterion("ZC like", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcNotLike(String value) {
            addCriterion("ZC not like", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcIn(List<String> values) {
            addCriterion("ZC in", values, "zc");
            return (Criteria) this;
        }

        public Criteria andZcNotIn(List<String> values) {
            addCriterion("ZC not in", values, "zc");
            return (Criteria) this;
        }

        public Criteria andZcBetween(String value1, String value2) {
            addCriterion("ZC between", value1, value2, "zc");
            return (Criteria) this;
        }

        public Criteria andZcNotBetween(String value1, String value2) {
            addCriterion("ZC not between", value1, value2, "zc");
            return (Criteria) this;
        }

        public Criteria andZcmcIsNull() {
            addCriterion("ZCMC is null");
            return (Criteria) this;
        }

        public Criteria andZcmcIsNotNull() {
            addCriterion("ZCMC is not null");
            return (Criteria) this;
        }

        public Criteria andZcmcEqualTo(String value) {
            addCriterion("ZCMC =", value, "zcmc");
            return (Criteria) this;
        }

        public Criteria andZcmcNotEqualTo(String value) {
            addCriterion("ZCMC <>", value, "zcmc");
            return (Criteria) this;
        }

        public Criteria andZcmcGreaterThan(String value) {
            addCriterion("ZCMC >", value, "zcmc");
            return (Criteria) this;
        }

        public Criteria andZcmcGreaterThanOrEqualTo(String value) {
            addCriterion("ZCMC >=", value, "zcmc");
            return (Criteria) this;
        }

        public Criteria andZcmcLessThan(String value) {
            addCriterion("ZCMC <", value, "zcmc");
            return (Criteria) this;
        }

        public Criteria andZcmcLessThanOrEqualTo(String value) {
            addCriterion("ZCMC <=", value, "zcmc");
            return (Criteria) this;
        }

        public Criteria andZcmcLike(String value) {
            addCriterion("ZCMC like", value, "zcmc");
            return (Criteria) this;
        }

        public Criteria andZcmcNotLike(String value) {
            addCriterion("ZCMC not like", value, "zcmc");
            return (Criteria) this;
        }

        public Criteria andZcmcIn(List<String> values) {
            addCriterion("ZCMC in", values, "zcmc");
            return (Criteria) this;
        }

        public Criteria andZcmcNotIn(List<String> values) {
            addCriterion("ZCMC not in", values, "zcmc");
            return (Criteria) this;
        }

        public Criteria andZcmcBetween(String value1, String value2) {
            addCriterion("ZCMC between", value1, value2, "zcmc");
            return (Criteria) this;
        }

        public Criteria andZcmcNotBetween(String value1, String value2) {
            addCriterion("ZCMC not between", value1, value2, "zcmc");
            return (Criteria) this;
        }

        public Criteria andZwIsNull() {
            addCriterion("ZW is null");
            return (Criteria) this;
        }

        public Criteria andZwIsNotNull() {
            addCriterion("ZW is not null");
            return (Criteria) this;
        }

        public Criteria andZwEqualTo(String value) {
            addCriterion("ZW =", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotEqualTo(String value) {
            addCriterion("ZW <>", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwGreaterThan(String value) {
            addCriterion("ZW >", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwGreaterThanOrEqualTo(String value) {
            addCriterion("ZW >=", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLessThan(String value) {
            addCriterion("ZW <", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLessThanOrEqualTo(String value) {
            addCriterion("ZW <=", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLike(String value) {
            addCriterion("ZW like", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotLike(String value) {
            addCriterion("ZW not like", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwIn(List<String> values) {
            addCriterion("ZW in", values, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotIn(List<String> values) {
            addCriterion("ZW not in", values, "zw");
            return (Criteria) this;
        }

        public Criteria andZwBetween(String value1, String value2) {
            addCriterion("ZW between", value1, value2, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotBetween(String value1, String value2) {
            addCriterion("ZW not between", value1, value2, "zw");
            return (Criteria) this;
        }

        public Criteria andZwmcIsNull() {
            addCriterion("ZWMC is null");
            return (Criteria) this;
        }

        public Criteria andZwmcIsNotNull() {
            addCriterion("ZWMC is not null");
            return (Criteria) this;
        }

        public Criteria andZwmcEqualTo(String value) {
            addCriterion("ZWMC =", value, "zwmc");
            return (Criteria) this;
        }

        public Criteria andZwmcNotEqualTo(String value) {
            addCriterion("ZWMC <>", value, "zwmc");
            return (Criteria) this;
        }

        public Criteria andZwmcGreaterThan(String value) {
            addCriterion("ZWMC >", value, "zwmc");
            return (Criteria) this;
        }

        public Criteria andZwmcGreaterThanOrEqualTo(String value) {
            addCriterion("ZWMC >=", value, "zwmc");
            return (Criteria) this;
        }

        public Criteria andZwmcLessThan(String value) {
            addCriterion("ZWMC <", value, "zwmc");
            return (Criteria) this;
        }

        public Criteria andZwmcLessThanOrEqualTo(String value) {
            addCriterion("ZWMC <=", value, "zwmc");
            return (Criteria) this;
        }

        public Criteria andZwmcLike(String value) {
            addCriterion("ZWMC like", value, "zwmc");
            return (Criteria) this;
        }

        public Criteria andZwmcNotLike(String value) {
            addCriterion("ZWMC not like", value, "zwmc");
            return (Criteria) this;
        }

        public Criteria andZwmcIn(List<String> values) {
            addCriterion("ZWMC in", values, "zwmc");
            return (Criteria) this;
        }

        public Criteria andZwmcNotIn(List<String> values) {
            addCriterion("ZWMC not in", values, "zwmc");
            return (Criteria) this;
        }

        public Criteria andZwmcBetween(String value1, String value2) {
            addCriterion("ZWMC between", value1, value2, "zwmc");
            return (Criteria) this;
        }

        public Criteria andZwmcNotBetween(String value1, String value2) {
            addCriterion("ZWMC not between", value1, value2, "zwmc");
            return (Criteria) this;
        }

        public Criteria andNjIsNull() {
            addCriterion("NJ is null");
            return (Criteria) this;
        }

        public Criteria andNjIsNotNull() {
            addCriterion("NJ is not null");
            return (Criteria) this;
        }

        public Criteria andNjEqualTo(String value) {
            addCriterion("NJ =", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotEqualTo(String value) {
            addCriterion("NJ <>", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjGreaterThan(String value) {
            addCriterion("NJ >", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjGreaterThanOrEqualTo(String value) {
            addCriterion("NJ >=", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjLessThan(String value) {
            addCriterion("NJ <", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjLessThanOrEqualTo(String value) {
            addCriterion("NJ <=", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjLike(String value) {
            addCriterion("NJ like", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotLike(String value) {
            addCriterion("NJ not like", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjIn(List<String> values) {
            addCriterion("NJ in", values, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotIn(List<String> values) {
            addCriterion("NJ not in", values, "nj");
            return (Criteria) this;
        }

        public Criteria andNjBetween(String value1, String value2) {
            addCriterion("NJ between", value1, value2, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotBetween(String value1, String value2) {
            addCriterion("NJ not between", value1, value2, "nj");
            return (Criteria) this;
        }

        public Criteria andJbIsNull() {
            addCriterion("JB is null");
            return (Criteria) this;
        }

        public Criteria andJbIsNotNull() {
            addCriterion("JB is not null");
            return (Criteria) this;
        }

        public Criteria andJbEqualTo(String value) {
            addCriterion("JB =", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotEqualTo(String value) {
            addCriterion("JB <>", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbGreaterThan(String value) {
            addCriterion("JB >", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbGreaterThanOrEqualTo(String value) {
            addCriterion("JB >=", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbLessThan(String value) {
            addCriterion("JB <", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbLessThanOrEqualTo(String value) {
            addCriterion("JB <=", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbLike(String value) {
            addCriterion("JB like", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotLike(String value) {
            addCriterion("JB not like", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbIn(List<String> values) {
            addCriterion("JB in", values, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotIn(List<String> values) {
            addCriterion("JB not in", values, "jb");
            return (Criteria) this;
        }

        public Criteria andJbBetween(String value1, String value2) {
            addCriterion("JB between", value1, value2, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotBetween(String value1, String value2) {
            addCriterion("JB not between", value1, value2, "jb");
            return (Criteria) this;
        }

        public Criteria andGwIsNull() {
            addCriterion("GW is null");
            return (Criteria) this;
        }

        public Criteria andGwIsNotNull() {
            addCriterion("GW is not null");
            return (Criteria) this;
        }

        public Criteria andGwEqualTo(String value) {
            addCriterion("GW =", value, "gw");
            return (Criteria) this;
        }

        public Criteria andGwNotEqualTo(String value) {
            addCriterion("GW <>", value, "gw");
            return (Criteria) this;
        }

        public Criteria andGwGreaterThan(String value) {
            addCriterion("GW >", value, "gw");
            return (Criteria) this;
        }

        public Criteria andGwGreaterThanOrEqualTo(String value) {
            addCriterion("GW >=", value, "gw");
            return (Criteria) this;
        }

        public Criteria andGwLessThan(String value) {
            addCriterion("GW <", value, "gw");
            return (Criteria) this;
        }

        public Criteria andGwLessThanOrEqualTo(String value) {
            addCriterion("GW <=", value, "gw");
            return (Criteria) this;
        }

        public Criteria andGwLike(String value) {
            addCriterion("GW like", value, "gw");
            return (Criteria) this;
        }

        public Criteria andGwNotLike(String value) {
            addCriterion("GW not like", value, "gw");
            return (Criteria) this;
        }

        public Criteria andGwIn(List<String> values) {
            addCriterion("GW in", values, "gw");
            return (Criteria) this;
        }

        public Criteria andGwNotIn(List<String> values) {
            addCriterion("GW not in", values, "gw");
            return (Criteria) this;
        }

        public Criteria andGwBetween(String value1, String value2) {
            addCriterion("GW between", value1, value2, "gw");
            return (Criteria) this;
        }

        public Criteria andGwNotBetween(String value1, String value2) {
            addCriterion("GW not between", value1, value2, "gw");
            return (Criteria) this;
        }

        public Criteria andHisKsdmIsNull() {
            addCriterion("HIS_KSDM is null");
            return (Criteria) this;
        }

        public Criteria andHisKsdmIsNotNull() {
            addCriterion("HIS_KSDM is not null");
            return (Criteria) this;
        }

        public Criteria andHisKsdmEqualTo(String value) {
            addCriterion("HIS_KSDM =", value, "hisKsdm");
            return (Criteria) this;
        }

        public Criteria andHisKsdmNotEqualTo(String value) {
            addCriterion("HIS_KSDM <>", value, "hisKsdm");
            return (Criteria) this;
        }

        public Criteria andHisKsdmGreaterThan(String value) {
            addCriterion("HIS_KSDM >", value, "hisKsdm");
            return (Criteria) this;
        }

        public Criteria andHisKsdmGreaterThanOrEqualTo(String value) {
            addCriterion("HIS_KSDM >=", value, "hisKsdm");
            return (Criteria) this;
        }

        public Criteria andHisKsdmLessThan(String value) {
            addCriterion("HIS_KSDM <", value, "hisKsdm");
            return (Criteria) this;
        }

        public Criteria andHisKsdmLessThanOrEqualTo(String value) {
            addCriterion("HIS_KSDM <=", value, "hisKsdm");
            return (Criteria) this;
        }

        public Criteria andHisKsdmLike(String value) {
            addCriterion("HIS_KSDM like", value, "hisKsdm");
            return (Criteria) this;
        }

        public Criteria andHisKsdmNotLike(String value) {
            addCriterion("HIS_KSDM not like", value, "hisKsdm");
            return (Criteria) this;
        }

        public Criteria andHisKsdmIn(List<String> values) {
            addCriterion("HIS_KSDM in", values, "hisKsdm");
            return (Criteria) this;
        }

        public Criteria andHisKsdmNotIn(List<String> values) {
            addCriterion("HIS_KSDM not in", values, "hisKsdm");
            return (Criteria) this;
        }

        public Criteria andHisKsdmBetween(String value1, String value2) {
            addCriterion("HIS_KSDM between", value1, value2, "hisKsdm");
            return (Criteria) this;
        }

        public Criteria andHisKsdmNotBetween(String value1, String value2) {
            addCriterion("HIS_KSDM not between", value1, value2, "hisKsdm");
            return (Criteria) this;
        }

        public Criteria andHisKsmcIsNull() {
            addCriterion("HIS_KSMC is null");
            return (Criteria) this;
        }

        public Criteria andHisKsmcIsNotNull() {
            addCriterion("HIS_KSMC is not null");
            return (Criteria) this;
        }

        public Criteria andHisKsmcEqualTo(String value) {
            addCriterion("HIS_KSMC =", value, "hisKsmc");
            return (Criteria) this;
        }

        public Criteria andHisKsmcNotEqualTo(String value) {
            addCriterion("HIS_KSMC <>", value, "hisKsmc");
            return (Criteria) this;
        }

        public Criteria andHisKsmcGreaterThan(String value) {
            addCriterion("HIS_KSMC >", value, "hisKsmc");
            return (Criteria) this;
        }

        public Criteria andHisKsmcGreaterThanOrEqualTo(String value) {
            addCriterion("HIS_KSMC >=", value, "hisKsmc");
            return (Criteria) this;
        }

        public Criteria andHisKsmcLessThan(String value) {
            addCriterion("HIS_KSMC <", value, "hisKsmc");
            return (Criteria) this;
        }

        public Criteria andHisKsmcLessThanOrEqualTo(String value) {
            addCriterion("HIS_KSMC <=", value, "hisKsmc");
            return (Criteria) this;
        }

        public Criteria andHisKsmcLike(String value) {
            addCriterion("HIS_KSMC like", value, "hisKsmc");
            return (Criteria) this;
        }

        public Criteria andHisKsmcNotLike(String value) {
            addCriterion("HIS_KSMC not like", value, "hisKsmc");
            return (Criteria) this;
        }

        public Criteria andHisKsmcIn(List<String> values) {
            addCriterion("HIS_KSMC in", values, "hisKsmc");
            return (Criteria) this;
        }

        public Criteria andHisKsmcNotIn(List<String> values) {
            addCriterion("HIS_KSMC not in", values, "hisKsmc");
            return (Criteria) this;
        }

        public Criteria andHisKsmcBetween(String value1, String value2) {
            addCriterion("HIS_KSMC between", value1, value2, "hisKsmc");
            return (Criteria) this;
        }

        public Criteria andHisKsmcNotBetween(String value1, String value2) {
            addCriterion("HIS_KSMC not between", value1, value2, "hisKsmc");
            return (Criteria) this;
        }

        public Criteria andHlIsNull() {
            addCriterion("HL is null");
            return (Criteria) this;
        }

        public Criteria andHlIsNotNull() {
            addCriterion("HL is not null");
            return (Criteria) this;
        }

        public Criteria andHlEqualTo(BigDecimal value) {
            addCriterion("HL =", value, "hl");
            return (Criteria) this;
        }

        public Criteria andHlNotEqualTo(BigDecimal value) {
            addCriterion("HL <>", value, "hl");
            return (Criteria) this;
        }

        public Criteria andHlGreaterThan(BigDecimal value) {
            addCriterion("HL >", value, "hl");
            return (Criteria) this;
        }

        public Criteria andHlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HL >=", value, "hl");
            return (Criteria) this;
        }

        public Criteria andHlLessThan(BigDecimal value) {
            addCriterion("HL <", value, "hl");
            return (Criteria) this;
        }

        public Criteria andHlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HL <=", value, "hl");
            return (Criteria) this;
        }

        public Criteria andHlIn(List<BigDecimal> values) {
            addCriterion("HL in", values, "hl");
            return (Criteria) this;
        }

        public Criteria andHlNotIn(List<BigDecimal> values) {
            addCriterion("HL not in", values, "hl");
            return (Criteria) this;
        }

        public Criteria andHlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HL between", value1, value2, "hl");
            return (Criteria) this;
        }

        public Criteria andHlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HL not between", value1, value2, "hl");
            return (Criteria) this;
        }

        public Criteria andZxpbIsNull() {
            addCriterion("ZXPB is null");
            return (Criteria) this;
        }

        public Criteria andZxpbIsNotNull() {
            addCriterion("ZXPB is not null");
            return (Criteria) this;
        }

        public Criteria andZxpbEqualTo(Short value) {
            addCriterion("ZXPB =", value, "zxpb");
            return (Criteria) this;
        }

        public Criteria andZxpbNotEqualTo(Short value) {
            addCriterion("ZXPB <>", value, "zxpb");
            return (Criteria) this;
        }

        public Criteria andZxpbGreaterThan(Short value) {
            addCriterion("ZXPB >", value, "zxpb");
            return (Criteria) this;
        }

        public Criteria andZxpbGreaterThanOrEqualTo(Short value) {
            addCriterion("ZXPB >=", value, "zxpb");
            return (Criteria) this;
        }

        public Criteria andZxpbLessThan(Short value) {
            addCriterion("ZXPB <", value, "zxpb");
            return (Criteria) this;
        }

        public Criteria andZxpbLessThanOrEqualTo(Short value) {
            addCriterion("ZXPB <=", value, "zxpb");
            return (Criteria) this;
        }

        public Criteria andZxpbIn(List<Short> values) {
            addCriterion("ZXPB in", values, "zxpb");
            return (Criteria) this;
        }

        public Criteria andZxpbNotIn(List<Short> values) {
            addCriterion("ZXPB not in", values, "zxpb");
            return (Criteria) this;
        }

        public Criteria andZxpbBetween(Short value1, Short value2) {
            addCriterion("ZXPB between", value1, value2, "zxpb");
            return (Criteria) this;
        }

        public Criteria andZxpbNotBetween(Short value1, Short value2) {
            addCriterion("ZXPB not between", value1, value2, "zxpb");
            return (Criteria) this;
        }

        public Criteria andSypbIsNull() {
            addCriterion("SYPB is null");
            return (Criteria) this;
        }

        public Criteria andSypbIsNotNull() {
            addCriterion("SYPB is not null");
            return (Criteria) this;
        }

        public Criteria andSypbEqualTo(Short value) {
            addCriterion("SYPB =", value, "sypb");
            return (Criteria) this;
        }

        public Criteria andSypbNotEqualTo(Short value) {
            addCriterion("SYPB <>", value, "sypb");
            return (Criteria) this;
        }

        public Criteria andSypbGreaterThan(Short value) {
            addCriterion("SYPB >", value, "sypb");
            return (Criteria) this;
        }

        public Criteria andSypbGreaterThanOrEqualTo(Short value) {
            addCriterion("SYPB >=", value, "sypb");
            return (Criteria) this;
        }

        public Criteria andSypbLessThan(Short value) {
            addCriterion("SYPB <", value, "sypb");
            return (Criteria) this;
        }

        public Criteria andSypbLessThanOrEqualTo(Short value) {
            addCriterion("SYPB <=", value, "sypb");
            return (Criteria) this;
        }

        public Criteria andSypbIn(List<Short> values) {
            addCriterion("SYPB in", values, "sypb");
            return (Criteria) this;
        }

        public Criteria andSypbNotIn(List<Short> values) {
            addCriterion("SYPB not in", values, "sypb");
            return (Criteria) this;
        }

        public Criteria andSypbBetween(Short value1, Short value2) {
            addCriterion("SYPB between", value1, value2, "sypb");
            return (Criteria) this;
        }

        public Criteria andSypbNotBetween(Short value1, Short value2) {
            addCriterion("SYPB not between", value1, value2, "sypb");
            return (Criteria) this;
        }

        public Criteria andGxbzIsNull() {
            addCriterion("GXBZ is null");
            return (Criteria) this;
        }

        public Criteria andGxbzIsNotNull() {
            addCriterion("GXBZ is not null");
            return (Criteria) this;
        }

        public Criteria andGxbzEqualTo(Short value) {
            addCriterion("GXBZ =", value, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzNotEqualTo(Short value) {
            addCriterion("GXBZ <>", value, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzGreaterThan(Short value) {
            addCriterion("GXBZ >", value, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzGreaterThanOrEqualTo(Short value) {
            addCriterion("GXBZ >=", value, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzLessThan(Short value) {
            addCriterion("GXBZ <", value, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzLessThanOrEqualTo(Short value) {
            addCriterion("GXBZ <=", value, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzIn(List<Short> values) {
            addCriterion("GXBZ in", values, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzNotIn(List<Short> values) {
            addCriterion("GXBZ not in", values, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzBetween(Short value1, Short value2) {
            addCriterion("GXBZ between", value1, value2, "gxbz");
            return (Criteria) this;
        }

        public Criteria andGxbzNotBetween(Short value1, Short value2) {
            addCriterion("GXBZ not between", value1, value2, "gxbz");
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