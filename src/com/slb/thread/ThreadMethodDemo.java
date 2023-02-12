package com.slb.thread;

public class ThreadMethodDemo extends Thread {

    @Override
    public void run() {
        System.out.println("Running Thread...." + Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        ThreadMethodDemo threadMethodDemo_ONE = new ThreadMethodDemo();
        ThreadMethodDemo threadMethodDemo_TWO = new ThreadMethodDemo();

        threadMethodDemo_ONE.setName("SLB-Thread-1");
        threadMethodDemo_TWO.setName("SLB-Thread-2");


        threadMethodDemo_ONE.start();
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread is running here....");
        threadMethodDemo_TWO.start();
    }
}
