package com.Java_Classes;

public class Producer implements Runnable{
   private Bucket_Queue bq;
    public Producer (Bucket_Queue bq){
        this.bq=bq;
    }
    @Override
    public void run() {
        int j=1;
        while(j<=10){
            bq.put(j++);
            System.out.println("Producer "+Thread.currentThread().getName()+" has put "+j);
            try{
                Thread.sleep(3000);
            }catch(Exception e){

            }
        }
    }
}