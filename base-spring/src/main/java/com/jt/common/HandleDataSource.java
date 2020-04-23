package com.jt.common;

/**
 * @ClassName HandleDataSource
 * @Description: TODO
 * @Author jt
 * @Date 2020/4/22/0022
 **/
public class HandleDataSource {

    public static final ThreadLocal<String> holder = new ThreadLocal<String>();

    /**
     * 绑定当前线程数据源
     * @param datasource
     */
    public static void putDataSource(String datasource) {
        holder.set(datasource);
    }

    /**
     * 获取当前线程的数据源
     * @return
     */
    public static String getDataSource(){
        return holder.get();
    }




}
