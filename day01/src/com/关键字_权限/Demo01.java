package com.关键字_权限;

import com.关键字_static.Animal;

/*
* # java的权限修饰符
    1. 四大权限修饰符
        public > protected > 不写(默认) > private

    2. 作用范围
        1). public (公开) : 整个工程可访问
        2). protected(受保护的) : 本包, 非本包子类内部可访问
        3). 不写(默认) : 本包
        4). private(私有) : 本类内部

    3. 常用:
        public/private
* */
public class Demo01 {

    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.id1);
//        System.out.println(a.id2);
    }
}
class Dog extends Animal{

    public void show(){
        System.out.println(id1);
        System.out.println(id2);
//        System.out.println(id3);
//        System.out.println(id4);
    }
}
