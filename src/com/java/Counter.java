package com.java;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by j-yangbo on 2017/4/11.
 */
public class Counter {

    public static  volatile int  counter = 0;//无效的   volatile对于某个线程将变量的修改放到共享内存，以至于所有线程都可以访问， 但是如果是自操作的话就无效
    public    static   int newCounter = 2;

    public static  AtomicInteger atomicInteger = new AtomicInteger(2);

    public   static  synchronized int getCount() {
         return counter++;
    }

    public void newCounter(){
        newCounter++;
        //synchronized block
        synchronized (this){
            newCounter--;
        }
    }

    public static int getAtomicIndex(){
        return atomicInteger.getAndIncrement();
    }
}
