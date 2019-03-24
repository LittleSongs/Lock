package com.dhy.yycompany.lock.bean;

import java.util.ArrayList;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
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

        public Criteria andRUuidIsNull() {
            addCriterion("r_uuid is null");
            return (Criteria) this;
        }

        public Criteria andRUuidIsNotNull() {
            addCriterion("r_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andRUuidEqualTo(String value) {
            addCriterion("r_uuid =", value, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidNotEqualTo(String value) {
            addCriterion("r_uuid <>", value, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidGreaterThan(String value) {
            addCriterion("r_uuid >", value, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidGreaterThanOrEqualTo(String value) {
            addCriterion("r_uuid >=", value, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidLessThan(String value) {
            addCriterion("r_uuid <", value, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidLessThanOrEqualTo(String value) {
            addCriterion("r_uuid <=", value, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidLike(String value) {
            addCriterion("r_uuid like", value, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidNotLike(String value) {
            addCriterion("r_uuid not like", value, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidIn(List<String> values) {
            addCriterion("r_uuid in", values, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidNotIn(List<String> values) {
            addCriterion("r_uuid not in", values, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidBetween(String value1, String value2) {
            addCriterion("r_uuid between", value1, value2, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidNotBetween(String value1, String value2) {
            addCriterion("r_uuid not between", value1, value2, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRApartmentIdIsNull() {
            addCriterion("r_apartment_id is null");
            return (Criteria) this;
        }

        public Criteria andRApartmentIdIsNotNull() {
            addCriterion("r_apartment_id is not null");
            return (Criteria) this;
        }

        public Criteria andRApartmentIdEqualTo(Integer value) {
            addCriterion("r_apartment_id =", value, "rApartmentId");
            return (Criteria) this;
        }

        public Criteria andRApartmentIdNotEqualTo(Integer value) {
            addCriterion("r_apartment_id <>", value, "rApartmentId");
            return (Criteria) this;
        }

        public Criteria andRApartmentIdGreaterThan(Integer value) {
            addCriterion("r_apartment_id >", value, "rApartmentId");
            return (Criteria) this;
        }

        public Criteria andRApartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_apartment_id >=", value, "rApartmentId");
            return (Criteria) this;
        }

        public Criteria andRApartmentIdLessThan(Integer value) {
            addCriterion("r_apartment_id <", value, "rApartmentId");
            return (Criteria) this;
        }

        public Criteria andRApartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_apartment_id <=", value, "rApartmentId");
            return (Criteria) this;
        }

        public Criteria andRApartmentIdIn(List<Integer> values) {
            addCriterion("r_apartment_id in", values, "rApartmentId");
            return (Criteria) this;
        }

        public Criteria andRApartmentIdNotIn(List<Integer> values) {
            addCriterion("r_apartment_id not in", values, "rApartmentId");
            return (Criteria) this;
        }

        public Criteria andRApartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("r_apartment_id between", value1, value2, "rApartmentId");
            return (Criteria) this;
        }

        public Criteria andRApartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_apartment_id not between", value1, value2, "rApartmentId");
            return (Criteria) this;
        }

        public Criteria andRFloorIsNull() {
            addCriterion("r_floor is null");
            return (Criteria) this;
        }

        public Criteria andRFloorIsNotNull() {
            addCriterion("r_floor is not null");
            return (Criteria) this;
        }

        public Criteria andRFloorEqualTo(Integer value) {
            addCriterion("r_floor =", value, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRFloorNotEqualTo(Integer value) {
            addCriterion("r_floor <>", value, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRFloorGreaterThan(Integer value) {
            addCriterion("r_floor >", value, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_floor >=", value, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRFloorLessThan(Integer value) {
            addCriterion("r_floor <", value, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRFloorLessThanOrEqualTo(Integer value) {
            addCriterion("r_floor <=", value, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRFloorIn(List<Integer> values) {
            addCriterion("r_floor in", values, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRFloorNotIn(List<Integer> values) {
            addCriterion("r_floor not in", values, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRFloorBetween(Integer value1, Integer value2) {
            addCriterion("r_floor between", value1, value2, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("r_floor not between", value1, value2, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRNumIsNull() {
            addCriterion("r_num is null");
            return (Criteria) this;
        }

        public Criteria andRNumIsNotNull() {
            addCriterion("r_num is not null");
            return (Criteria) this;
        }

        public Criteria andRNumEqualTo(String value) {
            addCriterion("r_num =", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumNotEqualTo(String value) {
            addCriterion("r_num <>", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumGreaterThan(String value) {
            addCriterion("r_num >", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumGreaterThanOrEqualTo(String value) {
            addCriterion("r_num >=", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumLessThan(String value) {
            addCriterion("r_num <", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumLessThanOrEqualTo(String value) {
            addCriterion("r_num <=", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumLike(String value) {
            addCriterion("r_num like", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumNotLike(String value) {
            addCriterion("r_num not like", value, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumIn(List<String> values) {
            addCriterion("r_num in", values, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumNotIn(List<String> values) {
            addCriterion("r_num not in", values, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumBetween(String value1, String value2) {
            addCriterion("r_num between", value1, value2, "rNum");
            return (Criteria) this;
        }

        public Criteria andRNumNotBetween(String value1, String value2) {
            addCriterion("r_num not between", value1, value2, "rNum");
            return (Criteria) this;
        }

        public Criteria andRPriceIsNull() {
            addCriterion("r_price is null");
            return (Criteria) this;
        }

        public Criteria andRPriceIsNotNull() {
            addCriterion("r_price is not null");
            return (Criteria) this;
        }

        public Criteria andRPriceEqualTo(Integer value) {
            addCriterion("r_price =", value, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceNotEqualTo(Integer value) {
            addCriterion("r_price <>", value, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceGreaterThan(Integer value) {
            addCriterion("r_price >", value, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_price >=", value, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceLessThan(Integer value) {
            addCriterion("r_price <", value, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceLessThanOrEqualTo(Integer value) {
            addCriterion("r_price <=", value, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceIn(List<Integer> values) {
            addCriterion("r_price in", values, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceNotIn(List<Integer> values) {
            addCriterion("r_price not in", values, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceBetween(Integer value1, Integer value2) {
            addCriterion("r_price between", value1, value2, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("r_price not between", value1, value2, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRResidentNumIsNull() {
            addCriterion("r_resident_num is null");
            return (Criteria) this;
        }

        public Criteria andRResidentNumIsNotNull() {
            addCriterion("r_resident_num is not null");
            return (Criteria) this;
        }

        public Criteria andRResidentNumEqualTo(Integer value) {
            addCriterion("r_resident_num =", value, "rResidentNum");
            return (Criteria) this;
        }

        public Criteria andRResidentNumNotEqualTo(Integer value) {
            addCriterion("r_resident_num <>", value, "rResidentNum");
            return (Criteria) this;
        }

        public Criteria andRResidentNumGreaterThan(Integer value) {
            addCriterion("r_resident_num >", value, "rResidentNum");
            return (Criteria) this;
        }

        public Criteria andRResidentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_resident_num >=", value, "rResidentNum");
            return (Criteria) this;
        }

        public Criteria andRResidentNumLessThan(Integer value) {
            addCriterion("r_resident_num <", value, "rResidentNum");
            return (Criteria) this;
        }

        public Criteria andRResidentNumLessThanOrEqualTo(Integer value) {
            addCriterion("r_resident_num <=", value, "rResidentNum");
            return (Criteria) this;
        }

        public Criteria andRResidentNumIn(List<Integer> values) {
            addCriterion("r_resident_num in", values, "rResidentNum");
            return (Criteria) this;
        }

        public Criteria andRResidentNumNotIn(List<Integer> values) {
            addCriterion("r_resident_num not in", values, "rResidentNum");
            return (Criteria) this;
        }

        public Criteria andRResidentNumBetween(Integer value1, Integer value2) {
            addCriterion("r_resident_num between", value1, value2, "rResidentNum");
            return (Criteria) this;
        }

        public Criteria andRResidentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("r_resident_num not between", value1, value2, "rResidentNum");
            return (Criteria) this;
        }

        public Criteria andRLockIdIsNull() {
            addCriterion("r_lock_id is null");
            return (Criteria) this;
        }

        public Criteria andRLockIdIsNotNull() {
            addCriterion("r_lock_id is not null");
            return (Criteria) this;
        }

        public Criteria andRLockIdEqualTo(Integer value) {
            addCriterion("r_lock_id =", value, "rLockId");
            return (Criteria) this;
        }

        public Criteria andRLockIdNotEqualTo(Integer value) {
            addCriterion("r_lock_id <>", value, "rLockId");
            return (Criteria) this;
        }

        public Criteria andRLockIdGreaterThan(Integer value) {
            addCriterion("r_lock_id >", value, "rLockId");
            return (Criteria) this;
        }

        public Criteria andRLockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_lock_id >=", value, "rLockId");
            return (Criteria) this;
        }

        public Criteria andRLockIdLessThan(Integer value) {
            addCriterion("r_lock_id <", value, "rLockId");
            return (Criteria) this;
        }

        public Criteria andRLockIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_lock_id <=", value, "rLockId");
            return (Criteria) this;
        }

        public Criteria andRLockIdIn(List<Integer> values) {
            addCriterion("r_lock_id in", values, "rLockId");
            return (Criteria) this;
        }

        public Criteria andRLockIdNotIn(List<Integer> values) {
            addCriterion("r_lock_id not in", values, "rLockId");
            return (Criteria) this;
        }

        public Criteria andRLockIdBetween(Integer value1, Integer value2) {
            addCriterion("r_lock_id between", value1, value2, "rLockId");
            return (Criteria) this;
        }

        public Criteria andRLockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_lock_id not between", value1, value2, "rLockId");
            return (Criteria) this;
        }

        public Criteria andRDeleteIsNull() {
            addCriterion("r_delete is null");
            return (Criteria) this;
        }

        public Criteria andRDeleteIsNotNull() {
            addCriterion("r_delete is not null");
            return (Criteria) this;
        }

        public Criteria andRDeleteEqualTo(Integer value) {
            addCriterion("r_delete =", value, "rDelete");
            return (Criteria) this;
        }

        public Criteria andRDeleteNotEqualTo(Integer value) {
            addCriterion("r_delete <>", value, "rDelete");
            return (Criteria) this;
        }

        public Criteria andRDeleteGreaterThan(Integer value) {
            addCriterion("r_delete >", value, "rDelete");
            return (Criteria) this;
        }

        public Criteria andRDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_delete >=", value, "rDelete");
            return (Criteria) this;
        }

        public Criteria andRDeleteLessThan(Integer value) {
            addCriterion("r_delete <", value, "rDelete");
            return (Criteria) this;
        }

        public Criteria andRDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("r_delete <=", value, "rDelete");
            return (Criteria) this;
        }

        public Criteria andRDeleteIn(List<Integer> values) {
            addCriterion("r_delete in", values, "rDelete");
            return (Criteria) this;
        }

        public Criteria andRDeleteNotIn(List<Integer> values) {
            addCriterion("r_delete not in", values, "rDelete");
            return (Criteria) this;
        }

        public Criteria andRDeleteBetween(Integer value1, Integer value2) {
            addCriterion("r_delete between", value1, value2, "rDelete");
            return (Criteria) this;
        }

        public Criteria andRDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("r_delete not between", value1, value2, "rDelete");
            return (Criteria) this;
        }

        public Criteria andRModifyIsNull() {
            addCriterion("r_modify is null");
            return (Criteria) this;
        }

        public Criteria andRModifyIsNotNull() {
            addCriterion("r_modify is not null");
            return (Criteria) this;
        }

        public Criteria andRModifyEqualTo(Integer value) {
            addCriterion("r_modify =", value, "rModify");
            return (Criteria) this;
        }

        public Criteria andRModifyNotEqualTo(Integer value) {
            addCriterion("r_modify <>", value, "rModify");
            return (Criteria) this;
        }

        public Criteria andRModifyGreaterThan(Integer value) {
            addCriterion("r_modify >", value, "rModify");
            return (Criteria) this;
        }

        public Criteria andRModifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_modify >=", value, "rModify");
            return (Criteria) this;
        }

        public Criteria andRModifyLessThan(Integer value) {
            addCriterion("r_modify <", value, "rModify");
            return (Criteria) this;
        }

        public Criteria andRModifyLessThanOrEqualTo(Integer value) {
            addCriterion("r_modify <=", value, "rModify");
            return (Criteria) this;
        }

        public Criteria andRModifyIn(List<Integer> values) {
            addCriterion("r_modify in", values, "rModify");
            return (Criteria) this;
        }

        public Criteria andRModifyNotIn(List<Integer> values) {
            addCriterion("r_modify not in", values, "rModify");
            return (Criteria) this;
        }

        public Criteria andRModifyBetween(Integer value1, Integer value2) {
            addCriterion("r_modify between", value1, value2, "rModify");
            return (Criteria) this;
        }

        public Criteria andRModifyNotBetween(Integer value1, Integer value2) {
            addCriterion("r_modify not between", value1, value2, "rModify");
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