package com.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {
    int var1;
    String var2, var3;

    public LinkedListCollection(int var1, String var2, String var3){
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public String toString(){
        return this.var1+" "+this.var2+" "+this.var3;
    }

    public static void main(String[] args) {
        List<LinkedListCollection> linkedList = new LinkedList<>();
        linkedList.add(new LinkedListCollection(1, "a", "aa"));
        linkedList.add(new LinkedListCollection(1, "b", "bb"));
        linkedList.add(new LinkedListCollection(1, "c", "cc"));
        linkedList.add(new LinkedListCollection(1, "d", "dd"));

        System.out.println(linkedList.get(6));
    }
}
