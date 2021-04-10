package com.main.service;

import com.main.controller.model.InfoReq;
import com.main.entity.Info;

import java.util.List;

/**
 * @Author: Zkoi
 * @Description:
 * @Date: create in 2021/4/6 上午10:32
 */
public interface InfoService {
    Info latestInfo(int id);
    Integer addNewInfo(InfoReq req);
    List<Info> queryAllInfoById(int id);
}
