package com.Exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = 0;
        int[] arr;
        int ele = 0;

        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        if(size < 0)
        {
            System.out.println("Invalid Input");
            return;
        }else{
            arr = new int[size];
        }

        for (int i = 0; i < size; i++) {

            arr[i] = in.nextInt();
            if(arr[i] < 0)
            {
                System.out.println("Invalid Input");
                return;
            }
        }
        ele = in.nextInt();

        findElementCount(arr,size,ele);

    }

    private static void findElementCount(int[] arr, int size, int ele) {
        int c = 0;
        for (int i = 0; i < size; i++) {
            if(arr[i] == ele) {
                c++;
            }
        }
        System.out.println(c);
    }
}
