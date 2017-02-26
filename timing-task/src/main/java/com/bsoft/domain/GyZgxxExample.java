package com.bsoft.domain;

import java.util.ArrayList;
import java.util.List;

public class GyZgxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GyZgxxExample() {
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

        public Criteria andZwksdmIsNull() {
            addCriterion("ZWKSDM is null");
            return (Criteria) this;
        }

        public Criteria andZwksdmIsNotNull() {
            addCriterion("ZWKSDM is not null");
            return (Criteria) this;
        }

        public Criteria andZwksdmEqualTo(String value) {
            addCriterion("ZWKSDM =", value, "zwksdm");
            return (Criteria) this;
        }

        public Criteria andZwksdmNotEqualTo(String value) {
            addCriterion("ZWKSDM <>", value, "zwksdm");
            return (Criteria) this;
        }

        public Criteria andZwksdmGreaterThan(String value) {
            addCriterion("ZWKSDM >", value, "zwksdm");
            return (Criteria) this;
        }

        public Criteria andZwksdmGreaterThanOrEqualTo(String value) {
            addCriterion("ZWKSDM >=", value, "zwksdm");
            return (Criteria) this;
        }

        public Criteria andZwksdmLessThan(String value) {
            addCriterion("ZWKSDM <", value, "zwksdm");
            return (Criteria) this;
        }

        public Criteria andZwksdmLessThanOrEqualTo(String value) {
            addCriterion("ZWKSDM <=", value, "zwksdm");
            return (Criteria) this;
        }

        public Criteria andZwksdmLike(String value) {
            addCriterion("ZWKSDM like", value, "zwksdm");
            return (Criteria) this;
        }

        public Criteria andZwksdmNotLike(String value) {
            addCriterion("ZWKSDM not like", value, "zwksdm");
            return (Criteria) this;
        }

        public Criteria andZwksdmIn(List<String> values) {
            addCriterion("ZWKSDM in", values, "zwksdm");
            return (Criteria) this;
        }

        public Criteria andZwksdmNotIn(List<String> values) {
            addCriterion("ZWKSDM not in", values, "zwksdm");
            return (Criteria) this;
        }

        public Criteria andZwksdmBetween(String value1, String value2) {
            addCriterion("ZWKSDM between", value1, value2, "zwksdm");
            return (Criteria) this;
        }

        public Criteria andZwksdmNotBetween(String value1, String value2) {
            addCriterion("ZWKSDM not between", value1, value2, "zwksdm");
            return (Criteria) this;
        }

        public Criteria andCfqIsNull() {
            addCriterion("CFQ is null");
            return (Criteria) this;
        }

        public Criteria andCfqIsNotNull() {
            addCriterion("CFQ is not null");
            return (Criteria) this;
        }

        public Criteria andCfqEqualTo(String value) {
            addCriterion("CFQ =", value, "cfq");
            return (Criteria) this;
        }

        public Criteria andCfqNotEqualTo(String value) {
            addCriterion("CFQ <>", value, "cfq");
            return (Criteria) this;
        }

        public Criteria andCfqGreaterThan(String value) {
            addCriterion("CFQ >", value, "cfq");
            return (Criteria) this;
        }

        public Criteria andCfqGreaterThanOrEqualTo(String value) {
            addCriterion("CFQ >=", value, "cfq");
            return (Criteria) this;
        }

        public Criteria andCfqLessThan(String value) {
            addCriterion("CFQ <", value, "cfq");
            return (Criteria) this;
        }

        public Criteria andCfqLessThanOrEqualTo(String value) {
            addCriterion("CFQ <=", value, "cfq");
            return (Criteria) this;
        }

        public Criteria andCfqLike(String value) {
            addCriterion("CFQ like", value, "cfq");
            return (Criteria) this;
        }

        public Criteria andCfqNotLike(String value) {
            addCriterion("CFQ not like", value, "cfq");
            return (Criteria) this;
        }

        public Criteria andCfqIn(List<String> values) {
            addCriterion("CFQ in", values, "cfq");
            return (Criteria) this;
        }

        public Criteria andCfqNotIn(List<String> values) {
            addCriterion("CFQ not in", values, "cfq");
            return (Criteria) this;
        }

        public Criteria andCfqBetween(String value1, String value2) {
            addCriterion("CFQ between", value1, value2, "cfq");
            return (Criteria) this;
        }

