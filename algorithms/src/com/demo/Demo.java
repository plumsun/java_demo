package com.demo;

import java.util.*;

/**
 * @description:
 * @date: 2022/5/1 13:49
 * @author: LiHaoHan
 * @program: com.demo
 */
public class Demo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(3);
        integers.add(2);
        integers.add(5);
        integers.add(8);
        integers.add(6);
        System.out.println("integers = " + integers);
        LinkedHashSet<Integer> integers1 = new LinkedHashSet<>();
        integers1.add(1);
        integers1.add(3);
        integers1.add(2);
        integers1.add(5);
        integers1.add(8);
        integers1.add(6);
        System.out.println("integers1 = " + integers1);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(6);
        System.out.println("arrayList = " + arrayList);
        Integer a = new Integer(1);
        int i = a.intValue();
        HashMap stringHashMap = new HashMap<>(20);
        int size = stringHashMap.size();
        System.out.println("size = " + size);
    }
}
