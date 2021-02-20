package com.jt.common.annotation;

import com.jt.enums.DataSourceEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 动态数据源注解
 * @ClassName DataSource
 * @Description: TODO
 * @Author jt
 * @Date 2020/4/22/0022
 **/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DataSource {
    DataSourceEnum value();
}
