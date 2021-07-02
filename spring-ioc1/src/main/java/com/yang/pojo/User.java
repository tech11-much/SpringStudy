package com.yang.pojo;

public class User {
    private String name;
    public User(){
        //默认使用无参构造创建对象
        System.out.println("User的无参构造");
    }
    //使用有参构造创建对象
    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set方法注入");
    }

    public void show(){
        System.out.println("name=" + name);
    }
}