        public Criteria andCfqNotBetween(String value1, String value2) {
            addCriterion("CFQ not between", value1, value2, "cfq");
            return (Criteria) this;
        }

        public Criteria andMzyqIsNull() {
            addCriterion("MZYQ is null");
            return (Criteria) this;
        }

        public Criteria andMzyqIsNotNull() {
            addCriterion("MZYQ is not null");
            return (Criteria) this;
        }

        public Criteria andMzyqEqualTo(String value) {
            addCriterion("MZYQ =", value, "mzyq");
            return (Criteria) this;
        }

        public Criteria andMzyqNotEqualTo(String value) {
            addCriterion("MZYQ <>", value, "mzyq");
            return (Criteria) this;
        }

        public Criteria andMzyqGreaterThan(String value) {
            addCriterion("MZYQ >", value, "mzyq");
            return (Criteria) this;
        }

        public Criteria andMzyqGreaterThanOrEqualTo(String value) {
            addCriterion("MZYQ >=", value, "mzyq");
            return (Criteria) this;
        }

        public Criteria andMzyqLessThan(String value) {
            addCriterion("MZYQ <", value, "mzyq");
            return (Criteria) this;
        }

        public Criteria andMzyqLessThanOrEqualTo(String value) {
            addCriterion("MZYQ <=", value, "mzyq");
            return (Criteria) this;
        }

        public Criteria andMzyqLike(String value) {
            addCriterion("MZYQ like", value, "mzyq");
            return (Criteria) this;
        }

        public Criteria andMzyqNotLike(String value) {
            addCriterion("MZYQ not like", value, "mzyq");
            return (Criteria) this;
        }

        public Criteria andMzyqIn(List<String> values) {
            addCriterion("MZYQ in", values, "mzyq");
            return (Criteria) this;
        }

        public Criteria andMzyqNotIn(List<String> values) {
            addCriterion("MZYQ not in", values, "mzyq");
            return (Criteria) this;
        }

        public Criteria andMzyqBetween(String value1, String value2) {
            addCriterion("MZYQ between", value1, value2, "mzyq");
            return (Criteria) this;
        }

        public Criteria andMzyqNotBetween(String value1, String value2) {
            addCriterion("MZYQ not between", value1, value2, "mzyq");
            return (Criteria) this;
        }

        public Criteria andJsyqIsNull() {
            addCriterion("JSYQ is null");
            return (Criteria) this;
        }

        public Criteria andJsyqIsNotNull() {
            addCriterion("JSYQ is not null");
            return (Criteria) this;
        }

        public Criteria andJsyqEqualTo(String value) {
            addCriterion("JSYQ =", value, "jsyq");
            return (Criteria) this;
        }

        public Criteria andJsyqNotEqualTo(String value) {
            addCriterion("JSYQ <>", value, "jsyq");
            return (Criteria) this;
        }

        public Criteria andJsyqGreaterThan(String value) {
            addCriterion("JSYQ >", value, "jsyq");
            return (Criteria) this;
        }

        public Criteria andJsyqGreaterThanOrEqualTo(String value) {
            addCriterion("JSYQ >=", value, "jsyq");
            return (Criteria) this;
        }

        public Criteria andJsyqLessThan(String value) {
            addCriterion("JSYQ <", value, "jsyq");
            return (Criteria) this;
        }

        public Criteria andJsyqLessThanOrEqualTo(String value) {
            addCriterion("JSYQ <=", value, "jsyq");
            return (Criteria) this;
        }

        public Criteria andJsyqLike(String value) {
            addCriterion("JSYQ like", value, "jsyq");
            return (Criteria) this;
        }

        public Criteria andJsyqNotLike(String value) {
            addCriterion("JSYQ not like", value, "jsyq");
            return (Criteria) this;
        }

        public Criteria andJsyqIn(List<String> values) {
            addCriterion("JSYQ in", values, "jsyq");
            return (Criteria) this;
        }

        public Criteria andJsyqNotIn(List<String> values) {
            addCriterion("JSYQ not in", values, "jsyq");
            return (Criteria) this;
        }

        public Criteria andJsyqBetween(String value1, String value2) {
            addCriterion("JSYQ between", value1, value2, "jsyq");
            return (Criteria) this;
        }

