package com.exceptions;

class Exceptions{

    static Exceptions e = new Exceptions();

    public static void main(String[] args) {
        System.out.println(objEqual(new Exceptions()));
    }

    static boolean objEqual(Exceptions a){
        return a.equals(e);
    }
}
