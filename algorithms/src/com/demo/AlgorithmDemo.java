package com.demo;

import org.junit.Test;

import java.util.HashMap;

/**
 * @author LiHaoHan
 * @date 2022/12/12
 */
public class AlgorithmDemo {

    /**
     * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * 你可以按任意顺序返回答案。
     * 两数之和
     */
    @Test
    public void test1(){
       twoSum(null,0);
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{0};
    }


    /**
     *  括号匹配深度
     */
    @Test
    public void test(){
        int i = bracketNum("((()))");
        System.out.println("i = " + i);
    }

    private int bracketNum(String str){
        int num = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='(')
                num++;
            else
                num--;
            count = Math.max(num,count);
        }
        return count;
    }

}

