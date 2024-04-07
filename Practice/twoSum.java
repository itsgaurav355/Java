package com.Practice;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int [] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }
    static int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        int k = 0;
        int sum = 0;
        int l =nums.length;
        for(int i = l-1; i>k && k < l; i--){
            sum = nums[i]+nums[k];
            if(sum == target){
                ans[0]=k;
                ans[1]=i;
                return ans;
            } else if( i != k+1 && sum < target || sum > target){
                continue;
            }else if(i== k+1){
                i =l-1;
                k++;
            }
        }
        return ans;

    }
}
