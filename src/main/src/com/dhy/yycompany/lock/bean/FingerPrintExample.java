package com.dhy.yycompany.lock.bean;

import java.util.ArrayList;
import java.util.List;

public class FingerPrintExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FingerPrintExample() {
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

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Integer value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Integer value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Integer value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Integer value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Integer> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Integer> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Integer value1, Integer value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFUuidIsNull() {
            addCriterion("f_uuid is null");
            return (Criteria) this;
        }

        public Criteria andFUuidIsNotNull() {
            addCriterion("f_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andFUuidEqualTo(String value) {
            addCriterion("f_uuid =", value, "fUuid");
            return (Criteria) this;
        }

        public Criteria andFUuidNotEqualTo(String value) {
            addCriterion("f_uuid <>", value, "fUuid");
            return (Criteria) this;
        }

        public Criteria andFUuidGreaterThan(String value) {
            addCriterion("f_uuid >", value, "fUuid");
            return (Criteria) this;
        }

        public Criteria andFUuidGreaterThanOrEqualTo(String value) {
            addCriterion("f_uuid >=", value, "fUuid");
            return (Criteria) this;
        }

        public Criteria andFUuidLessThan(String value) {
            addCriterion("f_uuid <", value, "fUuid");
            return (Criteria) this;
        }

        public Criteria andFUuidLessThanOrEqualTo(String value) {
            addCriterion("f_uuid <=", value, "fUuid");
            return (Criteria) this;
        }

        public Criteria andFUuidLike(String value) {
            addCriterion("f_uuid like", value, "fUuid");
            return (Criteria) this;
        }

        public Criteria andFUuidNotLike(String value) {
            addCriterion("f_uuid not like", value, "fUuid");
            return (Criteria) this;
        }

        public Criteria andFUuidIn(List<String> values) {
            addCriterion("f_uuid in", values, "fUuid");
            return (Criteria) this;
        }

        public Criteria andFUuidNotIn(List<String> values) {
            addCriterion("f_uuid not in", values, "fUuid");
            return (Criteria) this;
        }

        public Criteria andFUuidBetween(String value1, String value2) {
            addCriterion("f_uuid between", value1, value2, "fUuid");
            return (Criteria) this;
        }

        public Criteria andFUuidNotBetween(String value1, String value2) {
            addCriterion("f_uuid not between", value1, value2, "fUuid");
            return (Criteria) this;
        }

        public Criteria andFNameIsNull() {
            addCriterion("f_name is null");
            return (Criteria) this;
        }

        public Criteria andFNameIsNotNull() {
            addCriterion("f_name is not null");
            return (Criteria) this;
        }

        public Criteria andFNameEqualTo(String value) {
            addCriterion("f_name =", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotEqualTo(String value) {
            addCriterion("f_name <>", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThan(String value) {
            addCriterion("f_name >", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_name >=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThan(String value) {
            addCriterion("f_name <", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThanOrEqualTo(String value) {
            addCriterion("f_name <=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLike(String value) {
            addCriterion("f_name like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotLike(String value) {
            addCriterion("f_name not like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameIn(List<String> values) {
            addCriterion("f_name in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotIn(List<String> values) {
            addCriterion("f_name not in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameBetween(String value1, String value2) {
            addCriterion("f_name between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotBetween(String value1, String value2) {
            addCriterion("f_name not between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFLockIdIsNull() {
            addCriterion("f_lock_id is null");
            return (Criteria) this;
        }

        public Criteria andFLockIdIsNotNull() {
            addCriterion("f_lock_id is not null");
            return (Criteria) this;
        }

        public Criteria andFLockIdEqualTo(Integer value) {
            addCriterion("f_lock_id =", value, "fLockId");
            return (Criteria) this;
        }

        public Criteria andFLockIdNotEqualTo(Integer value) {
            addCriterion("f_lock_id <>", value, "fLockId");
            return (Criteria) this;
        }

        public Criteria andFLockIdGreaterThan(Integer value) {
            addCriterion("f_lock_id >", value, "fLockId");
            return (Criteria) this;
        }

        public Criteria andFLockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_lock_id >=", value, "fLockId");
            return (Criteria) this;
        }

        public Criteria andFLockIdLessThan(Integer value) {
            addCriterion("f_lock_id <", value, "fLockId");
            return (Criteria) this;
        }

        public Criteria andFLockIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_lock_id <=", value, "fLockId");
            return (Criteria) this;
        }

        public Criteria andFLockIdIn(List<Integer> values) {
            addCriterion("f_lock_id in", values, "fLockId");
            return (Criteria) this;
        }

        public Criteria andFLockIdNotIn(List<Integer> values) {
            addCriterion("f_lock_id not in", values, "fLockId");
            return (Criteria) this;
        }

        public Criteria andFLockIdBetween(Integer value1, Integer value2) {
            addCriterion("f_lock_id between", value1, value2, "fLockId");
            return (Criteria) this;
        }

        public Criteria andFLockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_lock_id not between", value1, value2, "fLockId");
            return (Criteria) this;
        }

        public Criteria andFUserIdIsNull() {
            addCriterion("f_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFUserIdIsNotNull() {
            addCriterion("f_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFUserIdEqualTo(Integer value) {
            addCriterion("f_user_id =", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdNotEqualTo(Integer value) {
            addCriterion("f_user_id <>", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdGreaterThan(Integer value) {
            addCriterion("f_user_id >", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_user_id >=", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdLessThan(Integer value) {
            addCriterion("f_user_id <", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_user_id <=", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdIn(List<Integer> values) {
            addCriterion("f_user_id in", values, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdNotIn(List<Integer> values) {
            addCriterion("f_user_id not in", values, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdBetween(Integer value1, Integer value2) {
            addCriterion("f_user_id between", value1, value2, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_user_id not between", value1, value2, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFContentPathIsNull() {
            addCriterion("f_content_path is null");
            return (Criteria) this;
        }

        public Criteria andFContentPathIsNotNull() {
            addCriterion("f_content_path is not null");
            return (Criteria) this;
        }

        public Criteria andFContentPathEqualTo(String value) {
            addCriterion("f_content_path =", value, "fContentPath");
            return (Criteria) this;
        }

        public Criteria andFContentPathNotEqualTo(String value) {
            addCriterion("f_content_path <>", value, "fContentPath");
            return (Criteria) this;
        }

        public Criteria andFContentPathGreaterThan(String value) {
            addCriterion("f_content_path >", value, "fContentPath");
            return (Criteria) this;
        }

        public Criteria andFContentPathGreaterThanOrEqualTo(String value) {
            addCriterion("f_content_path >=", value, "fContentPath");
            return (Criteria) this;
        }

        public Criteria andFContentPathLessThan(String value) {
            addCriterion("f_content_path <", value, "fContentPath");
            return (Criteria) this;
        }

        public Criteria andFContentPathLessThanOrEqualTo(String value) {
            addCriterion("f_content_path <=", value, "fContentPath");
            return (Criteria) this;
        }

        public Criteria andFContentPathLike(String value) {
            addCriterion("f_content_path like", value, "fContentPath");
            return (Criteria) this;
        }

        public Criteria andFContentPathNotLike(String value) {
            addCriterion("f_content_path not like", value, "fContentPath");
            return (Criteria) this;
        }

        public Criteria andFContentPathIn(List<String> values) {
            addCriterion("f_content_path in", values, "fContentPath");
            return (Criteria) this;
        }

        public Criteria andFContentPathNotIn(List<String> values) {
            addCriterion("f_content_path not in", values, "fContentPath");
            return (Criteria) this;
        }

        public Criteria andFContentPathBetween(String value1, String value2) {
            addCriterion("f_content_path between", value1, value2, "fContentPath");
            return (Criteria) this;
        }

        public Criteria andFContentPathNotBetween(String value1, String value2) {
            addCriterion("f_content_path not between", value1, value2, "fContentPath");
            return (Criteria) this;
        }

        public Criteria andFDeleteIsNull() {
            addCriterion("f_delete is null");
            return (Criteria) this;
        }

        public Criteria andFDeleteIsNotNull() {
            addCriterion("f_delete is not null");
            return (Criteria) this;
        }

        public Criteria andFDeleteEqualTo(Integer value) {
            addCriterion("f_delete =", value, "fDelete");
            return (Criteria) this;
        }

        public Criteria andFDeleteNotEqualTo(Integer value) {
            addCriterion("f_delete <>", value, "fDelete");
            return (Criteria) this;
        }

        public Criteria andFDeleteGreaterThan(Integer value) {
            addCriterion("f_delete >", value, "fDelete");
            return (Criteria) this;
        }

        public Criteria andFDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_delete >=", value, "fDelete");
            return (Criteria) this;
        }

        public Criteria andFDeleteLessThan(Integer value) {
            addCriterion("f_delete <", value, "fDelete");
            return (Criteria) this;
        }

        public Criteria andFDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("f_delete <=", value, "fDelete");
            return (Criteria) this;
        }

        public Criteria andFDeleteIn(List<Integer> values) {
            addCriterion("f_delete in", values, "fDelete");
            return (Criteria) this;
        }

        public Criteria andFDeleteNotIn(List<Integer> values) {
            addCriterion("f_delete not in", values, "fDelete");
            return (Criteria) this;
        }

        public Criteria andFDeleteBetween(Integer value1, Integer value2) {
            addCriterion("f_delete between", value1, value2, "fDelete");
            return (Criteria) this;
        }

        public Criteria andFDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("f_delete not between", value1, value2, "fDelete");
            return (Criteria) this;
        }

        public Criteria andFIsModifyIsNull() {
            addCriterion("f_is_modify is null");
            return (Criteria) this;
        }

        public Criteria andFIsModifyIsNotNull() {
            addCriterion("f_is_modify is not null");
            return (Criteria) this;
        }

        public Criteria andFIsModifyEqualTo(Integer value) {
            addCriterion("f_is_modify =", value, "fIsModify");
            return (Criteria) this;
        }

        public Criteria andFIsModifyNotEqualTo(Integer value) {
            addCriterion("f_is_modify <>", value, "fIsModify");
            return (Criteria) this;
        }

        public Criteria andFIsModifyGreaterThan(Integer value) {
            addCriterion("f_is_modify >", value, "fIsModify");
            return (Criteria) this;
        }

        public Criteria andFIsModifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_is_modify >=", value, "fIsModify");
            return (Criteria) this;
        }

        public Criteria andFIsModifyLessThan(Integer value) {
            addCriterion("f_is_modify <", value, "fIsModify");
            return (Criteria) this;
        }

        public Criteria andFIsModifyLessThanOrEqualTo(Integer value) {
            addCriterion("f_is_modify <=", value, "fIsModify");
            return (Criteria) this;
        }

        public Criteria andFIsModifyIn(List<Integer> values) {
            addCriterion("f_is_modify in", values, "fIsModify");
            return (Criteria) this;
        }

        public Criteria andFIsModifyNotIn(List<Integer> values) {
            addCriterion("f_is_modify not in", values, "fIsModify");
            return (Criteria) this;
        }

        public Criteria andFIsModifyBetween(Integer value1, Integer value2) {
            addCriterion("f_is_modify between", value1, value2, "fIsModify");
            return (Criteria) this;
        }

        public Criteria andFIsModifyNotBetween(Integer value1, Integer value2) {
            addCriterion("f_is_modify not between", value1, value2, "fIsModify");
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