        public Criteria andJsyqNotBetween(String value1, String value2) {
            addCriterion("JSYQ not between", value1, value2, "jsyq");
            return (Criteria) this;
        }

        public Criteria andDpqIsNull() {
            addCriterion("DPQ is null");
            return (Criteria) this;
        }

        public Criteria andDpqIsNotNull() {
            addCriterion("DPQ is not null");
            return (Criteria) this;
        }

        public Criteria andDpqEqualTo(String value) {
            addCriterion("DPQ =", value, "dpq");
            return (Criteria) this;
        }

        public Criteria andDpqNotEqualTo(String value) {
            addCriterion("DPQ <>", value, "dpq");
            return (Criteria) this;
        }

        public Criteria andDpqGreaterThan(String value) {
            addCriterion("DPQ >", value, "dpq");
            return (Criteria) this;
        }

        public Criteria andDpqGreaterThanOrEqualTo(String value) {
            addCriterion("DPQ >=", value, "dpq");
            return (Criteria) this;
        }

        public Criteria andDpqLessThan(String value) {
            addCriterion("DPQ <", value, "dpq");
            return (Criteria) this;
        }

        public Criteria andDpqLessThanOrEqualTo(String value) {
            addCriterion("DPQ <=", value, "dpq");
            return (Criteria) this;
        }

        public Criteria andDpqLike(String value) {
            addCriterion("DPQ like", value, "dpq");
            return (Criteria) this;
        }

        public Criteria andDpqNotLike(String value) {
            addCriterion("DPQ not like", value, "dpq");
            return (Criteria) this;
        }

        public Criteria andDpqIn(List<String> values) {
            addCriterion("DPQ in", values, "dpq");
            return (Criteria) this;
        }

        public Criteria andDpqNotIn(List<String> values) {
            addCriterion("DPQ not in", values, "dpq");
            return (Criteria) this;
        }

        public Criteria andDpqBetween(String value1, String value2) {
            addCriterion("DPQ between", value1, value2, "dpq");
            return (Criteria) this;
        }

        public Criteria andDpqNotBetween(String value1, String value2) {
            addCriterion("DPQ not between", value1, value2, "dpq");
            return (Criteria) this;
        }

        public Criteria andSsqIsNull() {
            addCriterion("SSQ is null");
            return (Criteria) this;
        }

        public Criteria andSsqIsNotNull() {
            addCriterion("SSQ is not null");
            return (Criteria) this;
        }

        public Criteria andSsqEqualTo(String value) {
            addCriterion("SSQ =", value, "ssq");
            return (Criteria) this;
        }

        public Criteria andSsqNotEqualTo(String value) {
            addCriterion("SSQ <>", value, "ssq");
            return (Criteria) this;
        }

        public Criteria andSsqGreaterThan(String value) {
            addCriterion("SSQ >", value, "ssq");
            return (Criteria) this;
        }

        public Criteria andSsqGreaterThanOrEqualTo(String value) {
            addCriterion("SSQ >=", value, "ssq");
            return (Criteria) this;
        }

        public Criteria andSsqLessThan(String value) {
            addCriterion("SSQ <", value, "ssq");
            return (Criteria) this;
        }

        public Criteria andSsqLessThanOrEqualTo(String value) {
            addCriterion("SSQ <=", value, "ssq");
            return (Criteria) this;
        }

        public Criteria andSsqLike(String value) {
            addCriterion("SSQ like", value, "ssq");
            return (Criteria) this;
        }

        public Criteria andSsqNotLike(String value) {
            addCriterion("SSQ not like", value, "ssq");
            return (Criteria) this;
        }

        public Criteria andSsqIn(List<String> values) {
            addCriterion("SSQ in", values, "ssq");
            return (Criteria) this;
        }

        public Criteria andSsqNotIn(List<String> values) {
            addCriterion("SSQ not in", values, "ssq");
            return (Criteria) this;
        }

        public Criteria andSsqBetween(String value1, String value2) {
            addCriterion("SSQ between", value1, value2, "ssq");
            return (Criteria) this;
        }

        public Criteria andSsqNotBetween(String value1, String value2) {
            addCriterion("SSQ not between", value1, value2, "ssq");
            return (Criteria) this;
        }

