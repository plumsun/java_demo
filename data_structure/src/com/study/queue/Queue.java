package com.study.queue;

/**
 * @author LiHaoHan
 * @date 2023/1/13
 */
public class Queue {
    private int[] arr;
    private int maxSize;
    private int rear;
    private int front;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.rear = 0;
        this.front=0;
        arr = new int[maxSize];
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    // TODO: 2023/1/13 队列操作
}
