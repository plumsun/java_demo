package com.demo.dual_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author LiHaoHan Created on 2023/12/5
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 0, 1, 1, 2};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println("lists = " + lists);
    }

    /**
     * 示例 1：
     * 输入：nums = [-1,0,1,2,-1,-4]
     * 输出：[[-1,-1,2],[-1,0,1]]
     * 解释：
     * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
     * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
     * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
     * 不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
     * 注意，输出的顺序和三元组的顺序并不重要。
     * <p>
     * 示例 2：
     * 输入：nums = [0,1,1]
     * 输出：[]
     * 解释：唯一可能的三元组和不为 0 。
     * <p>
     * 示例 3：
     * 输入：nums = [0,0,0]
     * 输出：[[0,0,0]]
     * 解释：唯一可能的三元组和为 0 。
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        // 三数之和,如果数组容量小于3不符合要求,直接返回空
        if (len < 3) {
            return list;
        }
        for (int i = 0; i < len; i++) {
            // 当前循环下标大于 0 ,证明此时的已经循环到 0 + n 的位置，如果当前下标值 == 上一位的值，可以直接跳过，因为上一个已经比较过了。
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                int num = nums[i] + nums[left] + nums[right];
                if (num == 0) {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 如果当前值 == 后一位值证明相同，但是相同的已经比较过了，可以直接跳过。
                    while (nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (num > 0) {
                    // 结果大于 0，因为数组已经排序完成，证明此时右指针的值过大，将右指针左移取小值进行比较
                    right--;
                } else {
                    // 结果小于 0，因为数组已经排序完成，证明此时左指针的值过小，将左指针右移取大值进行比较
                    left++;
                }
            }
        }
        return list;
    }
}
