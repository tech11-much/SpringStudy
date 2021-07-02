package com.yang.diy;
//相当于是自定义了一个切面，实现了切面的方法能在业务逻辑中执行
public class DiyPointCut {
    public void before(){
        System.out.println("=======方法执行前=======");
    }
    public void after(){
        System.out.println("=======方法执行后=======");
    }
}