        public Criteria andHyqIsNull() {
            addCriterion("HYQ is null");
            return (Criteria) this;
        }

        public Criteria andHyqIsNotNull() {
            addCriterion("HYQ is not null");
            return (Criteria) this;
        }

        public Criteria andHyqEqualTo(String value) {
            addCriterion("HYQ =", value, "hyq");
            return (Criteria) this;
        }

        public Criteria andHyqNotEqualTo(String value) {
            addCriterion("HYQ <>", value, "hyq");
            return (Criteria) this;
        }

        public Criteria andHyqGreaterThan(String value) {
            addCriterion("HYQ >", value, "hyq");
            return (Criteria) this;
        }

        public Criteria andHyqGreaterThanOrEqualTo(String value) {
            addCriterion("HYQ >=", value, "hyq");
            return (Criteria) this;
        }

        public Criteria andHyqLessThan(String value) {
            addCriterion("HYQ <", value, "hyq");
            return (Criteria) this;
        }

        public Criteria andHyqLessThanOrEqualTo(String value) {
            addCriterion("HYQ <=", value, "hyq");
            return (Criteria) this;
        }

        public Criteria andHyqLike(String value) {
            addCriterion("HYQ like", value, "hyq");
            return (Criteria) this;
        }

        public Criteria andHyqNotLike(String value) {
            addCriterion("HYQ not like", value, "hyq");
            return (Criteria) this;
        }

        public Criteria andHyqIn(List<String> values) {
            addCriterion("HYQ in", values, "hyq");
            return (Criteria) this;
        }

        public Criteria andHyqNotIn(List<String> values) {
            addCriterion("HYQ not in", values, "hyq");
            return (Criteria) this;
        }

        public Criteria andHyqBetween(String value1, String value2) {
            addCriterion("HYQ between", value1, value2, "hyq");
            return (Criteria) this;
        }

        public Criteria andHyqNotBetween(String value1, String value2) {
            addCriterion("HYQ not between", value1, value2, "hyq");
            return (Criteria) this;
        }

        public Criteria andTjqIsNull() {
            addCriterion("TJQ is null");
            return (Criteria) this;
        }

        public Criteria andTjqIsNotNull() {
            addCriterion("TJQ is not null");
            return (Criteria) this;
        }

        public Criteria andTjqEqualTo(String value) {
            addCriterion("TJQ =", value, "tjq");
            return (Criteria) this;
        }

        public Criteria andTjqNotEqualTo(String value) {
            addCriterion("TJQ <>", value, "tjq");
            return (Criteria) this;
        }

        public Criteria andTjqGreaterThan(String value) {
            addCriterion("TJQ >", value, "tjq");
            return (Criteria) this;
        }

        public Criteria andTjqGreaterThanOrEqualTo(String value) {
            addCriterion("TJQ >=", value, "tjq");
            return (Criteria) this;
        }

        public Criteria andTjqLessThan(String value) {
            addCriterion("TJQ <", value, "tjq");
            return (Criteria) this;
        }

        public Criteria andTjqLessThanOrEqualTo(String value) {
            addCriterion("TJQ <=", value, "tjq");
            return (Criteria) this;
        }

        public Criteria andTjqLike(String value) {
            addCriterion("TJQ like", value, "tjq");
            return (Criteria) this;
        }

        public Criteria andTjqNotLike(String value) {
            addCriterion("TJQ not like", value, "tjq");
            return (Criteria) this;
        }

        public Criteria andTjqIn(List<String> values) {
            addCriterion("TJQ in", values, "tjq");
            return (Criteria) this;
        }

        public Criteria andTjqNotIn(List<String> values) {
            addCriterion("TJQ not in", values, "tjq");
            return (Criteria) this;
        }

        public Criteria andTjqBetween(String value1, String value2) {
            addCriterion("TJQ between", value1, value2, "tjq");
            return (Criteria) this;
        }

        public Criteria andTjqNotBetween(String value1, String value2) {
            addCriterion("TJQ not between", value1, value2, "tjq");
            return (Criteria) this;
        }

        public Criteria andJczldIsNull() {
            addCriterion("JCZLD is null");
            return (Criteria) this;
        }

        public Criteria andJczldIsNotNull() {
            addCriterion("JCZLD is not null");
            return (Criteria) this;
        }

