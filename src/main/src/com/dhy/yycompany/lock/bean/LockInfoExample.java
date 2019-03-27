package com.dhy.yycompany.lock.bean;

import java.util.ArrayList;
import java.util.List;

public class LockInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LockInfoExample() {
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

        public Criteria andLIdIsNull() {
            addCriterion("l_id is null");
            return (Criteria) this;
        }

        public Criteria andLIdIsNotNull() {
            addCriterion("l_id is not null");
            return (Criteria) this;
        }

        public Criteria andLIdEqualTo(Integer value) {
            addCriterion("l_id =", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotEqualTo(Integer value) {
            addCriterion("l_id <>", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThan(Integer value) {
            addCriterion("l_id >", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_id >=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThan(Integer value) {
            addCriterion("l_id <", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThanOrEqualTo(Integer value) {
            addCriterion("l_id <=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdIn(List<Integer> values) {
            addCriterion("l_id in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotIn(List<Integer> values) {
            addCriterion("l_id not in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdBetween(Integer value1, Integer value2) {
            addCriterion("l_id between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotBetween(Integer value1, Integer value2) {
            addCriterion("l_id not between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLUuidIsNull() {
            addCriterion("l_uuid is null");
            return (Criteria) this;
        }

        public Criteria andLUuidIsNotNull() {
            addCriterion("l_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andLUuidEqualTo(String value) {
            addCriterion("l_uuid =", value, "lUuid");
            return (Criteria) this;
        }

        public Criteria andLUuidNotEqualTo(String value) {
            addCriterion("l_uuid <>", value, "lUuid");
            return (Criteria) this;
        }

        public Criteria andLUuidGreaterThan(String value) {
            addCriterion("l_uuid >", value, "lUuid");
            return (Criteria) this;
        }

        public Criteria andLUuidGreaterThanOrEqualTo(String value) {
            addCriterion("l_uuid >=", value, "lUuid");
            return (Criteria) this;
        }

        public Criteria andLUuidLessThan(String value) {
            addCriterion("l_uuid <", value, "lUuid");
            return (Criteria) this;
        }

        public Criteria andLUuidLessThanOrEqualTo(String value) {
            addCriterion("l_uuid <=", value, "lUuid");
            return (Criteria) this;
        }

        public Criteria andLUuidLike(String value) {
            addCriterion("l_uuid like", value, "lUuid");
            return (Criteria) this;
        }

        public Criteria andLUuidNotLike(String value) {
            addCriterion("l_uuid not like", value, "lUuid");
            return (Criteria) this;
        }

        public Criteria andLUuidIn(List<String> values) {
            addCriterion("l_uuid in", values, "lUuid");
            return (Criteria) this;
        }

        public Criteria andLUuidNotIn(List<String> values) {
            addCriterion("l_uuid not in", values, "lUuid");
            return (Criteria) this;
        }

        public Criteria andLUuidBetween(String value1, String value2) {
            addCriterion("l_uuid between", value1, value2, "lUuid");
            return (Criteria) this;
        }

        public Criteria andLUuidNotBetween(String value1, String value2) {
            addCriterion("l_uuid not between", value1, value2, "lUuid");
            return (Criteria) this;
        }

        public Criteria andLStatusIsNull() {
            addCriterion("l_status is null");
            return (Criteria) this;
        }

        public Criteria andLStatusIsNotNull() {
            addCriterion("l_status is not null");
            return (Criteria) this;
        }

        public Criteria andLStatusEqualTo(Integer value) {
            addCriterion("l_status =", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusNotEqualTo(Integer value) {
            addCriterion("l_status <>", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusGreaterThan(Integer value) {
            addCriterion("l_status >", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_status >=", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusLessThan(Integer value) {
            addCriterion("l_status <", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusLessThanOrEqualTo(Integer value) {
            addCriterion("l_status <=", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusIn(List<Integer> values) {
            addCriterion("l_status in", values, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusNotIn(List<Integer> values) {
            addCriterion("l_status not in", values, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusBetween(Integer value1, Integer value2) {
            addCriterion("l_status between", value1, value2, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("l_status not between", value1, value2, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLSupplierIsNull() {
            addCriterion("l_supplier is null");
            return (Criteria) this;
        }

        public Criteria andLSupplierIsNotNull() {
            addCriterion("l_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andLSupplierEqualTo(String value) {
            addCriterion("l_supplier =", value, "lSupplier");
            return (Criteria) this;
        }

        public Criteria andLSupplierNotEqualTo(String value) {
            addCriterion("l_supplier <>", value, "lSupplier");
            return (Criteria) this;
        }

        public Criteria andLSupplierGreaterThan(String value) {
            addCriterion("l_supplier >", value, "lSupplier");
            return (Criteria) this;
        }

        public Criteria andLSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("l_supplier >=", value, "lSupplier");
            return (Criteria) this;
        }

        public Criteria andLSupplierLessThan(String value) {
            addCriterion("l_supplier <", value, "lSupplier");
            return (Criteria) this;
        }

        public Criteria andLSupplierLessThanOrEqualTo(String value) {
            addCriterion("l_supplier <=", value, "lSupplier");
            return (Criteria) this;
        }

        public Criteria andLSupplierLike(String value) {
            addCriterion("l_supplier like", value, "lSupplier");
            return (Criteria) this;
        }

        public Criteria andLSupplierNotLike(String value) {
            addCriterion("l_supplier not like", value, "lSupplier");
            return (Criteria) this;
        }

        public Criteria andLSupplierIn(List<String> values) {
            addCriterion("l_supplier in", values, "lSupplier");
            return (Criteria) this;
        }

        public Criteria andLSupplierNotIn(List<String> values) {
            addCriterion("l_supplier not in", values, "lSupplier");
            return (Criteria) this;
        }

        public Criteria andLSupplierBetween(String value1, String value2) {
            addCriterion("l_supplier between", value1, value2, "lSupplier");
            return (Criteria) this;
        }

        public Criteria andLSupplierNotBetween(String value1, String value2) {
            addCriterion("l_supplier not between", value1, value2, "lSupplier");
            return (Criteria) this;
        }

        public Criteria andLSoftVerIsNull() {
            addCriterion("l_soft_ver is null");
            return (Criteria) this;
        }

        public Criteria andLSoftVerIsNotNull() {
            addCriterion("l_soft_ver is not null");
            return (Criteria) this;
        }

        public Criteria andLSoftVerEqualTo(String value) {
            addCriterion("l_soft_ver =", value, "lSoftVer");
            return (Criteria) this;
        }

        public Criteria andLSoftVerNotEqualTo(String value) {
            addCriterion("l_soft_ver <>", value, "lSoftVer");
            return (Criteria) this;
        }

        public Criteria andLSoftVerGreaterThan(String value) {
            addCriterion("l_soft_ver >", value, "lSoftVer");
            return (Criteria) this;
        }

        public Criteria andLSoftVerGreaterThanOrEqualTo(String value) {
            addCriterion("l_soft_ver >=", value, "lSoftVer");
            return (Criteria) this;
        }

        public Criteria andLSoftVerLessThan(String value) {
            addCriterion("l_soft_ver <", value, "lSoftVer");
            return (Criteria) this;
        }

        public Criteria andLSoftVerLessThanOrEqualTo(String value) {
            addCriterion("l_soft_ver <=", value, "lSoftVer");
            return (Criteria) this;
        }

        public Criteria andLSoftVerLike(String value) {
            addCriterion("l_soft_ver like", value, "lSoftVer");
            return (Criteria) this;
        }

        public Criteria andLSoftVerNotLike(String value) {
            addCriterion("l_soft_ver not like", value, "lSoftVer");
            return (Criteria) this;
        }

        public Criteria andLSoftVerIn(List<String> values) {
            addCriterion("l_soft_ver in", values, "lSoftVer");
            return (Criteria) this;
        }

        public Criteria andLSoftVerNotIn(List<String> values) {
            addCriterion("l_soft_ver not in", values, "lSoftVer");
            return (Criteria) this;
        }

        public Criteria andLSoftVerBetween(String value1, String value2) {
            addCriterion("l_soft_ver between", value1, value2, "lSoftVer");
            return (Criteria) this;
        }

        public Criteria andLSoftVerNotBetween(String value1, String value2) {
            addCriterion("l_soft_ver not between", value1, value2, "lSoftVer");
            return (Criteria) this;
        }

        public Criteria andLHardVerIsNull() {
            addCriterion("l_hard_ver is null");
            return (Criteria) this;
        }

        public Criteria andLHardVerIsNotNull() {
            addCriterion("l_hard_ver is not null");
            return (Criteria) this;
        }

        public Criteria andLHardVerEqualTo(String value) {
            addCriterion("l_hard_ver =", value, "lHardVer");
            return (Criteria) this;
        }

        public Criteria andLHardVerNotEqualTo(String value) {
            addCriterion("l_hard_ver <>", value, "lHardVer");
            return (Criteria) this;
        }

        public Criteria andLHardVerGreaterThan(String value) {
            addCriterion("l_hard_ver >", value, "lHardVer");
            return (Criteria) this;
        }

        public Criteria andLHardVerGreaterThanOrEqualTo(String value) {
            addCriterion("l_hard_ver >=", value, "lHardVer");
            return (Criteria) this;
        }

        public Criteria andLHardVerLessThan(String value) {
            addCriterion("l_hard_ver <", value, "lHardVer");
            return (Criteria) this;
        }

        public Criteria andLHardVerLessThanOrEqualTo(String value) {
            addCriterion("l_hard_ver <=", value, "lHardVer");
            return (Criteria) this;
        }

        public Criteria andLHardVerLike(String value) {
            addCriterion("l_hard_ver like", value, "lHardVer");
            return (Criteria) this;
        }

        public Criteria andLHardVerNotLike(String value) {
            addCriterion("l_hard_ver not like", value, "lHardVer");
            return (Criteria) this;
        }

        public Criteria andLHardVerIn(List<String> values) {
            addCriterion("l_hard_ver in", values, "lHardVer");
            return (Criteria) this;
        }

        public Criteria andLHardVerNotIn(List<String> values) {
            addCriterion("l_hard_ver not in", values, "lHardVer");
            return (Criteria) this;
        }

        public Criteria andLHardVerBetween(String value1, String value2) {
            addCriterion("l_hard_ver between", value1, value2, "lHardVer");
            return (Criteria) this;
        }

        public Criteria andLHardVerNotBetween(String value1, String value2) {
            addCriterion("l_hard_ver not between", value1, value2, "lHardVer");
            return (Criteria) this;
        }

        public Criteria andLProductionDateIsNull() {
            addCriterion("l_production_date is null");
            return (Criteria) this;
        }

        public Criteria andLProductionDateIsNotNull() {
            addCriterion("l_production_date is not null");
            return (Criteria) this;
        }

        public Criteria andLProductionDateEqualTo(String value) {
            addCriterion("l_production_date =", value, "lProductionDate");
            return (Criteria) this;
        }

        public Criteria andLProductionDateNotEqualTo(String value) {
            addCriterion("l_production_date <>", value, "lProductionDate");
            return (Criteria) this;
        }

        public Criteria andLProductionDateGreaterThan(String value) {
            addCriterion("l_production_date >", value, "lProductionDate");
            return (Criteria) this;
        }

        public Criteria andLProductionDateGreaterThanOrEqualTo(String value) {
            addCriterion("l_production_date >=", value, "lProductionDate");
            return (Criteria) this;
        }

        public Criteria andLProductionDateLessThan(String value) {
            addCriterion("l_production_date <", value, "lProductionDate");
            return (Criteria) this;
        }

        public Criteria andLProductionDateLessThanOrEqualTo(String value) {
            addCriterion("l_production_date <=", value, "lProductionDate");
            return (Criteria) this;
        }

        public Criteria andLProductionDateLike(String value) {
            addCriterion("l_production_date like", value, "lProductionDate");
            return (Criteria) this;
        }

        public Criteria andLProductionDateNotLike(String value) {
            addCriterion("l_production_date not like", value, "lProductionDate");
            return (Criteria) this;
        }

        public Criteria andLProductionDateIn(List<String> values) {
            addCriterion("l_production_date in", values, "lProductionDate");
            return (Criteria) this;
        }

        public Criteria andLProductionDateNotIn(List<String> values) {
            addCriterion("l_production_date not in", values, "lProductionDate");
            return (Criteria) this;
        }

        public Criteria andLProductionDateBetween(String value1, String value2) {
            addCriterion("l_production_date between", value1, value2, "lProductionDate");
            return (Criteria) this;
        }

        public Criteria andLProductionDateNotBetween(String value1, String value2) {
            addCriterion("l_production_date not between", value1, value2, "lProductionDate");
            return (Criteria) this;
        }

        public Criteria andLIntroductionIsNull() {
            addCriterion("l_introduction is null");
            return (Criteria) this;
        }

        public Criteria andLIntroductionIsNotNull() {
            addCriterion("l_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andLIntroductionEqualTo(String value) {
            addCriterion("l_introduction =", value, "lIntroduction");
            return (Criteria) this;
        }

        public Criteria andLIntroductionNotEqualTo(String value) {
            addCriterion("l_introduction <>", value, "lIntroduction");
            return (Criteria) this;
        }

        public Criteria andLIntroductionGreaterThan(String value) {
            addCriterion("l_introduction >", value, "lIntroduction");
            return (Criteria) this;
        }

        public Criteria andLIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("l_introduction >=", value, "lIntroduction");
            return (Criteria) this;
        }

        public Criteria andLIntroductionLessThan(String value) {
            addCriterion("l_introduction <", value, "lIntroduction");
            return (Criteria) this;
        }

        public Criteria andLIntroductionLessThanOrEqualTo(String value) {
            addCriterion("l_introduction <=", value, "lIntroduction");
            return (Criteria) this;
        }

        public Criteria andLIntroductionLike(String value) {
            addCriterion("l_introduction like", value, "lIntroduction");
            return (Criteria) this;
        }

        public Criteria andLIntroductionNotLike(String value) {
            addCriterion("l_introduction not like", value, "lIntroduction");
            return (Criteria) this;
        }

        public Criteria andLIntroductionIn(List<String> values) {
            addCriterion("l_introduction in", values, "lIntroduction");
            return (Criteria) this;
        }

        public Criteria andLIntroductionNotIn(List<String> values) {
            addCriterion("l_introduction not in", values, "lIntroduction");
            return (Criteria) this;
        }

        public Criteria andLIntroductionBetween(String value1, String value2) {
            addCriterion("l_introduction between", value1, value2, "lIntroduction");
            return (Criteria) this;
        }

        public Criteria andLIntroductionNotBetween(String value1, String value2) {
            addCriterion("l_introduction not between", value1, value2, "lIntroduction");
            return (Criteria) this;
        }

        public Criteria andLDeleteIsNull() {
            addCriterion("l_delete is null");
            return (Criteria) this;
        }

        public Criteria andLDeleteIsNotNull() {
            addCriterion("l_delete is not null");
            return (Criteria) this;
        }

        public Criteria andLDeleteEqualTo(Integer value) {
            addCriterion("l_delete =", value, "lDelete");
            return (Criteria) this;
        }

        public Criteria andLDeleteNotEqualTo(Integer value) {
            addCriterion("l_delete <>", value, "lDelete");
            return (Criteria) this;
        }

        public Criteria andLDeleteGreaterThan(Integer value) {
            addCriterion("l_delete >", value, "lDelete");
            return (Criteria) this;
        }

        public Criteria andLDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_delete >=", value, "lDelete");
            return (Criteria) this;
        }

        public Criteria andLDeleteLessThan(Integer value) {
            addCriterion("l_delete <", value, "lDelete");
            return (Criteria) this;
        }

        public Criteria andLDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("l_delete <=", value, "lDelete");
            return (Criteria) this;
        }

        public Criteria andLDeleteIn(List<Integer> values) {
            addCriterion("l_delete in", values, "lDelete");
            return (Criteria) this;
        }

        public Criteria andLDeleteNotIn(List<Integer> values) {
            addCriterion("l_delete not in", values, "lDelete");
            return (Criteria) this;
        }

        public Criteria andLDeleteBetween(Integer value1, Integer value2) {
            addCriterion("l_delete between", value1, value2, "lDelete");
            return (Criteria) this;
        }

        public Criteria andLDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("l_delete not between", value1, value2, "lDelete");
            return (Criteria) this;
        }

        public Criteria andLModifyIsNull() {
            addCriterion("l_modify is null");
            return (Criteria) this;
        }

        public Criteria andLModifyIsNotNull() {
            addCriterion("l_modify is not null");
            return (Criteria) this;
        }

        public Criteria andLModifyEqualTo(Integer value) {
            addCriterion("l_modify =", value, "lModify");
            return (Criteria) this;
        }

        public Criteria andLModifyNotEqualTo(Integer value) {
            addCriterion("l_modify <>", value, "lModify");
            return (Criteria) this;
        }

        public Criteria andLModifyGreaterThan(Integer value) {
            addCriterion("l_modify >", value, "lModify");
            return (Criteria) this;
        }

        public Criteria andLModifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_modify >=", value, "lModify");
            return (Criteria) this;
        }

        public Criteria andLModifyLessThan(Integer value) {
            addCriterion("l_modify <", value, "lModify");
            return (Criteria) this;
        }

        public Criteria andLModifyLessThanOrEqualTo(Integer value) {
            addCriterion("l_modify <=", value, "lModify");
            return (Criteria) this;
        }

        public Criteria andLModifyIn(List<Integer> values) {
            addCriterion("l_modify in", values, "lModify");
            return (Criteria) this;
        }

        public Criteria andLModifyNotIn(List<Integer> values) {
            addCriterion("l_modify not in", values, "lModify");
            return (Criteria) this;
        }

        public Criteria andLModifyBetween(Integer value1, Integer value2) {
            addCriterion("l_modify between", value1, value2, "lModify");
            return (Criteria) this;
        }

        public Criteria andLModifyNotBetween(Integer value1, Integer value2) {
            addCriterion("l_modify not between", value1, value2, "lModify");
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