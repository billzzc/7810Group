package com.main.service;

import com.main.controller.model.UserReq;
import com.main.entity.Info;
import com.main.entity.User;
import org.springframework.stereotype.Service;

/**
 * @Author: Zkoi
 * @Description:
 * @Date: create in 2021/4/4 下午12:36
 */
public interface UserService {
    User login(UserReq userReq);
}
