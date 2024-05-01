package com.Java_Classes;

//P for producer C for consumer B for Bucket class Use of wait() and notify() methods
public class PCB_Main {
    public static void main(String[] args) {
        Bucket_Queue bq=new Bucket_Queue();
        Producer p=new Producer(bq);
        Consumer c=new Consumer(bq);
        Thread t1=new Thread(p);
        Thread t2=new Thread(c);
        t1.start();
        t2.start();
    }
}
