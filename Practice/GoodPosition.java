package com.Practice;

public class GoodPosition {
    public static void main(String[] args) {
        int [] arr = {1,4,3};
        System.out.println(findPosition(arr , 3 , 3));
    }
    static int findPosition(int [] arr , int n,int k ){
        int sum = 0;
        for(int i =0; i < n ; i++ ){
            sum = sum + arr[i];
        }
        return findPos(arr,0,k,sum , 0);
    }

    private static int findPos(int[] arr, int i, int k, int sum,int ans) {
        if(i == arr.length){
            return ans;
        }
        if((arr[i]+k) > (sum-arr[i])){
            ans++;
            return findPos(arr , i+1,k,sum,ans);
        }else{
            return findPos(arr , i+1,k,sum,ans);
        }
    }


}
