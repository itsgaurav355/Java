package com.Practice;

import java.util.Arrays;

public class MaxDifference {
    public static void main(String[] args) {
        int [] arr = {1,6,3,2};
        Arrays.sort(arr);
        int maxDifference = arr[arr.length-1] - arr[0];
        System.out.println(maxDifference);


    }
}
