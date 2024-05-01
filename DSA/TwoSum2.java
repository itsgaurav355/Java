package com.DSA;

public class TwoSum2 {
    public static void main(String[] args) {

    }
    //Two Sum II - Input Array Is Sorted
    public static int[] twoSum(int[] numbers, int target) {
        int [] res = {-1,-1};
        int right = numbers.length-1;
        int left = 0;
        while(left <= right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                res[0] = left+1;
                res[1] = right+1;
                break;
            }else if(sum > target){
                right--;
            }else{
                left++;
            }

        }
        return res;
    }
}
