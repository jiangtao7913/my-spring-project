package com.jt.common;

import com.alibaba.druid.filter.config.ConfigTools;
import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName SecurityDataSource
 * @Description: durid 数据源用户名和密码加密解密
 * @Author jt
 * @Date 2020/5/11/0011
 **/
@Slf4j
public class SecurityDataSource extends DruidDataSource {

    /**
     * 设置用户名
     * @param username
     */
    @Override
    public void setUsername(String username) {
        try {
            username = ConfigTools.decrypt(username);
        }catch (Exception e){
            log.debug("数据库用户名解密错误=====" + e.getMessage());
        }
        super.setUsername(username);
    }

    /**
     * 设置密码
     * @param password
     */
    @Override
    public void setPassword(String password) {
        try {
            password = ConfigTools.decrypt(password);
        }catch (Exception e){
            log.debug("数据库密码解密错误=====" + e.getMessage());
        }
        super.setPassword(password);
    }

    public static void main(String[] args) throws Exception {
        String password = "jiangtao11";
        String username = "root";
        System.out.println("加密后的password = [" + ConfigTools.encrypt(password) + "]");
        System.out.println("加密后的username = [" + ConfigTools.encrypt(username) + "]");
    }
}
