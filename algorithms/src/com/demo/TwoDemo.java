package com.demo;

/**
 * @description:
 * @date: 2022/4/23 21:02
 * @author: LiHaoHan
 * @program: com.demo
 */
public class TwoDemo {
    /**
     * 二分查找
     */




    public static int towDome(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            System.out.println("middle = " + middle);
            if (arr[middle] == key) {
                System.out.println(middle);
                return middle;
            } else if (arr[middle] > key) {
                right = middle - 1;
                System.out.println("right = " + right);
            } else {
                left = middle + 1;
                System.out.println("left = " + left);
            }
        }
        return -1;
    }
}
