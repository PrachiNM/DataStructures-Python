package com.dataStructures.stack;

public class StackUsingLinkedList {

    Node top;
    int size;
    int capacity;

    class Node{
        Node previous;
        Object data;

        public Node(Object data){
            this.data = data;
            this.previous = null;
        }
    }

    public StackUsingLinkedList(Object data, int capacity){
        this.top = new Node(data);
        this.capacity = capacity;
    }

    public StackUsingLinkedList(int capacity){
        this.top = null;
        this.capacity = capacity;
    }

    public void push(Object data){
        if(top == null){
            top = new Node(data);
            this.size++;
            return;
        }
        if(capacity == size){
            throw new StackOverflowError("Stack overflow");
        }

        Node newNode = new Node(data);
        newNode.previous = top;
        top = newNode;
        size++;
    }

    public Node pop(){
        if(top == null){
            throw new NullPointerException("Stack Underflow");
        }
        Node retNode = this.top;
        this.top = top.previous;
        size--;
        return retNode;
    }

//    Print stack elements in stack in FIFO order
    public void print(Node top){
        if(top != null){
            print(top.previous);
            System.out.println(top.data);
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList(5);
        stack.push(5);
        stack.push(4);
        stack.push(7);
        stack.push(1);
        stack.push(89);
//        System.out.println(stack.pop().data);

        stack.print(stack.top);

    }

}
