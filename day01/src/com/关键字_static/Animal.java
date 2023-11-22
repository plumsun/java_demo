package com.关键字_static;

public class Animal {

    public int id1;
    protected int id2;
    int id3;
    private int id4;
}
class Demo05{

    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.id1);
        System.out.println(a.id2);
        System.out.println(a.id3);
//        System.out.println(a.id4);
    }
}
