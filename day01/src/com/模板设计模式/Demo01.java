package com.模板设计模式;

import java.util.HashMap;

public class Demo01 {

    public static void main(String[] args) {

        // ADriver ad = new ADriver();
        // //ad调用drive方法的时候, this=ad
        // // ADriver重写了style,this优先调用子类的style方法
        // ad.drive();
        //
        // new BDriver().drive();
        Integer a = new Integer(100);
        Integer b = new Integer(100);
        if(a==b){
            System.out.println("true = " + true);
        }
        String str = "java";
        String intern = str.intern();
        System.out.println("intern = " + intern==str);
        HashMap<String,String> map =new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        System.out.println("map = " + map);
        System.out.println("map = " + map);
    }
}