        public Criteria andJczldEqualTo(String value) {
            addCriterion("JCZLD =", value, "jczld");
            return (Criteria) this;
        }

        public Criteria andJczldNotEqualTo(String value) {
            addCriterion("JCZLD <>", value, "jczld");
            return (Criteria) this;
        }

        public Criteria andJczldGreaterThan(String value) {
            addCriterion("JCZLD >", value, "jczld");
            return (Criteria) this;
        }

        public Criteria andJczldGreaterThanOrEqualTo(String value) {
            addCriterion("JCZLD >=", value, "jczld");
            return (Criteria) this;
        }

        public Criteria andJczldLessThan(String value) {
            addCriterion("JCZLD <", value, "jczld");
            return (Criteria) this;
        }

        public Criteria andJczldLessThanOrEqualTo(String value) {
            addCriterion("JCZLD <=", value, "jczld");
            return (Criteria) this;
        }

        public Criteria andJczldLike(String value) {
            addCriterion("JCZLD like", value, "jczld");
            return (Criteria) this;
        }

        public Criteria andJczldNotLike(String value) {
            addCriterion("JCZLD not like", value, "jczld");
            return (Criteria) this;
        }

        public Criteria andJczldIn(List<String> values) {
            addCriterion("JCZLD in", values, "jczld");
            return (Criteria) this;
        }

        public Criteria andJczldNotIn(List<String> values) {
            addCriterion("JCZLD not in", values, "jczld");
            return (Criteria) this;
        }

        public Criteria andJczldBetween(String value1, String value2) {
            addCriterion("JCZLD between", value1, value2, "jczld");
            return (Criteria) this;
        }

        public Criteria andJczldNotBetween(String value1, String value2) {
            addCriterion("JCZLD not between", value1, value2, "jczld");
            return (Criteria) this;
        }

        public Criteria andHxcrqIsNull() {
            addCriterion("HXCRQ is null");
            return (Criteria) this;
        }

        public Criteria andHxcrqIsNotNull() {
            addCriterion("HXCRQ is not null");
            return (Criteria) this;
        }

        public Criteria andHxcrqEqualTo(String value) {
            addCriterion("HXCRQ =", value, "hxcrq");
            return (Criteria) this;
        }

        public Criteria andHxcrqNotEqualTo(String value) {
            addCriterion("HXCRQ <>", value, "hxcrq");
            return (Criteria) this;
        }

        public Criteria andHxcrqGreaterThan(String value) {
            addCriterion("HXCRQ >", value, "hxcrq");
            return (Criteria) this;
        }

        public Criteria andHxcrqGreaterThanOrEqualTo(String value) {
            addCriterion("HXCRQ >=", value, "hxcrq");
            return (Criteria) this;
        }

        public Criteria andHxcrqLessThan(String value) {
            addCriterion("HXCRQ <", value, "hxcrq");
            return (Criteria) this;
        }

        public Criteria andHxcrqLessThanOrEqualTo(String value) {
            addCriterion("HXCRQ <=", value, "hxcrq");
            return (Criteria) this;
        }

        public Criteria andHxcrqLike(String value) {
            addCriterion("HXCRQ like", value, "hxcrq");
            return (Criteria) this;
        }

        public Criteria andHxcrqNotLike(String value) {
            addCriterion("HXCRQ not like", value, "hxcrq");
            return (Criteria) this;
        }

        public Criteria andHxcrqIn(List<String> values) {
            addCriterion("HXCRQ in", values, "hxcrq");
            return (Criteria) this;
        }

        public Criteria andHxcrqNotIn(List<String> values) {
            addCriterion("HXCRQ not in", values, "hxcrq");
            return (Criteria) this;
        }

        public Criteria andHxcrqBetween(String value1, String value2) {
            addCriterion("HXCRQ between", value1, value2, "hxcrq");
            return (Criteria) this;
        }

        public Criteria andHxcrqNotBetween(String value1, String value2) {
            addCriterion("HXCRQ not between", value1, value2, "hxcrq");
            return (Criteria) this;
        }

        public Criteria andYykdqIsNull() {
            addCriterion("YYKDQ is null");
            return (Criteria) this;
        }

        public Criteria andYykdqIsNotNull() {
            addCriterion("YYKDQ is not null");
            return (Criteria) this;
        }

