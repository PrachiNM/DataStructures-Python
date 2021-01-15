package com.dataStructures.queue;

import java.util.Arrays;
import java.util.Scanner;

public class RegularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public RegularQueue(int capacity){
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = this.size = 0;
        this.rear = this.capacity -1;
    }

    public void enqueue(int data){
        if(isFull()) {
            System.out.println("queue is full");
            return;
        }
        this.rear = (++this.rear) % this.capacity;
        this.queue[this.rear] = data;
        System.out.println("enqueued: "+data);
        this.size++;
    }

    public int dequeue(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int retData = this.queue[this.front];
        this.queue[this.front] = Integer.MIN_VALUE;
        this.front = ++this.front % this.capacity;
        this.size--;
        System.out.println("Dequed: "+retData);
        return retData;
    }

    public boolean isFull(){
        return this.size == this.capacity;
    }

    public boolean isEmpty(){
        return (this.size == 0);
    }

    public int getFront(){
        return this.queue[this.front];
    }

    public int getRear(){
        return this.queue[this.rear];
    }

    public int getSize(){
        return this.size;
    }

    public void printQueue(){
        System.out.println(Arrays.toString(this.queue));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queueCapacity = scanner.nextInt();
        RegularQueue queueObject = new RegularQueue(queueCapacity);
        queueObject.enqueue(1);
        queueObject.enqueue(2);
        queueObject.enqueue(3);
        queueObject.enqueue(4);
        queueObject.enqueue(5);
        queueObject.printQueue();
        System.out.println("front: " + queueObject.getFront());
        System.out.println("rear: " + queueObject.getRear());
        System.out.println("size: " + queueObject.getSize());
        queueObject.dequeue();
        queueObject.dequeue();
        queueObject.printQueue();
        System.out.println("size: " + queueObject.getSize());
        queueObject.dequeue();
        queueObject.dequeue();
        queueObject.printQueue();
        queueObject.enqueue(4);
        queueObject.enqueue(5);
        queueObject.printQueue();
        System.out.println("size: " + queueObject.getSize());
        System.out.println("front: " + queueObject.getFront());
        System.out.println("rear: " + queueObject.getRear());
    }
}
