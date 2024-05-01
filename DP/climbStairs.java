package com.DP;

public class climbStairs {
    public static void main(String[] args) {

    }
    static int iterative(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        int oneStepBefore = 2;
        int twoStepBefore = 1;
        int res = 0 ;
        for(int i = 2 ; i < n ; i++ ){
            res = oneStepBefore + twoStepBefore ;
            twoStepBefore = oneStepBefore;
            oneStepBefore = res;
        }
        return res;
    }

    static int recursive(int n){
        if(n<=1){
            return 1;
        }else{
            int left = recursive(n-1);
            int right = recursive(n-2);
            return left + right;
        }
    }

}
