package com.study.queue;

/**
 * @author LiHaoHan
 * @date 2023/1/13
 */
public class ArrayToQueueDemo {

    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        int i = queue.get();
        queue.add(4);
        queue.showQueue();
        int size = queue.size();
        System.out.println("arr = " + size);
    }
}
