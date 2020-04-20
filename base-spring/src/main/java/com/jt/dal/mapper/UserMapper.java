package com.jt.dal.mapper;

import com.jt.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description: TODO
 * @Author jt
 * @Date 2020/4/20/0020
 **/
public interface UserMapper {

    /**
     *  根据用户id查询用户
     * @param userId
     * @return
     */
    User findUserById(@Param("id")Integer userId);

    List<User> findByUser(User user);
}
