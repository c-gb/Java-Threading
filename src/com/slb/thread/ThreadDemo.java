package com.slb.thread;

public class ThreadDemo {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("running...");
            }
        };
        runnable.run();
    }
}
