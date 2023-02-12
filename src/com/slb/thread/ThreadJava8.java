package com.slb.thread;

public class ThreadJava8 {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println("inside run method of lambda expression");
        };
    }
}
