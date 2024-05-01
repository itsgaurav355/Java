package com.DP;

import java.util.Arrays;

public class FiboSeries {
    public static void main(String[] args) {
        int n =5;
        int []dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fibo(dp,n));
    }
    static int fibo(int [] dp , int n){
        if(n <= 1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }else{
            return dp[n] =  fibo(dp, n-1) + fibo(dp , n-2);
        }
    }
}
