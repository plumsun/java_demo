package com.demo.skewers;

/**
 * @author LiHaoHan Created on 2023/12/13
 */
public class Subarrays {

    public static void main(String[] args) {
        int[] ints = new int[]{1, -1, 0};
        int i = subarraySum(ints, 3);
        System.out.println("i = " + i);
    }


    public static int subarraySum(int[] nums, int k) {
        int num = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = i; j < len; j++) {
                sum += nums[j];
                if (sum == k) {
                    num++;
                }
            }
        }
        return num;
    }
}
