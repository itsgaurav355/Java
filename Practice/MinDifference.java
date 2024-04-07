package com.Practice;

import java.util.Arrays;

public class MinDifference {
    public static void main(String[] args) {
        int [] arr = {90,80,70,75};
        System.out.println(minDiff(arr,2));
    }
    static int minDiff(int [] arr,int num){
        if(arr.length == 1 || arr.length<num){
            return 0;
        }
        Arrays.sort(arr);
        int j = num-1;
        int difference  = Integer.MAX_VALUE;
        int temp;
        for(int i =0;i< arr.length && j< arr.length;i++,j++){
            temp = arr[j] - arr[i];
            if(difference > temp){
                difference = temp;
            }
        }
        return difference;
    }
}
