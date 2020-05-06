package com.jt.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @ClassName PostProcessor
 * @Description: TODO
 * @Author jt
 * @Date 2020/4/23/0023
 **/
@Component
public class PostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("对象bean:" +  beanName + "开始实例化");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("对象bean:" + beanName + "实例化结束");
        return bean;
    }
}