        public Criteria andYykdqEqualTo(String value) {
            addCriterion("YYKDQ =", value, "yykdq");
            return (Criteria) this;
        }

        public Criteria andYykdqNotEqualTo(String value) {
            addCriterion("YYKDQ <>", value, "yykdq");
            return (Criteria) this;
        }

        public Criteria andYykdqGreaterThan(String value) {
            addCriterion("YYKDQ >", value, "yykdq");
            return (Criteria) this;
        }

        public Criteria andYykdqGreaterThanOrEqualTo(String value) {
            addCriterion("YYKDQ >=", value, "yykdq");
            return (Criteria) this;
        }

        public Criteria andYykdqLessThan(String value) {
            addCriterion("YYKDQ <", value, "yykdq");
            return (Criteria) this;
        }

        public Criteria andYykdqLessThanOrEqualTo(String value) {
            addCriterion("YYKDQ <=", value, "yykdq");
            return (Criteria) this;
        }

        public Criteria andYykdqLike(String value) {
            addCriterion("YYKDQ like", value, "yykdq");
            return (Criteria) this;
        }

        public Criteria andYykdqNotLike(String value) {
            addCriterion("YYKDQ not like", value, "yykdq");
            return (Criteria) this;
        }

        public Criteria andYykdqIn(List<String> values) {
            addCriterion("YYKDQ in", values, "yykdq");
            return (Criteria) this;
        }

        public Criteria andYykdqNotIn(List<String> values) {
            addCriterion("YYKDQ not in", values, "yykdq");
            return (Criteria) this;
        }

        public Criteria andYykdqBetween(String value1, String value2) {
            addCriterion("YYKDQ between", value1, value2, "yykdq");
            return (Criteria) this;
        }

        public Criteria andYykdqNotBetween(String value1, String value2) {
            addCriterion("YYKDQ not between", value1, value2, "yykdq");
            return (Criteria) this;
        }

        public Criteria andHlywqIsNull() {
            addCriterion("HLYWQ is null");
            return (Criteria) this;
        }

        public Criteria andHlywqIsNotNull() {
            addCriterion("HLYWQ is not null");
            return (Criteria) this;
        }

        public Criteria andHlywqEqualTo(String value) {
            addCriterion("HLYWQ =", value, "hlywq");
            return (Criteria) this;
        }

        public Criteria andHlywqNotEqualTo(String value) {
            addCriterion("HLYWQ <>", value, "hlywq");
            return (Criteria) this;
        }

        public Criteria andHlywqGreaterThan(String value) {
            addCriterion("HLYWQ >", value, "hlywq");
            return (Criteria) this;
        }

        public Criteria andHlywqGreaterThanOrEqualTo(String value) {
            addCriterion("HLYWQ >=", value, "hlywq");
            return (Criteria) this;
        }

        public Criteria andHlywqLessThan(String value) {
            addCriterion("HLYWQ <", value, "hlywq");
            return (Criteria) this;
        }

        public Criteria andHlywqLessThanOrEqualTo(String value) {
            addCriterion("HLYWQ <=", value, "hlywq");
            return (Criteria) this;
        }

        public Criteria andHlywqLike(String value) {
            addCriterion("HLYWQ like", value, "hlywq");
            return (Criteria) this;
        }

        public Criteria andHlywqNotLike(String value) {
            addCriterion("HLYWQ not like", value, "hlywq");
            return (Criteria) this;
        }

        public Criteria andHlywqIn(List<String> values) {
            addCriterion("HLYWQ in", values, "hlywq");
            return (Criteria) this;
        }

        public Criteria andHlywqNotIn(List<String> values) {
            addCriterion("HLYWQ not in", values, "hlywq");
            return (Criteria) this;
        }

        public Criteria andHlywqBetween(String value1, String value2) {
            addCriterion("HLYWQ between", value1, value2, "hlywq");
            return (Criteria) this;
        }

        public Criteria andHlywqNotBetween(String value1, String value2) {
            addCriterion("HLYWQ not between", value1, value2, "hlywq");
            return (Criteria) this;
        }

        public Criteria andKfzlqIsNull() {
            addCriterion("KFZLQ is null");
            return (Criteria) this;
        }

        public Criteria andKfzlqIsNotNull() {
            addCriterion("KFZLQ is not null");
            return (Criteria) this;
        }

