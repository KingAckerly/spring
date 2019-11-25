package com.example.spring.thread;

import java.io.IOException;

public class Thread1 {
    public static void main(String[] args) {
        /*MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();*/
        Thread thread = new Thread();
        //millis-毫秒 nanos-纳秒
        //InterruptedException
        thread.start();
        thread.interrupt();
        //thread.isInterrupted();
        //thread.interrupted();
        thread.interrupted();
        //System.out.println(thread.interrupted());
        System.out.println(thread.isInterrupted());
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
