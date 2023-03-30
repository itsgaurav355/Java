package Java_Classes;

class Producer2 implements Runnable {
 private Bucket_Queue2 bq;

    public Producer2(Bucket_Queue2 bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        int j = 0;
        while (j <= 10) {
            bq.put(j);
            System.out.println("Producer " + Thread.currentThread().getName() + " has put " + j);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            j++;
        }

    }
}

 class Consumer2 implements Runnable{
   private Bucket_Queue2 bq;
    public Consumer2(Bucket_Queue2 bq){
        this.bq=bq;
    }
    @Override
    public void run() {
        int j=0;
        while (j <= 10) {

            System.out.println("Consumer " + Thread.currentThread().getName() + " has consumed " + bq.get());
            try {
                Thread.sleep(3000);
            } catch (Exception e) {

            }
            j++;
        }
    }
}

class Bucket_Queue2 {
    int count;
    boolean available=false;

    public synchronized void put(int value){
        while(available==true){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        count=value;
        available=true;
        notify();
    }
    public synchronized int get(){
        while(available==false){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available=false;
        notify();
        return count;
    }

}

    public class PCB2 {
        public static void main(String[] args) {
            Bucket_Queue2 bq=new Bucket_Queue2();
            Producer2 p=new Producer2(bq);
            Consumer2 c=new Consumer2(bq);
            Thread t1=new Thread(p,"John");
            Thread t2=new Thread(c,"Mars");
            t1.start();
            t2.start();
        }
    }
