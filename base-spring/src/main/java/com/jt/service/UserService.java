package com.jt.service;

import com.jt.common.annotation.DataSource;
import com.jt.entity.User;
import com.jt.enums.DataSourceEnum;

/**
 * @ClassName UserService
 * @Description: TODO
 * @Author jt
 * @Date 2020/4/20/0020
 **/
public interface UserService {

    @DataSource(value = DataSourceEnum.SLAVE)
    int insertUser(User user);

    //@DataSource("slave")
    User findUserById();

    //@DataSource("slave")
    User insertUser1();
}
