package com.main.entity;

import java.util.Date;

public class Info {
    private Float weight;

    private Float height;

    private Integer id;

    private Integer uid;

    private String sex;

    private Integer age;

    private Float bmi;

    private Float map;

    private Float tc;

    private Float ldl;

    private Float hdl;

    private Float tch;

    private Float ltg;

    private Float glu;

    private Integer pregnancies;

    private Integer glucose;

    private Integer bloodpressure;

    private Integer skinthickness;

    private Float insulin;

    private Float dpf;

    private Date datetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getBmi() {
        return bmi;
    }

    public void setBmi(Float bmi) {
        this.bmi = bmi;
    }

    public Float getMap() {
        return map;
    }

    public void setMap(Float map) {
        this.map = map;
    }

    public Float getTc() {
        return tc;
    }

    public void setTc(Float tc) {
        this.tc = tc;
    }

    public Float getLdl() {
        return ldl;
    }

    public void setLdl(Float ldl) {
        this.ldl = ldl;
    }

    public Float getHdl() {
        return hdl;
    }

    public void setHdl(Float hdl) {
        this.hdl = hdl;
    }

    public Float getTch() {
        return tch;
    }

    public void setTch(Float tch) {
        this.tch = tch;
    }

    public Float getLtg() {
        return ltg;
    }

    public void setLtg(Float ltg) {
        this.ltg = ltg;
    }

    public Float getGlu() {
        return glu;
    }

    public void setGlu(Float glu) {
        this.glu = glu;
    }

    public Integer getPregnancies() {
        return pregnancies;
    }

    public void setPregnancies(Integer pregnancies) {
        this.pregnancies = pregnancies;
    }

    public Integer getGlucose() {
        return glucose;
    }

    public void setGlucose(Integer glucose) {
        this.glucose = glucose;
    }

    public Integer getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(Integer bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public Integer getSkinthickness() {
        return skinthickness;
    }

    public void setSkinthickness(Integer skinthickness) {
        this.skinthickness = skinthickness;
    }

    public Float getInsulin() {
        return insulin;
    }

    public void setInsulin(Float insulin) {
        this.insulin = insulin;
    }

    public Float getDpf() {
        return dpf;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public void setDpf(Float dpf) {
        this.dpf = dpf;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}