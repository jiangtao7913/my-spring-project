package com.jt.service.impl;

import com.jt.common.SpringUtils;
import com.jt.entity.User;
import com.jt.service.UserService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.*;

import static java.util.stream.Collectors.toList;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author jt
 * @Date 2020/4/20/0020
 **/
public class Test {



    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("classpath:application.xml");
        SpringUtils springUtils = (SpringUtils) context.getBean("springUtils");

        DataSource  dataSource = (DataSource) context.getBean("dataSource");
        UserService userService = (UserService) context.getBean("userService");

//
//
//        User user = new User();
//        user.setName("jiangtao");
//        user.setAge(26);
//        user.setSex(1);
//        user.setLocation("深圳市南山区");
//        user.setCreateUser(1);
//        user.setCreateDate(new Date());
//        user.setUpdateUser(1);
//        user.setUpdateDate(new Date());
//        //userService.insertUser(user);
//
//        User user1 = userService.findUserById();
//        System.out.println(user1.getName());

//        List<String>  list1 = new ArrayList<>();
//        list1.add("1");
//        list1.add("3");
//
//        List<String> list2 = new ArrayList<>();
////        list2.add("1");
////        list2.add("2");
//
//        List<String> intersection = list1.stream().filter(item -> list2.contains(item)).collect(toList());
//
//        System.out.println(intersection);

//        String str = "hellow";
//        String str1 = "he" +new String("llow");
//        System.out.println(str.equals(str1));

        Integer a= 130,b=130,c=50,d=50;

//        System.out.println(a==b);
//        System.out.println(c==d);
//
//
//        System.out.println(-10>>3);
//
//        Integer.valueOf(130);
//
//        System.out.println(a^b);
//        System.out.println(0^a);

        Map<String,String> map= new HashMap<>(10);
        System.out.println(Integer.valueOf(1).hashCode());
        System.out.println(Integer.valueOf(101).hashCode());
        map.put("a","100");
        map.put("a","199");
        map.put("a","100");
        map.put("b","1001");
        map.put("c","1002");

        map.get(a);
    }
}