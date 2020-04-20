package com.jt.service.impl;

import com.jt.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author jt
 * @Date 2020/4/20/0020
 **/
public class Test {



    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("classpath:application.xml");
        DataSource  dataSource = (DataSource) context.getBean("dataSource");
        UserService userService = (UserService) context.getBean("userService");

        userService.findUserById();
    }
}
