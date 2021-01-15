package com.dataStructures.stack;

public class Stack {
    int[] stack;
    int top;

    public Stack(int n){
        this.stack = new int[n];
        this.top = -1;
    }

    public int pop(){
        if (top == -1) {
            throw new NullPointerException("Stack Underflow");
        }
        return stack[top--];
    }

    public void push(int data){
        if (top == this.stack.length-1) {
            throw new StackOverflowError("Stack Overflow");
        }
        this.stack[++top] = data;
    }

    public int getTop(){
        return this.stack[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        stack.push(6);
        System.out.println(stack.pop());
        System.out.println(stack.getTop());
    }
}
