package com.Practice;

import java.util.Arrays;

public class twoStacks {
    public static void main(String[] args) {
        int []a =  {4,2,4,6,1};
        int []b =  {2,1,8,5};
        System.out.println(twoStack(12,a,b,0,0)-1);
    }

    static int twoStack(int maxSum, int [] a , int [] b ,int sum , int count ){
        if(sum > maxSum){
            return count;
        }
        if(a.length == 0 || b.length == 0){
            return count;
        }

        int ans1 = twoStack(maxSum, Arrays.copyOfRange(a,1,a.length),b,sum + a[0],count+1);
        int ans2 = twoStack(maxSum, a,Arrays.copyOfRange(b,1,a.length),sum + b[0],count+1);

        return Math.max(ans1,ans2);
    }
}
