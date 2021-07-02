package com.yang.demo04;

import com.yang.demo02.UserService;
import com.yang.demo02.UserServiceImpl;
import com.yang.demo02.UserServiceImplTwo;

import java.lang.reflect.InvocationHandler;

public class Client {
    public static void main(String[] args) {
        UserServiceImplTwo userService = new UserServiceImplTwo();
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setTarget(userService);
        UserService proxy = (UserService) handler.getProxy();
        proxy.update();
    }
}
