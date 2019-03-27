package com.dhy.yycompany.lock.bean;

import java.util.ArrayList;
import java.util.List;

public class VKeyUsernameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VKeyUsernameExample() {
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

        public Criteria andUUuidIsNull() {
            addCriterion("u_uuid is null");
            return (Criteria) this;
        }

        public Criteria andUUuidIsNotNull() {
            addCriterion("u_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUUuidEqualTo(String value) {
            addCriterion("u_uuid =", value, "uUuid");
            return (Criteria) this;
        }

        public Criteria andUUuidNotEqualTo(String value) {
            addCriterion("u_uuid <>", value, "uUuid");
            return (Criteria) this;
        }

        public Criteria andUUuidGreaterThan(String value) {
            addCriterion("u_uuid >", value, "uUuid");
            return (Criteria) this;
        }

        public Criteria andUUuidGreaterThanOrEqualTo(String value) {
            addCriterion("u_uuid >=", value, "uUuid");
            return (Criteria) this;
        }

        public Criteria andUUuidLessThan(String value) {
            addCriterion("u_uuid <", value, "uUuid");
            return (Criteria) this;
        }

        public Criteria andUUuidLessThanOrEqualTo(String value) {
            addCriterion("u_uuid <=", value, "uUuid");
            return (Criteria) this;
        }

        public Criteria andUUuidLike(String value) {
            addCriterion("u_uuid like", value, "uUuid");
            return (Criteria) this;
        }

        public Criteria andUUuidNotLike(String value) {
            addCriterion("u_uuid not like", value, "uUuid");
            return (Criteria) this;
        }

        public Criteria andUUuidIn(List<String> values) {
            addCriterion("u_uuid in", values, "uUuid");
            return (Criteria) this;
        }

        public Criteria andUUuidNotIn(List<String> values) {
            addCriterion("u_uuid not in", values, "uUuid");
            return (Criteria) this;
        }

        public Criteria andUUuidBetween(String value1, String value2) {
            addCriterion("u_uuid between", value1, value2, "uUuid");
            return (Criteria) this;
        }

        public Criteria andUUuidNotBetween(String value1, String value2) {
            addCriterion("u_uuid not between", value1, value2, "uUuid");
            return (Criteria) this;
        }

        public Criteria andURoomIdIsNull() {
            addCriterion("u_room_id is null");
            return (Criteria) this;
        }

        public Criteria andURoomIdIsNotNull() {
            addCriterion("u_room_id is not null");
            return (Criteria) this;
        }

        public Criteria andURoomIdEqualTo(Integer value) {
            addCriterion("u_room_id =", value, "uRoomId");
            return (Criteria) this;
        }

        public Criteria andURoomIdNotEqualTo(Integer value) {
            addCriterion("u_room_id <>", value, "uRoomId");
            return (Criteria) this;
        }

        public Criteria andURoomIdGreaterThan(Integer value) {
            addCriterion("u_room_id >", value, "uRoomId");
            return (Criteria) this;
        }

        public Criteria andURoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_room_id >=", value, "uRoomId");
            return (Criteria) this;
        }

        public Criteria andURoomIdLessThan(Integer value) {
            addCriterion("u_room_id <", value, "uRoomId");
            return (Criteria) this;
        }

