package com.DSA;

import java.util.ArrayList;

public class SortedArrays {
    public static void main(String[] args) {
    int arr[ ] = {2,3,1,4,4,5};
    ArrayList<Integer> list=new ArrayList<>();
//        System.out.println(linerSearch(arr,4 ,0));
//        System.out.println(Index(arr,4,0));
//        System.out.println(lastIndex(arr, 4 , arr.length-1));
     //   System.out.println(sorted(arr, 0));
        System.out.println(findAllIndex2(arr,4,0));
    }
    static boolean sorted(int [] arr , int index){
        //base condition
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr, index+1);
    }
    static boolean linerSearch(int arr[] , int target , int index){
        if(index ==arr.length
        ){
            return false;
        }
        return arr[index] == target || linerSearch(arr,target, index+1);
    }
    static int Index(int arr[] , int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return Index(arr , target , index+1);
    }
    static int lastIndex(int arr[] , int target , int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return lastIndex(arr , target , index-1);
    }
    static ArrayList<Integer> findAllIndex(int arr[] , int target , int index , ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
      return findAllIndex(arr , target , index+1,list);
    }
    //Finding all index without passing ArrayList as Argument (Not Optimized just a method to do)
    static ArrayList<Integer> findAllIndex2(int arr[] , int target , int index ){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        //This will contain the ans for that function call only
        if(arr[index] == target){
            list.add(index);
        }
     ArrayList<Integer> ansFromBelowCalls =findAllIndex2(arr , target , index+1);

        list.addAll(ansFromBelowCalls);
        return list;
    }
}
