package com.gaurav;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
       // int [] marks =new int[10];
       // int [] marks1={4,5,6,7,8,8};//Second way of writing Arrays
//        marks[0]=97;
//        marks[1]=98;
//        marks[2]=95;
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        for(int i=0;i<3;i++) {
//            System.out.println(marks[i]);
//        }
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();

        int number[]=new int [size];
        int res=0;
        float ans;
        //for input for loop
        System.out.println("Enter the number : ");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
            res=res+number[i];
        }
        ans=res/size;
        System.out.println(ans);


        }




    }

