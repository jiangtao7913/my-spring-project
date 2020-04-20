package com.jt.entity;

import com.jt.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @ClassName User
 * @Description: TODO
 * @Author jt
 * @Date 2020/4/20/0020
 **/
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    private String name;

    private Integer age;

    private Integer sex;

    private String location;
}
