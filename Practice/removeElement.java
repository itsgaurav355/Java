package com.Practice;

import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        System.out.println(remove(nums,3));
        System.out.println(Arrays.toString(nums));
    }
    static int remove(int[] nums, int val) {
        int j = 0 ;
        int [] ans = new int[nums.length];
        for (int i =0 ;i < nums.length;i++){
            if(nums[i] != val){
                ans[j++] = nums[i];
            }
        }
        nums = Arrays.copyOf(ans,j);
        return j;

    }
}
