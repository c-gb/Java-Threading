package com.slb.thread;

public class ThreadB implements Runnable{
    @Override
    public void run() {
        System.out.println("in run() of ThreadB class which implements Runnable interface");
    }
}
