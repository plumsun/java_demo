package com.继承的构造方法;

public class Person {

    public Person(int a){

    }
}
class Student extends Person{

    public Student(){
//        super();
//        super(1);
        this(1);
    }
    public Student(int b){
        super(b);
    }
}
