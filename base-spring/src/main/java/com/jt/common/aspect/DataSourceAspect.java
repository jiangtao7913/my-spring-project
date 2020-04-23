package com.jt.common.aspect;

import com.jt.common.HandleDataSource;
import com.jt.common.annotation.DataSource;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * @ClassName DataSourceAspect
 * @Description: TODO
 * @Author jt
 * @Date 2020/4/22/0022
 **/
public class DataSourceAspect {

    /**
     * 在dao获取datasource之前，在切面中指定当前线程的数据源
     */
    public void before(JoinPoint joinPoint){
        Object target = joinPoint.getTarget();
        String method = joinPoint.getSignature().getName();
        // 获取目标类的接口， 所以@DataSource需要写在接口上
        Class<?>[] classz = target.getClass().getInterfaces();

        Class<?>[] parameterTypes = ((MethodSignature) joinPoint.getSignature())
                .getMethod().getParameterTypes();

        Method m = null;
        try {
            m = classz[0].getMethod(method, parameterTypes);
            if (m != null && m.isAnnotationPresent(DataSource.class))
            {
                DataSource data = m.getAnnotation(DataSource.class);
                System.out.println("用户选择数据库库类型：" + data.value());
                // 数据源放到当前线程中
                HandleDataSource.putDataSource(data.value());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
