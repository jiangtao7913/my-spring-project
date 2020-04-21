package com.jt.entity.base;

import lombok.Data;

import java.util.Date;


/**
 * @ClassName BaseEntity
 * @Description: TODO
 * @Author jt
 * @Date 2020/4/20/0020
 **/
@Data
public class BaseEntity {

    private Integer id;

    private Integer createUser;

    private Date createDate;

    private Integer updateUser;

    private Date updateDate;

}
