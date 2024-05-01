package com.Java_Classes;

public class Bucket_Queue {
    int x;
    boolean valueInx=false;

    synchronized void put(int j){
        if(valueInx==false){
            x=j;
            valueInx=true;
            System.out.println("Producer has put "+x+" into X");
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    synchronized void get(){
        if(valueInx==true){
            System.out.println("Consumer is using the Resource "+x+" from X Container");
            valueInx=false;
            notify();

        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
