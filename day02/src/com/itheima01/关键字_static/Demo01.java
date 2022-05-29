package com.itheima01.关键字_static;

public class Demo01 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.schoolName = "传智黑马";

        Student s2 = new Student();
        System.out.println(s2.name); // null
        System.out.println(s2.schoolName);//传智黑马
    }
}
class Student{
    String name;
    static String schoolName;
//    String schoolName = "传智黑马";

    public void speak(){
        System.out.println("speak: 非静态的方法");
        System.out.println(schoolName);
        show();
    }

    public static void show(){
        //编译报错: 静态不能调用非静态
//        System.out.println(this);
//        System.out.println(name);
//        speak();
        System.out.println("show: 静态的方法");
    }
}