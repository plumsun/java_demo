package com.itheima02.constructor;
/*
*   #匿名对象
*       1. 含义: 没有名字的对象
*       2. 先解释有名字的对象
*       3. 匿名对象: 没有给一个变量赋值,而是直接调用
*       4. 匿名对象的特点
*           1). 好处: 语法简单
*           2). 局限: 因为没有变量记住匿名对象的地址,所以只能一次性使用
* */
public class Demo02 {

    public static void main(String[] args) {
        //有名字的对象, 这个对象的名字叫s1
        //这个对象赋值给一个变量
        Student s1 = new Student("张三", 18);
        s1.speak();


        //先创建对象
        Student s2 = new Student("李四", 19);
        //再调用方法
        s2.speak();

        //匿名对象: 没有给一个变量赋值,而是直接调用
        new Student("李四", 19).speak();

        Student s3 = new Student("王五", 20);
        //现在自定义类型对象打印的是内存地址
        //com.itheima02.constructor.Student@1540e19d
        System.out.println(s3);
        System.out.println(s3);

        //每new一次,就会创建一个新的对象
        //com.itheima02.constructor.Student@677327b6
        System.out.println(new Student("王五", 20));
        //com.itheima02.constructor.Student@14ae5a5
        System.out.println(new Student("王五", 20));


        //给方法传参 : 匿名对象就方便
        Student s4 = new Student("马六", 21);
        method01(s4);

        method01(new Student("马六", 21));
    }

    public static void method01(Student s){
        s.speak();
    }
}
