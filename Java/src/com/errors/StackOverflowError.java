package com.errors;

public class StackOverflowError {
    public void error(){
        error();
    }

    public static void main(String[] args) {
        new StackOverflowError().error();
    }
}
