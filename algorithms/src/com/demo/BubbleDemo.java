package com.demo;

import java.util.Arrays;

/**
 * @description:
 * @date: 2022/4/23 21:02
 * @author: LiHaoHan
 * @program: com.demo
 */
public class BubbleDemo {
    /**
     * 简单冒泡排序实现
     */
    public static void demo(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
