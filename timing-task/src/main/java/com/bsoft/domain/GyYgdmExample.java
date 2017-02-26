package com.bsoft.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GyYgdmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GyYgdmExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andYgdmIsNull() {
            addCriterion("YGDM is null");
            return (Criteria) this;
        }

        public Criteria andYgdmIsNotNull() {
            addCriterion("YGDM is not null");
            return (Criteria) this;
        }

        public Criteria andYgdmEqualTo(String value) {
            addCriterion("YGDM =", value, "ygdm");
            return (Criteria) this;
        }

        public Criteria andYgdmNotEqualTo(String value) {
            addCriterion("YGDM <>", value, "ygdm");
            return (Criteria) this;
        }

        public Criteria andYgdmGreaterThan(String value) {
            addCriterion("YGDM >", value, "ygdm");
            return (Criteria) this;
        }

        public Criteria andYgdmGreaterThanOrEqualTo(String value) {
            addCriterion("YGDM >=", value, "ygdm");
            return (Criteria) this;
        }

        public Criteria andYgdmLessThan(String value) {
            addCriterion("YGDM <", value, "ygdm");
            return (Criteria) this;
        }

        public Criteria andYgdmLessThanOrEqualTo(String value) {
            addCriterion("YGDM <=", value, "ygdm");
            return (Criteria) this;
        }

        public Criteria andYgdmLike(String value) {
            addCriterion("YGDM like", value, "ygdm");
            return (Criteria) this;
        }

        public Criteria andYgdmNotLike(String value) {
            addCriterion("YGDM not like", value, "ygdm");
            return (Criteria) this;
        }

        public Criteria andYgdmIn(List<String> values) {
            addCriterion("YGDM in", values, "ygdm");
            return (Criteria) this;
        }

        public Criteria andYgdmNotIn(List<String> values) {
            addCriterion("YGDM not in", values, "ygdm");
            return (Criteria) this;
        }

        public Criteria andYgdmBetween(String value1, String value2) {
            addCriterion("YGDM between", value1, value2, "ygdm");
            return (Criteria) this;
        }

        public Criteria andYgdmNotBetween(String value1, String value2) {
            addCriterion("YGDM not between", value1, value2, "ygdm");
            return (Criteria) this;
        }

        public Criteria andJgidIsNull() {
            addCriterion("JGID is null");
            return (Criteria) this;
        }

        public Criteria andJgidIsNotNull() {
            addCriterion("JGID is not null");
            return (Criteria) this;
        }

        public Criteria andJgidEqualTo(Integer value) {
            addCriterion("JGID =", value, "jgid");
            return (Criteria) this;
        }

        public Criteria andJgidNotEqualTo(Integer value) {
            addCriterion("JGID <>", value, "jgid");
            return (Criteria) this;
        }

        public Criteria andJgidGreaterThan(Integer value) {
            addCriterion("JGID >", value, "jgid");
            return (Criteria) this;
        }

        public Criteria andJgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("JGID >=", value, "jgid");
            return (Criteria) this;
        }

        public Criteria andJgidLessThan(Integer value) {
            addCriterion("JGID <", value, "jgid");
            return (Criteria) this;
        }

        public Criteria andJgidLessThanOrEqualTo(Integer value) {
            addCriterion("JGID <=", value, "jgid");
            return (Criteria) this;
        }

        public Criteria andJgidIn(List<Integer> values) {
            addCriterion("JGID in", values, "jgid");
            return (Criteria) this;
        }

        public Criteria andJgidNotIn(List<Integer> values) {
            addCriterion("JGID not in", values, "jgid");
            return (Criteria) this;
        }

        public Criteria andJgidBetween(Integer value1, Integer value2) {
            addCriterion("JGID between", value1, value2, "jgid");
            return (Criteria) this;
        }

        public Criteria andJgidNotBetween(Integer value1, Integer value2) {
            addCriterion("JGID not between", value1, value2, "jgid");
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

        public Criteria andKsdmEqualTo(Long value) {
            addCriterion("KSDM =", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmNotEqualTo(Long value) {
            addCriterion("KSDM <>", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmGreaterThan(Long value) {
            addCriterion("KSDM >", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmGreaterThanOrEqualTo(Long value) {
            addCriterion("KSDM >=", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmLessThan(Long value) {
            addCriterion("KSDM <", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmLessThanOrEqualTo(Long value) {
            addCriterion("KSDM <=", value, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmIn(List<Long> values) {
            addCriterion("KSDM in", values, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmNotIn(List<Long> values) {
            addCriterion("KSDM not in", values, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmBetween(Long value1, Long value2) {
            addCriterion("KSDM between", value1, value2, "ksdm");
            return (Criteria) this;
        }

        public Criteria andKsdmNotBetween(Long value1, Long value2) {
            addCriterion("KSDM not between", value1, value2, "ksdm");
            return (Criteria) this;
        }

        public Criteria andYgxmIsNull() {
            addCriterion("YGXM is null");
            return (Criteria) this;
        }

        public Criteria andYgxmIsNotNull() {
            addCriterion("YGXM is not null");
            return (Criteria) this;
        }

        public Criteria andYgxmEqualTo(String value) {
            addCriterion("YGXM =", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmNotEqualTo(String value) {
            addCriterion("YGXM <>", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmGreaterThan(String value) {
            addCriterion("YGXM >", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmGreaterThanOrEqualTo(String value) {
            addCriterion("YGXM >=", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmLessThan(String value) {
            addCriterion("YGXM <", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmLessThanOrEqualTo(String value) {
            addCriterion("YGXM <=", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmLike(String value) {
            addCriterion("YGXM like", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmNotLike(String value) {
            addCriterion("YGXM not like", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmIn(List<String> values) {
            addCriterion("YGXM in", values, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmNotIn(List<String> values) {
            addCriterion("YGXM not in", values, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmBetween(String value1, String value2) {
            addCriterion("YGXM between", value1, value2, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmNotBetween(String value1, String value2) {
            addCriterion("YGXM not between", value1, value2, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxbIsNull() {
            addCriterion("YGXB is null");
            return (Criteria) this;
        }

        public Criteria andYgxbIsNotNull() {
            addCriterion("YGXB is not null");
            return (Criteria) this;
        }

        public Criteria andYgxbEqualTo(Short value) {
            addCriterion("YGXB =", value, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbNotEqualTo(Short value) {
            addCriterion("YGXB <>", value, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbGreaterThan(Short value) {
            addCriterion("YGXB >", value, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbGreaterThanOrEqualTo(Short value) {
            addCriterion("YGXB >=", value, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbLessThan(Short value) {
            addCriterion("YGXB <", value, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbLessThanOrEqualTo(Short value) {
            addCriterion("YGXB <=", value, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbIn(List<Short> values) {
            addCriterion("YGXB in", values, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbNotIn(List<Short> values) {
            addCriterion("YGXB not in", values, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbBetween(Short value1, Short value2) {
            addCriterion("YGXB between", value1, value2, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbNotBetween(Short value1, Short value2) {
            addCriterion("YGXB not between", value1, value2, "ygxb");
            return (Criteria) this;
        }

        public Criteria andCsnyIsNull() {
            addCriterion("CSNY is null");
            return (Criteria) this;
        }

        public Criteria andCsnyIsNotNull() {
            addCriterion("CSNY is not null");
            return (Criteria) this;
        }

        public Criteria andCsnyEqualTo(Date value) {
            addCriterionForJDBCDate("CSNY =", value, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyNotEqualTo(Date value) {
            addCriterionForJDBCDate("CSNY <>", value, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyGreaterThan(Date value) {
            addCriterionForJDBCDate("CSNY >", value, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CSNY >=", value, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyLessThan(Date value) {
            addCriterionForJDBCDate("CSNY <", value, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CSNY <=", value, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyIn(List<Date> values) {
            addCriterionForJDBCDate("CSNY in", values, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyNotIn(List<Date> values) {
            addCriterionForJDBCDate("CSNY not in", values, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CSNY between", value1, value2, "csny");
            return (Criteria) this;
        }

        public Criteria andCsnyNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CSNY not between", value1, value2, "csny");
            return (Criteria) this;
        }

        public Criteria andYgzwIsNull() {
            addCriterion("YGZW is null");
            return (Criteria) this;
        }

        public Criteria andYgzwIsNotNull() {
            addCriterion("YGZW is not null");
            return (Criteria) this;
        }

        public Criteria andYgzwEqualTo(Short value) {
            addCriterion("YGZW =", value, "ygzw");
            return (Criteria) this;
        }

        public Criteria andYgzwNotEqualTo(Short value) {
            addCriterion("YGZW <>", value, "ygzw");
            return (Criteria) this;
        }

        public Criteria andYgzwGreaterThan(Short value) {
            addCriterion("YGZW >", value, "ygzw");
            return (Criteria) this;
        }

        public Criteria andYgzwGreaterThanOrEqualTo(Short value) {
            addCriterion("YGZW >=", value, "ygzw");
            return (Criteria) this;
        }

        public Criteria andYgzwLessThan(Short value) {
            addCriterion("YGZW <", value, "ygzw");
            return (Criteria) this;
        }

        public Criteria andYgzwLessThanOrEqualTo(Short value) {
            addCriterion("YGZW <=", value, "ygzw");
            return (Criteria) this;
        }

        public Criteria andYgzwIn(List<Short> values) {
            addCriterion("YGZW in", values, "ygzw");
            return (Criteria) this;
        }

        public Criteria andYgzwNotIn(List<Short> values) {
            addCriterion("YGZW not in", values, "ygzw");
            return (Criteria) this;
        }

        public Criteria andYgzwBetween(Short value1, Short value2) {
            addCriterion("YGZW between", value1, value2, "ygzw");
            return (Criteria) this;
        }

        public Criteria andYgzwNotBetween(Short value1, Short value2) {
            addCriterion("YGZW not between", value1, value2, "ygzw");
            return (Criteria) this;
        }

        public Criteria andYgjbIsNull() {
            addCriterion("YGJB is null");
            return (Criteria) this;
        }

        public Criteria andYgjbIsNotNull() {
            addCriterion("YGJB is not null");
            return (Criteria) this;
        }

        public Criteria andYgjbEqualTo(Short value) {
            addCriterion("YGJB =", value, "ygjb");
            return (Criteria) this;
        }

        public Criteria andYgjbNotEqualTo(Short value) {
            addCriterion("YGJB <>", value, "ygjb");
            return (Criteria) this;
        }

        public Criteria andYgjbGreaterThan(Short value) {
            addCriterion("YGJB >", value, "ygjb");
            return (Criteria) this;
        }

        public Criteria andYgjbGreaterThanOrEqualTo(Short value) {
            addCriterion("YGJB >=", value, "ygjb");
            return (Criteria) this;
        }

        public Criteria andYgjbLessThan(Short value) {
            addCriterion("YGJB <", value, "ygjb");
            return (Criteria) this;
        }

        public Criteria andYgjbLessThanOrEqualTo(Short value) {
            addCriterion("YGJB <=", value, "ygjb");
            return (Criteria) this;
        }

        public Criteria andYgjbIn(List<Short> values) {
            addCriterion("YGJB in", values, "ygjb");
            return (Criteria) this;
        }

        public Criteria andYgjbNotIn(List<Short> values) {
            addCriterion("YGJB not in", values, "ygjb");
            return (Criteria) this;
        }

        public Criteria andYgjbBetween(Short value1, Short value2) {
            addCriterion("YGJB between", value1, value2, "ygjb");
            return (Criteria) this;
        }

        public Criteria andYgjbNotBetween(Short value1, Short value2) {
            addCriterion("YGJB not between", value1, value2, "ygjb");
            return (Criteria) this;
        }

        public Criteria andPydmIsNull() {
            addCriterion("PYDM is null");
            return (Criteria) this;
        }

        public Criteria andPydmIsNotNull() {
            addCriterion("PYDM is not null");
            return (Criteria) this;
        }

        public Criteria andPydmEqualTo(String value) {
            addCriterion("PYDM =", value, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmNotEqualTo(String value) {
            addCriterion("PYDM <>", value, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmGreaterThan(String value) {
            addCriterion("PYDM >", value, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmGreaterThanOrEqualTo(String value) {
            addCriterion("PYDM >=", value, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmLessThan(String value) {
            addCriterion("PYDM <", value, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmLessThanOrEqualTo(String value) {
            addCriterion("PYDM <=", value, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmLike(String value) {
            addCriterion("PYDM like", value, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmNotLike(String value) {
            addCriterion("PYDM not like", value, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmIn(List<String> values) {
            addCriterion("PYDM in", values, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmNotIn(List<String> values) {
            addCriterion("PYDM not in", values, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmBetween(String value1, String value2) {
            addCriterion("PYDM between", value1, value2, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmNotBetween(String value1, String value2) {
            addCriterion("PYDM not between", value1, value2, "pydm");
            return (Criteria) this;
        }

        public Criteria andWbdmIsNull() {
            addCriterion("WBDM is null");
            return (Criteria) this;
        }

        public Criteria andWbdmIsNotNull() {
            addCriterion("WBDM is not null");
            return (Criteria) this;
        }

        public Criteria andWbdmEqualTo(String value) {
            addCriterion("WBDM =", value, "wbdm");
            return (Criteria) this;
        }

        public Criteria andWbdmNotEqualTo(String value) {
            addCriterion("WBDM <>", value, "wbdm");
            return (Criteria) this;
        }

        public Criteria andWbdmGreaterThan(String value) {
            addCriterion("WBDM >", value, "wbdm");
            return (Criteria) this;
        }

        public Criteria andWbdmGreaterThanOrEqualTo(String value) {
            addCriterion("WBDM >=", value, "wbdm");
            return (Criteria) this;
        }

        public Criteria andWbdmLessThan(String value) {
            addCriterion("WBDM <", value, "wbdm");
            return (Criteria) this;
        }

        public Criteria andWbdmLessThanOrEqualTo(String value) {
            addCriterion("WBDM <=", value, "wbdm");
            return (Criteria) this;
        }

        public Criteria andWbdmLike(String value) {
            addCriterion("WBDM like", value, "wbdm");
            return (Criteria) this;
        }

        public Criteria andWbdmNotLike(String value) {
            addCriterion("WBDM not like", value, "wbdm");
            return (Criteria) this;
        }

        public Criteria andWbdmIn(List<String> values) {
            addCriterion("WBDM in", values, "wbdm");
            return (Criteria) this;
        }

        public Criteria andWbdmNotIn(List<String> values) {
            addCriterion("WBDM not in", values, "wbdm");
            return (Criteria) this;
        }

        public Criteria andWbdmBetween(String value1, String value2) {
            addCriterion("WBDM between", value1, value2, "wbdm");
            return (Criteria) this;
        }

        public Criteria andWbdmNotBetween(String value1, String value2) {
            addCriterion("WBDM not between", value1, value2, "wbdm");
            return (Criteria) this;
        }

        public Criteria andJxdmIsNull() {
            addCriterion("JXDM is null");
            return (Criteria) this;
        }

        public Criteria andJxdmIsNotNull() {
            addCriterion("JXDM is not null");
            return (Criteria) this;
        }

        public Criteria andJxdmEqualTo(String value) {
            addCriterion("JXDM =", value, "jxdm");
            return (Criteria) this;
        }

        public Criteria andJxdmNotEqualTo(String value) {
            addCriterion("JXDM <>", value, "jxdm");
            return (Criteria) this;
        }

        public Criteria andJxdmGreaterThan(String value) {
            addCriterion("JXDM >", value, "jxdm");
            return (Criteria) this;
        }

        public Criteria andJxdmGreaterThanOrEqualTo(String value) {
            addCriterion("JXDM >=", value, "jxdm");
            return (Criteria) this;
        }

        public Criteria andJxdmLessThan(String value) {
            addCriterion("JXDM <", value, "jxdm");
            return (Criteria) this;
        }

        public Criteria andJxdmLessThanOrEqualTo(String value) {
            addCriterion("JXDM <=", value, "jxdm");
            return (Criteria) this;
        }

        public Criteria andJxdmLike(String value) {
            addCriterion("JXDM like", value, "jxdm");
            return (Criteria) this;
        }

        public Criteria andJxdmNotLike(String value) {
            addCriterion("JXDM not like", value, "jxdm");
            return (Criteria) this;
        }

        public Criteria andJxdmIn(List<String> values) {
            addCriterion("JXDM in", values, "jxdm");
            return (Criteria) this;
        }

        public Criteria andJxdmNotIn(List<String> values) {
            addCriterion("JXDM not in", values, "jxdm");
            return (Criteria) this;
        }

        public Criteria andJxdmBetween(String value1, String value2) {
            addCriterion("JXDM between", value1, value2, "jxdm");
            return (Criteria) this;
        }

        public Criteria andJxdmNotBetween(String value1, String value2) {
            addCriterion("JXDM not between", value1, value2, "jxdm");
            return (Criteria) this;
        }

        public Criteria andQtdmIsNull() {
            addCriterion("QTDM is null");
            return (Criteria) this;
        }

        public Criteria andQtdmIsNotNull() {
            addCriterion("QTDM is not null");
            return (Criteria) this;
        }

        public Criteria andQtdmEqualTo(String value) {
            addCriterion("QTDM =", value, "qtdm");
            return (Criteria) this;
        }

        public Criteria andQtdmNotEqualTo(String value) {
            addCriterion("QTDM <>", value, "qtdm");
            return (Criteria) this;
        }

        public Criteria andQtdmGreaterThan(String value) {
            addCriterion("QTDM >", value, "qtdm");
            return (Criteria) this;
        }

        public Criteria andQtdmGreaterThanOrEqualTo(String value) {
            addCriterion("QTDM >=", value, "qtdm");
            return (Criteria) this;
        }

        public Criteria andQtdmLessThan(String value) {
            addCriterion("QTDM <", value, "qtdm");
            return (Criteria) this;
        }

        public Criteria andQtdmLessThanOrEqualTo(String value) {
            addCriterion("QTDM <=", value, "qtdm");
            return (Criteria) this;
        }

        public Criteria andQtdmLike(String value) {
            addCriterion("QTDM like", value, "qtdm");
            return (Criteria) this;
        }

        public Criteria andQtdmNotLike(String value) {
            addCriterion("QTDM not like", value, "qtdm");
            return (Criteria) this;
        }

        public Criteria andQtdmIn(List<String> values) {
            addCriterion("QTDM in", values, "qtdm");
            return (Criteria) this;
        }

        public Criteria andQtdmNotIn(List<String> values) {
            addCriterion("QTDM not in", values, "qtdm");
            return (Criteria) this;
        }

        public Criteria andQtdmBetween(String value1, String value2) {
            addCriterion("QTDM between", value1, value2, "qtdm");
            return (Criteria) this;
        }

        public Criteria andQtdmNotBetween(String value1, String value2) {
            addCriterion("QTDM not between", value1, value2, "qtdm");
            return (Criteria) this;
        }

        public Criteria andKcfqIsNull() {
            addCriterion("KCFQ is null");
            return (Criteria) this;
        }

        public Criteria andKcfqIsNotNull() {
            addCriterion("KCFQ is not null");
            return (Criteria) this;
        }

        public Criteria andKcfqEqualTo(String value) {
            addCriterion("KCFQ =", value, "kcfq");
            return (Criteria) this;
        }

        public Criteria andKcfqNotEqualTo(String value) {
            addCriterion("KCFQ <>", value, "kcfq");
            return (Criteria) this;
        }

        public Criteria andKcfqGreaterThan(String value) {
            addCriterion("KCFQ >", value, "kcfq");
            return (Criteria) this;
        }

        public Criteria andKcfqGreaterThanOrEqualTo(String value) {
            addCriterion("KCFQ >=", value, "kcfq");
            return (Criteria) this;
        }

        public Criteria andKcfqLessThan(String value) {
            addCriterion("KCFQ <", value, "kcfq");
            return (Criteria) this;
        }

        public Criteria andKcfqLessThanOrEqualTo(String value) {
            addCriterion("KCFQ <=", value, "kcfq");
            return (Criteria) this;
        }

        public Criteria andKcfqLike(String value) {
            addCriterion("KCFQ like", value, "kcfq");
            return (Criteria) this;
        }

        public Criteria andKcfqNotLike(String value) {
            addCriterion("KCFQ not like", value, "kcfq");
            return (Criteria) this;
        }

        public Criteria andKcfqIn(List<String> values) {
            addCriterion("KCFQ in", values, "kcfq");
            return (Criteria) this;
        }

        public Criteria andKcfqNotIn(List<String> values) {
            addCriterion("KCFQ not in", values, "kcfq");
            return (Criteria) this;
        }

        public Criteria andKcfqBetween(String value1, String value2) {
            addCriterion("KCFQ between", value1, value2, "kcfq");
            return (Criteria) this;
        }

        public Criteria andKcfqNotBetween(String value1, String value2) {
            addCriterion("KCFQ not between", value1, value2, "kcfq");
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

        public Criteria andZjpbIsNull() {
            addCriterion("ZJPB is null");
            return (Criteria) this;
        }

        public Criteria andZjpbIsNotNull() {
            addCriterion("ZJPB is not null");
            return (Criteria) this;
        }

        public Criteria andZjpbEqualTo(Short value) {
            addCriterion("ZJPB =", value, "zjpb");
            return (Criteria) this;
        }

        public Criteria andZjpbNotEqualTo(Short value) {
            addCriterion("ZJPB <>", value, "zjpb");
            return (Criteria) this;
        }

        public Criteria andZjpbGreaterThan(Short value) {
            addCriterion("ZJPB >", value, "zjpb");
            return (Criteria) this;
        }

        public Criteria andZjpbGreaterThanOrEqualTo(Short value) {
            addCriterion("ZJPB >=", value, "zjpb");
            return (Criteria) this;
        }

        public Criteria andZjpbLessThan(Short value) {
            addCriterion("ZJPB <", value, "zjpb");
            return (Criteria) this;
        }

        public Criteria andZjpbLessThanOrEqualTo(Short value) {
            addCriterion("ZJPB <=", value, "zjpb");
            return (Criteria) this;
        }

        public Criteria andZjpbIn(List<Short> values) {
            addCriterion("ZJPB in", values, "zjpb");
            return (Criteria) this;
        }

        public Criteria andZjpbNotIn(List<Short> values) {
            addCriterion("ZJPB not in", values, "zjpb");
            return (Criteria) this;
        }

        public Criteria andZjpbBetween(Short value1, Short value2) {
            addCriterion("ZJPB between", value1, value2, "zjpb");
            return (Criteria) this;
        }

        public Criteria andZjpbNotBetween(Short value1, Short value2) {
            addCriterion("ZJPB not between", value1, value2, "zjpb");
            return (Criteria) this;
        }

        public Criteria andZjfyIsNull() {
            addCriterion("ZJFY is null");
            return (Criteria) this;
        }

        public Criteria andZjfyIsNotNull() {
            addCriterion("ZJFY is not null");
            return (Criteria) this;
        }

        public Criteria andZjfyEqualTo(BigDecimal value) {
            addCriterion("ZJFY =", value, "zjfy");
            return (Criteria) this;
        }

        public Criteria andZjfyNotEqualTo(BigDecimal value) {
            addCriterion("ZJFY <>", value, "zjfy");
            return (Criteria) this;
        }

        public Criteria andZjfyGreaterThan(BigDecimal value) {
            addCriterion("ZJFY >", value, "zjfy");
            return (Criteria) this;
        }

        public Criteria andZjfyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZJFY >=", value, "zjfy");
            return (Criteria) this;
        }

        public Criteria andZjfyLessThan(BigDecimal value) {
            addCriterion("ZJFY <", value, "zjfy");
            return (Criteria) this;
        }

        public Criteria andZjfyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZJFY <=", value, "zjfy");
            return (Criteria) this;
        }

        public Criteria andZjfyIn(List<BigDecimal> values) {
            addCriterion("ZJFY in", values, "zjfy");
            return (Criteria) this;
        }

        public Criteria andZjfyNotIn(List<BigDecimal> values) {
            addCriterion("ZJFY not in", values, "zjfy");
            return (Criteria) this;
        }

        public Criteria andZjfyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZJFY between", value1, value2, "zjfy");
            return (Criteria) this;
        }

        public Criteria andZjfyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZJFY not between", value1, value2, "zjfy");
            return (Criteria) this;
        }

        public Criteria andZfpbIsNull() {
            addCriterion("ZFPB is null");
            return (Criteria) this;
        }

        public Criteria andZfpbIsNotNull() {
            addCriterion("ZFPB is not null");
            return (Criteria) this;
        }

        public Criteria andZfpbEqualTo(Short value) {
            addCriterion("ZFPB =", value, "zfpb");
            return (Criteria) this;
        }

        public Criteria andZfpbNotEqualTo(Short value) {
            addCriterion("ZFPB <>", value, "zfpb");
            return (Criteria) this;
        }

        public Criteria andZfpbGreaterThan(Short value) {
            addCriterion("ZFPB >", value, "zfpb");
            return (Criteria) this;
        }

        public Criteria andZfpbGreaterThanOrEqualTo(Short value) {
            addCriterion("ZFPB >=", value, "zfpb");
            return (Criteria) this;
        }

        public Criteria andZfpbLessThan(Short value) {
            addCriterion("ZFPB <", value, "zfpb");
            return (Criteria) this;
        }

        public Criteria andZfpbLessThanOrEqualTo(Short value) {
            addCriterion("ZFPB <=", value, "zfpb");
            return (Criteria) this;
        }

        public Criteria andZfpbIn(List<Short> values) {
            addCriterion("ZFPB in", values, "zfpb");
            return (Criteria) this;
        }

        public Criteria andZfpbNotIn(List<Short> values) {
            addCriterion("ZFPB not in", values, "zfpb");
            return (Criteria) this;
        }

        public Criteria andZfpbBetween(Short value1, Short value2) {
            addCriterion("ZFPB between", value1, value2, "zfpb");
            return (Criteria) this;
        }

        public Criteria andZfpbNotBetween(Short value1, Short value2) {
            addCriterion("ZFPB not between", value1, value2, "zfpb");
            return (Criteria) this;
        }

        public Criteria andYsjjIsNull() {
            addCriterion("YSJJ is null");
            return (Criteria) this;
        }

        public Criteria andYsjjIsNotNull() {
            addCriterion("YSJJ is not null");
            return (Criteria) this;
        }

        public Criteria andYsjjEqualTo(String value) {
            addCriterion("YSJJ =", value, "ysjj");
            return (Criteria) this;
        }

        public Criteria andYsjjNotEqualTo(String value) {
            addCriterion("YSJJ <>", value, "ysjj");
            return (Criteria) this;
        }

        public Criteria andYsjjGreaterThan(String value) {
            addCriterion("YSJJ >", value, "ysjj");
            return (Criteria) this;
        }

        public Criteria andYsjjGreaterThanOrEqualTo(String value) {
            addCriterion("YSJJ >=", value, "ysjj");
            return (Criteria) this;
        }

        public Criteria andYsjjLessThan(String value) {
            addCriterion("YSJJ <", value, "ysjj");
            return (Criteria) this;
        }

        public Criteria andYsjjLessThanOrEqualTo(String value) {
            addCriterion("YSJJ <=", value, "ysjj");
            return (Criteria) this;
        }

        public Criteria andYsjjLike(String value) {
            addCriterion("YSJJ like", value, "ysjj");
            return (Criteria) this;
        }

        public Criteria andYsjjNotLike(String value) {
            addCriterion("YSJJ not like", value, "ysjj");
            return (Criteria) this;
        }

        public Criteria andYsjjIn(List<String> values) {
            addCriterion("YSJJ in", values, "ysjj");
            return (Criteria) this;
        }

        public Criteria andYsjjNotIn(List<String> values) {
            addCriterion("YSJJ not in", values, "ysjj");
            return (Criteria) this;
        }

        public Criteria andYsjjBetween(String value1, String value2) {
            addCriterion("YSJJ between", value1, value2, "ysjj");
            return (Criteria) this;
        }

        public Criteria andYsjjNotBetween(String value1, String value2) {
            addCriterion("YSJJ not between", value1, value2, "ysjj");
            return (Criteria) this;
        }

        public Criteria andJzsjSwIsNull() {
            addCriterion("JZSJ_SW is null");
            return (Criteria) this;
        }

        public Criteria andJzsjSwIsNotNull() {
            addCriterion("JZSJ_SW is not null");
            return (Criteria) this;
        }

        public Criteria andJzsjSwEqualTo(Date value) {
            addCriterionForJDBCDate("JZSJ_SW =", value, "jzsjSw");
            return (Criteria) this;
        }

        public Criteria andJzsjSwNotEqualTo(Date value) {
            addCriterionForJDBCDate("JZSJ_SW <>", value, "jzsjSw");
            return (Criteria) this;
        }

        public Criteria andJzsjSwGreaterThan(Date value) {
            addCriterionForJDBCDate("JZSJ_SW >", value, "jzsjSw");
            return (Criteria) this;
        }

        public Criteria andJzsjSwGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JZSJ_SW >=", value, "jzsjSw");
            return (Criteria) this;
        }

        public Criteria andJzsjSwLessThan(Date value) {
            addCriterionForJDBCDate("JZSJ_SW <", value, "jzsjSw");
            return (Criteria) this;
        }

        public Criteria andJzsjSwLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JZSJ_SW <=", value, "jzsjSw");
            return (Criteria) this;
        }

        public Criteria andJzsjSwIn(List<Date> values) {
            addCriterionForJDBCDate("JZSJ_SW in", values, "jzsjSw");
            return (Criteria) this;
        }

        public Criteria andJzsjSwNotIn(List<Date> values) {
            addCriterionForJDBCDate("JZSJ_SW not in", values, "jzsjSw");
            return (Criteria) this;
        }

        public Criteria andJzsjSwBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JZSJ_SW between", value1, value2, "jzsjSw");
            return (Criteria) this;
        }

        public Criteria andJzsjSwNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JZSJ_SW not between", value1, value2, "jzsjSw");
            return (Criteria) this;
        }

        public Criteria andJzsjXwIsNull() {
            addCriterion("JZSJ_XW is null");
            return (Criteria) this;
        }

        public Criteria andJzsjXwIsNotNull() {
            addCriterion("JZSJ_XW is not null");
            return (Criteria) this;
        }

        public Criteria andJzsjXwEqualTo(Date value) {
            addCriterionForJDBCDate("JZSJ_XW =", value, "jzsjXw");
            return (Criteria) this;
        }

        public Criteria andJzsjXwNotEqualTo(Date value) {
            addCriterionForJDBCDate("JZSJ_XW <>", value, "jzsjXw");
            return (Criteria) this;
        }

        public Criteria andJzsjXwGreaterThan(Date value) {
            addCriterionForJDBCDate("JZSJ_XW >", value, "jzsjXw");
            return (Criteria) this;
        }

        public Criteria andJzsjXwGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JZSJ_XW >=", value, "jzsjXw");
            return (Criteria) this;
        }

        public Criteria andJzsjXwLessThan(Date value) {
            addCriterionForJDBCDate("JZSJ_XW <", value, "jzsjXw");
            return (Criteria) this;
        }

        public Criteria andJzsjXwLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JZSJ_XW <=", value, "jzsjXw");
            return (Criteria) this;
        }

        public Criteria andJzsjXwIn(List<Date> values) {
            addCriterionForJDBCDate("JZSJ_XW in", values, "jzsjXw");
            return (Criteria) this;
        }

        public Criteria andJzsjXwNotIn(List<Date> values) {
            addCriterionForJDBCDate("JZSJ_XW not in", values, "jzsjXw");
            return (Criteria) this;
        }

        public Criteria andJzsjXwBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JZSJ_XW between", value1, value2, "jzsjXw");
            return (Criteria) this;
        }

        public Criteria andJzsjXwNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JZSJ_XW not between", value1, value2, "jzsjXw");
            return (Criteria) this;
        }

        public Criteria andYgbhIsNull() {
            addCriterion("YGBH is null");
            return (Criteria) this;
        }

        public Criteria andYgbhIsNotNull() {
            addCriterion("YGBH is not null");
            return (Criteria) this;
        }

        public Criteria andYgbhEqualTo(String value) {
            addCriterion("YGBH =", value, "ygbh");
            return (Criteria) this;
        }

        public Criteria andYgbhNotEqualTo(String value) {
            addCriterion("YGBH <>", value, "ygbh");
            return (Criteria) this;
        }

        public Criteria andYgbhGreaterThan(String value) {
            addCriterion("YGBH >", value, "ygbh");
            return (Criteria) this;
        }

        public Criteria andYgbhGreaterThanOrEqualTo(String value) {
            addCriterion("YGBH >=", value, "ygbh");
            return (Criteria) this;
        }

        public Criteria andYgbhLessThan(String value) {
            addCriterion("YGBH <", value, "ygbh");
            return (Criteria) this;
        }

        public Criteria andYgbhLessThanOrEqualTo(String value) {
            addCriterion("YGBH <=", value, "ygbh");
            return (Criteria) this;
        }

        public Criteria andYgbhLike(String value) {
            addCriterion("YGBH like", value, "ygbh");
            return (Criteria) this;
        }

        public Criteria andYgbhNotLike(String value) {
            addCriterion("YGBH not like", value, "ygbh");
            return (Criteria) this;
        }

        public Criteria andYgbhIn(List<String> values) {
            addCriterion("YGBH in", values, "ygbh");
            return (Criteria) this;
        }

        public Criteria andYgbhNotIn(List<String> values) {
            addCriterion("YGBH not in", values, "ygbh");
            return (Criteria) this;
        }

        public Criteria andYgbhBetween(String value1, String value2) {
            addCriterion("YGBH between", value1, value2, "ygbh");
            return (Criteria) this;
        }

        public Criteria andYgbhNotBetween(String value1, String value2) {
            addCriterion("YGBH not between", value1, value2, "ygbh");
            return (Criteria) this;
        }

        public Criteria andYgmmIsNull() {
            addCriterion("YGMM is null");
            return (Criteria) this;
        }

        public Criteria andYgmmIsNotNull() {
            addCriterion("YGMM is not null");
            return (Criteria) this;
        }

        public Criteria andYgmmEqualTo(String value) {
            addCriterion("YGMM =", value, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmNotEqualTo(String value) {
            addCriterion("YGMM <>", value, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmGreaterThan(String value) {
            addCriterion("YGMM >", value, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmGreaterThanOrEqualTo(String value) {
            addCriterion("YGMM >=", value, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmLessThan(String value) {
            addCriterion("YGMM <", value, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmLessThanOrEqualTo(String value) {
            addCriterion("YGMM <=", value, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmLike(String value) {
            addCriterion("YGMM like", value, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmNotLike(String value) {
            addCriterion("YGMM not like", value, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmIn(List<String> values) {
            addCriterion("YGMM in", values, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmNotIn(List<String> values) {
            addCriterion("YGMM not in", values, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmBetween(String value1, String value2) {
            addCriterion("YGMM between", value1, value2, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmNotBetween(String value1, String value2) {
            addCriterion("YGMM not between", value1, value2, "ygmm");
            return (Criteria) this;
        }

        public Criteria andKsyqIsNull() {
            addCriterion("KSYQ is null");
            return (Criteria) this;
        }

        public Criteria andKsyqIsNotNull() {
            addCriterion("KSYQ is not null");
            return (Criteria) this;
        }

        public Criteria andKsyqEqualTo(Short value) {
            addCriterion("KSYQ =", value, "ksyq");
            return (Criteria) this;
        }

        public Criteria andKsyqNotEqualTo(Short value) {
            addCriterion("KSYQ <>", value, "ksyq");
            return (Criteria) this;
        }

        public Criteria andKsyqGreaterThan(Short value) {
            addCriterion("KSYQ >", value, "ksyq");
            return (Criteria) this;
        }

        public Criteria andKsyqGreaterThanOrEqualTo(Short value) {
            addCriterion("KSYQ >=", value, "ksyq");
            return (Criteria) this;
        }

        public Criteria andKsyqLessThan(Short value) {
            addCriterion("KSYQ <", value, "ksyq");
            return (Criteria) this;
        }

        public Criteria andKsyqLessThanOrEqualTo(Short value) {
            addCriterion("KSYQ <=", value, "ksyq");
            return (Criteria) this;
        }

        public Criteria andKsyqIn(List<Short> values) {
            addCriterion("KSYQ in", values, "ksyq");
            return (Criteria) this;
        }

        public Criteria andKsyqNotIn(List<Short> values) {
            addCriterion("KSYQ not in", values, "ksyq");
            return (Criteria) this;
        }

        public Criteria andKsyqBetween(Short value1, Short value2) {
            addCriterion("KSYQ between", value1, value2, "ksyq");
            return (Criteria) this;
        }

        public Criteria andKsyqNotBetween(Short value1, Short value2) {
            addCriterion("KSYQ not between", value1, value2, "ksyq");
            return (Criteria) this;
        }

        public Criteria andSjhmIsNull() {
            addCriterion("SJHM is null");
            return (Criteria) this;
        }

        public Criteria andSjhmIsNotNull() {
            addCriterion("SJHM is not null");
            return (Criteria) this;
        }

        public Criteria andSjhmEqualTo(String value) {
            addCriterion("SJHM =", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotEqualTo(String value) {
            addCriterion("SJHM <>", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmGreaterThan(String value) {
            addCriterion("SJHM >", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmGreaterThanOrEqualTo(String value) {
            addCriterion("SJHM >=", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmLessThan(String value) {
            addCriterion("SJHM <", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmLessThanOrEqualTo(String value) {
            addCriterion("SJHM <=", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmLike(String value) {
            addCriterion("SJHM like", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotLike(String value) {
            addCriterion("SJHM not like", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmIn(List<String> values) {
            addCriterion("SJHM in", values, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotIn(List<String> values) {
            addCriterion("SJHM not in", values, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmBetween(String value1, String value2) {
            addCriterion("SJHM between", value1, value2, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotBetween(String value1, String value2) {
            addCriterion("SJHM not between", value1, value2, "sjhm");
            return (Criteria) this;
        }

        public Criteria andYxdzIsNull() {
            addCriterion("YXDZ is null");
            return (Criteria) this;
        }

        public Criteria andYxdzIsNotNull() {
            addCriterion("YXDZ is not null");
            return (Criteria) this;
        }

        public Criteria andYxdzEqualTo(String value) {
            addCriterion("YXDZ =", value, "yxdz");
            return (Criteria) this;
        }

        public Criteria andYxdzNotEqualTo(String value) {
            addCriterion("YXDZ <>", value, "yxdz");
            return (Criteria) this;
        }

        public Criteria andYxdzGreaterThan(String value) {
            addCriterion("YXDZ >", value, "yxdz");
            return (Criteria) this;
        }

        public Criteria andYxdzGreaterThanOrEqualTo(String value) {
            addCriterion("YXDZ >=", value, "yxdz");
            return (Criteria) this;
        }

        public Criteria andYxdzLessThan(String value) {
            addCriterion("YXDZ <", value, "yxdz");
            return (Criteria) this;
        }

        public Criteria andYxdzLessThanOrEqualTo(String value) {
            addCriterion("YXDZ <=", value, "yxdz");
            return (Criteria) this;
        }

        public Criteria andYxdzLike(String value) {
            addCriterion("YXDZ like", value, "yxdz");
            return (Criteria) this;
        }

        public Criteria andYxdzNotLike(String value) {
            addCriterion("YXDZ not like", value, "yxdz");
            return (Criteria) this;
        }

        public Criteria andYxdzIn(List<String> values) {
            addCriterion("YXDZ in", values, "yxdz");
            return (Criteria) this;
        }

        public Criteria andYxdzNotIn(List<String> values) {
            addCriterion("YXDZ not in", values, "yxdz");
            return (Criteria) this;
        }

        public Criteria andYxdzBetween(String value1, String value2) {
            addCriterion("YXDZ between", value1, value2, "yxdz");
            return (Criteria) this;
        }

        public Criteria andYxdzNotBetween(String value1, String value2) {
            addCriterion("YXDZ not between", value1, value2, "yxdz");
            return (Criteria) this;
        }

        public Criteria andZxdmIsNull() {
            addCriterion("ZXDM is null");
            return (Criteria) this;
        }

        public Criteria andZxdmIsNotNull() {
            addCriterion("ZXDM is not null");
            return (Criteria) this;
        }

        public Criteria andZxdmEqualTo(String value) {
            addCriterion("ZXDM =", value, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmNotEqualTo(String value) {
            addCriterion("ZXDM <>", value, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmGreaterThan(String value) {
            addCriterion("ZXDM >", value, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmGreaterThanOrEqualTo(String value) {
            addCriterion("ZXDM >=", value, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmLessThan(String value) {
            addCriterion("ZXDM <", value, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmLessThanOrEqualTo(String value) {
            addCriterion("ZXDM <=", value, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmLike(String value) {
            addCriterion("ZXDM like", value, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmNotLike(String value) {
            addCriterion("ZXDM not like", value, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmIn(List<String> values) {
            addCriterion("ZXDM in", values, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmNotIn(List<String> values) {
            addCriterion("ZXDM not in", values, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmBetween(String value1, String value2) {
            addCriterion("ZXDM between", value1, value2, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxdmNotBetween(String value1, String value2) {
            addCriterion("ZXDM not between", value1, value2, "zxdm");
            return (Criteria) this;
        }

        public Criteria andZxmmIsNull() {
            addCriterion("ZXMM is null");
            return (Criteria) this;
        }

        public Criteria andZxmmIsNotNull() {
            addCriterion("ZXMM is not null");
            return (Criteria) this;
        }

        public Criteria andZxmmEqualTo(String value) {
            addCriterion("ZXMM =", value, "zxmm");
            return (Criteria) this;
        }

        public Criteria andZxmmNotEqualTo(String value) {
            addCriterion("ZXMM <>", value, "zxmm");
            return (Criteria) this;
        }

        public Criteria andZxmmGreaterThan(String value) {
            addCriterion("ZXMM >", value, "zxmm");
            return (Criteria) this;
        }

        public Criteria andZxmmGreaterThanOrEqualTo(String value) {
            addCriterion("ZXMM >=", value, "zxmm");
            return (Criteria) this;
        }

        public Criteria andZxmmLessThan(String value) {
            addCriterion("ZXMM <", value, "zxmm");
            return (Criteria) this;
        }

        public Criteria andZxmmLessThanOrEqualTo(String value) {
            addCriterion("ZXMM <=", value, "zxmm");
            return (Criteria) this;
        }

        public Criteria andZxmmLike(String value) {
            addCriterion("ZXMM like", value, "zxmm");
            return (Criteria) this;
        }

        public Criteria andZxmmNotLike(String value) {
            addCriterion("ZXMM not like", value, "zxmm");
            return (Criteria) this;
        }

        public Criteria andZxmmIn(List<String> values) {
            addCriterion("ZXMM in", values, "zxmm");
            return (Criteria) this;
        }

        public Criteria andZxmmNotIn(List<String> values) {
            addCriterion("ZXMM not in", values, "zxmm");
            return (Criteria) this;
        }

        public Criteria andZxmmBetween(String value1, String value2) {
            addCriterion("ZXMM between", value1, value2, "zxmm");
            return (Criteria) this;
        }

        public Criteria andZxmmNotBetween(String value1, String value2) {
            addCriterion("ZXMM not between", value1, value2, "zxmm");
            return (Criteria) this;
        }

        public Criteria andZxjsIsNull() {
            addCriterion("ZXJS is null");
            return (Criteria) this;
        }

        public Criteria andZxjsIsNotNull() {
            addCriterion("ZXJS is not null");
            return (Criteria) this;
        }

        public Criteria andZxjsEqualTo(String value) {
            addCriterion("ZXJS =", value, "zxjs");
            return (Criteria) this;
        }

        public Criteria andZxjsNotEqualTo(String value) {
            addCriterion("ZXJS <>", value, "zxjs");
            return (Criteria) this;
        }

        public Criteria andZxjsGreaterThan(String value) {
            addCriterion("ZXJS >", value, "zxjs");
            return (Criteria) this;
        }

        public Criteria andZxjsGreaterThanOrEqualTo(String value) {
            addCriterion("ZXJS >=", value, "zxjs");
            return (Criteria) this;
        }

        public Criteria andZxjsLessThan(String value) {
            addCriterion("ZXJS <", value, "zxjs");
            return (Criteria) this;
        }

        public Criteria andZxjsLessThanOrEqualTo(String value) {
            addCriterion("ZXJS <=", value, "zxjs");
            return (Criteria) this;
        }

        public Criteria andZxjsLike(String value) {
            addCriterion("ZXJS like", value, "zxjs");
            return (Criteria) this;
        }

        public Criteria andZxjsNotLike(String value) {
            addCriterion("ZXJS not like", value, "zxjs");
            return (Criteria) this;
        }

        public Criteria andZxjsIn(List<String> values) {
            addCriterion("ZXJS in", values, "zxjs");
            return (Criteria) this;
        }

        public Criteria andZxjsNotIn(List<String> values) {
            addCriterion("ZXJS not in", values, "zxjs");
            return (Criteria) this;
        }

        public Criteria andZxjsBetween(String value1, String value2) {
            addCriterion("ZXJS between", value1, value2, "zxjs");
            return (Criteria) this;
        }

        public Criteria andZxjsNotBetween(String value1, String value2) {
            addCriterion("ZXJS not between", value1, value2, "zxjs");
            return (Criteria) this;
        }

        public Criteria andKssqIsNull() {
            addCriterion("KSSQ is null");
            return (Criteria) this;
        }

        public Criteria andKssqIsNotNull() {
            addCriterion("KSSQ is not null");
            return (Criteria) this;
        }

        public Criteria andKssqEqualTo(Short value) {
            addCriterion("KSSQ =", value, "kssq");
            return (Criteria) this;
        }

        public Criteria andKssqNotEqualTo(Short value) {
            addCriterion("KSSQ <>", value, "kssq");
            return (Criteria) this;
        }

        public Criteria andKssqGreaterThan(Short value) {
            addCriterion("KSSQ >", value, "kssq");
            return (Criteria) this;
        }

        public Criteria andKssqGreaterThanOrEqualTo(Short value) {
            addCriterion("KSSQ >=", value, "kssq");
            return (Criteria) this;
        }

        public Criteria andKssqLessThan(Short value) {
            addCriterion("KSSQ <", value, "kssq");
            return (Criteria) this;
        }

        public Criteria andKssqLessThanOrEqualTo(Short value) {
            addCriterion("KSSQ <=", value, "kssq");
            return (Criteria) this;
        }

        public Criteria andKssqIn(List<Short> values) {
            addCriterion("KSSQ in", values, "kssq");
            return (Criteria) this;
        }

        public Criteria andKssqNotIn(List<Short> values) {
            addCriterion("KSSQ not in", values, "kssq");
            return (Criteria) this;
        }

        public Criteria andKssqBetween(Short value1, Short value2) {
            addCriterion("KSSQ between", value1, value2, "kssq");
            return (Criteria) this;
        }

        public Criteria andKssqNotBetween(Short value1, Short value2) {
            addCriterion("KSSQ not between", value1, value2, "kssq");
            return (Criteria) this;
        }

        public Criteria andTskssqIsNull() {
            addCriterion("TSKSSQ is null");
            return (Criteria) this;
        }

        public Criteria andTskssqIsNotNull() {
            addCriterion("TSKSSQ is not null");
            return (Criteria) this;
        }

        public Criteria andTskssqEqualTo(Short value) {
            addCriterion("TSKSSQ =", value, "tskssq");
            return (Criteria) this;
        }

        public Criteria andTskssqNotEqualTo(Short value) {
            addCriterion("TSKSSQ <>", value, "tskssq");
            return (Criteria) this;
        }

        public Criteria andTskssqGreaterThan(Short value) {
            addCriterion("TSKSSQ >", value, "tskssq");
            return (Criteria) this;
        }

        public Criteria andTskssqGreaterThanOrEqualTo(Short value) {
            addCriterion("TSKSSQ >=", value, "tskssq");
            return (Criteria) this;
        }

        public Criteria andTskssqLessThan(Short value) {
            addCriterion("TSKSSQ <", value, "tskssq");
            return (Criteria) this;
        }

        public Criteria andTskssqLessThanOrEqualTo(Short value) {
            addCriterion("TSKSSQ <=", value, "tskssq");
            return (Criteria) this;
        }

        public Criteria andTskssqIn(List<Short> values) {
            addCriterion("TSKSSQ in", values, "tskssq");
            return (Criteria) this;
        }

        public Criteria andTskssqNotIn(List<Short> values) {
            addCriterion("TSKSSQ not in", values, "tskssq");
            return (Criteria) this;
        }

        public Criteria andTskssqBetween(Short value1, Short value2) {
            addCriterion("TSKSSQ between", value1, value2, "tskssq");
            return (Criteria) this;
        }

        public Criteria andTskssqNotBetween(Short value1, Short value2) {
            addCriterion("TSKSSQ not between", value1, value2, "tskssq");
            return (Criteria) this;
        }

        public Criteria andYgjsIsNull() {
            addCriterion("YGJS is null");
            return (Criteria) this;
        }

        public Criteria andYgjsIsNotNull() {
            addCriterion("YGJS is not null");
            return (Criteria) this;
        }

        public Criteria andYgjsEqualTo(Short value) {
            addCriterion("YGJS =", value, "ygjs");
            return (Criteria) this;
        }

        public Criteria andYgjsNotEqualTo(Short value) {
            addCriterion("YGJS <>", value, "ygjs");
            return (Criteria) this;
        }

        public Criteria andYgjsGreaterThan(Short value) {
            addCriterion("YGJS >", value, "ygjs");
            return (Criteria) this;
        }

        public Criteria andYgjsGreaterThanOrEqualTo(Short value) {
            addCriterion("YGJS >=", value, "ygjs");
            return (Criteria) this;
        }

        public Criteria andYgjsLessThan(Short value) {
            addCriterion("YGJS <", value, "ygjs");
            return (Criteria) this;
        }

        public Criteria andYgjsLessThanOrEqualTo(Short value) {
            addCriterion("YGJS <=", value, "ygjs");
            return (Criteria) this;
        }

        public Criteria andYgjsIn(List<Short> values) {
            addCriterion("YGJS in", values, "ygjs");
            return (Criteria) this;
        }

        public Criteria andYgjsNotIn(List<Short> values) {
            addCriterion("YGJS not in", values, "ygjs");
            return (Criteria) this;
        }

        public Criteria andYgjsBetween(Short value1, Short value2) {
            addCriterion("YGJS between", value1, value2, "ygjs");
            return (Criteria) this;
        }

        public Criteria andYgjsNotBetween(Short value1, Short value2) {
            addCriterion("YGJS not between", value1, value2, "ygjs");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNull() {
            addCriterion("LXDH is null");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNotNull() {
            addCriterion("LXDH is not null");
            return (Criteria) this;
        }

        public Criteria andLxdhEqualTo(String value) {
            addCriterion("LXDH =", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotEqualTo(String value) {
            addCriterion("LXDH <>", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThan(String value) {
            addCriterion("LXDH >", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThanOrEqualTo(String value) {
            addCriterion("LXDH >=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThan(String value) {
            addCriterion("LXDH <", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThanOrEqualTo(String value) {
            addCriterion("LXDH <=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLike(String value) {
            addCriterion("LXDH like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotLike(String value) {
            addCriterion("LXDH not like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhIn(List<String> values) {
            addCriterion("LXDH in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotIn(List<String> values) {
            addCriterion("LXDH not in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhBetween(String value1, String value2) {
            addCriterion("LXDH between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotBetween(String value1, String value2) {
            addCriterion("LXDH not between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andBzxxIsNull() {
            addCriterion("BZXX is null");
            return (Criteria) this;
        }

        public Criteria andBzxxIsNotNull() {
            addCriterion("BZXX is not null");
            return (Criteria) this;
        }

        public Criteria andBzxxEqualTo(String value) {
            addCriterion("BZXX =", value, "bzxx");
            return (Criteria) this;
        }

        public Criteria andBzxxNotEqualTo(String value) {
            addCriterion("BZXX <>", value, "bzxx");
            return (Criteria) this;
        }

        public Criteria andBzxxGreaterThan(String value) {
            addCriterion("BZXX >", value, "bzxx");
            return (Criteria) this;
        }

        public Criteria andBzxxGreaterThanOrEqualTo(String value) {
            addCriterion("BZXX >=", value, "bzxx");
            return (Criteria) this;
        }

        public Criteria andBzxxLessThan(String value) {
            addCriterion("BZXX <", value, "bzxx");
            return (Criteria) this;
        }

        public Criteria andBzxxLessThanOrEqualTo(String value) {
            addCriterion("BZXX <=", value, "bzxx");
            return (Criteria) this;
        }

        public Criteria andBzxxLike(String value) {
            addCriterion("BZXX like", value, "bzxx");
            return (Criteria) this;
        }

        public Criteria andBzxxNotLike(String value) {
            addCriterion("BZXX not like", value, "bzxx");
            return (Criteria) this;
        }

        public Criteria andBzxxIn(List<String> values) {
            addCriterion("BZXX in", values, "bzxx");
            return (Criteria) this;
        }

        public Criteria andBzxxNotIn(List<String> values) {
            addCriterion("BZXX not in", values, "bzxx");
            return (Criteria) this;
        }

        public Criteria andBzxxBetween(String value1, String value2) {
            addCriterion("BZXX between", value1, value2, "bzxx");
            return (Criteria) this;
        }

        public Criteria andBzxxNotBetween(String value1, String value2) {
            addCriterion("BZXX not between", value1, value2, "bzxx");
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