package com.Java_Classes;
//Demonstration of Priority Threads
public class MSword implements Runnable {
    public void run() {
    if(Thread.currentThread().getName().equals("Typing"))
        typing();
    else if(Thread.currentThread().getName().equals("spellcheck"))
        spellcheck();
    else
        autosave();
    }
    public void typing(){
        for(;;)//leads to infinite loop
        {
            System.out.println("typing Started ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Typing Completed");
        }
    }
    public void spellcheck()
    {
        for(;;){//leads to infinite loop
            System.out.println("Spelling cheking started ");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public void autosave()
    {
        for(int i=0;i<5;i++){
            System.out.println("Autosaving started ");
        }
       // System.out.println("Autosaving done");
    }

    public static void main(String[] args) {
        MSword m=new MSword();
        Thread t1=new Thread(m,"Typing");
        Thread t2=new Thread(m,"spellcheck");
        Thread t3=new Thread(m,"autosave");

        t2.setDaemon(true);//it will execute at last
        t3.setDaemon(true);//it will execute at last

        t2.setPriority(2);
        t3.setPriority(3);//decrease priority from 10 --> 0

        t1.start();
        t2.start();
        t3.start();


    }
}
