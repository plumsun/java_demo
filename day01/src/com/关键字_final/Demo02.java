package com.关键字_final;

/*
*  # final修饰变量
*       特点: 一次赋值,终身不变
*
*       0). 变量访问原则
*           java中访问某个变量,这个变量必须有值
*       1). 成员变量
*           I. final修饰的成员变量必须给初始值,不能使用默认值(因为这样没有意义)
*           II. 设置初始值的方法
*               a. 直接赋值  (常用)
*               b. 通过构造方法赋值(那么所有的构造都必须给这个属性赋值)
*
*       2). 局部变量
*           I. final修饰的局部变量不需要给初始值,因为局部变量没有默认值
*           II. 保证调用前有值即可
*
* */
public class Demo02 {

    public static void main(String[] args) {
        /*
            我们外部要访问非静态属性a, 必须通过对象来访问
            肯定要先调用构造方法
         */

        E e = new E("abc");
        System.out.println(e.a);
    }
}
class E{
//    final int a = 1;
    final int a;
    public E(){
        a = 1;
    }
    public E(String str){
        a = 2;
    }
    public void show(){
        final int b;
        b = 3;
        System.out.println(a);
        System.out.println(b);
    }
}