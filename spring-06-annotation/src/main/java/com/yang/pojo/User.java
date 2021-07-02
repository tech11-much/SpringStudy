package com.yang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//等价于注册了一个bean
@Component
@Scope("prototype")
public class User {
    //相当于使用property的set方法赋值
    @Value("杨河川")
    public String name;
}
