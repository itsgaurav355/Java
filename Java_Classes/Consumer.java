package com.Java_Classes;

public class Consumer implements Runnable{
    Bucket_Queue bq;
    public Consumer(Bucket_Queue bq){
        this.bq=bq;
    }
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bq.get();
        }
    }
}
