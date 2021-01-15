package com.dataStructures.queue;

import java.util.Arrays;
import java.util.Scanner;

public class CircularQueue {
    private int front;
    private int rear;
    private int size;
    private int capacity;
    int[] circularQueue;

    public CircularQueue(int capacity){
        this.capacity = capacity;
        this.circularQueue = new int[capacity];
        this.size = 0;
        this.front = this.rear = -1;
    }

    private boolean isFull(){
        return ((this.front == 0 && this.rear == this.capacity - 1) ||
                (this.rear == (this.front - 1) % (this.capacity - 1)));
    }

    private boolean isEmpty(){
        return this.size == 0;
    }

    private int getFront(){
        if(isEmpty()){
            System.out.println("empty queue");
            return Integer.MIN_VALUE;
        }
        return this.circularQueue[this.front];
    }

    private int getRear(){
        if(isEmpty()){
            System.out.println("empty queue");
            return Integer.MIN_VALUE;
        }
        return this.circularQueue[this.rear];
    }

    private int getSize(){
        return this.size;
    }

    private int getCapacity(){
        return this.capacity;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }
        else if(this.front == -1){
            this.front = 0;
            this.rear = 0;
        }
        else if(this.rear == this.size - 1 && this.front != 0){
            this.rear = 0;
        }
        else {
            this.rear += 1;
        }

        this.circularQueue[this.rear] = data;
        this.size++;
        System.out.println("enqueued: "+data);
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return Integer.MIN_VALUE;
        }
        this.front = ++this.front % this.capacity;
        int retData = this.circularQueue[this.front];
        this.circularQueue[this.front] = Integer.MIN_VALUE;
        this.size--;
        System.out.println("dequeued: "+retData);
        return retData;
    }

    public void printQueue(){
        System.out.println(Arrays.toString(circularQueue));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queueCapacity = scanner.nextInt();
        CircularQueue circularQueue = new CircularQueue(queueCapacity);
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.dequeue();
        circularQueue.printQueue();
    }

}
