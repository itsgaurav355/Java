package com.DSA;

public class Recursion {
    public static void main(String[] args) {
//        System.out.println(fibo(4));
//        int arr[] = {1,2,3,4,55,66,78};
//       int r=  binarySearch(arr,0, arr.length -1,4);
//        System.out.println(r);
//        for (int i =0; i < 11; i++) {
//            System.out.println(fiboFormula(i));
//        }
        System.out.println(fiboFormula(50));
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    //using Linear Recurrence Fibo series
    static int fiboFormula(int n)
    {
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n) / Math.sqrt(5));
    }
    static int binarySearch(int [] arr,int start,int end,int target){
        if( start>end){
           return -1;
        }
        int mid= start + (end-start)/2;
        if(target == arr[mid]) {
            return mid;
        }else if(target > arr[mid]){
            return binarySearch(arr,mid+1,end,target);
        } else{
            return binarySearch(arr,start,mid-1,target);
        }
    }
}
