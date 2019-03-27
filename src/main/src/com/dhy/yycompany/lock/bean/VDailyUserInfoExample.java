package com.dhy.yycompany.lock.bean;

import java.util.ArrayList;
import java.util.List;

public class VDailyUserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VDailyUserInfoExample() {
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

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDUuidIsNull() {
            addCriterion("d_uuid is null");
            return (Criteria) this;
        }

        public Criteria andDUuidIsNotNull() {
            addCriterion("d_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andDUuidEqualTo(String value) {
            addCriterion("d_uuid =", value, "dUuid");
            return (Criteria) this;
        }

        public Criteria andDUuidNotEqualTo(String value) {
            addCriterion("d_uuid <>", value, "dUuid");
            return (Criteria) this;
        }

        public Criteria andDUuidGreaterThan(String value) {
            addCriterion("d_uuid >", value, "dUuid");
            return (Criteria) this;
        }

        public Criteria andDUuidGreaterThanOrEqualTo(String value) {
            addCriterion("d_uuid >=", value, "dUuid");
            return (Criteria) this;
        }

        public Criteria andDUuidLessThan(String value) {
            addCriterion("d_uuid <", value, "dUuid");
            return (Criteria) this;
        }

        public Criteria andDUuidLessThanOrEqualTo(String value) {
            addCriterion("d_uuid <=", value, "dUuid");
            return (Criteria) this;
        }

        public Criteria andDUuidLike(String value) {
            addCriterion("d_uuid like", value, "dUuid");
            return (Criteria) this;
        }

        public Criteria andDUuidNotLike(String value) {
            addCriterion("d_uuid not like", value, "dUuid");
            return (Criteria) this;
        }

        public Criteria andDUuidIn(List<String> values) {
            addCriterion("d_uuid in", values, "dUuid");
            return (Criteria) this;
        }

        public Criteria andDUuidNotIn(List<String> values) {
            addCriterion("d_uuid not in", values, "dUuid");
            return (Criteria) this;
        }

        public Criteria andDUuidBetween(String value1, String value2) {
            addCriterion("d_uuid between", value1, value2, "dUuid");
            return (Criteria) this;
        }

        public Criteria andDUuidNotBetween(String value1, String value2) {
            addCriterion("d_uuid not between", value1, value2, "dUuid");
            return (Criteria) this;
        }

        public Criteria andDUserIdIsNull() {
            addCriterion("d_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDUserIdIsNotNull() {
            addCriterion("d_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDUserIdEqualTo(Integer value) {
            addCriterion("d_user_id =", value, "dUserId");
            return (Criteria) this;
        }

        public Criteria andDUserIdNotEqualTo(Integer value) {
            addCriterion("d_user_id <>", value, "dUserId");
            return (Criteria) this;
        }

        public Criteria andDUserIdGreaterThan(Integer value) {
            addCriterion("d_user_id >", value, "dUserId");
            return (Criteria) this;
        }

        public Criteria andDUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_user_id >=", value, "dUserId");
            return (Criteria) this;
        }

        public Criteria andDUserIdLessThan(Integer value) {
            addCriterion("d_user_id <", value, "dUserId");
            return (Criteria) this;
        }

        public Criteria andDUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_user_id <=", value, "dUserId");
            return (Criteria) this;
        }

        public Criteria andDUserIdIn(List<Integer> values) {
            addCriterion("d_user_id in", values, "dUserId");
            return (Criteria) this;
        }

        public Criteria andDUserIdNotIn(List<Integer> values) {
            addCriterion("d_user_id not in", values, "dUserId");
            return (Criteria) this;
        }

        public Criteria andDUserIdBetween(Integer value1, Integer value2) {
            addCriterion("d_user_id between", value1, value2, "dUserId");
            return (Criteria) this;
        }

        public Criteria andDUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_user_id not between", value1, value2, "dUserId");
            return (Criteria) this;
        }

        public Criteria andDLockIdIsNull() {
            addCriterion("d_lock_id is null");
            return (Criteria) this;
        }

        public Criteria andDLockIdIsNotNull() {
            addCriterion("d_lock_id is not null");
            return (Criteria) this;
        }

        public Criteria andDLockIdEqualTo(Integer value) {
            addCriterion("d_lock_id =", value, "dLockId");
            return (Criteria) this;
        }

        public Criteria andDLockIdNotEqualTo(Integer value) {
            addCriterion("d_lock_id <>", value, "dLockId");
            return (Criteria) this;
        }

        public Criteria andDLockIdGreaterThan(Integer value) {
            addCriterion("d_lock_id >", value, "dLockId");
            return (Criteria) this;
        }

        public Criteria andDLockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_lock_id >=", value, "dLockId");
            return (Criteria) this;
        }

        public Criteria andDLockIdLessThan(Integer value) {
            addCriterion("d_lock_id <", value, "dLockId");
            return (Criteria) this;
        }

        public Criteria andDLockIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_lock_id <=", value, "dLockId");
            return (Criteria) this;
        }

        public Criteria andDLockIdIn(List<Integer> values) {
            addCriterion("d_lock_id in", values, "dLockId");
            return (Criteria) this;
        }

        public Criteria andDLockIdNotIn(List<Integer> values) {
            addCriterion("d_lock_id not in", values, "dLockId");
            return (Criteria) this;
        }

        public Criteria andDLockIdBetween(Integer value1, Integer value2) {
            addCriterion("d_lock_id between", value1, value2, "dLockId");
            return (Criteria) this;
        }

        public Criteria andDLockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_lock_id not between", value1, value2, "dLockId");
            return (Criteria) this;
        }

        public Criteria andDTimeIsNull() {
            addCriterion("d_time is null");
            return (Criteria) this;
        }

        public Criteria andDTimeIsNotNull() {
            addCriterion("d_time is not null");
            return (Criteria) this;
        }

        public Criteria andDTimeEqualTo(String value) {
            addCriterion("d_time =", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeNotEqualTo(String value) {
            addCriterion("d_time <>", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeGreaterThan(String value) {
            addCriterion("d_time >", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeGreaterThanOrEqualTo(String value) {
            addCriterion("d_time >=", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeLessThan(String value) {
            addCriterion("d_time <", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeLessThanOrEqualTo(String value) {
            addCriterion("d_time <=", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeLike(String value) {
            addCriterion("d_time like", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeNotLike(String value) {
            addCriterion("d_time not like", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeIn(List<String> values) {
            addCriterion("d_time in", values, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeNotIn(List<String> values) {
            addCriterion("d_time not in", values, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeBetween(String value1, String value2) {
            addCriterion("d_time between", value1, value2, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeNotBetween(String value1, String value2) {
            addCriterion("d_time not between", value1, value2, "dTime");
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