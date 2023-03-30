package com.Exam;

import java.util.Scanner;

public class capgemini02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2134;
        int c =0;
        while(n>0){
            if(n>500){
                n = n - 500;
                c++;
            }else if(n>100){
                n = n -100;
                c++;
            }else if(n>50){
                n=n-50;
                c++;
            }else if(n>10){
                n = n-10;
                c++;
            }else if(n>5){
                n = n-5;
                c++;
            }else if(n>1){
                n = n-1;
                c++;

            }
            System.out.println(c);
        }

    }
}
