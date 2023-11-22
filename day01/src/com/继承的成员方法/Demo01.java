package com.继承的成员方法;

public class Demo01 {

    public static void main(String[] args) {

//        Animal a = new Animal();
//        a.speak();

        Dog dog = new Dog();
        dog.speak();
//        dog.run();


    }
}
class Animal{
    public void speak(){
        System.out.println("动物在说话");
    }
}
class Dog extends Animal{
    public void run(){
        System.out.println("狗在奔跑");
    }

    /*public void speak(){
        super.speak();
        System.out.println("狗在汪汪叫");
    }*/

    @Override
    public void speak() {
        super.speak();

    }

    public void method01(int a, String b){

    }
    public void method01(String b, int a){

    }
}
