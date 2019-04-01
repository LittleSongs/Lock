package com.dhy.yycompany.lock.bean;

import java.util.ArrayList;
import java.util.List;

public class AdministratorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdministratorExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminUuidIsNull() {
            addCriterion("admin_uuid is null");
            return (Criteria) this;
        }

        public Criteria andAdminUuidIsNotNull() {
            addCriterion("admin_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andAdminUuidEqualTo(String value) {
            addCriterion("admin_uuid =", value, "adminUuid");
            return (Criteria) this;
        }

        public Criteria andAdminUuidNotEqualTo(String value) {
            addCriterion("admin_uuid <>", value, "adminUuid");
            return (Criteria) this;
        }

        public Criteria andAdminUuidGreaterThan(String value) {
            addCriterion("admin_uuid >", value, "adminUuid");
            return (Criteria) this;
        }

        public Criteria andAdminUuidGreaterThanOrEqualTo(String value) {
            addCriterion("admin_uuid >=", value, "adminUuid");
            return (Criteria) this;
        }

        public Criteria andAdminUuidLessThan(String value) {
            addCriterion("admin_uuid <", value, "adminUuid");
            return (Criteria) this;
        }

        public Criteria andAdminUuidLessThanOrEqualTo(String value) {
            addCriterion("admin_uuid <=", value, "adminUuid");
            return (Criteria) this;
        }

        public Criteria andAdminUuidLike(String value) {
            addCriterion("admin_uuid like", value, "adminUuid");
            return (Criteria) this;
        }

        public Criteria andAdminUuidNotLike(String value) {
            addCriterion("admin_uuid not like", value, "adminUuid");
            return (Criteria) this;
        }

        public Criteria andAdminUuidIn(List<String> values) {
            addCriterion("admin_uuid in", values, "adminUuid");
            return (Criteria) this;
        }

        public Criteria andAdminUuidNotIn(List<String> values) {
            addCriterion("admin_uuid not in", values, "adminUuid");
            return (Criteria) this;
        }

        public Criteria andAdminUuidBetween(String value1, String value2) {
            addCriterion("admin_uuid between", value1, value2, "adminUuid");
            return (Criteria) this;
        }

        public Criteria andAdminUuidNotBetween(String value1, String value2) {
            addCriterion("admin_uuid not between", value1, value2, "adminUuid");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminAvatorIsNull() {
            addCriterion("admin_avator is null");
            return (Criteria) this;
        }

        public Criteria andAdminAvatorIsNotNull() {
            addCriterion("admin_avator is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAvatorEqualTo(String value) {
            addCriterion("admin_avator =", value, "adminAvator");
            return (Criteria) this;
        }

        public Criteria andAdminAvatorNotEqualTo(String value) {
            addCriterion("admin_avator <>", value, "adminAvator");
            return (Criteria) this;
        }

        public Criteria andAdminAvatorGreaterThan(String value) {
            addCriterion("admin_avator >", value, "adminAvator");
            return (Criteria) this;
        }

        public Criteria andAdminAvatorGreaterThanOrEqualTo(String value) {
            addCriterion("admin_avator >=", value, "adminAvator");
            return (Criteria) this;
        }

        public Criteria andAdminAvatorLessThan(String value) {
            addCriterion("admin_avator <", value, "adminAvator");
            return (Criteria) this;
        }

        public Criteria andAdminAvatorLessThanOrEqualTo(String value) {
            addCriterion("admin_avator <=", value, "adminAvator");
            return (Criteria) this;
        }

        public Criteria andAdminAvatorLike(String value) {
            addCriterion("admin_avator like", value, "adminAvator");
            return (Criteria) this;
        }

        public Criteria andAdminAvatorNotLike(String value) {
            addCriterion("admin_avator not like", value, "adminAvator");
            return (Criteria) this;
        }

        public Criteria andAdminAvatorIn(List<String> values) {
            addCriterion("admin_avator in", values, "adminAvator");
            return (Criteria) this;
        }

        public Criteria andAdminAvatorNotIn(List<String> values) {
            addCriterion("admin_avator not in", values, "adminAvator");
            return (Criteria) this;
        }

        public Criteria andAdminAvatorBetween(String value1, String value2) {
            addCriterion("admin_avator between", value1, value2, "adminAvator");
            return (Criteria) this;
        }

        public Criteria andAdminAvatorNotBetween(String value1, String value2) {
            addCriterion("admin_avator not between", value1, value2, "adminAvator");
            return (Criteria) this;
        }

        public Criteria andAdminPermissionIsNull() {
            addCriterion("admin_permission is null");
            return (Criteria) this;
        }

        public Criteria andAdminPermissionIsNotNull() {
            addCriterion("admin_permission is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPermissionEqualTo(Integer value) {
            addCriterion("admin_permission =", value, "adminPermission");
            return (Criteria) this;
        }

        public Criteria andAdminPermissionNotEqualTo(Integer value) {
            addCriterion("admin_permission <>", value, "adminPermission");
            return (Criteria) this;
        }

        public Criteria andAdminPermissionGreaterThan(Integer value) {
            addCriterion("admin_permission >", value, "adminPermission");
            return (Criteria) this;
        }

        public Criteria andAdminPermissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_permission >=", value, "adminPermission");
            return (Criteria) this;
        }

        public Criteria andAdminPermissionLessThan(Integer value) {
            addCriterion("admin_permission <", value, "adminPermission");
            return (Criteria) this;
        }

        public Criteria andAdminPermissionLessThanOrEqualTo(Integer value) {
            addCriterion("admin_permission <=", value, "adminPermission");
            return (Criteria) this;
        }

        public Criteria andAdminPermissionIn(List<Integer> values) {
            addCriterion("admin_permission in", values, "adminPermission");
            return (Criteria) this;
        }

        public Criteria andAdminPermissionNotIn(List<Integer> values) {
            addCriterion("admin_permission not in", values, "adminPermission");
            return (Criteria) this;
        }

        public Criteria andAdminPermissionBetween(Integer value1, Integer value2) {
            addCriterion("admin_permission between", value1, value2, "adminPermission");
            return (Criteria) this;
        }

        public Criteria andAdminPermissionNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_permission not between", value1, value2, "adminPermission");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNull() {
            addCriterion("admin_phone is null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNotNull() {
            addCriterion("admin_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneEqualTo(String value) {
            addCriterion("admin_phone =", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotEqualTo(String value) {
            addCriterion("admin_phone <>", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThan(String value) {
            addCriterion("admin_phone >", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("admin_phone >=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThan(String value) {
            addCriterion("admin_phone <", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThanOrEqualTo(String value) {
            addCriterion("admin_phone <=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLike(String value) {
            addCriterion("admin_phone like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotLike(String value) {
            addCriterion("admin_phone not like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIn(List<String> values) {
            addCriterion("admin_phone in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotIn(List<String> values) {
            addCriterion("admin_phone not in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneBetween(String value1, String value2) {
            addCriterion("admin_phone between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotBetween(String value1, String value2) {
            addCriterion("admin_phone not between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminAddressIsNull() {
            addCriterion("admin_address is null");
            return (Criteria) this;
        }

        public Criteria andAdminAddressIsNotNull() {
            addCriterion("admin_address is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAddressEqualTo(String value) {
            addCriterion("admin_address =", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressNotEqualTo(String value) {
            addCriterion("admin_address <>", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressGreaterThan(String value) {
            addCriterion("admin_address >", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressGreaterThanOrEqualTo(String value) {
            addCriterion("admin_address >=", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressLessThan(String value) {
            addCriterion("admin_address <", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressLessThanOrEqualTo(String value) {
            addCriterion("admin_address <=", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressLike(String value) {
            addCriterion("admin_address like", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressNotLike(String value) {
            addCriterion("admin_address not like", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressIn(List<String> values) {
            addCriterion("admin_address in", values, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressNotIn(List<String> values) {
            addCriterion("admin_address not in", values, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressBetween(String value1, String value2) {
            addCriterion("admin_address between", value1, value2, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressNotBetween(String value1, String value2) {
            addCriterion("admin_address not between", value1, value2, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIsNull() {
            addCriterion("admin_account is null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIsNotNull() {
            addCriterion("admin_account is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountEqualTo(String value) {
            addCriterion("admin_account =", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotEqualTo(String value) {
            addCriterion("admin_account <>", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThan(String value) {
            addCriterion("admin_account >", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThanOrEqualTo(String value) {
            addCriterion("admin_account >=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThan(String value) {
            addCriterion("admin_account <", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThanOrEqualTo(String value) {
            addCriterion("admin_account <=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLike(String value) {
            addCriterion("admin_account like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotLike(String value) {
            addCriterion("admin_account not like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIn(List<String> values) {
            addCriterion("admin_account in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotIn(List<String> values) {
            addCriterion("admin_account not in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountBetween(String value1, String value2) {
            addCriterion("admin_account between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotBetween(String value1, String value2) {
            addCriterion("admin_account not between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("admin_password =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("admin_password >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("admin_password <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("admin_password like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("admin_password not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("admin_password in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminModifyIsNull() {
            addCriterion("admin_modify is null");
            return (Criteria) this;
        }

        public Criteria andAdminModifyIsNotNull() {
            addCriterion("admin_modify is not null");
            return (Criteria) this;
        }

        public Criteria andAdminModifyEqualTo(Integer value) {
            addCriterion("admin_modify =", value, "adminModify");
            return (Criteria) this;
        }

        public Criteria andAdminModifyNotEqualTo(Integer value) {
            addCriterion("admin_modify <>", value, "adminModify");
            return (Criteria) this;
        }

        public Criteria andAdminModifyGreaterThan(Integer value) {
            addCriterion("admin_modify >", value, "adminModify");
            return (Criteria) this;
        }

        public Criteria andAdminModifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_modify >=", value, "adminModify");
            return (Criteria) this;
        }

        public Criteria andAdminModifyLessThan(Integer value) {
            addCriterion("admin_modify <", value, "adminModify");
            return (Criteria) this;
        }

        public Criteria andAdminModifyLessThanOrEqualTo(Integer value) {
            addCriterion("admin_modify <=", value, "adminModify");
            return (Criteria) this;
        }

        public Criteria andAdminModifyIn(List<Integer> values) {
            addCriterion("admin_modify in", values, "adminModify");
            return (Criteria) this;
        }

        public Criteria andAdminModifyNotIn(List<Integer> values) {
            addCriterion("admin_modify not in", values, "adminModify");
            return (Criteria) this;
        }

        public Criteria andAdminModifyBetween(Integer value1, Integer value2) {
            addCriterion("admin_modify between", value1, value2, "adminModify");
            return (Criteria) this;
        }

        public Criteria andAdminModifyNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_modify not between", value1, value2, "adminModify");
            return (Criteria) this;
        }

        public Criteria andAdminDeleteIsNull() {
            addCriterion("admin_delete is null");
            return (Criteria) this;
        }

        public Criteria andAdminDeleteIsNotNull() {
            addCriterion("admin_delete is not null");
            return (Criteria) this;
        }

        public Criteria andAdminDeleteEqualTo(Integer value) {
            addCriterion("admin_delete =", value, "adminDelete");
            return (Criteria) this;
        }

        public Criteria andAdminDeleteNotEqualTo(Integer value) {
            addCriterion("admin_delete <>", value, "adminDelete");
            return (Criteria) this;
        }

        public Criteria andAdminDeleteGreaterThan(Integer value) {
            addCriterion("admin_delete >", value, "adminDelete");
            return (Criteria) this;
        }

        public Criteria andAdminDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_delete >=", value, "adminDelete");
            return (Criteria) this;
        }

        public Criteria andAdminDeleteLessThan(Integer value) {
            addCriterion("admin_delete <", value, "adminDelete");
            return (Criteria) this;
        }

        public Criteria andAdminDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("admin_delete <=", value, "adminDelete");
            return (Criteria) this;
        }

        public Criteria andAdminDeleteIn(List<Integer> values) {
            addCriterion("admin_delete in", values, "adminDelete");
            return (Criteria) this;
        }

        public Criteria andAdminDeleteNotIn(List<Integer> values) {
            addCriterion("admin_delete not in", values, "adminDelete");
            return (Criteria) this;
        }

        public Criteria andAdminDeleteBetween(Integer value1, Integer value2) {
            addCriterion("admin_delete between", value1, value2, "adminDelete");
            return (Criteria) this;
        }

        public Criteria andAdminDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_delete not between", value1, value2, "adminDelete");
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