package com.jt.service.impl;

import com.jt.dal.mapper.UserMapper;
import com.jt.entity.User;
import com.jt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description: TODO
 * @Author jt
 * @Date 2020/4/20/0020
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUserById() {
        System.out.println("测试1111111111");
        return userMapper.findUserById(1);
    }



}
