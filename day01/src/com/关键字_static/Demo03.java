package com.关键字_static;
/*
*  # static修饰方法
*       修饰符 返回值类名 方法名(参数列表)
*
*       static是在修饰符的位置
*
*  1). 语法
*       类名.方法名 (推荐)
*       对象名.方法名
*
*  2). 适用场景
*       一个类中的某个方法,没有调用本类的非静态内容
*       那么此方法适合设计成static方法
*
*  3). 好处:
*        I. 节省内存
*        II. 速度快
*
*  # 扩展: main方法为什么是static的?
*       main方法是一个java程序的入口,设计成static的好处要比坏处多
*       好处: 节省内存,速度快
*       坏处: 不能调用本类对象的非静态(this有关都不可以)
* */
public class Demo03 {

    public static void main(String[] args) {

        /*
        *   需求: 有一个方法,方法体是输出一些内容
        *
        *   方案A: 普通方法, 创建对象调用
        *
        *   方案B: 静态方法, 直接类名调用
        *
        *   对比: 方案B比较好
        *       1). 节省内存
        *       2). 比较快
        *
        *  静态方法的缺陷:
        *       静态不能调用非静态(对象), 非静态可以调用静态
        *
        *       原因: 静态先于非静态加载的
        *       静态被加载的时候,对象还不存在,在静态就无法引用对象内容
        *
        * */
        Student s1 = new Student();
        s1.speak();

        Student.show();

        method01();
    }

    private static void method01() {

    }
}
