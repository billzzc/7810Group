package com.main.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfoExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andBmiIsNull() {
            addCriterion("bmi is null");
            return (Criteria) this;
        }

        public Criteria andBmiIsNotNull() {
            addCriterion("bmi is not null");
            return (Criteria) this;
        }

        public Criteria andBmiEqualTo(Float value) {
            addCriterion("bmi =", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotEqualTo(Float value) {
            addCriterion("bmi <>", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiGreaterThan(Float value) {
            addCriterion("bmi >", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiGreaterThanOrEqualTo(Float value) {
            addCriterion("bmi >=", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiLessThan(Float value) {
            addCriterion("bmi <", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiLessThanOrEqualTo(Float value) {
            addCriterion("bmi <=", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiIn(List<Float> values) {
            addCriterion("bmi in", values, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotIn(List<Float> values) {
            addCriterion("bmi not in", values, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiBetween(Float value1, Float value2) {
            addCriterion("bmi between", value1, value2, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotBetween(Float value1, Float value2) {
            addCriterion("bmi not between", value1, value2, "bmi");
            return (Criteria) this;
        }

        public Criteria andMapIsNull() {
            addCriterion("map is null");
            return (Criteria) this;
        }

        public Criteria andMapIsNotNull() {
            addCriterion("map is not null");
            return (Criteria) this;
        }

        public Criteria andMapEqualTo(Float value) {
            addCriterion("map =", value, "map");
            return (Criteria) this;
        }

        public Criteria andMapNotEqualTo(Float value) {
            addCriterion("map <>", value, "map");
            return (Criteria) this;
        }

        public Criteria andMapGreaterThan(Float value) {
            addCriterion("map >", value, "map");
            return (Criteria) this;
        }

        public Criteria andMapGreaterThanOrEqualTo(Float value) {
            addCriterion("map >=", value, "map");
            return (Criteria) this;
        }

        public Criteria andMapLessThan(Float value) {
            addCriterion("map <", value, "map");
            return (Criteria) this;
        }

        public Criteria andMapLessThanOrEqualTo(Float value) {
            addCriterion("map <=", value, "map");
            return (Criteria) this;
        }

        public Criteria andMapIn(List<Float> values) {
            addCriterion("map in", values, "map");
            return (Criteria) this;
        }

        public Criteria andMapNotIn(List<Float> values) {
            addCriterion("map not in", values, "map");
            return (Criteria) this;
        }

        public Criteria andMapBetween(Float value1, Float value2) {
            addCriterion("map between", value1, value2, "map");
            return (Criteria) this;
        }

        public Criteria andMapNotBetween(Float value1, Float value2) {
            addCriterion("map not between", value1, value2, "map");
            return (Criteria) this;
        }

        public Criteria andTcIsNull() {
            addCriterion("tc is null");
            return (Criteria) this;
        }

        public Criteria andTcIsNotNull() {
            addCriterion("tc is not null");
            return (Criteria) this;
        }

        public Criteria andTcEqualTo(Float value) {
            addCriterion("tc =", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotEqualTo(Float value) {
            addCriterion("tc <>", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcGreaterThan(Float value) {
            addCriterion("tc >", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcGreaterThanOrEqualTo(Float value) {
            addCriterion("tc >=", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcLessThan(Float value) {
            addCriterion("tc <", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcLessThanOrEqualTo(Float value) {
            addCriterion("tc <=", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcIn(List<Float> values) {
            addCriterion("tc in", values, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotIn(List<Float> values) {
            addCriterion("tc not in", values, "tc");
            return (Criteria) this;
        }

        public Criteria andTcBetween(Float value1, Float value2) {
            addCriterion("tc between", value1, value2, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotBetween(Float value1, Float value2) {
            addCriterion("tc not between", value1, value2, "tc");
            return (Criteria) this;
        }

        public Criteria andLdlIsNull() {
            addCriterion("ldl is null");
            return (Criteria) this;
        }

        public Criteria andLdlIsNotNull() {
            addCriterion("ldl is not null");
            return (Criteria) this;
        }

        public Criteria andLdlEqualTo(Float value) {
            addCriterion("ldl =", value, "ldl");
            return (Criteria) this;
        }

        public Criteria andLdlNotEqualTo(Float value) {
            addCriterion("ldl <>", value, "ldl");
            return (Criteria) this;
        }

        public Criteria andLdlGreaterThan(Float value) {
            addCriterion("ldl >", value, "ldl");
            return (Criteria) this;
        }

        public Criteria andLdlGreaterThanOrEqualTo(Float value) {
            addCriterion("ldl >=", value, "ldl");
            return (Criteria) this;
        }

        public Criteria andLdlLessThan(Float value) {
            addCriterion("ldl <", value, "ldl");
            return (Criteria) this;
        }

        public Criteria andLdlLessThanOrEqualTo(Float value) {
            addCriterion("ldl <=", value, "ldl");
            return (Criteria) this;
        }

        public Criteria andLdlIn(List<Float> values) {
            addCriterion("ldl in", values, "ldl");
            return (Criteria) this;
        }

        public Criteria andLdlNotIn(List<Float> values) {
            addCriterion("ldl not in", values, "ldl");
            return (Criteria) this;
        }

        public Criteria andLdlBetween(Float value1, Float value2) {
            addCriterion("ldl between", value1, value2, "ldl");
            return (Criteria) this;
        }

        public Criteria andLdlNotBetween(Float value1, Float value2) {
            addCriterion("ldl not between", value1, value2, "ldl");
            return (Criteria) this;
        }

        public Criteria andHdlIsNull() {
            addCriterion("hdl is null");
            return (Criteria) this;
        }

        public Criteria andHdlIsNotNull() {
            addCriterion("hdl is not null");
            return (Criteria) this;
        }

        public Criteria andHdlEqualTo(Float value) {
            addCriterion("hdl =", value, "hdl");
            return (Criteria) this;
        }

        public Criteria andHdlNotEqualTo(Float value) {
            addCriterion("hdl <>", value, "hdl");
            return (Criteria) this;
        }

        public Criteria andHdlGreaterThan(Float value) {
            addCriterion("hdl >", value, "hdl");
            return (Criteria) this;
        }

        public Criteria andHdlGreaterThanOrEqualTo(Float value) {
            addCriterion("hdl >=", value, "hdl");
            return (Criteria) this;
        }

        public Criteria andHdlLessThan(Float value) {
            addCriterion("hdl <", value, "hdl");
            return (Criteria) this;
        }

        public Criteria andHdlLessThanOrEqualTo(Float value) {
            addCriterion("hdl <=", value, "hdl");
            return (Criteria) this;
        }

        public Criteria andHdlIn(List<Float> values) {
            addCriterion("hdl in", values, "hdl");
            return (Criteria) this;
        }

        public Criteria andHdlNotIn(List<Float> values) {
            addCriterion("hdl not in", values, "hdl");
            return (Criteria) this;
        }

        public Criteria andHdlBetween(Float value1, Float value2) {
            addCriterion("hdl between", value1, value2, "hdl");
            return (Criteria) this;
        }

        public Criteria andHdlNotBetween(Float value1, Float value2) {
            addCriterion("hdl not between", value1, value2, "hdl");
            return (Criteria) this;
        }

        public Criteria andTchIsNull() {
            addCriterion("tch is null");
            return (Criteria) this;
        }

        public Criteria andTchIsNotNull() {
            addCriterion("tch is not null");
            return (Criteria) this;
        }

        public Criteria andTchEqualTo(Float value) {
            addCriterion("tch =", value, "tch");
            return (Criteria) this;
        }

        public Criteria andTchNotEqualTo(Float value) {
            addCriterion("tch <>", value, "tch");
            return (Criteria) this;
        }

        public Criteria andTchGreaterThan(Float value) {
            addCriterion("tch >", value, "tch");
            return (Criteria) this;
        }

        public Criteria andTchGreaterThanOrEqualTo(Float value) {
            addCriterion("tch >=", value, "tch");
            return (Criteria) this;
        }

        public Criteria andTchLessThan(Float value) {
            addCriterion("tch <", value, "tch");
            return (Criteria) this;
        }

        public Criteria andTchLessThanOrEqualTo(Float value) {
            addCriterion("tch <=", value, "tch");
            return (Criteria) this;
        }

        public Criteria andTchIn(List<Float> values) {
            addCriterion("tch in", values, "tch");
            return (Criteria) this;
        }

        public Criteria andTchNotIn(List<Float> values) {
            addCriterion("tch not in", values, "tch");
            return (Criteria) this;
        }

        public Criteria andTchBetween(Float value1, Float value2) {
            addCriterion("tch between", value1, value2, "tch");
            return (Criteria) this;
        }

        public Criteria andTchNotBetween(Float value1, Float value2) {
            addCriterion("tch not between", value1, value2, "tch");
            return (Criteria) this;
        }

        public Criteria andLtgIsNull() {
            addCriterion("ltg is null");
            return (Criteria) this;
        }

        public Criteria andLtgIsNotNull() {
            addCriterion("ltg is not null");
            return (Criteria) this;
        }

        public Criteria andLtgEqualTo(Float value) {
            addCriterion("ltg =", value, "ltg");
            return (Criteria) this;
        }

        public Criteria andLtgNotEqualTo(Float value) {
            addCriterion("ltg <>", value, "ltg");
            return (Criteria) this;
        }

        public Criteria andLtgGreaterThan(Float value) {
            addCriterion("ltg >", value, "ltg");
            return (Criteria) this;
        }

        public Criteria andLtgGreaterThanOrEqualTo(Float value) {
            addCriterion("ltg >=", value, "ltg");
            return (Criteria) this;
        }

        public Criteria andLtgLessThan(Float value) {
            addCriterion("ltg <", value, "ltg");
            return (Criteria) this;
        }

        public Criteria andLtgLessThanOrEqualTo(Float value) {
            addCriterion("ltg <=", value, "ltg");
            return (Criteria) this;
        }

        public Criteria andLtgIn(List<Float> values) {
            addCriterion("ltg in", values, "ltg");
            return (Criteria) this;
        }

        public Criteria andLtgNotIn(List<Float> values) {
            addCriterion("ltg not in", values, "ltg");
            return (Criteria) this;
        }

        public Criteria andLtgBetween(Float value1, Float value2) {
            addCriterion("ltg between", value1, value2, "ltg");
            return (Criteria) this;
        }

        public Criteria andLtgNotBetween(Float value1, Float value2) {
            addCriterion("ltg not between", value1, value2, "ltg");
            return (Criteria) this;
        }

        public Criteria andGluIsNull() {
            addCriterion("glu is null");
            return (Criteria) this;
        }

        public Criteria andGluIsNotNull() {
            addCriterion("glu is not null");
            return (Criteria) this;
        }

        public Criteria andGluEqualTo(Float value) {
            addCriterion("glu =", value, "glu");
            return (Criteria) this;
        }

        public Criteria andGluNotEqualTo(Float value) {
            addCriterion("glu <>", value, "glu");
            return (Criteria) this;
        }

        public Criteria andGluGreaterThan(Float value) {
            addCriterion("glu >", value, "glu");
            return (Criteria) this;
        }

        public Criteria andGluGreaterThanOrEqualTo(Float value) {
            addCriterion("glu >=", value, "glu");
            return (Criteria) this;
        }

        public Criteria andGluLessThan(Float value) {
            addCriterion("glu <", value, "glu");
            return (Criteria) this;
        }

        public Criteria andGluLessThanOrEqualTo(Float value) {
            addCriterion("glu <=", value, "glu");
            return (Criteria) this;
        }

        public Criteria andGluIn(List<Float> values) {
            addCriterion("glu in", values, "glu");
            return (Criteria) this;
        }

        public Criteria andGluNotIn(List<Float> values) {
            addCriterion("glu not in", values, "glu");
            return (Criteria) this;
        }

        public Criteria andGluBetween(Float value1, Float value2) {
            addCriterion("glu between", value1, value2, "glu");
            return (Criteria) this;
        }

        public Criteria andGluNotBetween(Float value1, Float value2) {
            addCriterion("glu not between", value1, value2, "glu");
            return (Criteria) this;
        }

        public Criteria andPregnanciesIsNull() {
            addCriterion("Pregnancies is null");
            return (Criteria) this;
        }

        public Criteria andPregnanciesIsNotNull() {
            addCriterion("Pregnancies is not null");
            return (Criteria) this;
        }

        public Criteria andPregnanciesEqualTo(Integer value) {
            addCriterion("Pregnancies =", value, "pregnancies");
            return (Criteria) this;
        }

        public Criteria andPregnanciesNotEqualTo(Integer value) {
            addCriterion("Pregnancies <>", value, "pregnancies");
            return (Criteria) this;
        }

        public Criteria andPregnanciesGreaterThan(Integer value) {
            addCriterion("Pregnancies >", value, "pregnancies");
            return (Criteria) this;
        }

        public Criteria andPregnanciesGreaterThanOrEqualTo(Integer value) {
            addCriterion("Pregnancies >=", value, "pregnancies");
            return (Criteria) this;
        }

        public Criteria andPregnanciesLessThan(Integer value) {
            addCriterion("Pregnancies <", value, "pregnancies");
            return (Criteria) this;
        }

        public Criteria andPregnanciesLessThanOrEqualTo(Integer value) {
            addCriterion("Pregnancies <=", value, "pregnancies");
            return (Criteria) this;
        }

        public Criteria andPregnanciesIn(List<Integer> values) {
            addCriterion("Pregnancies in", values, "pregnancies");
            return (Criteria) this;
        }

        public Criteria andPregnanciesNotIn(List<Integer> values) {
            addCriterion("Pregnancies not in", values, "pregnancies");
            return (Criteria) this;
        }

        public Criteria andPregnanciesBetween(Integer value1, Integer value2) {
            addCriterion("Pregnancies between", value1, value2, "pregnancies");
            return (Criteria) this;
        }

        public Criteria andPregnanciesNotBetween(Integer value1, Integer value2) {
            addCriterion("Pregnancies not between", value1, value2, "pregnancies");
            return (Criteria) this;
        }

        public Criteria andGlucoseIsNull() {
            addCriterion("Glucose is null");
            return (Criteria) this;
        }

        public Criteria andGlucoseIsNotNull() {
            addCriterion("Glucose is not null");
            return (Criteria) this;
        }

        public Criteria andGlucoseEqualTo(Integer value) {
            addCriterion("Glucose =", value, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseNotEqualTo(Integer value) {
            addCriterion("Glucose <>", value, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseGreaterThan(Integer value) {
            addCriterion("Glucose >", value, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseGreaterThanOrEqualTo(Integer value) {
            addCriterion("Glucose >=", value, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseLessThan(Integer value) {
            addCriterion("Glucose <", value, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseLessThanOrEqualTo(Integer value) {
            addCriterion("Glucose <=", value, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseIn(List<Integer> values) {
            addCriterion("Glucose in", values, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseNotIn(List<Integer> values) {
            addCriterion("Glucose not in", values, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseBetween(Integer value1, Integer value2) {
            addCriterion("Glucose between", value1, value2, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseNotBetween(Integer value1, Integer value2) {
            addCriterion("Glucose not between", value1, value2, "glucose");
            return (Criteria) this;
        }

        public Criteria andBloodpressureIsNull() {
            addCriterion("BloodPressure is null");
            return (Criteria) this;
        }

        public Criteria andBloodpressureIsNotNull() {
            addCriterion("BloodPressure is not null");
            return (Criteria) this;
        }

        public Criteria andBloodpressureEqualTo(Integer value) {
            addCriterion("BloodPressure =", value, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureNotEqualTo(Integer value) {
            addCriterion("BloodPressure <>", value, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureGreaterThan(Integer value) {
            addCriterion("BloodPressure >", value, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureGreaterThanOrEqualTo(Integer value) {
            addCriterion("BloodPressure >=", value, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureLessThan(Integer value) {
            addCriterion("BloodPressure <", value, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureLessThanOrEqualTo(Integer value) {
            addCriterion("BloodPressure <=", value, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureIn(List<Integer> values) {
            addCriterion("BloodPressure in", values, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureNotIn(List<Integer> values) {
            addCriterion("BloodPressure not in", values, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureBetween(Integer value1, Integer value2) {
            addCriterion("BloodPressure between", value1, value2, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andBloodpressureNotBetween(Integer value1, Integer value2) {
            addCriterion("BloodPressure not between", value1, value2, "bloodpressure");
            return (Criteria) this;
        }

        public Criteria andSkinthicknessIsNull() {
            addCriterion("SkinThickness is null");
            return (Criteria) this;
        }

        public Criteria andSkinthicknessIsNotNull() {
            addCriterion("SkinThickness is not null");
            return (Criteria) this;
        }

        public Criteria andSkinthicknessEqualTo(Integer value) {
            addCriterion("SkinThickness =", value, "skinthickness");
            return (Criteria) this;
        }

        public Criteria andSkinthicknessNotEqualTo(Integer value) {
            addCriterion("SkinThickness <>", value, "skinthickness");
            return (Criteria) this;
        }

        public Criteria andSkinthicknessGreaterThan(Integer value) {
            addCriterion("SkinThickness >", value, "skinthickness");
            return (Criteria) this;
        }

        public Criteria andSkinthicknessGreaterThanOrEqualTo(Integer value) {
            addCriterion("SkinThickness >=", value, "skinthickness");
            return (Criteria) this;
        }

        public Criteria andSkinthicknessLessThan(Integer value) {
            addCriterion("SkinThickness <", value, "skinthickness");
            return (Criteria) this;
        }

        public Criteria andSkinthicknessLessThanOrEqualTo(Integer value) {
            addCriterion("SkinThickness <=", value, "skinthickness");
            return (Criteria) this;
        }

        public Criteria andSkinthicknessIn(List<Integer> values) {
            addCriterion("SkinThickness in", values, "skinthickness");
            return (Criteria) this;
        }

        public Criteria andSkinthicknessNotIn(List<Integer> values) {
            addCriterion("SkinThickness not in", values, "skinthickness");
            return (Criteria) this;
        }

        public Criteria andSkinthicknessBetween(Integer value1, Integer value2) {
            addCriterion("SkinThickness between", value1, value2, "skinthickness");
            return (Criteria) this;
        }

        public Criteria andSkinthicknessNotBetween(Integer value1, Integer value2) {
            addCriterion("SkinThickness not between", value1, value2, "skinthickness");
            return (Criteria) this;
        }

        public Criteria andInsulinIsNull() {
            addCriterion("Insulin is null");
            return (Criteria) this;
        }

        public Criteria andInsulinIsNotNull() {
            addCriterion("Insulin is not null");
            return (Criteria) this;
        }

        public Criteria andInsulinEqualTo(Float value) {
            addCriterion("Insulin =", value, "insulin");
            return (Criteria) this;
        }

        public Criteria andInsulinNotEqualTo(Float value) {
            addCriterion("Insulin <>", value, "insulin");
            return (Criteria) this;
        }

        public Criteria andInsulinGreaterThan(Float value) {
            addCriterion("Insulin >", value, "insulin");
            return (Criteria) this;
        }

        public Criteria andInsulinGreaterThanOrEqualTo(Float value) {
            addCriterion("Insulin >=", value, "insulin");
            return (Criteria) this;
        }

        public Criteria andInsulinLessThan(Float value) {
            addCriterion("Insulin <", value, "insulin");
            return (Criteria) this;
        }

        public Criteria andInsulinLessThanOrEqualTo(Float value) {
            addCriterion("Insulin <=", value, "insulin");
            return (Criteria) this;
        }

        public Criteria andInsulinIn(List<Float> values) {
            addCriterion("Insulin in", values, "insulin");
            return (Criteria) this;
        }

        public Criteria andInsulinNotIn(List<Float> values) {
            addCriterion("Insulin not in", values, "insulin");
            return (Criteria) this;
        }

        public Criteria andInsulinBetween(Float value1, Float value2) {
            addCriterion("Insulin between", value1, value2, "insulin");
            return (Criteria) this;
        }

        public Criteria andInsulinNotBetween(Float value1, Float value2) {
            addCriterion("Insulin not between", value1, value2, "insulin");
            return (Criteria) this;
        }

        public Criteria andDpfIsNull() {
            addCriterion("DPF is null");
            return (Criteria) this;
        }

        public Criteria andDpfIsNotNull() {
            addCriterion("DPF is not null");
            return (Criteria) this;
        }

        public Criteria andDpfEqualTo(Float value) {
            addCriterion("DPF =", value, "dpf");
            return (Criteria) this;
        }

        public Criteria andDpfNotEqualTo(Float value) {
            addCriterion("DPF <>", value, "dpf");
            return (Criteria) this;
        }

        public Criteria andDpfGreaterThan(Float value) {
            addCriterion("DPF >", value, "dpf");
            return (Criteria) this;
        }

        public Criteria andDpfGreaterThanOrEqualTo(Float value) {
            addCriterion("DPF >=", value, "dpf");
            return (Criteria) this;
        }

        public Criteria andDpfLessThan(Float value) {
            addCriterion("DPF <", value, "dpf");
            return (Criteria) this;
        }

        public Criteria andDpfLessThanOrEqualTo(Float value) {
            addCriterion("DPF <=", value, "dpf");
            return (Criteria) this;
        }

        public Criteria andDpfIn(List<Float> values) {
            addCriterion("DPF in", values, "dpf");
            return (Criteria) this;
        }

        public Criteria andDpfNotIn(List<Float> values) {
            addCriterion("DPF not in", values, "dpf");
            return (Criteria) this;
        }

        public Criteria andDpfBetween(Float value1, Float value2) {
            addCriterion("DPF between", value1, value2, "dpf");
            return (Criteria) this;
        }

        public Criteria andDpfNotBetween(Float value1, Float value2) {
            addCriterion("DPF not between", value1, value2, "dpf");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNull() {
            addCriterion("dateTime is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNotNull() {
            addCriterion("dateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeEqualTo(Date value) {
            addCriterion("dateTime =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(Date value) {
            addCriterion("dateTime <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(Date value) {
            addCriterion("dateTime >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dateTime >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(Date value) {
            addCriterion("dateTime <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("dateTime <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<Date> values) {
            addCriterion("dateTime in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<Date> values) {
            addCriterion("dateTime not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(Date value1, Date value2) {
            addCriterion("dateTime between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("dateTime not between", value1, value2, "datetime");
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