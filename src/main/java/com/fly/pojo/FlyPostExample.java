package com.fly.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlyPostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlyPostExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPtypeIsNull() {
            addCriterion("PTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPtypeIsNotNull() {
            addCriterion("PTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPtypeEqualTo(String value) {
            addCriterion("PTYPE =", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotEqualTo(String value) {
            addCriterion("PTYPE <>", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeGreaterThan(String value) {
            addCriterion("PTYPE >", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeGreaterThanOrEqualTo(String value) {
            addCriterion("PTYPE >=", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLessThan(String value) {
            addCriterion("PTYPE <", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLessThanOrEqualTo(String value) {
            addCriterion("PTYPE <=", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLike(String value) {
            addCriterion("PTYPE like", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotLike(String value) {
            addCriterion("PTYPE not like", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeIn(List<String> values) {
            addCriterion("PTYPE in", values, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotIn(List<String> values) {
            addCriterion("PTYPE not in", values, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeBetween(String value1, String value2) {
            addCriterion("PTYPE between", value1, value2, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotBetween(String value1, String value2) {
            addCriterion("PTYPE not between", value1, value2, "ptype");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("VERSION like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("VERSION not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andPcolumnIsNull() {
            addCriterion("PCOLUMN is null");
            return (Criteria) this;
        }

        public Criteria andPcolumnIsNotNull() {
            addCriterion("PCOLUMN is not null");
            return (Criteria) this;
        }

        public Criteria andPcolumnEqualTo(String value) {
            addCriterion("PCOLUMN =", value, "pcolumn");
            return (Criteria) this;
        }

        public Criteria andPcolumnNotEqualTo(String value) {
            addCriterion("PCOLUMN <>", value, "pcolumn");
            return (Criteria) this;
        }

        public Criteria andPcolumnGreaterThan(String value) {
            addCriterion("PCOLUMN >", value, "pcolumn");
            return (Criteria) this;
        }

        public Criteria andPcolumnGreaterThanOrEqualTo(String value) {
            addCriterion("PCOLUMN >=", value, "pcolumn");
            return (Criteria) this;
        }

        public Criteria andPcolumnLessThan(String value) {
            addCriterion("PCOLUMN <", value, "pcolumn");
            return (Criteria) this;
        }

        public Criteria andPcolumnLessThanOrEqualTo(String value) {
            addCriterion("PCOLUMN <=", value, "pcolumn");
            return (Criteria) this;
        }

        public Criteria andPcolumnLike(String value) {
            addCriterion("PCOLUMN like", value, "pcolumn");
            return (Criteria) this;
        }

        public Criteria andPcolumnNotLike(String value) {
            addCriterion("PCOLUMN not like", value, "pcolumn");
            return (Criteria) this;
        }

        public Criteria andPcolumnIn(List<String> values) {
            addCriterion("PCOLUMN in", values, "pcolumn");
            return (Criteria) this;
        }

        public Criteria andPcolumnNotIn(List<String> values) {
            addCriterion("PCOLUMN not in", values, "pcolumn");
            return (Criteria) this;
        }

        public Criteria andPcolumnBetween(String value1, String value2) {
            addCriterion("PCOLUMN between", value1, value2, "pcolumn");
            return (Criteria) this;
        }

        public Criteria andPcolumnNotBetween(String value1, String value2) {
            addCriterion("PCOLUMN not between", value1, value2, "pcolumn");
            return (Criteria) this;
        }

        public Criteria andKissIsNull() {
            addCriterion("KISS is null");
            return (Criteria) this;
        }

        public Criteria andKissIsNotNull() {
            addCriterion("KISS is not null");
            return (Criteria) this;
        }

        public Criteria andKissEqualTo(Integer value) {
            addCriterion("KISS =", value, "kiss");
            return (Criteria) this;
        }

        public Criteria andKissNotEqualTo(Integer value) {
            addCriterion("KISS <>", value, "kiss");
            return (Criteria) this;
        }

        public Criteria andKissGreaterThan(Integer value) {
            addCriterion("KISS >", value, "kiss");
            return (Criteria) this;
        }

        public Criteria andKissGreaterThanOrEqualTo(Integer value) {
            addCriterion("KISS >=", value, "kiss");
            return (Criteria) this;
        }

        public Criteria andKissLessThan(Integer value) {
            addCriterion("KISS <", value, "kiss");
            return (Criteria) this;
        }

        public Criteria andKissLessThanOrEqualTo(Integer value) {
            addCriterion("KISS <=", value, "kiss");
            return (Criteria) this;
        }

        public Criteria andKissIn(List<Integer> values) {
            addCriterion("KISS in", values, "kiss");
            return (Criteria) this;
        }

        public Criteria andKissNotIn(List<Integer> values) {
            addCriterion("KISS not in", values, "kiss");
            return (Criteria) this;
        }

        public Criteria andKissBetween(Integer value1, Integer value2) {
            addCriterion("KISS between", value1, value2, "kiss");
            return (Criteria) this;
        }

        public Criteria andKissNotBetween(Integer value1, Integer value2) {
            addCriterion("KISS not between", value1, value2, "kiss");
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

        public Criteria andAnsnumIsNull() {
            addCriterion("ANSNUM is null");
            return (Criteria) this;
        }

        public Criteria andAnsnumIsNotNull() {
            addCriterion("ANSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andAnsnumEqualTo(Integer value) {
            addCriterion("ANSNUM =", value, "ansnum");
            return (Criteria) this;
        }

        public Criteria andAnsnumNotEqualTo(Integer value) {
            addCriterion("ANSNUM <>", value, "ansnum");
            return (Criteria) this;
        }

        public Criteria andAnsnumGreaterThan(Integer value) {
            addCriterion("ANSNUM >", value, "ansnum");
            return (Criteria) this;
        }

        public Criteria andAnsnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ANSNUM >=", value, "ansnum");
            return (Criteria) this;
        }

        public Criteria andAnsnumLessThan(Integer value) {
            addCriterion("ANSNUM <", value, "ansnum");
            return (Criteria) this;
        }

        public Criteria andAnsnumLessThanOrEqualTo(Integer value) {
            addCriterion("ANSNUM <=", value, "ansnum");
            return (Criteria) this;
        }

        public Criteria andAnsnumIn(List<Integer> values) {
            addCriterion("ANSNUM in", values, "ansnum");
            return (Criteria) this;
        }

        public Criteria andAnsnumNotIn(List<Integer> values) {
            addCriterion("ANSNUM not in", values, "ansnum");
            return (Criteria) this;
        }

        public Criteria andAnsnumBetween(Integer value1, Integer value2) {
            addCriterion("ANSNUM between", value1, value2, "ansnum");
            return (Criteria) this;
        }

        public Criteria andAnsnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ANSNUM not between", value1, value2, "ansnum");
            return (Criteria) this;
        }

        public Criteria andPopularityIsNull() {
            addCriterion("POPULARITY is null");
            return (Criteria) this;
        }

        public Criteria andPopularityIsNotNull() {
            addCriterion("POPULARITY is not null");
            return (Criteria) this;
        }

        public Criteria andPopularityEqualTo(Integer value) {
            addCriterion("POPULARITY =", value, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityNotEqualTo(Integer value) {
            addCriterion("POPULARITY <>", value, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityGreaterThan(Integer value) {
            addCriterion("POPULARITY >", value, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityGreaterThanOrEqualTo(Integer value) {
            addCriterion("POPULARITY >=", value, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityLessThan(Integer value) {
            addCriterion("POPULARITY <", value, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityLessThanOrEqualTo(Integer value) {
            addCriterion("POPULARITY <=", value, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityIn(List<Integer> values) {
            addCriterion("POPULARITY in", values, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityNotIn(List<Integer> values) {
            addCriterion("POPULARITY not in", values, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityBetween(Integer value1, Integer value2) {
            addCriterion("POPULARITY between", value1, value2, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityNotBetween(Integer value1, Integer value2) {
            addCriterion("POPULARITY not between", value1, value2, "popularity");
            return (Criteria) this;
        }

        public Criteria andBoutiquedIsNull() {
            addCriterion("BOUTIQUED is null");
            return (Criteria) this;
        }

        public Criteria andBoutiquedIsNotNull() {
            addCriterion("BOUTIQUED is not null");
            return (Criteria) this;
        }

        public Criteria andBoutiquedEqualTo(String value) {
            addCriterion("BOUTIQUED =", value, "boutiqued");
            return (Criteria) this;
        }

        public Criteria andBoutiquedNotEqualTo(String value) {
            addCriterion("BOUTIQUED <>", value, "boutiqued");
            return (Criteria) this;
        }

        public Criteria andBoutiquedGreaterThan(String value) {
            addCriterion("BOUTIQUED >", value, "boutiqued");
            return (Criteria) this;
        }

        public Criteria andBoutiquedGreaterThanOrEqualTo(String value) {
            addCriterion("BOUTIQUED >=", value, "boutiqued");
            return (Criteria) this;
        }

        public Criteria andBoutiquedLessThan(String value) {
            addCriterion("BOUTIQUED <", value, "boutiqued");
            return (Criteria) this;
        }

        public Criteria andBoutiquedLessThanOrEqualTo(String value) {
            addCriterion("BOUTIQUED <=", value, "boutiqued");
            return (Criteria) this;
        }

        public Criteria andBoutiquedLike(String value) {
            addCriterion("BOUTIQUED like", value, "boutiqued");
            return (Criteria) this;
        }

        public Criteria andBoutiquedNotLike(String value) {
            addCriterion("BOUTIQUED not like", value, "boutiqued");
            return (Criteria) this;
        }

        public Criteria andBoutiquedIn(List<String> values) {
            addCriterion("BOUTIQUED in", values, "boutiqued");
            return (Criteria) this;
        }

        public Criteria andBoutiquedNotIn(List<String> values) {
            addCriterion("BOUTIQUED not in", values, "boutiqued");
            return (Criteria) this;
        }

        public Criteria andBoutiquedBetween(String value1, String value2) {
            addCriterion("BOUTIQUED between", value1, value2, "boutiqued");
            return (Criteria) this;
        }

        public Criteria andBoutiquedNotBetween(String value1, String value2) {
            addCriterion("BOUTIQUED not between", value1, value2, "boutiqued");
            return (Criteria) this;
        }

        public Criteria andToppedIsNull() {
            addCriterion("TOPPED is null");
            return (Criteria) this;
        }

        public Criteria andToppedIsNotNull() {
            addCriterion("TOPPED is not null");
            return (Criteria) this;
        }

        public Criteria andToppedEqualTo(String value) {
            addCriterion("TOPPED =", value, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedNotEqualTo(String value) {
            addCriterion("TOPPED <>", value, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedGreaterThan(String value) {
            addCriterion("TOPPED >", value, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedGreaterThanOrEqualTo(String value) {
            addCriterion("TOPPED >=", value, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedLessThan(String value) {
            addCriterion("TOPPED <", value, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedLessThanOrEqualTo(String value) {
            addCriterion("TOPPED <=", value, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedLike(String value) {
            addCriterion("TOPPED like", value, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedNotLike(String value) {
            addCriterion("TOPPED not like", value, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedIn(List<String> values) {
            addCriterion("TOPPED in", values, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedNotIn(List<String> values) {
            addCriterion("TOPPED not in", values, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedBetween(String value1, String value2) {
            addCriterion("TOPPED between", value1, value2, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedNotBetween(String value1, String value2) {
            addCriterion("TOPPED not between", value1, value2, "topped");
            return (Criteria) this;
        }

        public Criteria andEndedIsNull() {
            addCriterion("ENDED is null");
            return (Criteria) this;
        }

        public Criteria andEndedIsNotNull() {
            addCriterion("ENDED is not null");
            return (Criteria) this;
        }

        public Criteria andEndedEqualTo(String value) {
            addCriterion("ENDED =", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedNotEqualTo(String value) {
            addCriterion("ENDED <>", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedGreaterThan(String value) {
            addCriterion("ENDED >", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedGreaterThanOrEqualTo(String value) {
            addCriterion("ENDED >=", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedLessThan(String value) {
            addCriterion("ENDED <", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedLessThanOrEqualTo(String value) {
            addCriterion("ENDED <=", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedLike(String value) {
            addCriterion("ENDED like", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedNotLike(String value) {
            addCriterion("ENDED not like", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedIn(List<String> values) {
            addCriterion("ENDED in", values, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedNotIn(List<String> values) {
            addCriterion("ENDED not in", values, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedBetween(String value1, String value2) {
            addCriterion("ENDED between", value1, value2, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedNotBetween(String value1, String value2) {
            addCriterion("ENDED not between", value1, value2, "ended");
            return (Criteria) this;
        }

        public Criteria andAcceptedIsNull() {
            addCriterion("ACCEPTED is null");
            return (Criteria) this;
        }

        public Criteria andAcceptedIsNotNull() {
            addCriterion("ACCEPTED is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptedEqualTo(String value) {
            addCriterion("ACCEPTED =", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedNotEqualTo(String value) {
            addCriterion("ACCEPTED <>", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedGreaterThan(String value) {
            addCriterion("ACCEPTED >", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedGreaterThanOrEqualTo(String value) {
            addCriterion("ACCEPTED >=", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedLessThan(String value) {
            addCriterion("ACCEPTED <", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedLessThanOrEqualTo(String value) {
            addCriterion("ACCEPTED <=", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedLike(String value) {
            addCriterion("ACCEPTED like", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedNotLike(String value) {
            addCriterion("ACCEPTED not like", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedIn(List<String> values) {
            addCriterion("ACCEPTED in", values, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedNotIn(List<String> values) {
            addCriterion("ACCEPTED not in", values, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedBetween(String value1, String value2) {
            addCriterion("ACCEPTED between", value1, value2, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedNotBetween(String value1, String value2) {
            addCriterion("ACCEPTED not between", value1, value2, "accepted");
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