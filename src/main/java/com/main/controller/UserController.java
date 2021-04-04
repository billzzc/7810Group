package com.main.controller;

import com.main.controller.model.UserReq;
import com.main.controller.model.illReq;
import com.main.entity.User;
import com.main.service.Impl.UserServiceImpl;
import com.main.utils.ResponseMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Zkoi
 * @Description:
 * @Date: create in 2021/4/4 下午7:13
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    UserServiceImpl userService;


    @RequestMapping("/login")
    public ResponseMessage login(@RequestBody UserReq userReq) {
        log.info("============调用login方法");
        log.info("============打印入参======="+userReq.toString());
        User user = userService.login(userReq);
        if(user!=null)
            return ResponseMessage.newOkInstance(user,"登录成功");
        else
            return ResponseMessage.newOkInstance(user,"账号不存在或者密码错误");
    }

}
