package com.demo;

/**
 * @description:
 * @date: 2022/4/23 21:02
 * @author: LiHaoHan
 * @program: com.demo
 */
public class ChooseDemo {
    /**
     * 选择排序
     */
    public static int[] xzDemo(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
