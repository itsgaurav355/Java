package com.Exam;

import java.text.DecimalFormat;
import java.util.Scanner;

public class prime_index {
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        try{
            if(n<0){
                System.out.println("Invalid Input");
            }else{
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                for (int i = 0; i < n; i++) {
                    if(arr[i] < 0){
                        System.out.println("Invalid Input");
                    }else{
                        System.out.println("Welcome to Program");
                    }
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
