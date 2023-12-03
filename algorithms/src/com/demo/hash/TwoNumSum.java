package com.demo.hash;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author LiHaoHan Created on 2023/12/1
 */
public class TwoNumSum {

    public static void main(String[] args) {
        int[] ints = new int[]{3,3};
        int[] ints1 = twoSum(ints, 6);
        System.out.println("ints1 = " + Arrays.toString(ints1));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ints = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (map.containsKey(tmp)) {
                ints[0] = map.get(tmp);
                ints[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return ints;
    }
}
