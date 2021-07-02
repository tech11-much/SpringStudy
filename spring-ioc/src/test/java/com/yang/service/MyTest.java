package com.yang.service;

import com.yang.dao.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//       ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
//       userService.getUser();
        //注意传入的参数是字符串类型
        //以及注意对象的强转
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }
}
