package com.threadDemo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

/**
 * @author LiHaoHan
 * @date 2022/12/12
 */
public class AlgorithmDemo {

    /**
     * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * 你可以按任意顺序返回答案。
     *
     */
    @Test
    public void test(){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int length = nums.length-1;
        for (int i = 0; i < length; ++i) {
            for (int y = i + 1; y < length; ++y) {
                System.out.println("y = " + y);
                if (nums[i] + nums[y] == target) {
                    System.out.println("index = " + Arrays.toString(new int[]{i, y}));
                }
            }
        }


    }
}
