package com.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
//Subsequence stands for String Subset stands for numbers
    //Using iterative approach
    static List<List<Integer>> subset(int arr[]){
        List<List<Integer>> outer =new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr){
            int n =outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    //Removing Duplicate (for containing duplicate element
    static List<List<Integer>> subsetDuplicate(int arr[]){
        Arrays.sort(arr);
        List<List<Integer>> outer =new ArrayList<>();

        outer.add(new ArrayList<>());
        int start =0;
        int end =0;
        for(int i =0 ; i<arr.length ;i++){
           start =0 ;
           //but if current and previous element is same ,then s = e + 1
            if(i > 0 && arr[i] == arr[i-1]){
                start =end + 1;
            }
            end =outer.size() -1 ;
            int n =outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2};
        List<List<Integer>> ans = subsetDuplicate(arr);
//        System.out.println(ans);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }
}
