package com.constructor;

public class Student {

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show(){
//        int age = 0;
        System.out.println("this:" + this);
        //当前方法中存在局部age变量时,隐式的this会被擦除
        System.out.println("show:" + age);
        System.out.println("show:" + this.age);

        this.speak();
        speak();
    }

    public void speak(){
        System.out.println(name + "说:今天天气不错");
    }
}
