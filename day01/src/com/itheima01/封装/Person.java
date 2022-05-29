package com.itheima01.封装;
/*
*  类的封装
*   1. private 属性
*   2. public get/set 方法
*   3. 构造
*       注意有个隐式声明:
*           如果一个类没有声明任何构造,会有默认public空参构造
*
*   作用: 为了类设计的安全性
* */
public class Person {
    //成员属性
    private String name;
//    public int age;
    private int age;

    //构造方法
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //成员方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("不能对age赋值负数");
            return;
        }
        this.age = age;
    }
}
