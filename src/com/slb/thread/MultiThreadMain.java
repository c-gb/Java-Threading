package com.slb.thread;

import java.util.Arrays;
import java.util.List;

class MultiThreadingDemo extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is running.." + Thread.currentThread().getName());
    }
}

public class MultiThreadMain{

    public static void main(String[] args) {

        int numberOfThread = 10;
        Arrays.asList();
        for (int i = 0; i < numberOfThread; i++){
            MultiThreadingDemo multiThreadingDemo = new MultiThreadingDemo();
            multiThreadingDemo.setName("Thread " + i);
            multiThreadingDemo.start();


        }

    }
}
