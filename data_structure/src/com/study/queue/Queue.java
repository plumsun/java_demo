package com.study.queue;

/**
 * @author LiHaoHan
 * @date 2023/1/13
 */
public class Queue {
    /**
     * 容器
     */
    private int[] arr;

    /**
     * 容器最大容量
     */
    private int maxSize;

    /**
     * 后指针，队列数据输入时变化
     */
    private int rear;

    /**
     * 前指针，队列数据输出时变化
     */
    private int front;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.rear = 0;
        this.front = 0;
        arr = new int[maxSize];
    }
    // TODO: 2023/1/13 队列操作

    /**
     * 添加数据
     */
    public void add(int num) {
        boolean full = isFull();
        if (full) {
            System.out.println("队列已满");
            return;
        }
        if (rear + 1 == maxSize) {
            rear = (rear + 1) % maxSize;
        }
        arr[rear] = num;
        rear++;
    }

    /**
     * 取出数据
     */
    public int get() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        int num = arr[front];
        front++;
        return num;
    }

    /**
     * 获取当前容器所有数据
     */
    public void showQueue() {
        for (int i = front; i < front + size(); i++) {
            System.out.println(arr[i % maxSize]);
        }
    }

    /**
     * 获取当前容器有效数据个数
     */
    public int size() {
        return (rear + maxSize - front) % maxSize;
    }

    /**
     * 判断容器是否为空
     */
    public boolean isEmpty() {
        return rear == front;
    }

    /**
     * 判断容器是否满
     */
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }
}
