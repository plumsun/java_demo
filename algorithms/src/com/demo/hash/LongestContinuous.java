package com.demo.hash;

import java.util.Arrays;

/**
 * @author LiHaoHan Created on 2023/12/3
 */
public class LongestContinuous {
    public static void main(String[] args) {
        int[] ints= new int[]{0,1,-1};
        int i = longestConsecutive(ints);
        System.out.println("i = " + i);
    }

    /**
     * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
     * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
     * 示例 1：
     * 输入：nums = [100,4,200,1,3,2]
     * 输出：4
     * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
     * 示例 2：
     * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
     * 输出：9
     *
     * @param nums num
     * @return int
     */
    public static int longestConsecutive(int[] nums) {
        if(nums.length<1){
            return 0;
        }
        Arrays.sort(nums);
        int num = 1;
        int maxNum = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]-nums[i-1] == 1){
                num++;
                maxNum = Math.max(num,maxNum);
            }else if (nums[i]==nums[i-1]){
                continue;
            }else{
                num =1;
            }
        }
        return maxNum;
    }
}
