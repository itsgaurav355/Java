package com.Java_Classes;
import java.util.*;
class Former{
   float p,t,si;
   static float r;//With static and without static
   void input(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Principal Amount ");
       p=sc.nextFloat();
       System.out.println("Enter the No. of Years ");
        t=sc.nextFloat();
   }
   static{
       r=2.5f;
   }
   void calSI(){
       si=(p*t*r)/100;
   }
   void disp(){
       System.out.println("SI is : "+si);
   }
}
public class LoanApp {
    public static void main(String []args){
        Former f1=new Former();
        Former f2=new Former();
        Former f3=new Former();
        f1.input();
        f1.calSI();
        f1.disp();
        f2.input();
        f2.calSI();
        f2.disp();
        f3.input();
        f3.calSI();
        f3.disp();
    }
}
