package com.itheima09.抽象类;

import java.util.concurrent.ArrayBlockingQueue;

class MyCircularQueue {

    private ArrayBlockingQueue<Integer> queue = null;

    public MyCircularQueue(int k) {
        queue = new ArrayBlockingQueue<>(k);
    }

    public boolean enQueue(int value) {
        try {
            return queue.add(value);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean deQueue() {
        return queue.remove(queue.peek());
    }

    public int Front() {
        return queue.poll();
    }

    public int Rear() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public boolean isFull() {
        if (queue.remainingCapacity() == 0) {
            return true;
        }
        return false;
    }

}
