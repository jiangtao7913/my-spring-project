package com.jt.service.impl;

import com.jt.entity.User;
import com.jt.service.UserService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.Date;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author jt
 * @Date 2020/4/20/0020
 **/
public class Test {



    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("classpath:application.xml");
        //DataSource  dataSource = (DataSource) context.getBean("dataSource");
        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setName("jiangtao");
        user.setAge(26);
        user.setSex(1);
        user.setLocation("深圳市南山区");
        user.setCreateUser(1);
        user.setCreateDate(new Date());
        user.setUpdateUser(1);
        user.setUpdateDate(new Date());
        //userService.insertUser(user);

        User user1 = userService.findUserById();
        System.out.println(user1.getName());
    }
}
