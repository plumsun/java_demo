package com.itheima03.extends_继承;

public class Demo01 {

    public static void main(String[] args) {
        A a = new A();
        a.name = "张三"; //父类中定义的属性
        a.age = 18;
        a.speak();//父类中定义的方法
        a.show();
    }
}
/*
*  # 注意: 一个java文件可以定义多个类
*   1. 这样做在开发中是不规范的, 只是练习的时候图省事
*   2. 新增的类不能用public修饰 (跟java文件名一致的类才能public修饰)
* */
class B{
    String name;
    public void speak(){
        System.out.println(name + "speak:今天天气不错");
    }
}
class A extends B{
    int age;
    public void show(){
        System.out.println(name + "show:" + age);
    }
}