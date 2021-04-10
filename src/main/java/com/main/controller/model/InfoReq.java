package com.main.controller.model;

import lombok.Data;

/**
 * @Author: Zkoi
 * @Description:
 * @Date: create in 2021/4/6 上午10:49
 */
@Data
public class InfoReq {
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

    private Float weight;

    private Float height;
}
