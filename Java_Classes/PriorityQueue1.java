package com.Java_Classes;
import java.util.PriorityQueue;
import java.util.Scanner;

class Cricketer implements Cloneable{
    String name;
    Object obj;
    public Cricketer(String name){
        this.name=name;
    }
   public Object clone(){
        try{
          obj=super.clone();
        }catch(Exception e){
        e.printStackTrace();
        }
       return obj;
   }
}
public class PriorityQueue1 {
    public static void main(String[] args) {
        System.out.println("Enter Your name: ");
        Scanner sc =new Scanner(System.in);
        String name=sc.next();
        Cricketer c=new Cricketer(name);
        System.out.println(c.name);
        System.out.println(c.clone());
        Cricketer c2= (Cricketer) c.clone();
        System.out.println(c2.name);


       /*  PriorityQueue<Object> p=new PriorityQueue<>();
       p.add(10);
        p.add(200);
        p.add(30);
        p.add(5);
       // p.add(50);
        System.out.println(p);//[5 10 30 200] By default normal sorting having low number have high priority

        */


    }
}
