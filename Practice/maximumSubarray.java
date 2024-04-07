package com.Practice;

public class maximumSubarray {
    public static void main(String[] args) {

    }
    //kandal's algorithm --> if the value of gujarti becomes less than zero than the next gujrati will not help him otherwise they do help to another gujrati
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];
        for(int i = 1 ; i < nums.length ;i++){
            if(sum >= 0){
                sum = sum +  nums[i];
            }else{
                sum = nums[i];
            }

            if(maxSum < sum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
