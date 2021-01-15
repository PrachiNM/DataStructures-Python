package com.dataStructures.trees;

public class BinarySearchTree {
    Node root;

    static class Node {
        Node left;
        Node right;
        int key;
        String fName;
        String lName;

        public Node(int key, String fName, String lName) {
            this.key = key;
            this.fName = fName;
            this.lName = lName;
            this.left = null;
            this.right = null;
        }
    }

    public BinarySearchTree(int key, String fName, String lName) {
        root = new Node(key, fName, lName);
    }

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key, String fName, String lName) {
        root = insertRec(root, key, fName, lName);
    }

    public Node insertRec(Node node, int key, String fName, String lName) {
        if (node == null) {
            node = new Node(key, fName, lName);
        }else if (key < node.key) {
            //lest sub-tree
            node.left = insertRec(node.left, key, fName, lName);
        } else if (key > node.key) {
            //right sub-tree
            node.right = insertRec(node.right, key, fName, lName);
        }
//        System.out.println("node.key: "+node.key);
        return node;
    }

    public void inorderTraversal(){
        inorderRec(root);
    }

    public void preorderTraversal(){
        preorderRec(root);
    }

    public void postorderTraversal(){
        postorderRec(root);
    }

    public void inorderRec(Node node){
        if(node != null){
            inorderRec(node.left);
            System.out.println(node.key);
            inorderRec(node.right);
        }
    }

    public void preorderRec(Node node){
        if(node != null){
            System.out.println(node.key);
            preorderRec(node.left);
            preorderRec(node.right);
        }
    }

    public void postorderRec(Node node){
        if(node != null){
            postorderRec(node.left);
            postorderRec(node.right);
            System.out.println(node.key);
        }
    }

    public Node search(int key){
        Node node = searchRec(root, key);
        return node;
    }

    public Node searchRec(Node node, int key){
        if(key == node.key)
            return node;
        else if(key<node.key)
            return searchRec(node.left, key);
        else if(key>node.key)
            return searchRec(node.right, key);
        else
        return null;
    }

    public void printData(Node node){
        System.out.println("key: "+ node.key);
        System.out.println("fName: "+ node.fName);
        System.out.println("lName: "+ node.lName);
    }

    public static void main(String[] args) {
        BinarySearchTree obj = new BinarySearchTree(100, "Nitin", "Mehare");
        obj.insert(50, "Prachi", "Mehare");
        obj.insert(30, "Parag", "Mehare");
        obj.insert(20, "Manisha", "Mehare");
        obj.insert(40, "Priyanka", "Katole");
        obj.insert(70, "Samruddhi", "Rathi");
        obj.insert(60, "Poulomi", "Saha");
        obj.insert(80, "Shivam", "Deshpande");
        System.out.println("inorderTraversal");
        obj.inorderTraversal();
        System.out.println("preorderTraversal");
        obj.preorderTraversal();
        System.out.println("postorderTraversal");
        obj.postorderTraversal();
        obj.insert(1, "Harsh", "Purohit");
        obj.insert(90, "Rohit", "Kelkar");
        obj.insert(32, "Mohit", "Deshmukh");
        obj.inorderTraversal();
        Object ob = 1;

        Node node = obj.search(60);
        if(node != null){
            obj.printData(node);
        }
    }
}
