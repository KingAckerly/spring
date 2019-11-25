package com.example.spring.thread;

public class MyRunnable implements Runnable {
    /**
     * implements Runnable 共享资源
     */
    private int ticket = 5;
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (this.ticket > 0) {
                //由于共享资源,只会执行5次,因为ticket = 5,ticket--
                System.out.println(Thread.currentThread().getName() + " 卖票：ticket " + this.ticket--);
            }
        }
    }
}
