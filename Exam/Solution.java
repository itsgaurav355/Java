package com.Exam;
import java.util.*;
class Solution{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int M,N,P,addStep=0;
        int sumOfPrevious=0;
        int sumOfNow=0;
        int a[][]=new int[10][10];



        M=sc.nextInt();
        N=sc.nextInt();
        P=sc.nextInt();

        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){

                a[i][j]=sc.nextInt();


            }
        }
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
               if(a[i][j]>a[i+1][j] && i<M-1){
                   addStep+=a[i][j]-a[i+1][j];
               }
            }
        }

        System.out.println("Case #1: "+addStep);



    }
}