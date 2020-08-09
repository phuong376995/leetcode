package queue;

/**
 * The problem: https://leetcode.com/explore/learn/card/queue-stack/228/first-in-first-out-data-structure/1337/
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 8/9/20
 */

public class MyCircularQueue {

    private int[] data;
    private int size;
    private int count;
    private int head;
    private int tail;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data = new int[k];
        size = k;
        count = 0;
        head = tail = -1;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        tail++;
        if (tail == size) {
            tail = 0;
        }
        if (isEmpty()) {
            head = tail;
        }
        data[tail] = value;
        count++;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head++;
        if (head == size) {
            head = 0;
        }
        count--;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }

        return data[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }

        return data[tail];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return count == 0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return count >= size;
    }
}