        public Criteria andURoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_room_id <=", value, "uRoomId");
            return (Criteria) this;
        }

        public Criteria andURoomIdIn(List<Integer> values) {
            addCriterion("u_room_id in", values, "uRoomId");
            return (Criteria) this;
        }

        public Criteria andURoomIdNotIn(List<Integer> values) {
            addCriterion("u_room_id not in", values, "uRoomId");
            return (Criteria) this;
        }

        public Criteria andURoomIdBetween(Integer value1, Integer value2) {
            addCriterion("u_room_id between", value1, value2, "uRoomId");
            return (Criteria) this;
        }

        public Criteria andURoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_room_id not between", value1, value2, "uRoomId");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("u_sex is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("u_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(String value) {
            addCriterion("u_sex =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(String value) {
            addCriterion("u_sex <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(String value) {
            addCriterion("u_sex >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(String value) {
            addCriterion("u_sex >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(String value) {
            addCriterion("u_sex <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(String value) {
            addCriterion("u_sex <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLike(String value) {
            addCriterion("u_sex like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotLike(String value) {
            addCriterion("u_sex not like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<String> values) {
            addCriterion("u_sex in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<String> values) {
            addCriterion("u_sex not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(String value1, String value2) {
            addCriterion("u_sex between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(String value1, String value2) {
            addCriterion("u_sex not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUIdCardIsNull() {
            addCriterion("u_id_card is null");
            return (Criteria) this;
        }

        public Criteria andUIdCardIsNotNull() {
            addCriterion("u_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andUIdCardEqualTo(String value) {
            addCriterion("u_id_card =", value, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardNotEqualTo(String value) {
            addCriterion("u_id_card <>", value, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardGreaterThan(String value) {
            addCriterion("u_id_card >", value, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("u_id_card >=", value, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardLessThan(String value) {
            addCriterion("u_id_card <", value, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardLessThanOrEqualTo(String value) {
            addCriterion("u_id_card <=", value, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardLike(String value) {
            addCriterion("u_id_card like", value, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardNotLike(String value) {
            addCriterion("u_id_card not like", value, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardIn(List<String> values) {
            addCriterion("u_id_card in", values, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardNotIn(List<String> values) {
            addCriterion("u_id_card not in", values, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardBetween(String value1, String value2) {
            addCriterion("u_id_card between", value1, value2, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUIdCardNotBetween(String value1, String value2) {
            addCriterion("u_id_card not between", value1, value2, "uIdCard");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNull() {
            addCriterion("u_phone is null");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNotNull() {
            addCriterion("u_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUPhoneEqualTo(String value) {
            addCriterion("u_phone =", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotEqualTo(String value) {
            addCriterion("u_phone <>", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThan(String value) {
            addCriterion("u_phone >", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("u_phone >=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThan(String value) {
            addCriterion("u_phone <", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThanOrEqualTo(String value) {
            addCriterion("u_phone <=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLike(String value) {
            addCriterion("u_phone like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotLike(String value) {
            addCriterion("u_phone not like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneIn(List<String> values) {
            addCriterion("u_phone in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotIn(List<String> values) {
            addCriterion("u_phone not in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneBetween(String value1, String value2) {
            addCriterion("u_phone between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotBetween(String value1, String value2) {
            addCriterion("u_phone not between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUStayTimeIsNull() {
            addCriterion("u_stay_time is null");
            return (Criteria) this;
        }

        public Criteria andUStayTimeIsNotNull() {
            addCriterion("u_stay_time is not null");
            return (Criteria) this;
        }

        public Criteria andUStayTimeEqualTo(String value) {
            addCriterion("u_stay_time =", value, "uStayTime");
            return (Criteria) this;
        }

        public Criteria andUStayTimeNotEqualTo(String value) {
            addCriterion("u_stay_time <>", value, "uStayTime");
            return (Criteria) this;
        }

        public Criteria andUStayTimeGreaterThan(String value) {
            addCriterion("u_stay_time >", value, "uStayTime");
            return (Criteria) this;
        }

        public Criteria andUStayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("u_stay_time >=", value, "uStayTime");
            return (Criteria) this;
        }

        public Criteria andUStayTimeLessThan(String value) {
            addCriterion("u_stay_time <", value, "uStayTime");
            return (Criteria) this;
        }

        public Criteria andUStayTimeLessThanOrEqualTo(String value) {
            addCriterion("u_stay_time <=", value, "uStayTime");
            return (Criteria) this;
        }

        public Criteria andUStayTimeLike(String value) {
            addCriterion("u_stay_time like", value, "uStayTime");
            return (Criteria) this;
        }

        public Criteria andUStayTimeNotLike(String value) {
            addCriterion("u_stay_time not like", value, "uStayTime");
            return (Criteria) this;
        }

        public Criteria andUStayTimeIn(List<String> values) {
            addCriterion("u_stay_time in", values, "uStayTime");
            return (Criteria) this;
        }

        public Criteria andUStayTimeNotIn(List<String> values) {
            addCriterion("u_stay_time not in", values, "uStayTime");
            return (Criteria) this;
        }

        public Criteria andUStayTimeBetween(String value1, String value2) {
            addCriterion("u_stay_time between", value1, value2, "uStayTime");
            return (Criteria) this;
        }

        public Criteria andUStayTimeNotBetween(String value1, String value2) {
            addCriterion("u_stay_time not between", value1, value2, "uStayTime");
            return (Criteria) this;
        }

        public Criteria andURetreatTimeIsNull() {
            addCriterion("u_retreat_time is null");
            return (Criteria) this;
        }

        public Criteria andURetreatTimeIsNotNull() {
            addCriterion("u_retreat_time is not null");
            return (Criteria) this;
        }

        public Criteria andURetreatTimeEqualTo(String value) {
            addCriterion("u_retreat_time =", value, "uRetreatTime");
            return (Criteria) this;
        }

        public Criteria andURetreatTimeNotEqualTo(String value) {
            addCriterion("u_retreat_time <>", value, "uRetreatTime");
            return (Criteria) this;
        }

        public Criteria andURetreatTimeGreaterThan(String value) {
            addCriterion("u_retreat_time >", value, "uRetreatTime");
            return (Criteria) this;
        }

        public Criteria andURetreatTimeGreaterThanOrEqualTo(String value) {
            addCriterion("u_retreat_time >=", value, "uRetreatTime");
            return (Criteria) this;
        }

        public Criteria andURetreatTimeLessThan(String value) {
            addCriterion("u_retreat_time <", value, "uRetreatTime");
            return (Criteria) this;
        }

        public Criteria andURetreatTimeLessThanOrEqualTo(String value) {
            addCriterion("u_retreat_time <=", value, "uRetreatTime");
            return (Criteria) this;
        }

        public Criteria andURetreatTimeLike(String value) {
            addCriterion("u_retreat_time like", value, "uRetreatTime");
            return (Criteria) this;
        }

        public Criteria andURetreatTimeNotLike(String value) {
            addCriterion("u_retreat_time not like", value, "uRetreatTime");
            return (Criteria) this;
        }

        public Criteria andURetreatTimeIn(List<String> values) {
            addCriterion("u_retreat_time in", values, "uRetreatTime");
            return (Criteria) this;
        }

        public Criteria andURetreatTimeNotIn(List<String> values) {
            addCriterion("u_retreat_time not in", values, "uRetreatTime");
            return (Criteria) this;
        }

        public Criteria andURetreatTimeBetween(String value1, String value2) {
            addCriterion("u_retreat_time between", value1, value2, "uRetreatTime");
            return (Criteria) this;
        }

        public Criteria andURetreatTimeNotBetween(String value1, String value2) {
            addCriterion("u_retreat_time not between", value1, value2, "uRetreatTime");
            return (Criteria) this;
        }

        public Criteria andUIntroductionIsNull() {
            addCriterion("u_introduction is null");
            return (Criteria) this;
        }

        public Criteria andUIntroductionIsNotNull() {
            addCriterion("u_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andUIntroductionEqualTo(String value) {
            addCriterion("u_introduction =", value, "uIntroduction");
            return (Criteria) this;
        }

        public Criteria andUIntroductionNotEqualTo(String value) {
            addCriterion("u_introduction <>", value, "uIntroduction");
            return (Criteria) this;
        }

        public Criteria andUIntroductionGreaterThan(String value) {
            addCriterion("u_introduction >", value, "uIntroduction");
            return (Criteria) this;
        }

        public Criteria andUIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("u_introduction >=", value, "uIntroduction");
            return (Criteria) this;
        }

        public Criteria andUIntroductionLessThan(String value) {
            addCriterion("u_introduction <", value, "uIntroduction");
            return (Criteria) this;
        }

        public Criteria andUIntroductionLessThanOrEqualTo(String value) {
            addCriterion("u_introduction <=", value, "uIntroduction");
            return (Criteria) this;
        }

        public Criteria andUIntroductionLike(String value) {
            addCriterion("u_introduction like", value, "uIntroduction");
            return (Criteria) this;
        }

        public Criteria andUIntroductionNotLike(String value) {
            addCriterion("u_introduction not like", value, "uIntroduction");
            return (Criteria) this;
        }

        public Criteria andUIntroductionIn(List<String> values) {
            addCriterion("u_introduction in", values, "uIntroduction");
            return (Criteria) this;
        }

        public Criteria andUIntroductionNotIn(List<String> values) {
            addCriterion("u_introduction not in", values, "uIntroduction");
            return (Criteria) this;
        }

        public Criteria andUIntroductionBetween(String value1, String value2) {
            addCriterion("u_introduction between", value1, value2, "uIntroduction");
            return (Criteria) this;
        }

        public Criteria andUIntroductionNotBetween(String value1, String value2) {
            addCriterion("u_introduction not between", value1, value2, "uIntroduction");
            return (Criteria) this;
        }

        public Criteria andUPrimaryUserIsNull() {
            addCriterion("u_primary_user is null");
            return (Criteria) this;
        }

        public Criteria andUPrimaryUserIsNotNull() {
            addCriterion("u_primary_user is not null");
            return (Criteria) this;
        }

        public Criteria andUPrimaryUserEqualTo(Integer value) {
            addCriterion("u_primary_user =", value, "uPrimaryUser");
            return (Criteria) this;
        }

        public Criteria andUPrimaryUserNotEqualTo(Integer value) {
            addCriterion("u_primary_user <>", value, "uPrimaryUser");
            return (Criteria) this;
        }

        public Criteria andUPrimaryUserGreaterThan(Integer value) {
            addCriterion("u_primary_user >", value, "uPrimaryUser");
            return (Criteria) this;
        }

        public Criteria andUPrimaryUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_primary_user >=", value, "uPrimaryUser");
            return (Criteria) this;
        }

        public Criteria andUPrimaryUserLessThan(Integer value) {
            addCriterion("u_primary_user <", value, "uPrimaryUser");
            return (Criteria) this;
        }

        public Criteria andUPrimaryUserLessThanOrEqualTo(Integer value) {
            addCriterion("u_primary_user <=", value, "uPrimaryUser");
            return (Criteria) this;
        }

        public Criteria andUPrimaryUserIn(List<Integer> values) {
            addCriterion("u_primary_user in", values, "uPrimaryUser");
            return (Criteria) this;
        }

        public Criteria andUPrimaryUserNotIn(List<Integer> values) {
            addCriterion("u_primary_user not in", values, "uPrimaryUser");
            return (Criteria) this;
        }

        public Criteria andUPrimaryUserBetween(Integer value1, Integer value2) {
            addCriterion("u_primary_user between", value1, value2, "uPrimaryUser");
            return (Criteria) this;
        }

        public Criteria andUPrimaryUserNotBetween(Integer value1, Integer value2) {
            addCriterion("u_primary_user not between", value1, value2, "uPrimaryUser");
            return (Criteria) this;
        }

        public Criteria andUDeleteIsNull() {
            addCriterion("u_delete is null");
            return (Criteria) this;
        }

        public Criteria andUDeleteIsNotNull() {
            addCriterion("u_delete is not null");
            return (Criteria) this;
        }

        public Criteria andUDeleteEqualTo(Integer value) {
            addCriterion("u_delete =", value, "uDelete");
            return (Criteria) this;
        }

        public Criteria andUDeleteNotEqualTo(Integer value) {
            addCriterion("u_delete <>", value, "uDelete");
            return (Criteria) this;
        }

        public Criteria andUDeleteGreaterThan(Integer value) {
            addCriterion("u_delete >", value, "uDelete");
            return (Criteria) this;
        }

        public Criteria andUDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_delete >=", value, "uDelete");
            return (Criteria) this;
        }

        public Criteria andUDeleteLessThan(Integer value) {
            addCriterion("u_delete <", value, "uDelete");
            return (Criteria) this;
        }

        public Criteria andUDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("u_delete <=", value, "uDelete");
            return (Criteria) this;
        }

        public Criteria andUDeleteIn(List<Integer> values) {
            addCriterion("u_delete in", values, "uDelete");
            return (Criteria) this;
        }

        public Criteria andUDeleteNotIn(List<Integer> values) {
            addCriterion("u_delete not in", values, "uDelete");
            return (Criteria) this;
        }

        public Criteria andUDeleteBetween(Integer value1, Integer value2) {
            addCriterion("u_delete between", value1, value2, "uDelete");
            return (Criteria) this;
        }

        public Criteria andUDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("u_delete not between", value1, value2, "uDelete");
            return (Criteria) this;
        }

        public Criteria andUIsModifyIsNull() {
            addCriterion("u_is_modify is null");
            return (Criteria) this;
        }

        public Criteria andUIsModifyIsNotNull() {
            addCriterion("u_is_modify is not null");
            return (Criteria) this;
        }

        public Criteria andUIsModifyEqualTo(Integer value) {
            addCriterion("u_is_modify =", value, "uIsModify");
            return (Criteria) this;
        }

        public Criteria andUIsModifyNotEqualTo(Integer value) {
            addCriterion("u_is_modify <>", value, "uIsModify");
            return (Criteria) this;
        }

        public Criteria andUIsModifyGreaterThan(Integer value) {
            addCriterion("u_is_modify >", value, "uIsModify");
            return (Criteria) this;
        }

        public Criteria andUIsModifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_is_modify >=", value, "uIsModify");
            return (Criteria) this;
        }

        public Criteria andUIsModifyLessThan(Integer value) {
            addCriterion("u_is_modify <", value, "uIsModify");
            return (Criteria) this;
        }

        public Criteria andUIsModifyLessThanOrEqualTo(Integer value) {
            addCriterion("u_is_modify <=", value, "uIsModify");
            return (Criteria) this;
        }

        public Criteria andUIsModifyIn(List<Integer> values) {
            addCriterion("u_is_modify in", values, "uIsModify");
            return (Criteria) this;
        }

        public Criteria andUIsModifyNotIn(List<Integer> values) {
            addCriterion("u_is_modify not in", values, "uIsModify");
            return (Criteria) this;
        }

        public Criteria andUIsModifyBetween(Integer value1, Integer value2) {
            addCriterion("u_is_modify between", value1, value2, "uIsModify");
            return (Criteria) this;
        }

        public Criteria andUIsModifyNotBetween(Integer value1, Integer value2) {
            addCriterion("u_is_modify not between", value1, value2, "uIsModify");
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