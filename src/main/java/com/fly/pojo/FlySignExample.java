package com.fly.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlySignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlySignExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSignedIsNull() {
            addCriterion("SIGNED is null");
            return (Criteria) this;
        }

        public Criteria andSignedIsNotNull() {
            addCriterion("SIGNED is not null");
            return (Criteria) this;
        }

        public Criteria andSignedEqualTo(String value) {
            addCriterion("SIGNED =", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedNotEqualTo(String value) {
            addCriterion("SIGNED <>", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedGreaterThan(String value) {
            addCriterion("SIGNED >", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNED >=", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedLessThan(String value) {
            addCriterion("SIGNED <", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedLessThanOrEqualTo(String value) {
            addCriterion("SIGNED <=", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedLike(String value) {
            addCriterion("SIGNED like", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedNotLike(String value) {
            addCriterion("SIGNED not like", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedIn(List<String> values) {
            addCriterion("SIGNED in", values, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedNotIn(List<String> values) {
            addCriterion("SIGNED not in", values, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedBetween(String value1, String value2) {
            addCriterion("SIGNED between", value1, value2, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedNotBetween(String value1, String value2) {
            addCriterion("SIGNED not between", value1, value2, "signed");
            return (Criteria) this;
        }

        public Criteria andContinueNumIsNull() {
            addCriterion("CONTINUE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andContinueNumIsNotNull() {
            addCriterion("CONTINUE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andContinueNumEqualTo(Integer value) {
            addCriterion("CONTINUE_NUM =", value, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueNumNotEqualTo(Integer value) {
            addCriterion("CONTINUE_NUM <>", value, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueNumGreaterThan(Integer value) {
            addCriterion("CONTINUE_NUM >", value, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONTINUE_NUM >=", value, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueNumLessThan(Integer value) {
            addCriterion("CONTINUE_NUM <", value, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueNumLessThanOrEqualTo(Integer value) {
            addCriterion("CONTINUE_NUM <=", value, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueNumIn(List<Integer> values) {
            addCriterion("CONTINUE_NUM in", values, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueNumNotIn(List<Integer> values) {
            addCriterion("CONTINUE_NUM not in", values, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueNumBetween(Integer value1, Integer value2) {
            addCriterion("CONTINUE_NUM between", value1, value2, "continueNum");
            return (Criteria) this;
        }

        public Criteria andContinueNumNotBetween(Integer value1, Integer value2) {
            addCriterion("CONTINUE_NUM not between", value1, value2, "continueNum");
            return (Criteria) this;
        }

        public Criteria andSignNumIsNull() {
            addCriterion("SIGN_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSignNumIsNotNull() {
            addCriterion("SIGN_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSignNumEqualTo(Integer value) {
            addCriterion("SIGN_NUM =", value, "signNum");
            return (Criteria) this;
        }

        public Criteria andSignNumNotEqualTo(Integer value) {
            addCriterion("SIGN_NUM <>", value, "signNum");
            return (Criteria) this;
        }

        public Criteria andSignNumGreaterThan(Integer value) {
            addCriterion("SIGN_NUM >", value, "signNum");
            return (Criteria) this;
        }

        public Criteria andSignNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIGN_NUM >=", value, "signNum");
            return (Criteria) this;
        }

        public Criteria andSignNumLessThan(Integer value) {
            addCriterion("SIGN_NUM <", value, "signNum");
            return (Criteria) this;
        }

        public Criteria andSignNumLessThanOrEqualTo(Integer value) {
            addCriterion("SIGN_NUM <=", value, "signNum");
            return (Criteria) this;
        }

        public Criteria andSignNumIn(List<Integer> values) {
            addCriterion("SIGN_NUM in", values, "signNum");
            return (Criteria) this;
        }

        public Criteria andSignNumNotIn(List<Integer> values) {
            addCriterion("SIGN_NUM not in", values, "signNum");
            return (Criteria) this;
        }

        public Criteria andSignNumBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_NUM between", value1, value2, "signNum");
            return (Criteria) this;
        }

        public Criteria andSignNumNotBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_NUM not between", value1, value2, "signNum");
            return (Criteria) this;
        }

        public Criteria andLastDateIsNull() {
            addCriterion("LAST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastDateIsNotNull() {
            addCriterion("LAST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastDateEqualTo(Date value) {
            addCriterion("LAST_DATE =", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotEqualTo(Date value) {
            addCriterion("LAST_DATE <>", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateGreaterThan(Date value) {
            addCriterion("LAST_DATE >", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_DATE >=", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLessThan(Date value) {
            addCriterion("LAST_DATE <", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_DATE <=", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateIn(List<Date> values) {
            addCriterion("LAST_DATE in", values, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotIn(List<Date> values) {
            addCriterion("LAST_DATE not in", values, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateBetween(Date value1, Date value2) {
            addCriterion("LAST_DATE between", value1, value2, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_DATE not between", value1, value2, "lastDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
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