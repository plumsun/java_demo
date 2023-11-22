package com.threadDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

/**
 * @program: Stream
 * @Date: 2022/10/18
 * @Author: LiHaoHan
 * @Description:
 */
public class Stream {

    @org.junit.Test
    public void streamTest(){
        Test test = new Test();
        ArrayList<String> objects = new ArrayList<>();
        test.setObjects(objects);
        Optional<Test> test1 = Optional.ofNullable(test);
        System.out.println(test1.get());
    }

    @org.junit.Test
    public void streamDemo(){
        Test test = new Test();
        ArrayList<String> objects = new ArrayList<>();
        Collections.addAll(objects,"1","2","3");
        test.setObjects(objects);

        test.getObjects();
    }

    @org.junit.Test
    public void streamDis(){
        ArrayList<Test> objects = new ArrayList<>();
        objects.add(new Test("1","2",null));
        objects.add(new Test("1","3",null));
        objects.add(new Test("1","4",null));
        objects.add(new Test("1","2",null));
        long count = objects.stream().distinct().count();
        long count1 = objects.stream().map(Test::getObjects).distinct().count();
        long count2 = objects.stream().map(Test::getId).distinct().count();
        long count3 = objects.stream().map(Test::getName).distinct().count();
        System.out.println("count1 = " + count1);
        System.out.println("'count' = " + count);
        Test test1 = new Test("1", "2", null);
        Test test2 = new Test("1", "2", null);
        boolean equals = test2.equals(test1);
        System.out.println("equals = " + equals);
    }
}
