package com.jt.service;

import com.jt.common.annotation.DataSource;
import com.jt.entity.User;

/**
 * @ClassName UserService
 * @Description: TODO
 * @Author jt
 * @Date 2020/4/20/0020
 **/
public interface UserService {

    @DataSource("slave")
    User findUserById();

    void insertUser(User user);
}
