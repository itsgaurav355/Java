package Java_Classes;

import java.util.Scanner;
//This is not Threading this is called procedural execution of a program or The program executed by only one thread and step by step
public class ThreadsDemo {
    public static void main(String[] args) {
        System.out.println("Task 1 Activity Started ");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("task 1 Completed ");
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

        System.out.println("Task 3 Activity Started");
        System.out.println("Enter Two no. to get the product ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The product is : "+a*b);
        System.out.println("Task 3 Completed");
    }
}
