package com.gaurav;

public class RecursionBasics {
    //Fibonacci series
     public static void printFib(int a ,int b,int n) {
         if (n > 0) {
             int c = a + b;
             System.out.println(c);
             a = b;
             b = c;
             printFib(a, b, n -1);
         }else{
             return;
         }

     }
    public static void main(String[] args) {
        int a,b,n;
        a=0;b=1;n=7;
        System.out.println(a);
        System.out.println(b);
        printFib(a,b,n-2);
    }
}
