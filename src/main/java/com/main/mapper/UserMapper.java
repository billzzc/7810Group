package com.main.mapper;

import com.main.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Author: Zkoi
 * @Description:
 * @Date: create in 2021/4/2 下午11:58
 */
@Repository
public interface UserMapper {
    User Sel(int id);
}