        public Criteria andKfzlqEqualTo(String value) {
            addCriterion("KFZLQ =", value, "kfzlq");
            return (Criteria) this;
        }

        public Criteria andKfzlqNotEqualTo(String value) {
            addCriterion("KFZLQ <>", value, "kfzlq");
            return (Criteria) this;
        }

        public Criteria andKfzlqGreaterThan(String value) {
            addCriterion("KFZLQ >", value, "kfzlq");
            return (Criteria) this;
        }

        public Criteria andKfzlqGreaterThanOrEqualTo(String value) {
            addCriterion("KFZLQ >=", value, "kfzlq");
            return (Criteria) this;
        }

        public Criteria andKfzlqLessThan(String value) {
            addCriterion("KFZLQ <", value, "kfzlq");
            return (Criteria) this;
        }

        public Criteria andKfzlqLessThanOrEqualTo(String value) {
            addCriterion("KFZLQ <=", value, "kfzlq");
            return (Criteria) this;
        }

        public Criteria andKfzlqLike(String value) {
            addCriterion("KFZLQ like", value, "kfzlq");
            return (Criteria) this;
        }

        public Criteria andKfzlqNotLike(String value) {
            addCriterion("KFZLQ not like", value, "kfzlq");
            return (Criteria) this;
        }

        public Criteria andKfzlqIn(List<String> values) {
            addCriterion("KFZLQ in", values, "kfzlq");
            return (Criteria) this;
        }

        public Criteria andKfzlqNotIn(List<String> values) {
            addCriterion("KFZLQ not in", values, "kfzlq");
            return (Criteria) this;
        }

        public Criteria andKfzlqBetween(String value1, String value2) {
            addCriterion("KFZLQ between", value1, value2, "kfzlq");
            return (Criteria) this;
        }

        public Criteria andKfzlqNotBetween(String value1, String value2) {
            addCriterion("KFZLQ not between", value1, value2, "kfzlq");
            return (Criteria) this;
        }

        public Criteria andMzzcqIsNull() {
            addCriterion("MZZCQ is null");
            return (Criteria) this;
        }

        public Criteria andMzzcqIsNotNull() {
            addCriterion("MZZCQ is not null");
            return (Criteria) this;
        }

        public Criteria andMzzcqEqualTo(String value) {
            addCriterion("MZZCQ =", value, "mzzcq");
            return (Criteria) this;
        }

        public Criteria andMzzcqNotEqualTo(String value) {
            addCriterion("MZZCQ <>", value, "mzzcq");
            return (Criteria) this;
        }

        public Criteria andMzzcqGreaterThan(String value) {
            addCriterion("MZZCQ >", value, "mzzcq");
            return (Criteria) this;
        }

        public Criteria andMzzcqGreaterThanOrEqualTo(String value) {
            addCriterion("MZZCQ >=", value, "mzzcq");
            return (Criteria) this;
        }

        public Criteria andMzzcqLessThan(String value) {
            addCriterion("MZZCQ <", value, "mzzcq");
            return (Criteria) this;
        }

        public Criteria andMzzcqLessThanOrEqualTo(String value) {
            addCriterion("MZZCQ <=", value, "mzzcq");
            return (Criteria) this;
        }

        public Criteria andMzzcqLike(String value) {
            addCriterion("MZZCQ like", value, "mzzcq");
            return (Criteria) this;
        }

        public Criteria andMzzcqNotLike(String value) {
            addCriterion("MZZCQ not like", value, "mzzcq");
            return (Criteria) this;
        }

        public Criteria andMzzcqIn(List<String> values) {
            addCriterion("MZZCQ in", values, "mzzcq");
            return (Criteria) this;
        }

        public Criteria andMzzcqNotIn(List<String> values) {
            addCriterion("MZZCQ not in", values, "mzzcq");
            return (Criteria) this;
        }

        public Criteria andMzzcqBetween(String value1, String value2) {
            addCriterion("MZZCQ between", value1, value2, "mzzcq");
            return (Criteria) this;
        }

        public Criteria andMzzcqNotBetween(String value1, String value2) {
            addCriterion("MZZCQ not between", value1, value2, "mzzcq");
            return (Criteria) this;
        }

        public Criteria andJzzcqIsNull() {
            addCriterion("JZZCQ is null");
            return (Criteria) this;
        }

