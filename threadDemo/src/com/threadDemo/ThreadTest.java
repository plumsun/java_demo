package com.threadDemo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @program: Stream
 * @Date: 2022/10/18
 * @Author: LiHaoHan
 * @Description:
 */
public class ThreadTest {


    @Test
    public void workThreadTest() throws InterruptedException {
        ExecutorService pool = Executors.newWorkStealingPool(3);
        for (int i = 0; i < 10; i++) {
            final int taskNumber = i;
            pool.submit(() -> {
                System.out.println("Task " + taskNumber + " executed by " + Thread.currentThread().getName());
                try {
                    // 模拟任务耗时
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
        // 等待所有任务完成
        pool.shutdown();
        System.out.println("pool = " + pool + System.currentTimeMillis());
        // 判断线程池中所有任务是否在指定时间范围内完成
        boolean b = pool.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("pool = " + b);
    }


    @Test
    public void workThreadTest2() throws InterruptedException {
        List<Integer> integerList = List.of(11, 33, 66, 8, 9, 13);
        // 获取流中小于 50 的数据，直到不符合条件停止
        integerList.stream().takeWhile(x -> x < 50).forEach(System.out::println);// 11 33

        // 删除流中小于 50 的数据，直到不符合条件停止
        integerList.stream().dropWhile(x -> x < 50).forEach(System.out::println);// 66 8 9 13
        System.out.println("integerList = " + integerList);

        int i = 1;
        i = 2;

        System.out.println("i = " + i);
    }


    @Test
    public void workThreadTest4() throws InterruptedException {
        var map1 = new HashMap<>();
        var map2 = new HashMap<>();
        map1.put(1, new ArrayList<>(1));
        map1.put(2, 1);
        map2.put("a", "1");
        System.out.println("map2 = " + map2);
        System.out.println("map1 = " + map1);
    }

    int factorial(int i) {
        var context = new Object() {
            int fact(int i, int accumulator) {
                if (i <= 1)
                    return accumulator;
                else
                    return fact(i - 1, i * accumulator);
            }
        };
        return context.fact(i, 1);
    }


    int[] parseAndLogInts(List<String> list, int radix) {
        var context = new Object() {
            int parseAndLogInt(String str) {
                System.out.println(str);
                return Integer.parseInt(str, radix);
            }
        };
        return list.stream().mapToInt(context::parseAndLogInt).toArray();
    }


    int[] parseAndLogInts1(List<String> list, int radix) {
        var context = new AutoCloseable() {
            int parseAndLogInt(String str) {
                System.out.println(str);
                return Integer.parseInt(str, radix);
            }

            public void close() {
                System.out.println("exit");
            }
        };
        try (context) {
            return list.stream().mapToInt(context::parseAndLogInt).toArray();
        }
    }

    @Test
    public void workThreadTest3() throws InterruptedException {


    }
}


class TestObj {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestObj{" +
                "name='" + name + '\'' +
                '}';
    }
}