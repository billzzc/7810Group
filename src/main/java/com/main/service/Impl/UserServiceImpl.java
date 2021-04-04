package com.main.service.Impl;

import com.main.controller.model.UserReq;
import com.main.entity.User;
import com.main.mapper.UserMapper;
import com.main.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Zkoi
 * @Description:
 * @Date: create in 2021/4/4 下午12:34
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper mapper;

    @Override
    public User login(UserReq userReq) {
        User user = new User();
        user.setUserName(userReq.getUserName());
        user.setPassWord(userReq.getPassWord());
        return mapper.Login(user);
    }
}
