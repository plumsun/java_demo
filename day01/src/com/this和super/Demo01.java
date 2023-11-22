package com.this和super;

public class Demo01 {

    public static void main(String[] args) {

        Animal a = new Animal();
        //this:com.itheima08.this和super.Animal@1540e19d
        a.speak();
        //com.itheima08.this和super.Animal@1540e19d
        System.out.println(a);

        System.out.println("------------");

        Dog d = new Dog();
        //this:com.itheima08.this和super.Dog@677327b6
        d.speak();
        //com.itheima08.this和super.Dog@677327b6
        System.out.println(d);

        System.out.println("--------------");
        new Dog().show();
    }
}
class Animal{
    public Animal(){

    }
    public Animal(String a){

    }
    public void speak(){
        System.out.println("father:" + this);
    }
}
class Dog extends Animal{
    public Dog(){
//        int i = 1;
//        this(1);
        super();
//        super("abc");
    }
    public Dog(int a){
//        super();
        super("abc");
    }
    public void speak(){

        System.out.println("son:" + this);
    }
    public void show(){
        speak();
        this.speak();
        super.speak();
    }
}