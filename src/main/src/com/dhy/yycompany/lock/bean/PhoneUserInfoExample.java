package com.dhy.yycompany.lock.bean;

import java.util.ArrayList;
import java.util.List;

public class PhoneUserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhoneUserInfoExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPUuidIsNull() {
            addCriterion("p_uuid is null");
            return (Criteria) this;
        }

        public Criteria andPUuidIsNotNull() {
            addCriterion("p_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andPUuidEqualTo(String value) {
            addCriterion("p_uuid =", value, "pUuid");
            return (Criteria) this;
        }

        public Criteria andPUuidNotEqualTo(String value) {
            addCriterion("p_uuid <>", value, "pUuid");
            return (Criteria) this;
        }

        public Criteria andPUuidGreaterThan(String value) {
            addCriterion("p_uuid >", value, "pUuid");
            return (Criteria) this;
        }

        public Criteria andPUuidGreaterThanOrEqualTo(String value) {
            addCriterion("p_uuid >=", value, "pUuid");
            return (Criteria) this;
        }

        public Criteria andPUuidLessThan(String value) {
            addCriterion("p_uuid <", value, "pUuid");
            return (Criteria) this;
        }

        public Criteria andPUuidLessThanOrEqualTo(String value) {
            addCriterion("p_uuid <=", value, "pUuid");
            return (Criteria) this;
        }

        public Criteria andPUuidLike(String value) {
            addCriterion("p_uuid like", value, "pUuid");
            return (Criteria) this;
        }

        public Criteria andPUuidNotLike(String value) {
            addCriterion("p_uuid not like", value, "pUuid");
            return (Criteria) this;
        }

        public Criteria andPUuidIn(List<String> values) {
            addCriterion("p_uuid in", values, "pUuid");
            return (Criteria) this;
        }

        public Criteria andPUuidNotIn(List<String> values) {
            addCriterion("p_uuid not in", values, "pUuid");
            return (Criteria) this;
        }

        public Criteria andPUuidBetween(String value1, String value2) {
            addCriterion("p_uuid between", value1, value2, "pUuid");
            return (Criteria) this;
        }

        public Criteria andPUuidNotBetween(String value1, String value2) {
            addCriterion("p_uuid not between", value1, value2, "pUuid");
            return (Criteria) this;
        }

        public Criteria andPUIdIsNull() {
            addCriterion("p_u_id is null");
            return (Criteria) this;
        }

        public Criteria andPUIdIsNotNull() {
            addCriterion("p_u_id is not null");
            return (Criteria) this;
        }

        public Criteria andPUIdEqualTo(Integer value) {
            addCriterion("p_u_id =", value, "pUId");
            return (Criteria) this;
        }

        public Criteria andPUIdNotEqualTo(Integer value) {
            addCriterion("p_u_id <>", value, "pUId");
            return (Criteria) this;
        }

        public Criteria andPUIdGreaterThan(Integer value) {
            addCriterion("p_u_id >", value, "pUId");
            return (Criteria) this;
        }

        public Criteria andPUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_u_id >=", value, "pUId");
            return (Criteria) this;
        }

        public Criteria andPUIdLessThan(Integer value) {
            addCriterion("p_u_id <", value, "pUId");
            return (Criteria) this;
        }

        public Criteria andPUIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_u_id <=", value, "pUId");
            return (Criteria) this;
        }

        public Criteria andPUIdIn(List<Integer> values) {
            addCriterion("p_u_id in", values, "pUId");
            return (Criteria) this;
        }

        public Criteria andPUIdNotIn(List<Integer> values) {
            addCriterion("p_u_id not in", values, "pUId");
            return (Criteria) this;
        }

        public Criteria andPUIdBetween(Integer value1, Integer value2) {
            addCriterion("p_u_id between", value1, value2, "pUId");
            return (Criteria) this;
        }

        public Criteria andPUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_u_id not between", value1, value2, "pUId");
            return (Criteria) this;
        }

        public Criteria andPUserNameIsNull() {
            addCriterion("p_user_name is null");
            return (Criteria) this;
        }

        public Criteria andPUserNameIsNotNull() {
            addCriterion("p_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andPUserNameEqualTo(String value) {
            addCriterion("p_user_name =", value, "pUserName");
            return (Criteria) this;
        }

        public Criteria andPUserNameNotEqualTo(String value) {
            addCriterion("p_user_name <>", value, "pUserName");
            return (Criteria) this;
        }

        public Criteria andPUserNameGreaterThan(String value) {
            addCriterion("p_user_name >", value, "pUserName");
            return (Criteria) this;
        }

        public Criteria andPUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_user_name >=", value, "pUserName");
            return (Criteria) this;
        }

        public Criteria andPUserNameLessThan(String value) {
            addCriterion("p_user_name <", value, "pUserName");
            return (Criteria) this;
        }

        public Criteria andPUserNameLessThanOrEqualTo(String value) {
            addCriterion("p_user_name <=", value, "pUserName");
            return (Criteria) this;
        }

        public Criteria andPUserNameLike(String value) {
            addCriterion("p_user_name like", value, "pUserName");
            return (Criteria) this;
        }

        public Criteria andPUserNameNotLike(String value) {
            addCriterion("p_user_name not like", value, "pUserName");
            return (Criteria) this;
        }

        public Criteria andPUserNameIn(List<String> values) {
            addCriterion("p_user_name in", values, "pUserName");
            return (Criteria) this;
        }

        public Criteria andPUserNameNotIn(List<String> values) {
            addCriterion("p_user_name not in", values, "pUserName");
            return (Criteria) this;
        }

        public Criteria andPUserNameBetween(String value1, String value2) {
            addCriterion("p_user_name between", value1, value2, "pUserName");
            return (Criteria) this;
        }

        public Criteria andPUserNameNotBetween(String value1, String value2) {
            addCriterion("p_user_name not between", value1, value2, "pUserName");
            return (Criteria) this;
        }

        public Criteria andPAccountNumIsNull() {
            addCriterion("p_account_num is null");
            return (Criteria) this;
        }

        public Criteria andPAccountNumIsNotNull() {
            addCriterion("p_account_num is not null");
            return (Criteria) this;
        }

        public Criteria andPAccountNumEqualTo(String value) {
            addCriterion("p_account_num =", value, "pAccountNum");
            return (Criteria) this;
        }

        public Criteria andPAccountNumNotEqualTo(String value) {
            addCriterion("p_account_num <>", value, "pAccountNum");
            return (Criteria) this;
        }

        public Criteria andPAccountNumGreaterThan(String value) {
            addCriterion("p_account_num >", value, "pAccountNum");
            return (Criteria) this;
        }

        public Criteria andPAccountNumGreaterThanOrEqualTo(String value) {
            addCriterion("p_account_num >=", value, "pAccountNum");
            return (Criteria) this;
        }

        public Criteria andPAccountNumLessThan(String value) {
            addCriterion("p_account_num <", value, "pAccountNum");
            return (Criteria) this;
        }

        public Criteria andPAccountNumLessThanOrEqualTo(String value) {
            addCriterion("p_account_num <=", value, "pAccountNum");
            return (Criteria) this;
        }

        public Criteria andPAccountNumLike(String value) {
            addCriterion("p_account_num like", value, "pAccountNum");
            return (Criteria) this;
        }

        public Criteria andPAccountNumNotLike(String value) {
            addCriterion("p_account_num not like", value, "pAccountNum");
            return (Criteria) this;
        }

        public Criteria andPAccountNumIn(List<String> values) {
            addCriterion("p_account_num in", values, "pAccountNum");
            return (Criteria) this;
        }

        public Criteria andPAccountNumNotIn(List<String> values) {
            addCriterion("p_account_num not in", values, "pAccountNum");
            return (Criteria) this;
        }

        public Criteria andPAccountNumBetween(String value1, String value2) {
            addCriterion("p_account_num between", value1, value2, "pAccountNum");
            return (Criteria) this;
        }

        public Criteria andPAccountNumNotBetween(String value1, String value2) {
            addCriterion("p_account_num not between", value1, value2, "pAccountNum");
            return (Criteria) this;
        }

        public Criteria andPPasswordIsNull() {
            addCriterion("p_password is null");
            return (Criteria) this;
        }

        public Criteria andPPasswordIsNotNull() {
            addCriterion("p_password is not null");
            return (Criteria) this;
        }

        public Criteria andPPasswordEqualTo(String value) {
            addCriterion("p_password =", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordNotEqualTo(String value) {
            addCriterion("p_password <>", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordGreaterThan(String value) {
            addCriterion("p_password >", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("p_password >=", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordLessThan(String value) {
            addCriterion("p_password <", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordLessThanOrEqualTo(String value) {
            addCriterion("p_password <=", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordLike(String value) {
            addCriterion("p_password like", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordNotLike(String value) {
            addCriterion("p_password not like", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordIn(List<String> values) {
            addCriterion("p_password in", values, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordNotIn(List<String> values) {
            addCriterion("p_password not in", values, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordBetween(String value1, String value2) {
            addCriterion("p_password between", value1, value2, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordNotBetween(String value1, String value2) {
            addCriterion("p_password not between", value1, value2, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPDeleteIsNull() {
            addCriterion("p_delete is null");
            return (Criteria) this;
        }

        public Criteria andPDeleteIsNotNull() {
            addCriterion("p_delete is not null");
            return (Criteria) this;
        }

        public Criteria andPDeleteEqualTo(Integer value) {
            addCriterion("p_delete =", value, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPDeleteNotEqualTo(Integer value) {
            addCriterion("p_delete <>", value, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPDeleteGreaterThan(Integer value) {
            addCriterion("p_delete >", value, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_delete >=", value, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPDeleteLessThan(Integer value) {
            addCriterion("p_delete <", value, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("p_delete <=", value, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPDeleteIn(List<Integer> values) {
            addCriterion("p_delete in", values, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPDeleteNotIn(List<Integer> values) {
            addCriterion("p_delete not in", values, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPDeleteBetween(Integer value1, Integer value2) {
            addCriterion("p_delete between", value1, value2, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("p_delete not between", value1, value2, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPModifyIsNull() {
            addCriterion("p_modify is null");
            return (Criteria) this;
        }

        public Criteria andPModifyIsNotNull() {
            addCriterion("p_modify is not null");
            return (Criteria) this;
        }

        public Criteria andPModifyEqualTo(Integer value) {
            addCriterion("p_modify =", value, "pModify");
            return (Criteria) this;
        }

        public Criteria andPModifyNotEqualTo(Integer value) {
            addCriterion("p_modify <>", value, "pModify");
            return (Criteria) this;
        }

        public Criteria andPModifyGreaterThan(Integer value) {
            addCriterion("p_modify >", value, "pModify");
            return (Criteria) this;
        }

        public Criteria andPModifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_modify >=", value, "pModify");
            return (Criteria) this;
        }

        public Criteria andPModifyLessThan(Integer value) {
            addCriterion("p_modify <", value, "pModify");
            return (Criteria) this;
        }

        public Criteria andPModifyLessThanOrEqualTo(Integer value) {
            addCriterion("p_modify <=", value, "pModify");
            return (Criteria) this;
        }

        public Criteria andPModifyIn(List<Integer> values) {
            addCriterion("p_modify in", values, "pModify");
            return (Criteria) this;
        }

        public Criteria andPModifyNotIn(List<Integer> values) {
            addCriterion("p_modify not in", values, "pModify");
            return (Criteria) this;
        }

        public Criteria andPModifyBetween(Integer value1, Integer value2) {
            addCriterion("p_modify between", value1, value2, "pModify");
            return (Criteria) this;
        }

        public Criteria andPModifyNotBetween(Integer value1, Integer value2) {
            addCriterion("p_modify not between", value1, value2, "pModify");
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