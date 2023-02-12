package com.slb.thread;

public class DaemonThreadExample extends Thread{

    @Override
    public void run() {

        System.out.println("running...");

//        System.out.println(this.getName());
//        System.out.println("is this daemon thread ? :" + this.isDaemon());

        System.out.println("PRIORITY OF "+this.getName() +" THREAD : " + this.getPriority());
    }

    //will first create one user thread and then will create another one for daemon
    public static void main(String[] args) {
        DaemonThreadExample userThread1 = new DaemonThreadExample();
        DaemonThreadExample daemonThread = new DaemonThreadExample();
        DaemonThreadExample userThread2 = new DaemonThreadExample();
        DaemonThreadExample userThread3 = new DaemonThreadExample();
        DaemonThreadExample daemonThread2 = new DaemonThreadExample();

        daemonThread.setDaemon(true);
        daemonThread2.setDaemon(true);

        userThread1.setName("USER THREAD-1");
        userThread2.setName("USER THREAD-2");
        userThread3.setName("USER THREAD-3");
        daemonThread.setName("DAEMON THREAD 1 ");
        daemonThread2.setName("DAEMON THREAD 2 ");

        userThread1.start();
        daemonThread.start();
        userThread2.start();
        userThread3.start();

        System.out.println("checking main thread is daemon or not");
        System.out.println(Thread.currentThread().isDaemon());

    }

}
