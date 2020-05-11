package com.jt.service.impl;

import com.jt.dal.mapper.UserMapper;
import com.jt.entity.User;
import com.jt.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @ClassName UserServiceImpl
 * @Description: TODO
 * @Author jt
 * @Date 2020/4/20/0020
 **/
@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService, InitializingBean {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUserById() {
        log.debug("测试日志打印");
        System.out.println("测试1111111111");
        return userMapper.findUserById(1);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("实例化userService-------");
    }

    @PostConstruct
    public void init(){
        System.out.println("1111111111111");
    }
}
