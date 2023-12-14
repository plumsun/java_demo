package com.demo.slide_the_window;

import java.util.Arrays;

/**
 * @author LiHaoHan Created on 2023/12/14
 */
public class Max_num {

    public static void main(String[] args) {
        int[] ints = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int[] ints1 = maxSlidingWindow(ints, 3);
        System.out.println("ints1 = " + Arrays.toString(ints1));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ints = new int[nums.length - k + 1];
        int index = 0;
        if (k == 1) {
            return nums;
        }
        int asInt = Arrays.stream(nums).limit(k).max().getAsInt();
        int count = k - 1;
        int max = nums[0];
        while (count > 0) {
            if (max < nums[count]) {
                max = nums[count];
                index = count;
            }
            count--;
        }
        int maxIndex = 0;
        while (maxIndex < k - 1) {
            ints[maxIndex++] = asInt;
        }
        for (int i = k; i <= nums.length - 1; ) {
            if (index < i - k + 1) {
                count = k - 1 + i;
                max = nums[i];
                int temp = 0;
                while (count > i) {
                    if (max < nums[count]) {
                        max = nums[count];
                        index = count;
                    }
                    count--;
                    temp++;
                }
                i += k;
                while (temp > 0) {
                    ints[maxIndex++] = max;
                    temp--;
                }
            } else {
                max = Math.max(nums[index], nums[i]);
                ints[maxIndex++] = max;
                i++;
            }
        }
        return ints;
    }

    public static int[] maxSlidingWindow1(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 0; i < n; i += k) {
            int start = i;
            int end = start + k - 1;
            if (end >= n) {
                end = n - 1;
            }
            left[start] = nums[start];
            for (int j = start + 1; j <= end; j++) {
                left[j] = Math.max(left[j - 1], nums[j]);
            }
            right[end] = nums[end];
            for (int j = end - 1; j >= start; j--) {
                right[j] = Math.max(right[j + 1], nums[j]);
            }
        }
        int[] result = new int[n - k + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.max(right[i], left[i + k - 1]);
        }
        return result;
    }
}
