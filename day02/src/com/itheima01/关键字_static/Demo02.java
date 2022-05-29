package com.itheima01.关键字_static;

/*
* # 1. static修饰属性
*       1). 语法
*           类名.static属性 (推荐)
*           对象名.static属性
*
*       2). 适用场景:
*           如果一个类的某个属性被所有实例所共享
*           那么这个属性适合用static修饰
*
*       3). 好处: 节省内存
* */
public class Demo02 {

    public static void main(String[] args) {
        /*
            需求: 两个学生来自于传智黑马
                要求用简单的方式实现上面的需求

            方案A:
                将shcoolName是static,一次赋值,其他对象共享

             方案B:
                将schoolName是非静态, 直接给初始值, 其他对象都一样

             比较: 方案A好,好在内存占用小(static属性在内存独一份)


         */
//        Student.schoolName = "传智黑马";
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);

    }
}
