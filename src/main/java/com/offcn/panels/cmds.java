package com.offcn.panels;



import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class cmds {
    public static void main(String[] args) {
//        Runtime runtime = Runtime.getRuntime();
//        ConcurrentHashMap hashMap = new ConcurrentHashMap();
//        HashMap map = new HashMap();
//
//        Thread thread = new Thread();
        threads threads = new threads();
        threads.setName("这是一个线程");
        threads.start();
    }
}

class threads extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            String name = Thread.currentThread().getName();
            System.out.println("我是线程"+name+i);
            if (i==50){
                threadss threadss = new threadss();

                threadss.run();
            }
        }
    }
}

class threadss implements Runnable{
    public void run() {
        System.out.println("这是线程"+Thread.currentThread().getName());
        threads threads = new threads();
        threads.start();
    }
}
