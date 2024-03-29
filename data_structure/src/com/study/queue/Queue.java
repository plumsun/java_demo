package com.study.queue;

/**
 * The type Queue.
 *
 * @author LiHaoHan
 * @date 2023 /1/13
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

    /**
     * Instantiates a new Queue.
     *
     * @param maxSize the max size
     */
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.rear = 0;
        this.front = 0;
        arr = new int[maxSize];
    }

    /**
     * 添加数据
     *
     * @param num the num
     */
    public void add(int num) {
        boolean full = isFull();
        if (full) {
            System.out.println("队列已满");
            return;
        }
        rear = (rear + 1) % maxSize;
    }

    /**
     * 取出数据
     *
     * @return the int
     */
    public int get() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        int num = arr[front];
        front = (front + 1) % maxSize;
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
     *
     * @return the int
     */
    public int size() {
        return (rear + maxSize - front) % maxSize;
    }

    /**
     * 判断容器是否为空
     *
     * @return the boolean
     */
    public boolean isEmpty() {
        return rear == front;
    }

    /**
     * 判断容器是否满
     *
     * @return the boolean
     */
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }
}
