package org.example.threads;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Threads extends Thread{

    private int szam = 0;

    public void run(){
        long startTime = System.currentTimeMillis();
        Random r = new Random();

        while (true) {
            try {
                for(int i=0; i<100; i++){
                    int newR = r.nextInt(3000-1000) + 1000;
                    // ezt a szam++ itt most lockolni kellene valahogyan
                    Lock lock = new ReentrantLock();
                    try{
                        lock.lock();
                        szam++;
                    }finally {
                        lock.unlock();
                    }
                    Thread.sleep(newR);
                    System.out.print(this.getName() + ", a szam változtatva: " + szam + "\n");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int plus(int a){
        return a++;
    }

    public static void main(String args[]){
        Threads t1=new Threads();
        Threads t2=new Threads();
        Threads t3=new Threads();
        t1.start();
        t2.start();
        t3.start();
    }

}
