package com.java.thread;

import com.java.Counter;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by j-yangbo on 2017/4/11.
 */
public class ThreadMain {

    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("" + Thread.currentThread().getName());
        new subThread2().start();
        new subThread1().start();
        //1*2/(1+2)


        ThreadB threadB = new ThreadB();
        threadB.start();
        synchronized (threadB){

        try {
            System.out.println("Wainting for  thread B to complete");
            threadB.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Total is " + threadB.total);
        }
    }


    private synchronized int getResult() {
        return 1 * 2 / (1 + 2);
    }

}

class ThreadB extends Thread {
    int total;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                total += i;
            }
            notify();
        }
    }
}

class subThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("thread name" + Thread.currentThread().getName() + ": value =" + Counter.getCount());
    }
}

class subThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("thread name" + Thread.currentThread().getName() + ": value =" + Counter.getCount());
    }
}