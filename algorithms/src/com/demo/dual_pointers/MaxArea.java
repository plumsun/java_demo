package com.demo.dual_pointers;

/**
 * @author LiHaoHan Created on 2023/12/6
 */
public class MaxArea {

    public static void main(String[] args) {
        int[] ints = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int trap = trap(ints);
        System.out.println("trap = " + trap);
    }

    public static int trap(int[] height) {
        int sum = 0;
        int[] maxRight = new int[height.length];
        for (int i = height.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i + 1]);
        }
        int maxLeft = 0;
        for (int i = 1; i < height.length - 1; i++) {
            maxLeft = Math.max(maxLeft, height[i - 1]);
            int min = Math.min(maxLeft, maxRight[i]);
            if (min > height[i]) {
                sum = sum + (min - height[i]);
            }
        }
        return sum;
    }
}
