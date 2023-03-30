package com.gaurav;
import java.util.Scanner;
public class loops_injava {
    public static void main(String[] args) {
        System.out.println("Enter the value");
//        for(int counter=0;counter<3;counter++){
//            System.out.println("Hello world");
//        }
//        for(int i=1;i<11;i++){
//            System.out.print(i+" ");
//        }
//        int i=0;
//        while(i<11){
//            System.out.println(i);
//            i++;
//        }
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<11);
        Scanner sc = new Scanner(System.in);
//            int a=sc.nextInt();
//            int sum=0;
//            for(int j=1;j<=a;j++){
//             sum=sum+j;
//
//}
//        System.out.println(sum);
        int a= sc.nextInt();

     for(int i=1;i<11;i++){
         System.out.println(a +" * "+i+" = "+(a*i));
     }


    }
}
