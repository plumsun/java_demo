package com.demo.dual_pointers;

import java.util.Arrays;

/**
 * @author LiHaoHan Created on 2023/11/30
 */
public class MoveZero {

    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
     * <p>
     * 示例 1:
     * 输入: nums = [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     * 示例 2:
     * 输入: nums = [0]
     * 输出: [0]
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0};
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] nums) {
        if(nums.length<=1){
            return;
        }
        int left = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                nums[left] = nums[i];
                left++;
            }
        }
        int len = length-1;
        for (; len >= left; left++) {
            nums[left] = 0;
        }
        System.out.println("nums = " + Arrays.toString(nums));
    }
}
