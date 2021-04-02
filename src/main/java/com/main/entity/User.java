package com.main.entity;

import lombok.Data;

/**
 * @Author: Zkoi
 * @Description:
 * @Date: create in 2021/4/2 下午11:57
 */
@Data
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
}
