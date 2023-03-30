package Java_Classes;

//method 1 for threading by extending thread class:)
class Mythread extends Thread{
    @Override
    public void run(){
        int a=0;
        while(true){
            System.out.println("Even No.");
            System.out.println(" i am happy,i got everything");
            a++;
        }
    }
}
class Mythread2 extends Thread {
    @Override
    public void run() {
        int b=0;
        while (true) {
            System.out.println("Odd No. ");
            System.out.println("I am very happy, Because i don't have anything");
            b++;
        }
    }
}
public class Multithreading{
    public static void main(String[] args) {
        Mythread t1= new Mythread();
        Mythread2 t2=new Mythread2();
        //to use that run method .start() is required
        t1.start();
        t2.start();
    }
}
