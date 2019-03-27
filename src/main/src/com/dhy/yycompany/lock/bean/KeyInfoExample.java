package com.dhy.yycompany.lock.bean;

import java.util.ArrayList;
import java.util.List;

public class KeyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KeyInfoExample() {
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

        public Criteria andKIdIsNull() {
            addCriterion("k_id is null");
            return (Criteria) this;
        }

        public Criteria andKIdIsNotNull() {
            addCriterion("k_id is not null");
            return (Criteria) this;
        }

        public Criteria andKIdEqualTo(Integer value) {
            addCriterion("k_id =", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdNotEqualTo(Integer value) {
            addCriterion("k_id <>", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdGreaterThan(Integer value) {
            addCriterion("k_id >", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("k_id >=", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdLessThan(Integer value) {
            addCriterion("k_id <", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdLessThanOrEqualTo(Integer value) {
            addCriterion("k_id <=", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdIn(List<Integer> values) {
            addCriterion("k_id in", values, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdNotIn(List<Integer> values) {
            addCriterion("k_id not in", values, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdBetween(Integer value1, Integer value2) {
            addCriterion("k_id between", value1, value2, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdNotBetween(Integer value1, Integer value2) {
            addCriterion("k_id not between", value1, value2, "kId");
            return (Criteria) this;
        }

        public Criteria andKUuidIsNull() {
            addCriterion("k_uuid is null");
            return (Criteria) this;
        }

        public Criteria andKUuidIsNotNull() {
            addCriterion("k_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andKUuidEqualTo(String value) {
            addCriterion("k_uuid =", value, "kUuid");
            return (Criteria) this;
        }

        public Criteria andKUuidNotEqualTo(String value) {
            addCriterion("k_uuid <>", value, "kUuid");
            return (Criteria) this;
        }

        public Criteria andKUuidGreaterThan(String value) {
            addCriterion("k_uuid >", value, "kUuid");
            return (Criteria) this;
        }

        public Criteria andKUuidGreaterThanOrEqualTo(String value) {
            addCriterion("k_uuid >=", value, "kUuid");
            return (Criteria) this;
        }

        public Criteria andKUuidLessThan(String value) {
            addCriterion("k_uuid <", value, "kUuid");
            return (Criteria) this;
        }

        public Criteria andKUuidLessThanOrEqualTo(String value) {
            addCriterion("k_uuid <=", value, "kUuid");
            return (Criteria) this;
        }

        public Criteria andKUuidLike(String value) {
            addCriterion("k_uuid like", value, "kUuid");
            return (Criteria) this;
        }

        public Criteria andKUuidNotLike(String value) {
            addCriterion("k_uuid not like", value, "kUuid");
            return (Criteria) this;
        }

        public Criteria andKUuidIn(List<String> values) {
            addCriterion("k_uuid in", values, "kUuid");
            return (Criteria) this;
        }

        public Criteria andKUuidNotIn(List<String> values) {
            addCriterion("k_uuid not in", values, "kUuid");
            return (Criteria) this;
        }

        public Criteria andKUuidBetween(String value1, String value2) {
            addCriterion("k_uuid between", value1, value2, "kUuid");
            return (Criteria) this;
        }

        public Criteria andKUuidNotBetween(String value1, String value2) {
            addCriterion("k_uuid not between", value1, value2, "kUuid");
            return (Criteria) this;
        }

        public Criteria andKLockIdIsNull() {
            addCriterion("k_lock_id is null");
            return (Criteria) this;
        }

        public Criteria andKLockIdIsNotNull() {
            addCriterion("k_lock_id is not null");
            return (Criteria) this;
        }

        public Criteria andKLockIdEqualTo(Integer value) {
            addCriterion("k_lock_id =", value, "kLockId");
            return (Criteria) this;
        }

        public Criteria andKLockIdNotEqualTo(Integer value) {
            addCriterion("k_lock_id <>", value, "kLockId");
            return (Criteria) this;
        }

        public Criteria andKLockIdGreaterThan(Integer value) {
            addCriterion("k_lock_id >", value, "kLockId");
            return (Criteria) this;
        }

        public Criteria andKLockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("k_lock_id >=", value, "kLockId");
            return (Criteria) this;
        }

        public Criteria andKLockIdLessThan(Integer value) {
            addCriterion("k_lock_id <", value, "kLockId");
            return (Criteria) this;
        }

        public Criteria andKLockIdLessThanOrEqualTo(Integer value) {
            addCriterion("k_lock_id <=", value, "kLockId");
            return (Criteria) this;
        }

        public Criteria andKLockIdIn(List<Integer> values) {
            addCriterion("k_lock_id in", values, "kLockId");
            return (Criteria) this;
        }

        public Criteria andKLockIdNotIn(List<Integer> values) {
            addCriterion("k_lock_id not in", values, "kLockId");
            return (Criteria) this;
        }

        public Criteria andKLockIdBetween(Integer value1, Integer value2) {
            addCriterion("k_lock_id between", value1, value2, "kLockId");
            return (Criteria) this;
        }

        public Criteria andKLockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("k_lock_id not between", value1, value2, "kLockId");
            return (Criteria) this;
        }

        public Criteria andKUserIdIsNull() {
            addCriterion("k_user_id is null");
            return (Criteria) this;
        }

        public Criteria andKUserIdIsNotNull() {
            addCriterion("k_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andKUserIdEqualTo(Integer value) {
            addCriterion("k_user_id =", value, "kUserId");
            return (Criteria) this;
        }

        public Criteria andKUserIdNotEqualTo(Integer value) {
            addCriterion("k_user_id <>", value, "kUserId");
            return (Criteria) this;
        }

        public Criteria andKUserIdGreaterThan(Integer value) {
            addCriterion("k_user_id >", value, "kUserId");
            return (Criteria) this;
        }

        public Criteria andKUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("k_user_id >=", value, "kUserId");
            return (Criteria) this;
        }

        public Criteria andKUserIdLessThan(Integer value) {
            addCriterion("k_user_id <", value, "kUserId");
            return (Criteria) this;
        }

        public Criteria andKUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("k_user_id <=", value, "kUserId");
            return (Criteria) this;
        }

        public Criteria andKUserIdIn(List<Integer> values) {
            addCriterion("k_user_id in", values, "kUserId");
            return (Criteria) this;
        }

        public Criteria andKUserIdNotIn(List<Integer> values) {
            addCriterion("k_user_id not in", values, "kUserId");
            return (Criteria) this;
        }

        public Criteria andKUserIdBetween(Integer value1, Integer value2) {
            addCriterion("k_user_id between", value1, value2, "kUserId");
            return (Criteria) this;
        }

        public Criteria andKUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("k_user_id not between", value1, value2, "kUserId");
            return (Criteria) this;
        }

        public Criteria andKPasswordIsNull() {
            addCriterion("k_password is null");
            return (Criteria) this;
        }

        public Criteria andKPasswordIsNotNull() {
            addCriterion("k_password is not null");
            return (Criteria) this;
        }

        public Criteria andKPasswordEqualTo(String value) {
            addCriterion("k_password =", value, "kPassword");
            return (Criteria) this;
        }

        public Criteria andKPasswordNotEqualTo(String value) {
            addCriterion("k_password <>", value, "kPassword");
            return (Criteria) this;
        }

        public Criteria andKPasswordGreaterThan(String value) {
            addCriterion("k_password >", value, "kPassword");
            return (Criteria) this;
        }

        public Criteria andKPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("k_password >=", value, "kPassword");
            return (Criteria) this;
        }

        public Criteria andKPasswordLessThan(String value) {
            addCriterion("k_password <", value, "kPassword");
            return (Criteria) this;
        }

        public Criteria andKPasswordLessThanOrEqualTo(String value) {
            addCriterion("k_password <=", value, "kPassword");
            return (Criteria) this;
        }

        public Criteria andKPasswordLike(String value) {
            addCriterion("k_password like", value, "kPassword");
            return (Criteria) this;
        }

        public Criteria andKPasswordNotLike(String value) {
            addCriterion("k_password not like", value, "kPassword");
            return (Criteria) this;
        }

        public Criteria andKPasswordIn(List<String> values) {
            addCriterion("k_password in", values, "kPassword");
            return (Criteria) this;
        }

        public Criteria andKPasswordNotIn(List<String> values) {
            addCriterion("k_password not in", values, "kPassword");
            return (Criteria) this;
        }

        public Criteria andKPasswordBetween(String value1, String value2) {
            addCriterion("k_password between", value1, value2, "kPassword");
            return (Criteria) this;
        }

        public Criteria andKPasswordNotBetween(String value1, String value2) {
            addCriterion("k_password not between", value1, value2, "kPassword");
            return (Criteria) this;
        }

        public Criteria andKAvailableTimesIsNull() {
            addCriterion("k_available_times is null");
            return (Criteria) this;
        }

        public Criteria andKAvailableTimesIsNotNull() {
            addCriterion("k_available_times is not null");
            return (Criteria) this;
        }

        public Criteria andKAvailableTimesEqualTo(Integer value) {
            addCriterion("k_available_times =", value, "kAvailableTimes");
            return (Criteria) this;
        }

        public Criteria andKAvailableTimesNotEqualTo(Integer value) {
            addCriterion("k_available_times <>", value, "kAvailableTimes");
            return (Criteria) this;
        }

        public Criteria andKAvailableTimesGreaterThan(Integer value) {
            addCriterion("k_available_times >", value, "kAvailableTimes");
            return (Criteria) this;
        }

        public Criteria andKAvailableTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("k_available_times >=", value, "kAvailableTimes");
            return (Criteria) this;
        }

        public Criteria andKAvailableTimesLessThan(Integer value) {
            addCriterion("k_available_times <", value, "kAvailableTimes");
            return (Criteria) this;
        }

        public Criteria andKAvailableTimesLessThanOrEqualTo(Integer value) {
            addCriterion("k_available_times <=", value, "kAvailableTimes");
            return (Criteria) this;
        }

        public Criteria andKAvailableTimesIn(List<Integer> values) {
            addCriterion("k_available_times in", values, "kAvailableTimes");
            return (Criteria) this;
        }

        public Criteria andKAvailableTimesNotIn(List<Integer> values) {
            addCriterion("k_available_times not in", values, "kAvailableTimes");
            return (Criteria) this;
        }

        public Criteria andKAvailableTimesBetween(Integer value1, Integer value2) {
            addCriterion("k_available_times between", value1, value2, "kAvailableTimes");
            return (Criteria) this;
        }

        public Criteria andKAvailableTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("k_available_times not between", value1, value2, "kAvailableTimes");
            return (Criteria) this;
        }

        public Criteria andKIsModifyIsNull() {
            addCriterion("k_is_modify is null");
            return (Criteria) this;
        }

        public Criteria andKIsModifyIsNotNull() {
            addCriterion("k_is_modify is not null");
            return (Criteria) this;
        }

        public Criteria andKIsModifyEqualTo(Integer value) {
            addCriterion("k_is_modify =", value, "kIsModify");
            return (Criteria) this;
        }

        public Criteria andKIsModifyNotEqualTo(Integer value) {
            addCriterion("k_is_modify <>", value, "kIsModify");
            return (Criteria) this;
        }

        public Criteria andKIsModifyGreaterThan(Integer value) {
            addCriterion("k_is_modify >", value, "kIsModify");
            return (Criteria) this;
        }

        public Criteria andKIsModifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("k_is_modify >=", value, "kIsModify");
            return (Criteria) this;
        }

        public Criteria andKIsModifyLessThan(Integer value) {
            addCriterion("k_is_modify <", value, "kIsModify");
            return (Criteria) this;
        }

        public Criteria andKIsModifyLessThanOrEqualTo(Integer value) {
            addCriterion("k_is_modify <=", value, "kIsModify");
            return (Criteria) this;
        }

        public Criteria andKIsModifyIn(List<Integer> values) {
            addCriterion("k_is_modify in", values, "kIsModify");
            return (Criteria) this;
        }

        public Criteria andKIsModifyNotIn(List<Integer> values) {
            addCriterion("k_is_modify not in", values, "kIsModify");
            return (Criteria) this;
        }

        public Criteria andKIsModifyBetween(Integer value1, Integer value2) {
            addCriterion("k_is_modify between", value1, value2, "kIsModify");
            return (Criteria) this;
        }

        public Criteria andKIsModifyNotBetween(Integer value1, Integer value2) {
            addCriterion("k_is_modify not between", value1, value2, "kIsModify");
            return (Criteria) this;
        }

        public Criteria andKDeleteIsNull() {
            addCriterion("k_delete is null");
            return (Criteria) this;
        }

        public Criteria andKDeleteIsNotNull() {
            addCriterion("k_delete is not null");
            return (Criteria) this;
        }

        public Criteria andKDeleteEqualTo(Integer value) {
            addCriterion("k_delete =", value, "kDelete");
            return (Criteria) this;
        }

        public Criteria andKDeleteNotEqualTo(Integer value) {
            addCriterion("k_delete <>", value, "kDelete");
            return (Criteria) this;
        }

        public Criteria andKDeleteGreaterThan(Integer value) {
            addCriterion("k_delete >", value, "kDelete");
            return (Criteria) this;
        }

        public Criteria andKDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("k_delete >=", value, "kDelete");
            return (Criteria) this;
        }

        public Criteria andKDeleteLessThan(Integer value) {
            addCriterion("k_delete <", value, "kDelete");
            return (Criteria) this;
        }

        public Criteria andKDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("k_delete <=", value, "kDelete");
            return (Criteria) this;
        }

        public Criteria andKDeleteIn(List<Integer> values) {
            addCriterion("k_delete in", values, "kDelete");
            return (Criteria) this;
        }

        public Criteria andKDeleteNotIn(List<Integer> values) {
            addCriterion("k_delete not in", values, "kDelete");
            return (Criteria) this;
        }

        public Criteria andKDeleteBetween(Integer value1, Integer value2) {
            addCriterion("k_delete between", value1, value2, "kDelete");
            return (Criteria) this;
        }

        public Criteria andKDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("k_delete not between", value1, value2, "kDelete");
            return (Criteria) this;
        }

        public Criteria andKFailureTimeIsNull() {
            addCriterion("k_failure_time is null");
            return (Criteria) this;
        }

        public Criteria andKFailureTimeIsNotNull() {
            addCriterion("k_failure_time is not null");
            return (Criteria) this;
        }

        public Criteria andKFailureTimeEqualTo(String value) {
            addCriterion("k_failure_time =", value, "kFailureTime");
            return (Criteria) this;
        }

        public Criteria andKFailureTimeNotEqualTo(String value) {
            addCriterion("k_failure_time <>", value, "kFailureTime");
            return (Criteria) this;
        }

        public Criteria andKFailureTimeGreaterThan(String value) {
            addCriterion("k_failure_time >", value, "kFailureTime");
            return (Criteria) this;
        }

        public Criteria andKFailureTimeGreaterThanOrEqualTo(String value) {
            addCriterion("k_failure_time >=", value, "kFailureTime");
            return (Criteria) this;
        }

        public Criteria andKFailureTimeLessThan(String value) {
            addCriterion("k_failure_time <", value, "kFailureTime");
            return (Criteria) this;
        }

        public Criteria andKFailureTimeLessThanOrEqualTo(String value) {
            addCriterion("k_failure_time <=", value, "kFailureTime");
            return (Criteria) this;
        }

        public Criteria andKFailureTimeLike(String value) {
            addCriterion("k_failure_time like", value, "kFailureTime");
            return (Criteria) this;
        }

        public Criteria andKFailureTimeNotLike(String value) {
            addCriterion("k_failure_time not like", value, "kFailureTime");
            return (Criteria) this;
        }

        public Criteria andKFailureTimeIn(List<String> values) {
            addCriterion("k_failure_time in", values, "kFailureTime");
            return (Criteria) this;
        }

        public Criteria andKFailureTimeNotIn(List<String> values) {
            addCriterion("k_failure_time not in", values, "kFailureTime");
            return (Criteria) this;
        }

        public Criteria andKFailureTimeBetween(String value1, String value2) {
            addCriterion("k_failure_time between", value1, value2, "kFailureTime");
            return (Criteria) this;
        }

        public Criteria andKFailureTimeNotBetween(String value1, String value2) {
            addCriterion("k_failure_time not between", value1, value2, "kFailureTime");
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