        public Criteria andJzzcqIsNotNull() {
            addCriterion("JZZCQ is not null");
            return (Criteria) this;
        }

        public Criteria andJzzcqEqualTo(String value) {
            addCriterion("JZZCQ =", value, "jzzcq");
            return (Criteria) this;
        }

        public Criteria andJzzcqNotEqualTo(String value) {
            addCriterion("JZZCQ <>", value, "jzzcq");
            return (Criteria) this;
        }

        public Criteria andJzzcqGreaterThan(String value) {
            addCriterion("JZZCQ >", value, "jzzcq");
            return (Criteria) this;
        }

        public Criteria andJzzcqGreaterThanOrEqualTo(String value) {
            addCriterion("JZZCQ >=", value, "jzzcq");
            return (Criteria) this;
        }

        public Criteria andJzzcqLessThan(String value) {
            addCriterion("JZZCQ <", value, "jzzcq");
            return (Criteria) this;
        }

        public Criteria andJzzcqLessThanOrEqualTo(String value) {
            addCriterion("JZZCQ <=", value, "jzzcq");
            return (Criteria) this;
        }

        public Criteria andJzzcqLike(String value) {
            addCriterion("JZZCQ like", value, "jzzcq");
            return (Criteria) this;
        }

        public Criteria andJzzcqNotLike(String value) {
            addCriterion("JZZCQ not like", value, "jzzcq");
            return (Criteria) this;
        }

        public Criteria andJzzcqIn(List<String> values) {
            addCriterion("JZZCQ in", values, "jzzcq");
            return (Criteria) this;
        }

        public Criteria andJzzcqNotIn(List<String> values) {
            addCriterion("JZZCQ not in", values, "jzzcq");
            return (Criteria) this;
        }

        public Criteria andJzzcqBetween(String value1, String value2) {
            addCriterion("JZZCQ between", value1, value2, "jzzcq");
            return (Criteria) this;
        }

        public Criteria andJzzcqNotBetween(String value1, String value2) {
            addCriterion("JZZCQ not between", value1, value2, "jzzcq");
            return (Criteria) this;
        }

        public Criteria andYszsbhIsNull() {
            addCriterion("YSZSBH is null");
            return (Criteria) this;
        }

        public Criteria andYszsbhIsNotNull() {
            addCriterion("YSZSBH is not null");
            return (Criteria) this;
        }

        public Criteria andYszsbhEqualTo(String value) {
            addCriterion("YSZSBH =", value, "yszsbh");
            return (Criteria) this;
        }

        public Criteria andYszsbhNotEqualTo(String value) {
            addCriterion("YSZSBH <>", value, "yszsbh");
            return (Criteria) this;
        }

        public Criteria andYszsbhGreaterThan(String value) {
            addCriterion("YSZSBH >", value, "yszsbh");
            return (Criteria) this;
        }

        public Criteria andYszsbhGreaterThanOrEqualTo(String value) {
            addCriterion("YSZSBH >=", value, "yszsbh");
            return (Criteria) this;
        }

        public Criteria andYszsbhLessThan(String value) {
            addCriterion("YSZSBH <", value, "yszsbh");
            return (Criteria) this;
        }

        public Criteria andYszsbhLessThanOrEqualTo(String value) {
            addCriterion("YSZSBH <=", value, "yszsbh");
            return (Criteria) this;
        }

        public Criteria andYszsbhLike(String value) {
            addCriterion("YSZSBH like", value, "yszsbh");
            return (Criteria) this;
        }

        public Criteria andYszsbhNotLike(String value) {
            addCriterion("YSZSBH not like", value, "yszsbh");
            return (Criteria) this;
        }

        public Criteria andYszsbhIn(List<String> values) {
            addCriterion("YSZSBH in", values, "yszsbh");
            return (Criteria) this;
        }

        public Criteria andYszsbhNotIn(List<String> values) {
            addCriterion("YSZSBH not in", values, "yszsbh");
            return (Criteria) this;
        }

        public Criteria andYszsbhBetween(String value1, String value2) {
            addCriterion("YSZSBH between", value1, value2, "yszsbh");
            return (Criteria) this;
        }

        public Criteria andYszsbhNotBetween(String value1, String value2) {
            addCriterion("YSZSBH not between", value1, value2, "yszsbh");
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