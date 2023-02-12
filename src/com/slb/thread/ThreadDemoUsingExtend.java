package com.slb.thread;

public class ThreadDemoUsingExtend  extends  Thread{

    @Override
    public void run() {
        System.out.println("Running Thread....");
    }

    public static void main(String[] args) {
        ThreadDemoUsingExtend threadObject = new ThreadDemoUsingExtend();
        threadObject.start();
    }
}
