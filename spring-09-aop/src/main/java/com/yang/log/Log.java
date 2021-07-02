package com.yang.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
//通过继承接口来实现增加切面方法
public class Log implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "的" + method.getName() + "被执行了");
    }
}
