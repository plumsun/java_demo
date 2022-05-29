package com.itheima02.constructor;

import com.itheima01.封装.Person;

/*
* 1. 构造方法
*      1). 构造的方法名和类名一致的
*      2). 有个隐式声明:  如果一个类没有声明任何构造,会有默认public空参构造
*
* 2. 构造方法的主要作用
*       1). 创建对象
*       2). 通过构造方法对实例的成员属性进行赋值
*
* 3. this 关键字
*       1). this : 当前对象 (谁调用就是谁)
*       2). 隐式声明
 *          I. this本身是隐式内容
*           II. 在类中调用本类的成员属性/方法,默认this调用
*               (当前方法中存在局部age变量时,隐式的this会被擦除)
*
*     再学了 super和static关键字
*       1). super : 为什么说this(当前类对象是不对的)
*       2). static : 为什么调用非static的属性和方法,会有隐式this
* */
public class Demo01 {

    public static void main(String[] args) {
        Student s = new Student("张三", 18);
        //暂时认为: 对象的类型@对象的内存地址
        //com.itheima02.constructor.Student@1540e19d
        System.out.println(s);
        s.show();

        Student s2 = new Student("李四",19);
        s2.show();

    }
}
