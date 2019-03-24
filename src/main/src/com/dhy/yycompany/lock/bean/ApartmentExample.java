package com.dhy.yycompany.lock.bean;

import java.util.ArrayList;
import java.util.List;

public class ApartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApartmentExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAUuidIsNull() {
            addCriterion("a_uuid is null");
            return (Criteria) this;
        }

        public Criteria andAUuidIsNotNull() {
            addCriterion("a_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andAUuidEqualTo(String value) {
            addCriterion("a_uuid =", value, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidNotEqualTo(String value) {
            addCriterion("a_uuid <>", value, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidGreaterThan(String value) {
            addCriterion("a_uuid >", value, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidGreaterThanOrEqualTo(String value) {
            addCriterion("a_uuid >=", value, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidLessThan(String value) {
            addCriterion("a_uuid <", value, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidLessThanOrEqualTo(String value) {
            addCriterion("a_uuid <=", value, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidLike(String value) {
            addCriterion("a_uuid like", value, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidNotLike(String value) {
            addCriterion("a_uuid not like", value, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidIn(List<String> values) {
            addCriterion("a_uuid in", values, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidNotIn(List<String> values) {
            addCriterion("a_uuid not in", values, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidBetween(String value1, String value2) {
            addCriterion("a_uuid between", value1, value2, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidNotBetween(String value1, String value2) {
            addCriterion("a_uuid not between", value1, value2, "aUuid");
            return (Criteria) this;
        }

        public Criteria andANameIsNull() {
            addCriterion("a_name is null");
            return (Criteria) this;
        }

        public Criteria andANameIsNotNull() {
            addCriterion("a_name is not null");
            return (Criteria) this;
        }

        public Criteria andANameEqualTo(String value) {
            addCriterion("a_name =", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotEqualTo(String value) {
            addCriterion("a_name <>", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThan(String value) {
            addCriterion("a_name >", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThanOrEqualTo(String value) {
            addCriterion("a_name >=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThan(String value) {
            addCriterion("a_name <", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThanOrEqualTo(String value) {
            addCriterion("a_name <=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLike(String value) {
            addCriterion("a_name like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotLike(String value) {
            addCriterion("a_name not like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameIn(List<String> values) {
            addCriterion("a_name in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotIn(List<String> values) {
            addCriterion("a_name not in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameBetween(String value1, String value2) {
            addCriterion("a_name between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotBetween(String value1, String value2) {
            addCriterion("a_name not between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andAFloorNumIsNull() {
            addCriterion("a_floor_num is null");
            return (Criteria) this;
        }

        public Criteria andAFloorNumIsNotNull() {
            addCriterion("a_floor_num is not null");
            return (Criteria) this;
        }

        public Criteria andAFloorNumEqualTo(String value) {
            addCriterion("a_floor_num =", value, "aFloorNum");
            return (Criteria) this;
        }

        public Criteria andAFloorNumNotEqualTo(String value) {
            addCriterion("a_floor_num <>", value, "aFloorNum");
            return (Criteria) this;
        }

        public Criteria andAFloorNumGreaterThan(String value) {
            addCriterion("a_floor_num >", value, "aFloorNum");
            return (Criteria) this;
        }

        public Criteria andAFloorNumGreaterThanOrEqualTo(String value) {
            addCriterion("a_floor_num >=", value, "aFloorNum");
            return (Criteria) this;
        }

        public Criteria andAFloorNumLessThan(String value) {
            addCriterion("a_floor_num <", value, "aFloorNum");
            return (Criteria) this;
        }

        public Criteria andAFloorNumLessThanOrEqualTo(String value) {
            addCriterion("a_floor_num <=", value, "aFloorNum");
            return (Criteria) this;
        }

        public Criteria andAFloorNumLike(String value) {
            addCriterion("a_floor_num like", value, "aFloorNum");
            return (Criteria) this;
        }

        public Criteria andAFloorNumNotLike(String value) {
            addCriterion("a_floor_num not like", value, "aFloorNum");
            return (Criteria) this;
        }

        public Criteria andAFloorNumIn(List<String> values) {
            addCriterion("a_floor_num in", values, "aFloorNum");
            return (Criteria) this;
        }

        public Criteria andAFloorNumNotIn(List<String> values) {
            addCriterion("a_floor_num not in", values, "aFloorNum");
            return (Criteria) this;
        }

        public Criteria andAFloorNumBetween(String value1, String value2) {
            addCriterion("a_floor_num between", value1, value2, "aFloorNum");
            return (Criteria) this;
        }

        public Criteria andAFloorNumNotBetween(String value1, String value2) {
            addCriterion("a_floor_num not between", value1, value2, "aFloorNum");
            return (Criteria) this;
        }

        public Criteria andADeleteIsNull() {
            addCriterion("a_delete is null");
            return (Criteria) this;
        }

        public Criteria andADeleteIsNotNull() {
            addCriterion("a_delete is not null");
            return (Criteria) this;
        }

        public Criteria andADeleteEqualTo(Integer value) {
            addCriterion("a_delete =", value, "aDelete");
            return (Criteria) this;
        }

        public Criteria andADeleteNotEqualTo(Integer value) {
            addCriterion("a_delete <>", value, "aDelete");
            return (Criteria) this;
        }

        public Criteria andADeleteGreaterThan(Integer value) {
            addCriterion("a_delete >", value, "aDelete");
            return (Criteria) this;
        }

        public Criteria andADeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_delete >=", value, "aDelete");
            return (Criteria) this;
        }

        public Criteria andADeleteLessThan(Integer value) {
            addCriterion("a_delete <", value, "aDelete");
            return (Criteria) this;
        }

        public Criteria andADeleteLessThanOrEqualTo(Integer value) {
            addCriterion("a_delete <=", value, "aDelete");
            return (Criteria) this;
        }

        public Criteria andADeleteIn(List<Integer> values) {
            addCriterion("a_delete in", values, "aDelete");
            return (Criteria) this;
        }

        public Criteria andADeleteNotIn(List<Integer> values) {
            addCriterion("a_delete not in", values, "aDelete");
            return (Criteria) this;
        }

        public Criteria andADeleteBetween(Integer value1, Integer value2) {
            addCriterion("a_delete between", value1, value2, "aDelete");
            return (Criteria) this;
        }

        public Criteria andADeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("a_delete not between", value1, value2, "aDelete");
            return (Criteria) this;
        }

        public Criteria andAModifyIsNull() {
            addCriterion("a_modify is null");
            return (Criteria) this;
        }

        public Criteria andAModifyIsNotNull() {
            addCriterion("a_modify is not null");
            return (Criteria) this;
        }

        public Criteria andAModifyEqualTo(Integer value) {
            addCriterion("a_modify =", value, "aModify");
            return (Criteria) this;
        }

        public Criteria andAModifyNotEqualTo(Integer value) {
            addCriterion("a_modify <>", value, "aModify");
            return (Criteria) this;
        }

        public Criteria andAModifyGreaterThan(Integer value) {
            addCriterion("a_modify >", value, "aModify");
            return (Criteria) this;
        }

        public Criteria andAModifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_modify >=", value, "aModify");
            return (Criteria) this;
        }

        public Criteria andAModifyLessThan(Integer value) {
            addCriterion("a_modify <", value, "aModify");
            return (Criteria) this;
        }

        public Criteria andAModifyLessThanOrEqualTo(Integer value) {
            addCriterion("a_modify <=", value, "aModify");
            return (Criteria) this;
        }

        public Criteria andAModifyIn(List<Integer> values) {
            addCriterion("a_modify in", values, "aModify");
            return (Criteria) this;
        }

        public Criteria andAModifyNotIn(List<Integer> values) {
            addCriterion("a_modify not in", values, "aModify");
            return (Criteria) this;
        }

        public Criteria andAModifyBetween(Integer value1, Integer value2) {
            addCriterion("a_modify between", value1, value2, "aModify");
            return (Criteria) this;
        }

        public Criteria andAModifyNotBetween(Integer value1, Integer value2) {
            addCriterion("a_modify not between", value1, value2, "aModify");
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