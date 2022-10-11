package com.itheima03.extends_继承;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {

    public static void main(String[] args) {
        List<String> listOne = new ArrayList<String>();
                 listOne.add("333");
                 listOne.add("666");
                 listOne.add("999");
                 List<String> listTwo = new ArrayList<String>();
                 listTwo.add("A");
                 listTwo.add("B");
                 listTwo.add("C");

                 //addAll  添加另一集合里面的元素
                 //结果[333, 666, 999, A, B, C]
                 listOne.addAll(listTwo);
                 System.out.println(listOne);
    }
}
/*
*  # 注意: 一个java文件可以定义多个类
*   1. 这样做在开发中是不规范的, 只是练习的时候图省事
*   2. 新增的类不能用public修饰 (跟java文件名一致的类才能public修饰)
* */
class B{
    String name;

    public B() {
        System.out.println(123456);
    }

    @Override
    public String toString() {
        System.out.println("super = ");
        return "B{" +
                "name='" + name + '\'' +
                '}';
    }

    public void speak(){
        System.out.println(name + "speak:今天天气不错");
    }
}
class A extends B{
    int age;
    public void show(){
        System.out.println(name + "show:" + age);
    }

    @Override
    public String toString() {
        return "A{" +
                "age=" + age +
                '}';
    }
}