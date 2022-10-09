package com.demo;

/**
 * @description:
 * @date: 2022/6/18 21:06
 * @author: LiHaoHan
 * @program: com.demo
 */
public class UnableCreateThreadDemo {

    static int test(String a,String b){
        return a.indexOf(b.charAt(0));
    }



    static int i =0;
    /**
     * 1.当前应用创建太多线程，超过系统承载极限
     * 2.本地服务器不允许应用程序创建这么线程，超过了阈值
     *
     *
     * 优化代码，降低线程数量
     * 改变服务器限制
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("test() = " + test("hello", "11"));
        i++;
        // while (true){
        //     new Thread(()->{
        //         try {
        //             Thread.sleep(Integer.MAX_VALUE);
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //     }).start();
        // }
    }

}
