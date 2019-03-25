package com.dhy.yycompany.lock.bean;

import java.util.ArrayList;
import java.util.List;

public class VRoomUserLockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VRoomUserLockExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_id not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andLIdIsNull() {
            addCriterion("l_id is null");
            return (Criteria) this;
        }

        public Criteria andLIdIsNotNull() {
            addCriterion("l_id is not null");
            return (Criteria) this;
        }

        public Criteria andLIdEqualTo(Integer value) {
            addCriterion("l_id =", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotEqualTo(Integer value) {
            addCriterion("l_id <>", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThan(Integer value) {
            addCriterion("l_id >", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_id >=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThan(Integer value) {
            addCriterion("l_id <", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThanOrEqualTo(Integer value) {
            addCriterion("l_id <=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdIn(List<Integer> values) {
            addCriterion("l_id in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotIn(List<Integer> values) {
            addCriterion("l_id not in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdBetween(Integer value1, Integer value2) {
            addCriterion("l_id between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotBetween(Integer value1, Integer value2) {
            addCriterion("l_id not between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andStayTimeIsNull() {
            addCriterion("stay_time is null");
            return (Criteria) this;
        }

        public Criteria andStayTimeIsNotNull() {
            addCriterion("stay_time is not null");
            return (Criteria) this;
        }

        public Criteria andStayTimeEqualTo(String value) {
            addCriterion("stay_time =", value, "stayTime");
            return (Criteria) this;
        }

        public Criteria andStayTimeNotEqualTo(String value) {
            addCriterion("stay_time <>", value, "stayTime");
            return (Criteria) this;
        }

        public Criteria andStayTimeGreaterThan(String value) {
            addCriterion("stay_time >", value, "stayTime");
            return (Criteria) this;
        }

        public Criteria andStayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("stay_time >=", value, "stayTime");
            return (Criteria) this;
        }

        public Criteria andStayTimeLessThan(String value) {
            addCriterion("stay_time <", value, "stayTime");
            return (Criteria) this;
        }

        public Criteria andStayTimeLessThanOrEqualTo(String value) {
            addCriterion("stay_time <=", value, "stayTime");
            return (Criteria) this;
        }

        public Criteria andStayTimeLike(String value) {
            addCriterion("stay_time like", value, "stayTime");
            return (Criteria) this;
        }

        public Criteria andStayTimeNotLike(String value) {
            addCriterion("stay_time not like", value, "stayTime");
            return (Criteria) this;
        }

        public Criteria andStayTimeIn(List<String> values) {
            addCriterion("stay_time in", values, "stayTime");
            return (Criteria) this;
        }

        public Criteria andStayTimeNotIn(List<String> values) {
            addCriterion("stay_time not in", values, "stayTime");
            return (Criteria) this;
        }

        public Criteria andStayTimeBetween(String value1, String value2) {
            addCriterion("stay_time between", value1, value2, "stayTime");
            return (Criteria) this;
        }

        public Criteria andStayTimeNotBetween(String value1, String value2) {
            addCriterion("stay_time not between", value1, value2, "stayTime");
            return (Criteria) this;
        }

        public Criteria andRetreatTimeIsNull() {
            addCriterion("retreat_time is null");
            return (Criteria) this;
        }

        public Criteria andRetreatTimeIsNotNull() {
            addCriterion("retreat_time is not null");
            return (Criteria) this;
        }

        public Criteria andRetreatTimeEqualTo(String value) {
            addCriterion("retreat_time =", value, "retreatTime");
            return (Criteria) this;
        }

        public Criteria andRetreatTimeNotEqualTo(String value) {
            addCriterion("retreat_time <>", value, "retreatTime");
            return (Criteria) this;
        }

        public Criteria andRetreatTimeGreaterThan(String value) {
            addCriterion("retreat_time >", value, "retreatTime");
            return (Criteria) this;
        }

        public Criteria andRetreatTimeGreaterThanOrEqualTo(String value) {
            addCriterion("retreat_time >=", value, "retreatTime");
            return (Criteria) this;
        }

        public Criteria andRetreatTimeLessThan(String value) {
            addCriterion("retreat_time <", value, "retreatTime");
            return (Criteria) this;
        }

        public Criteria andRetreatTimeLessThanOrEqualTo(String value) {
            addCriterion("retreat_time <=", value, "retreatTime");
            return (Criteria) this;
        }

        public Criteria andRetreatTimeLike(String value) {
            addCriterion("retreat_time like", value, "retreatTime");
            return (Criteria) this;
        }

        public Criteria andRetreatTimeNotLike(String value) {
            addCriterion("retreat_time not like", value, "retreatTime");
            return (Criteria) this;
        }

        public Criteria andRetreatTimeIn(List<String> values) {
            addCriterion("retreat_time in", values, "retreatTime");
            return (Criteria) this;
        }

        public Criteria andRetreatTimeNotIn(List<String> values) {
            addCriterion("retreat_time not in", values, "retreatTime");
            return (Criteria) this;
        }

        public Criteria andRetreatTimeBetween(String value1, String value2) {
            addCriterion("retreat_time between", value1, value2, "retreatTime");
            return (Criteria) this;
        }

        public Criteria andRetreatTimeNotBetween(String value1, String value2) {
            addCriterion("retreat_time not between", value1, value2, "retreatTime");
            return (Criteria) this;
        }

        public Criteria andResidentNumIsNull() {
            addCriterion("resident_num is null");
            return (Criteria) this;
        }

        public Criteria andResidentNumIsNotNull() {
            addCriterion("resident_num is not null");
            return (Criteria) this;
        }

        public Criteria andResidentNumEqualTo(Integer value) {
            addCriterion("resident_num =", value, "residentNum");
            return (Criteria) this;
        }

        public Criteria andResidentNumNotEqualTo(Integer value) {
            addCriterion("resident_num <>", value, "residentNum");
            return (Criteria) this;
        }

        public Criteria andResidentNumGreaterThan(Integer value) {
            addCriterion("resident_num >", value, "residentNum");
            return (Criteria) this;
        }

        public Criteria andResidentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("resident_num >=", value, "residentNum");
            return (Criteria) this;
        }

        public Criteria andResidentNumLessThan(Integer value) {
            addCriterion("resident_num <", value, "residentNum");
            return (Criteria) this;
        }

        public Criteria andResidentNumLessThanOrEqualTo(Integer value) {
            addCriterion("resident_num <=", value, "residentNum");
            return (Criteria) this;
        }

        public Criteria andResidentNumIn(List<Integer> values) {
            addCriterion("resident_num in", values, "residentNum");
            return (Criteria) this;
        }

        public Criteria andResidentNumNotIn(List<Integer> values) {
            addCriterion("resident_num not in", values, "residentNum");
            return (Criteria) this;
        }

        public Criteria andResidentNumBetween(Integer value1, Integer value2) {
            addCriterion("resident_num between", value1, value2, "residentNum");
            return (Criteria) this;
        }

        public Criteria andResidentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("resident_num not between", value1, value2, "residentNum");
            return (Criteria) this;
        }

        public Criteria andLStatusIsNull() {
            addCriterion("l_status is null");
            return (Criteria) this;
        }

        public Criteria andLStatusIsNotNull() {
            addCriterion("l_status is not null");
            return (Criteria) this;
        }

        public Criteria andLStatusEqualTo(Integer value) {
            addCriterion("l_status =", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusNotEqualTo(Integer value) {
            addCriterion("l_status <>", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusGreaterThan(Integer value) {
            addCriterion("l_status >", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_status >=", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusLessThan(Integer value) {
            addCriterion("l_status <", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusLessThanOrEqualTo(Integer value) {
            addCriterion("l_status <=", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusIn(List<Integer> values) {
            addCriterion("l_status in", values, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusNotIn(List<Integer> values) {
            addCriterion("l_status not in", values, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusBetween(Integer value1, Integer value2) {
            addCriterion("l_status between", value1, value2, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("l_status not between", value1, value2, "lStatus");
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