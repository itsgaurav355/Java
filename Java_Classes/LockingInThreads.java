package com.Java_Classes;
//Blocking in threads or blocking of source
//case 1 --> Blocking of resources in java(When one thread is working with bat ball another thread cannot access the same resource they will go to block state until thread 1 completes  its execution
/*
class Cricket extends Thread{
    String resource1="Bat";
    String resource2="Ball";
    String resource3="Wickets";
    public void run()
    {
        if(Thread.currentThread().getName().equals("Dhoni"))
        {
            dhoniAcquiredResource();
        }else{
            SewaghAcquiredResource();
        }
    }
    public void dhoniAcquiredResource()
    {
        synchronized (resource1){
            System.out.println("Dhoni has acquired"+resource1+"Resource");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        synchronized (resource2) {
            System.out.println("Dhoni has acquired " + resource2 + "Resource");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (resource3) {
                System.out.println("Dhoni has acquired " + resource3 + " resource");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Dhoni has released " + resource3 + " resource");
            }
            System.out.println("Dhoni has released " + resource2 + " resource");
        }
            System.out.println("Dhoni has released " + resource1 + " resource");
        }
     }
    public void SewaghAcquiredResource()
    {
        synchronized (resource1){
            System.out.println("Sewagh has acquired"+resource1+"Resource");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (resource2) {
                System.out.println("Sewagh has acquired " + resource2 + "Resource");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource3) {
                    System.out.println("Sewagh has acquired " + resource3 + " resource");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Sewagh has released " + resource3 + " resource");
                }
                System.out.println("Sewagh has released " + resource2 + " resource");
            }
            System.out.println("Sewagh has released " + resource1 + " resource");
        }
    }
}
public class LockingInThreads {
    public static void main(String[] args) {
        Cricket c1=new Cricket();
        Cricket c2=new Cricket();
        c1.setName("Dhoni");
        c2.setName("Sewagh");
        c1.start();
        c2.start();
    }
}
*/
//case 2 --> deadlock condition here resouce 1 and 3 are hold by different threads waiting for each other to release so will lead to dead lock condition
class Cricket extends Thread{
    String resource1="Bat";
    String resource2="Ball";
    String resource3="Wickets";
    public void run()
    {
        if(Thread.currentThread().getName().equals("Dhoni"))
        {
            dhoniAcquiredResource();
        }else{
            SewaghAcquiredResource();
        }
    }
    public void dhoniAcquiredResource()
    {
        synchronized (resource1){
            System.out.println("Dhoni has acquired"+resource1+"Resource");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (resource2) {
                System.out.println("Dhoni has acquired " + resource2 + "Resource");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource3) {
                    System.out.println("Dhoni has acquired " + resource3 + " resource");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Dhoni has released " + resource3 + " resource");
                }
                System.out.println("Dhoni has released " + resource2 + " resource");
            }
            System.out.println("Dhoni has released " + resource1 + " resource");
        }
    }
    public void SewaghAcquiredResource()
    {
        synchronized (resource3){
            System.out.println("Sewagh has acquired"+resource1+"Resource");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (resource2) {
                System.out.println("Sewagh has acquired " + resource2 + "Resource");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource1) {
                    System.out.println("Sewagh has acquired " + resource3 + " resource");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Sewagh has released " + resource3 + " resource");
                }
                System.out.println("Sewagh has released " + resource2 + " resource");
            }
            System.out.println("Sewagh has released " + resource1 + " resource");
        }
    }
}
public class LockingInThreads {
    public static void main(String[] args) {
        Cricket c1=new Cricket();
        Cricket c2=new Cricket();
        c1.setName("Dhoni");
        c2.setName("Sewagh");
        c1.start();
        c2.start();
    }
}