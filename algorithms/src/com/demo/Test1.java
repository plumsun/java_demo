package com.demo;

import java.util.Calendar;
import java.util.Date;

/**
 * @description:
 * @date: 2022/4/26 19:33
 * @author: LiHaoHan
 * @program: com.migu.live.timing.controller
 */
public class Test1 {
    public static void main(String[] args) {
        Date date = new Date();
        date.getTime();System.out.println("date = " + date.getTime());
        long newTimeStamp = getNewTimeStamp(1l, 3 - 1,
                Calendar.DAY_OF_WEEK);
        System.out.println("newTimeStamp = " + newTimeStamp);
    }

    public static long getNewTimeStamp(long time, int amunt,int TimeType) {
        Date oldDate = new Date(time);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(oldDate);
        calendar.add(TimeType, amunt);
        return calendar.getTime().getTime();
    }


    public void test(int[] buf) {
        for (int i = 0; i < buf.length / 2; i++) {
            int temp = buf[buf.length - i - 1];
            buf[buf.length - i - 1] = buf[i];
            buf[i] = temp;
        }
    }

    public static int[] solve(int n, int m, int[] a) {
        //把最后一个元素拿出来，然后把前一位的值赋给后一位，来回移动，外循环表示你要移动几位，也就是循环次数
        for (int j = 0; j<m ; j++) {
            int tem = a[a.length-1];
            for (int i = a.length-1; i>=1; i--) {
                a[i]=a[i-1];
            }
            a[0]=tem;
        }
        return a;
    }

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
