package com.代码块;

public class Demo01 {

    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal a2 = new Animal();
        a1.show();
    }


}
class Animal{//class body 类体
    static{
        System.out.println("animal静态代码块");
    }

    { // code block 代码块
        System.out.println("animal的构造代码块");
    }
    public Animal(){
        System.out.println("animal的构造方法");
    }
    public void show(){ // method body 方法体

        int a = 1;
        {
            int b = 2;
            System.out.println(a);
            System.out.println(b);
        }
        System.out.println(a);
//        System.out.println(b);
    }
}