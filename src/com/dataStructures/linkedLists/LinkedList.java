package com.dataStructures.linkedLists;

public class LinkedList {
    Node head;

    class Node{
        Object data;
        Node next;

        public Node(Object data){
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList(){
        this.head = null;
    }

    public LinkedList(Object data){
        head = new Node(data);
    }

    public void insert(Object data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        Node newNode = new Node(data);
        last.next = newNode;
    }

    public void delete(Object data){

        if(head != null && head.data == data){
            head = head.next;
            return;
        }

        Node node = head;
        Node last = null;
        while (node != null) {
            if (node.data != data) {
                last = node;
                node = node.next;
            }
            else {
                last.next = node.next;
                node.next = null;
                return;
            }
        }
    }

    public void print(){
        Node pointer = head;
        while (pointer != null){
            System.out.println(pointer.data);
            pointer = pointer.next;
        }
    }

    public void printRev(){
        printRec(this.head);
    }

    public void printRec(Node node){
        if(node != null){
            printRec(node.next);
            System.out.println(node.data);
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(0);
        linkedList.insert(8);
        linkedList.insert(4);
//        linkedList.print();
//        linkedList.printRev();
        linkedList.delete(4);
        linkedList.printRev();
    }
}
