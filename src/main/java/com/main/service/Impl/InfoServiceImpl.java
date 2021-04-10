package com.main.service.Impl;

import com.main.controller.model.InfoReq;
import com.main.entity.Info;
import com.main.mapper.InfoMapper;
import com.main.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author: Zkoi
 * @Description:
 * @Date: create in 2021/4/6 上午10:33
 */
@Service
public class InfoServiceImpl implements InfoService {

    @Autowired
    InfoMapper mapper;

    @Override
    public Info latestInfo(int id) {
        Info info = mapper.selectLatestInfo(id).get(0);
        return info;
    }

    @Override
    public Integer addNewInfo(InfoReq req) {
        Info info = new Info();
        info.setAge(req.getAge());
        info.setBloodpressure(req.getBloodpressure());
        info.setBmi((float) (req.getWeight() / Math.pow(req.getHeight(),2)));
        info.setDatetime(new Date());
        info.setDpf(req.getDpf());
        info.setGlu(req.getGlu());
        info.setGlucose(req.getGlucose());
        info.setHdl(req.getHdl());
        info.setInsulin(req.getInsulin());
        info.setLdl(req.getLdl());
        info.setLtg(req.getLtg());
        info.setMap(req.getMap());
        info.setTch(req.getTch());
        info.setSkinthickness(req.getSkinthickness());
        info.setSex(req.getSex());
        info.setUid(req.getUid());
        info.setPregnancies(req.getPregnancies());
        info.setTc(req.getTc());
        info.setHeight(req.getHeight());
        info.setWeight(req.getWeight());
        int result = mapper.insert(info);
        return result;
    }

    @Override
    public List<Info> queryAllInfoById(int id) {
        List<Info> list = mapper.selectLatestInfo(id);
        return list;
    }
}
