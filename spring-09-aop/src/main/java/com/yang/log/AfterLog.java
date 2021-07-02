package com.yang.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
//通过继承接口来实现切面方法
public class AfterLog implements AfterReturningAdvice {
    //returnValue   返回值
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了"+method.getName()+"的方法，返回结果为"+returnValue);
    }
}