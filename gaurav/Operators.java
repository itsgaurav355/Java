package com.gaurav;
import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] housepipeline = new int[M][N];
        int K=0;
        for (int i = 0; i <= M; i++) {
            for (int j = 0; i <= M; j++) {
                int l = sc.nextInt();
                housepipeline[i][j] = l;
                int r = sc.nextInt();
                housepipeline[i][j] = r;
                if (l >= r || r >= M || 1 >= N) {
                     K= housepipeline[i][j];
                }
            }



        }
        System.out.println(K);

        */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int k=0;
        for(int i=1;i<=N;i++){
            int t=sc.nextInt();
            int c=sc.nextInt();
            if(i==t || i==c){
                k=i;
            }
        }
        System.out.println(k);


      /*  Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] box=new int[N];
        for(int i=0;i<=N;i++){
            if(i==N){
                System.out.println(i+"  Box is filled");
            }

       */
        }
    }
