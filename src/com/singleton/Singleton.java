package com.singleton;

public class Singleton {

    int x = 10;

    private static Singleton instance = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}

class Main{
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        a.x+=10;
        System.out.println(a.x);
        System.out.println(b.x);
    }
}