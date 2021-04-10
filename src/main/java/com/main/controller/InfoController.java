package com.main.controller;

import com.main.controller.model.InfoReq;
import com.main.controller.model.UserReq;
import com.main.entity.User;
import com.main.service.Impl.InfoServiceImpl;
import com.main.service.Impl.UserServiceImpl;
import com.main.utils.ResponseMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Zkoi
 * @Description:
 * @Date: create in 2021/4/6 上午10:44
 */
@RestController
@RequestMapping("/info")
@Slf4j
public class InfoController {
    @Autowired
    InfoServiceImpl infoServiceImpl;


    @RequestMapping("/latestInfo")
    public ResponseMessage latestInfo(@RequestBody InfoReq infoReq) {
        log.info("============调用latestInfo方法");
        log.info("============打印入参======="+String.valueOf(infoReq.getId()));
        return ResponseMessage.newOkInstance(infoServiceImpl.latestInfo(infoReq.getId()),"请求成功");
    }

    @RequestMapping("/addNewInfo")
    public ResponseMessage addNewInfo(@RequestBody InfoReq infoReq){
        log.info("============调用addNewInfo方法");
        log.info("============打印入参"+infoReq.toString());
        if(infoServiceImpl.addNewInfo(infoReq)>0)
            return ResponseMessage.newOkInstance(null,"添加成功");
        else
            return ResponseMessage.newOkInstance(null,"添加失败");
    }

    @RequestMapping("/queryAllInfo")
    public ResponseMessage queryAllInfo(@RequestBody InfoReq infoReq){
        log.info("============调用queryAllInfo方法");
        log.info("============打印入参======="+String.valueOf(infoReq.getUid()));
        return ResponseMessage.newOkInstance(infoServiceImpl.queryAllInfoById(infoReq.getUid()),"查询成功");
    }
}
