package com.example.spring.thread;

public class MyThread extends Thread {
    /**
     * extends Thread 非共享资源
     */
    private int ticket = 10;
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (this.ticket > 0) {
                //由于非共享资源,会执行30次,因为ticket = 10,ticket--,3个线程
                System.out.println(this.getName() + "买票：ticket " + this.ticket--);
            }
        }
    }
}
