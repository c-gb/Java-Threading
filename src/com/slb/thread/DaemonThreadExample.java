package com.slb.thread;

public class DaemonThreadExample extends Thread{

    @Override
    public void run() {

        System.out.println("running...");

        System.out.println(this.getName());
        System.out.println("is this daemon thread ? :" + this.isDaemon());
    }

    //will first create one user thread and then will create another one for daemon
    public static void main(String[] args) {
        DaemonThreadExample userThread = new DaemonThreadExample();
        DaemonThreadExample daemonThread = new DaemonThreadExample();

        daemonThread.setDaemon(true);

        userThread.setName("USER THREAD");
        daemonThread.setName("DAEMON THREAD");

        userThread.run();
        daemonThread.run();

        System.out.println("checking main thread is daemon or not");
        System.out.println(Thread.currentThread().isDaemon());

    }

}
