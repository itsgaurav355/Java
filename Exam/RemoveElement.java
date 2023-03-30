package com.Exam;

import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int ans[]= new int[nums.length];
        int j = 0 ;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]!=val){
                ans[j] = nums[i];
                j++;
            }
        }
        nums = ans;
        System.out.println(Arrays.toString(nums));
        return j;
    }

    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));
    }
}
