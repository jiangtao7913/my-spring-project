package com.jt.controller;

import com.jt.controller.test.IngoreAnnotation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName BaseController
 * @Description: TODO
 * @Author jt
 * @Date 2020/5/6/0006
 **/
@IngoreAnnotation
@Controller
@RequestMapping("/base")
public class BaseController {

    @RequestMapping("/test")
    public void test(){
        System.out.println("测试springmvc");
    }

    @RequestMapping("/index")
    public String index(){
       return "views/index";
    }
}
