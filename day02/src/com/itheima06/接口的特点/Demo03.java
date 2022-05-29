package com.itheima06.接口的特点;

public class Demo03 {

    public static void main(String[] args) {
        O o = new O();
        o.method02();
    }
}
interface M{
    //static原因: 接口不能实例化
    public static final int A = 1;
    //抽象方法: public abstract
    void method01();

    default void method02(){
        System.out.println("M的默认方法");
    }

    static void method03(){
        System.out.println("M的静态方法");
    }
}
interface N{
    int A = 2;
    void method01();
    default void method02(){
        System.out.println("N的默认方法");
    }
    static void method03(){
        System.out.println("N的静态方法");
    }
}
class O implements M,N{
    @Override
    public void method02() {
        System.out.println("O的method02方法");
    }

    @Override
    public void method01() {
        M.method03();
        N.method03();

        System.out.println(M.A);
        System.out.println(N.A);
    }
}
class P{
   public void method01(){

   }
}
interface Q{
    void method01();
}
class R extends P implements Q{
    //R继承了P的method01方法,又可以作为Q的重写
}
/*
* 运用场景: 任何一个类都继承自Object类
*   Object有一个方法
*           boolean equals(Object obj){
*
*           }
* */
interface T{
    boolean equals(Object obj);
    String toString();
}
/*
    面试题: U不是抽象类,为什么无需重写T的equals方法啊?
        1. 语法:
            class R extends P implements Q{
                //R继承了P的method01方法,又可以作为Q的重写
            }
        2. 知识点:
            任何一个类最终都继承自Object
        3. 知识点: Object中有哪些方法

     结论: 一个类的父接口中所有的跟Object一样的抽象方法,都无需重写
 */

class U implements T{

}