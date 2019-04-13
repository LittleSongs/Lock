package com.dhy.yycompany.lock.bean;

import java.util.ArrayList;
import java.util.List;

public class RentingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RentingExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Integer value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Integer value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Integer value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Integer value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Integer> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Integer> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRentTimeIsNull() {
            addCriterion("rent_time is null");
            return (Criteria) this;
        }

        public Criteria andRentTimeIsNotNull() {
            addCriterion("rent_time is not null");
            return (Criteria) this;
        }

        public Criteria andRentTimeEqualTo(String value) {
            addCriterion("rent_time =", value, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeNotEqualTo(String value) {
            addCriterion("rent_time <>", value, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeGreaterThan(String value) {
            addCriterion("rent_time >", value, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("rent_time >=", value, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeLessThan(String value) {
            addCriterion("rent_time <", value, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeLessThanOrEqualTo(String value) {
            addCriterion("rent_time <=", value, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeLike(String value) {
            addCriterion("rent_time like", value, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeNotLike(String value) {
            addCriterion("rent_time not like", value, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeIn(List<String> values) {
            addCriterion("rent_time in", values, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeNotIn(List<String> values) {
            addCriterion("rent_time not in", values, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeBetween(String value1, String value2) {
            addCriterion("rent_time between", value1, value2, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeNotBetween(String value1, String value2) {
            addCriterion("rent_time not between", value1, value2, "rentTime");
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