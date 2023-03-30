package Java_Classes;

import java.util.Scanner;

class Alpha implements Runnable{
    public void run(){
        System.out.println("Activity 1 Started ");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println();
        }
        System.out.println("Activity 1 Completed");

    }
}
class  Beta implements Runnable{
    public void run(){
        System.out.println("Task 2 Started ");
        System.out.println("Enter the integer to check whether it is a even or odd");
        Scanner sc=new Scanner(System.in);
        int element=sc.nextInt();
        if(element%2==0){
            System.out.println("It is an Even No.");
        }else{
            System.out.println("It is An Odd no");
        }
        System.out.println("task 2 Activity Completed ");
    }
}
class Delta implements Runnable{
    public void run(){
        System.out.println("Task 3 Activity Started");
        System.out.println("Enter Two no. to get the product ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The product is : "+a*b);
        System.out.println("Task 3 Completed");
    }
}
public class ThreadingWithImplement {
    public static void main(String[] args) {
        //Main Thread starts first Always
        Alpha a1=new Alpha();
        Beta b1=new Beta();
        Delta d1=new Delta();
       Thread t1=new Thread(a1);
       Thread t2=new Thread(b1);
       Thread t3=new Thread(d1);
       t1.start();
       t2.start();
       t3.start();
        //Main Thread finishes its execution first Always


    }
}
