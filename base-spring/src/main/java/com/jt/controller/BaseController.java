package com.jt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName BaseController
 * @Description: TODO
 * @Author jt
 * @Date 2020/5/6/0006
 **/
@Controller
@RequestMapping("/base")
public class BaseController {

    @RequestMapping("/test")
    public void test(){
        System.out.println("测试springmvc");
    }
}
