package com.dhy.yycompany.lock.bean;

import java.util.ArrayList;
import java.util.List;

public class InstructionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstructionExample() {
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

        public Criteria andIIdIsNull() {
            addCriterion("i_id is null");
            return (Criteria) this;
        }

        public Criteria andIIdIsNotNull() {
            addCriterion("i_id is not null");
            return (Criteria) this;
        }

        public Criteria andIIdEqualTo(Integer value) {
            addCriterion("i_id =", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotEqualTo(Integer value) {
            addCriterion("i_id <>", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThan(Integer value) {
            addCriterion("i_id >", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_id >=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThan(Integer value) {
            addCriterion("i_id <", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThanOrEqualTo(Integer value) {
            addCriterion("i_id <=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdIn(List<Integer> values) {
            addCriterion("i_id in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotIn(List<Integer> values) {
            addCriterion("i_id not in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdBetween(Integer value1, Integer value2) {
            addCriterion("i_id between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotBetween(Integer value1, Integer value2) {
            addCriterion("i_id not between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andIUuidIsNull() {
            addCriterion("i_uuid is null");
            return (Criteria) this;
        }

        public Criteria andIUuidIsNotNull() {
            addCriterion("i_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andIUuidEqualTo(String value) {
            addCriterion("i_uuid =", value, "iUuid");
            return (Criteria) this;
        }

        public Criteria andIUuidNotEqualTo(String value) {
            addCriterion("i_uuid <>", value, "iUuid");
            return (Criteria) this;
        }

        public Criteria andIUuidGreaterThan(String value) {
            addCriterion("i_uuid >", value, "iUuid");
            return (Criteria) this;
        }

        public Criteria andIUuidGreaterThanOrEqualTo(String value) {
            addCriterion("i_uuid >=", value, "iUuid");
            return (Criteria) this;
        }

        public Criteria andIUuidLessThan(String value) {
            addCriterion("i_uuid <", value, "iUuid");
            return (Criteria) this;
        }

        public Criteria andIUuidLessThanOrEqualTo(String value) {
            addCriterion("i_uuid <=", value, "iUuid");
            return (Criteria) this;
        }

        public Criteria andIUuidLike(String value) {
            addCriterion("i_uuid like", value, "iUuid");
            return (Criteria) this;
        }

        public Criteria andIUuidNotLike(String value) {
            addCriterion("i_uuid not like", value, "iUuid");
            return (Criteria) this;
        }

        public Criteria andIUuidIn(List<String> values) {
            addCriterion("i_uuid in", values, "iUuid");
            return (Criteria) this;
        }

        public Criteria andIUuidNotIn(List<String> values) {
            addCriterion("i_uuid not in", values, "iUuid");
            return (Criteria) this;
        }

        public Criteria andIUuidBetween(String value1, String value2) {
            addCriterion("i_uuid between", value1, value2, "iUuid");
            return (Criteria) this;
        }

        public Criteria andIUuidNotBetween(String value1, String value2) {
            addCriterion("i_uuid not between", value1, value2, "iUuid");
            return (Criteria) this;
        }

        public Criteria andILockIdIsNull() {
            addCriterion("i_lock_id is null");
            return (Criteria) this;
        }

        public Criteria andILockIdIsNotNull() {
            addCriterion("i_lock_id is not null");
            return (Criteria) this;
        }

        public Criteria andILockIdEqualTo(Integer value) {
            addCriterion("i_lock_id =", value, "iLockId");
            return (Criteria) this;
        }

        public Criteria andILockIdNotEqualTo(Integer value) {
            addCriterion("i_lock_id <>", value, "iLockId");
            return (Criteria) this;
        }

        public Criteria andILockIdGreaterThan(Integer value) {
            addCriterion("i_lock_id >", value, "iLockId");
            return (Criteria) this;
        }

        public Criteria andILockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_lock_id >=", value, "iLockId");
            return (Criteria) this;
        }

        public Criteria andILockIdLessThan(Integer value) {
            addCriterion("i_lock_id <", value, "iLockId");
            return (Criteria) this;
        }

        public Criteria andILockIdLessThanOrEqualTo(Integer value) {
            addCriterion("i_lock_id <=", value, "iLockId");
            return (Criteria) this;
        }

        public Criteria andILockIdIn(List<Integer> values) {
            addCriterion("i_lock_id in", values, "iLockId");
            return (Criteria) this;
        }

        public Criteria andILockIdNotIn(List<Integer> values) {
            addCriterion("i_lock_id not in", values, "iLockId");
            return (Criteria) this;
        }

        public Criteria andILockIdBetween(Integer value1, Integer value2) {
            addCriterion("i_lock_id between", value1, value2, "iLockId");
            return (Criteria) this;
        }

        public Criteria andILockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("i_lock_id not between", value1, value2, "iLockId");
            return (Criteria) this;
        }

        public Criteria andIUserIdIsNull() {
            addCriterion("i_user_id is null");
            return (Criteria) this;
        }

        public Criteria andIUserIdIsNotNull() {
            addCriterion("i_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andIUserIdEqualTo(Integer value) {
            addCriterion("i_user_id =", value, "iUserId");
            return (Criteria) this;
        }

        public Criteria andIUserIdNotEqualTo(Integer value) {
            addCriterion("i_user_id <>", value, "iUserId");
            return (Criteria) this;
        }

        public Criteria andIUserIdGreaterThan(Integer value) {
            addCriterion("i_user_id >", value, "iUserId");
            return (Criteria) this;
        }

        public Criteria andIUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_user_id >=", value, "iUserId");
            return (Criteria) this;
        }

        public Criteria andIUserIdLessThan(Integer value) {
            addCriterion("i_user_id <", value, "iUserId");
            return (Criteria) this;
        }

        public Criteria andIUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("i_user_id <=", value, "iUserId");
            return (Criteria) this;
        }

        public Criteria andIUserIdIn(List<Integer> values) {
            addCriterion("i_user_id in", values, "iUserId");
            return (Criteria) this;
        }

        public Criteria andIUserIdNotIn(List<Integer> values) {
            addCriterion("i_user_id not in", values, "iUserId");
            return (Criteria) this;
        }

        public Criteria andIUserIdBetween(Integer value1, Integer value2) {
            addCriterion("i_user_id between", value1, value2, "iUserId");
            return (Criteria) this;
        }

        public Criteria andIUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("i_user_id not between", value1, value2, "iUserId");
            return (Criteria) this;
        }

        public Criteria andIIsDeleteIsNull() {
            addCriterion("i_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIIsDeleteIsNotNull() {
            addCriterion("i_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIIsDeleteEqualTo(Integer value) {
            addCriterion("i_is_delete =", value, "iIsDelete");
            return (Criteria) this;
        }

        public Criteria andIIsDeleteNotEqualTo(Integer value) {
            addCriterion("i_is_delete <>", value, "iIsDelete");
            return (Criteria) this;
        }

        public Criteria andIIsDeleteGreaterThan(Integer value) {
            addCriterion("i_is_delete >", value, "iIsDelete");
            return (Criteria) this;
        }

        public Criteria andIIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_is_delete >=", value, "iIsDelete");
            return (Criteria) this;
        }

        public Criteria andIIsDeleteLessThan(Integer value) {
            addCriterion("i_is_delete <", value, "iIsDelete");
            return (Criteria) this;
        }

        public Criteria andIIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("i_is_delete <=", value, "iIsDelete");
            return (Criteria) this;
        }

        public Criteria andIIsDeleteIn(List<Integer> values) {
            addCriterion("i_is_delete in", values, "iIsDelete");
            return (Criteria) this;
        }

        public Criteria andIIsDeleteNotIn(List<Integer> values) {
            addCriterion("i_is_delete not in", values, "iIsDelete");
            return (Criteria) this;
        }

        public Criteria andIIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("i_is_delete between", value1, value2, "iIsDelete");
            return (Criteria) this;
        }

        public Criteria andIIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("i_is_delete not between", value1, value2, "iIsDelete");
            return (Criteria) this;
        }

        public Criteria andIIsModifyIsNull() {
            addCriterion("i_is_modify is null");
            return (Criteria) this;
        }

        public Criteria andIIsModifyIsNotNull() {
            addCriterion("i_is_modify is not null");
            return (Criteria) this;
        }

        public Criteria andIIsModifyEqualTo(Integer value) {
            addCriterion("i_is_modify =", value, "iIsModify");
            return (Criteria) this;
        }

        public Criteria andIIsModifyNotEqualTo(Integer value) {
            addCriterion("i_is_modify <>", value, "iIsModify");
            return (Criteria) this;
        }

        public Criteria andIIsModifyGreaterThan(Integer value) {
            addCriterion("i_is_modify >", value, "iIsModify");
            return (Criteria) this;
        }

        public Criteria andIIsModifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_is_modify >=", value, "iIsModify");
            return (Criteria) this;
        }

        public Criteria andIIsModifyLessThan(Integer value) {
            addCriterion("i_is_modify <", value, "iIsModify");
            return (Criteria) this;
        }

        public Criteria andIIsModifyLessThanOrEqualTo(Integer value) {
            addCriterion("i_is_modify <=", value, "iIsModify");
            return (Criteria) this;
        }

        public Criteria andIIsModifyIn(List<Integer> values) {
            addCriterion("i_is_modify in", values, "iIsModify");
            return (Criteria) this;
        }

        public Criteria andIIsModifyNotIn(List<Integer> values) {
            addCriterion("i_is_modify not in", values, "iIsModify");
            return (Criteria) this;
        }

        public Criteria andIIsModifyBetween(Integer value1, Integer value2) {
            addCriterion("i_is_modify between", value1, value2, "iIsModify");
            return (Criteria) this;
        }

        public Criteria andIIsModifyNotBetween(Integer value1, Integer value2) {
            addCriterion("i_is_modify not between", value1, value2, "iIsModify");
            return (Criteria) this;
        }

        public Criteria andIIsUserIsNull() {
            addCriterion("i_is_user is null");
            return (Criteria) this;
        }

        public Criteria andIIsUserIsNotNull() {
            addCriterion("i_is_user is not null");
            return (Criteria) this;
        }

        public Criteria andIIsUserEqualTo(Integer value) {
            addCriterion("i_is_user =", value, "iIsUser");
            return (Criteria) this;
        }

        public Criteria andIIsUserNotEqualTo(Integer value) {
            addCriterion("i_is_user <>", value, "iIsUser");
            return (Criteria) this;
        }

        public Criteria andIIsUserGreaterThan(Integer value) {
            addCriterion("i_is_user >", value, "iIsUser");
            return (Criteria) this;
        }

        public Criteria andIIsUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_is_user >=", value, "iIsUser");
            return (Criteria) this;
        }

        public Criteria andIIsUserLessThan(Integer value) {
            addCriterion("i_is_user <", value, "iIsUser");
            return (Criteria) this;
        }

        public Criteria andIIsUserLessThanOrEqualTo(Integer value) {
            addCriterion("i_is_user <=", value, "iIsUser");
            return (Criteria) this;
        }

        public Criteria andIIsUserIn(List<Integer> values) {
            addCriterion("i_is_user in", values, "iIsUser");
            return (Criteria) this;
        }

        public Criteria andIIsUserNotIn(List<Integer> values) {
            addCriterion("i_is_user not in", values, "iIsUser");
            return (Criteria) this;
        }

        public Criteria andIIsUserBetween(Integer value1, Integer value2) {
            addCriterion("i_is_user between", value1, value2, "iIsUser");
            return (Criteria) this;
        }

        public Criteria andIIsUserNotBetween(Integer value1, Integer value2) {
            addCriterion("i_is_user not between", value1, value2, "iIsUser");
            return (Criteria) this;
        }

        public Criteria andIIsLockIsNull() {
            addCriterion("i_is_lock is null");
            return (Criteria) this;
        }

        public Criteria andIIsLockIsNotNull() {
            addCriterion("i_is_lock is not null");
            return (Criteria) this;
        }

        public Criteria andIIsLockEqualTo(Integer value) {
            addCriterion("i_is_lock =", value, "iIsLock");
            return (Criteria) this;
        }

        public Criteria andIIsLockNotEqualTo(Integer value) {
            addCriterion("i_is_lock <>", value, "iIsLock");
            return (Criteria) this;
        }

        public Criteria andIIsLockGreaterThan(Integer value) {
            addCriterion("i_is_lock >", value, "iIsLock");
            return (Criteria) this;
        }

        public Criteria andIIsLockGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_is_lock >=", value, "iIsLock");
            return (Criteria) this;
        }

        public Criteria andIIsLockLessThan(Integer value) {
            addCriterion("i_is_lock <", value, "iIsLock");
            return (Criteria) this;
        }

        public Criteria andIIsLockLessThanOrEqualTo(Integer value) {
            addCriterion("i_is_lock <=", value, "iIsLock");
            return (Criteria) this;
        }

        public Criteria andIIsLockIn(List<Integer> values) {
            addCriterion("i_is_lock in", values, "iIsLock");
            return (Criteria) this;
        }

        public Criteria andIIsLockNotIn(List<Integer> values) {
            addCriterion("i_is_lock not in", values, "iIsLock");
            return (Criteria) this;
        }

        public Criteria andIIsLockBetween(Integer value1, Integer value2) {
            addCriterion("i_is_lock between", value1, value2, "iIsLock");
            return (Criteria) this;
        }

        public Criteria andIIsLockNotBetween(Integer value1, Integer value2) {
            addCriterion("i_is_lock not between", value1, value2, "iIsLock");
            return (Criteria) this;
        }

        public Criteria andIIsKeyIsNull() {
            addCriterion("i_is_key is null");
            return (Criteria) this;
        }

        public Criteria andIIsKeyIsNotNull() {
            addCriterion("i_is_key is not null");
            return (Criteria) this;
        }

        public Criteria andIIsKeyEqualTo(Integer value) {
            addCriterion("i_is_key =", value, "iIsKey");
            return (Criteria) this;
        }

        public Criteria andIIsKeyNotEqualTo(Integer value) {
            addCriterion("i_is_key <>", value, "iIsKey");
            return (Criteria) this;
        }

        public Criteria andIIsKeyGreaterThan(Integer value) {
            addCriterion("i_is_key >", value, "iIsKey");
            return (Criteria) this;
        }

        public Criteria andIIsKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_is_key >=", value, "iIsKey");
            return (Criteria) this;
        }

        public Criteria andIIsKeyLessThan(Integer value) {
            addCriterion("i_is_key <", value, "iIsKey");
            return (Criteria) this;
        }

        public Criteria andIIsKeyLessThanOrEqualTo(Integer value) {
            addCriterion("i_is_key <=", value, "iIsKey");
            return (Criteria) this;
        }

        public Criteria andIIsKeyIn(List<Integer> values) {
            addCriterion("i_is_key in", values, "iIsKey");
            return (Criteria) this;
        }

        public Criteria andIIsKeyNotIn(List<Integer> values) {
            addCriterion("i_is_key not in", values, "iIsKey");
            return (Criteria) this;
        }

        public Criteria andIIsKeyBetween(Integer value1, Integer value2) {
            addCriterion("i_is_key between", value1, value2, "iIsKey");
            return (Criteria) this;
        }

        public Criteria andIIsKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("i_is_key not between", value1, value2, "iIsKey");
            return (Criteria) this;
        }

        public Criteria andIIsFingerIsNull() {
            addCriterion("i_is_finger is null");
            return (Criteria) this;
        }

        public Criteria andIIsFingerIsNotNull() {
            addCriterion("i_is_finger is not null");
            return (Criteria) this;
        }

        public Criteria andIIsFingerEqualTo(Integer value) {
            addCriterion("i_is_finger =", value, "iIsFinger");
            return (Criteria) this;
        }

        public Criteria andIIsFingerNotEqualTo(Integer value) {
            addCriterion("i_is_finger <>", value, "iIsFinger");
            return (Criteria) this;
        }

        public Criteria andIIsFingerGreaterThan(Integer value) {
            addCriterion("i_is_finger >", value, "iIsFinger");
            return (Criteria) this;
        }

        public Criteria andIIsFingerGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_is_finger >=", value, "iIsFinger");
            return (Criteria) this;
        }

        public Criteria andIIsFingerLessThan(Integer value) {
            addCriterion("i_is_finger <", value, "iIsFinger");
            return (Criteria) this;
        }

        public Criteria andIIsFingerLessThanOrEqualTo(Integer value) {
            addCriterion("i_is_finger <=", value, "iIsFinger");
            return (Criteria) this;
        }

        public Criteria andIIsFingerIn(List<Integer> values) {
            addCriterion("i_is_finger in", values, "iIsFinger");
            return (Criteria) this;
        }

        public Criteria andIIsFingerNotIn(List<Integer> values) {
            addCriterion("i_is_finger not in", values, "iIsFinger");
            return (Criteria) this;
        }

        public Criteria andIIsFingerBetween(Integer value1, Integer value2) {
            addCriterion("i_is_finger between", value1, value2, "iIsFinger");
            return (Criteria) this;
        }

        public Criteria andIIsFingerNotBetween(Integer value1, Integer value2) {
            addCriterion("i_is_finger not between", value1, value2, "iIsFinger");
            return (Criteria) this;
        }

        public Criteria andIUserInfoIsNull() {
            addCriterion("i_user_info is null");
            return (Criteria) this;
        }

        public Criteria andIUserInfoIsNotNull() {
            addCriterion("i_user_info is not null");
            return (Criteria) this;
        }

        public Criteria andIUserInfoEqualTo(String value) {
            addCriterion("i_user_info =", value, "iUserInfo");
            return (Criteria) this;
        }

        public Criteria andIUserInfoNotEqualTo(String value) {
            addCriterion("i_user_info <>", value, "iUserInfo");
            return (Criteria) this;
        }

        public Criteria andIUserInfoGreaterThan(String value) {
            addCriterion("i_user_info >", value, "iUserInfo");
            return (Criteria) this;
        }

        public Criteria andIUserInfoGreaterThanOrEqualTo(String value) {
            addCriterion("i_user_info >=", value, "iUserInfo");
            return (Criteria) this;
        }

        public Criteria andIUserInfoLessThan(String value) {
            addCriterion("i_user_info <", value, "iUserInfo");
            return (Criteria) this;
        }

        public Criteria andIUserInfoLessThanOrEqualTo(String value) {
            addCriterion("i_user_info <=", value, "iUserInfo");
            return (Criteria) this;
        }

        public Criteria andIUserInfoLike(String value) {
            addCriterion("i_user_info like", value, "iUserInfo");
            return (Criteria) this;
        }

        public Criteria andIUserInfoNotLike(String value) {
            addCriterion("i_user_info not like", value, "iUserInfo");
            return (Criteria) this;
        }

        public Criteria andIUserInfoIn(List<String> values) {
            addCriterion("i_user_info in", values, "iUserInfo");
            return (Criteria) this;
        }

        public Criteria andIUserInfoNotIn(List<String> values) {
            addCriterion("i_user_info not in", values, "iUserInfo");
            return (Criteria) this;
        }

        public Criteria andIUserInfoBetween(String value1, String value2) {
            addCriterion("i_user_info between", value1, value2, "iUserInfo");
            return (Criteria) this;
        }

        public Criteria andIUserInfoNotBetween(String value1, String value2) {
            addCriterion("i_user_info not between", value1, value2, "iUserInfo");
            return (Criteria) this;
        }

        public Criteria andILockInfoIsNull() {
            addCriterion("i_lock_info is null");
            return (Criteria) this;
        }

        public Criteria andILockInfoIsNotNull() {
            addCriterion("i_lock_info is not null");
            return (Criteria) this;
        }

        public Criteria andILockInfoEqualTo(String value) {
            addCriterion("i_lock_info =", value, "iLockInfo");
            return (Criteria) this;
        }

        public Criteria andILockInfoNotEqualTo(String value) {
            addCriterion("i_lock_info <>", value, "iLockInfo");
            return (Criteria) this;
        }

        public Criteria andILockInfoGreaterThan(String value) {
            addCriterion("i_lock_info >", value, "iLockInfo");
            return (Criteria) this;
        }

        public Criteria andILockInfoGreaterThanOrEqualTo(String value) {
            addCriterion("i_lock_info >=", value, "iLockInfo");
            return (Criteria) this;
        }

        public Criteria andILockInfoLessThan(String value) {
            addCriterion("i_lock_info <", value, "iLockInfo");
            return (Criteria) this;
        }

        public Criteria andILockInfoLessThanOrEqualTo(String value) {
            addCriterion("i_lock_info <=", value, "iLockInfo");
            return (Criteria) this;
        }

        public Criteria andILockInfoLike(String value) {
            addCriterion("i_lock_info like", value, "iLockInfo");
            return (Criteria) this;
        }

        public Criteria andILockInfoNotLike(String value) {
            addCriterion("i_lock_info not like", value, "iLockInfo");
            return (Criteria) this;
        }

        public Criteria andILockInfoIn(List<String> values) {
            addCriterion("i_lock_info in", values, "iLockInfo");
            return (Criteria) this;
        }

        public Criteria andILockInfoNotIn(List<String> values) {
            addCriterion("i_lock_info not in", values, "iLockInfo");
            return (Criteria) this;
        }

        public Criteria andILockInfoBetween(String value1, String value2) {
            addCriterion("i_lock_info between", value1, value2, "iLockInfo");
            return (Criteria) this;
        }

        public Criteria andILockInfoNotBetween(String value1, String value2) {
            addCriterion("i_lock_info not between", value1, value2, "iLockInfo");
            return (Criteria) this;
        }

        public Criteria andIKeyInfoIsNull() {
            addCriterion("i_key_info is null");
            return (Criteria) this;
        }

        public Criteria andIKeyInfoIsNotNull() {
            addCriterion("i_key_info is not null");
            return (Criteria) this;
        }

        public Criteria andIKeyInfoEqualTo(String value) {
            addCriterion("i_key_info =", value, "iKeyInfo");
            return (Criteria) this;
        }

        public Criteria andIKeyInfoNotEqualTo(String value) {
            addCriterion("i_key_info <>", value, "iKeyInfo");
            return (Criteria) this;
        }

        public Criteria andIKeyInfoGreaterThan(String value) {
            addCriterion("i_key_info >", value, "iKeyInfo");
            return (Criteria) this;
        }

        public Criteria andIKeyInfoGreaterThanOrEqualTo(String value) {
            addCriterion("i_key_info >=", value, "iKeyInfo");
            return (Criteria) this;
        }

        public Criteria andIKeyInfoLessThan(String value) {
            addCriterion("i_key_info <", value, "iKeyInfo");
            return (Criteria) this;
        }

        public Criteria andIKeyInfoLessThanOrEqualTo(String value) {
            addCriterion("i_key_info <=", value, "iKeyInfo");
            return (Criteria) this;
        }

        public Criteria andIKeyInfoLike(String value) {
            addCriterion("i_key_info like", value, "iKeyInfo");
            return (Criteria) this;
        }

        public Criteria andIKeyInfoNotLike(String value) {
            addCriterion("i_key_info not like", value, "iKeyInfo");
            return (Criteria) this;
        }

        public Criteria andIKeyInfoIn(List<String> values) {
            addCriterion("i_key_info in", values, "iKeyInfo");
            return (Criteria) this;
        }

        public Criteria andIKeyInfoNotIn(List<String> values) {
            addCriterion("i_key_info not in", values, "iKeyInfo");
            return (Criteria) this;
        }

        public Criteria andIKeyInfoBetween(String value1, String value2) {
            addCriterion("i_key_info between", value1, value2, "iKeyInfo");
            return (Criteria) this;
        }

        public Criteria andIKeyInfoNotBetween(String value1, String value2) {
            addCriterion("i_key_info not between", value1, value2, "iKeyInfo");
            return (Criteria) this;
        }

        public Criteria andIFingerInfoIsNull() {
            addCriterion("i_finger_info is null");
            return (Criteria) this;
        }

        public Criteria andIFingerInfoIsNotNull() {
            addCriterion("i_finger_info is not null");
            return (Criteria) this;
        }

        public Criteria andIFingerInfoEqualTo(String value) {
            addCriterion("i_finger_info =", value, "iFingerInfo");
            return (Criteria) this;
        }

        public Criteria andIFingerInfoNotEqualTo(String value) {
            addCriterion("i_finger_info <>", value, "iFingerInfo");
            return (Criteria) this;
        }

        public Criteria andIFingerInfoGreaterThan(String value) {
            addCriterion("i_finger_info >", value, "iFingerInfo");
            return (Criteria) this;
        }

        public Criteria andIFingerInfoGreaterThanOrEqualTo(String value) {
            addCriterion("i_finger_info >=", value, "iFingerInfo");
            return (Criteria) this;
        }

        public Criteria andIFingerInfoLessThan(String value) {
            addCriterion("i_finger_info <", value, "iFingerInfo");
            return (Criteria) this;
        }

        public Criteria andIFingerInfoLessThanOrEqualTo(String value) {
            addCriterion("i_finger_info <=", value, "iFingerInfo");
            return (Criteria) this;
        }

        public Criteria andIFingerInfoLike(String value) {
            addCriterion("i_finger_info like", value, "iFingerInfo");
            return (Criteria) this;
        }

        public Criteria andIFingerInfoNotLike(String value) {
            addCriterion("i_finger_info not like", value, "iFingerInfo");
            return (Criteria) this;
        }

        public Criteria andIFingerInfoIn(List<String> values) {
            addCriterion("i_finger_info in", values, "iFingerInfo");
            return (Criteria) this;
        }

        public Criteria andIFingerInfoNotIn(List<String> values) {
            addCriterion("i_finger_info not in", values, "iFingerInfo");
            return (Criteria) this;
        }

        public Criteria andIFingerInfoBetween(String value1, String value2) {
            addCriterion("i_finger_info between", value1, value2, "iFingerInfo");
            return (Criteria) this;
        }

        public Criteria andIFingerInfoNotBetween(String value1, String value2) {
            addCriterion("i_finger_info not between", value1, value2, "iFingerInfo");
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