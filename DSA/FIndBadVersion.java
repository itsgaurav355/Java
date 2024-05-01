package com.DSA;

public class FIndBadVersion {
    public static void main(String[] args) {

    }
    //First Bad Version
    public static int firstBadVersion(int n) {
        if(n == 0 || n == 1){
            return 1;
        }

        int start = 0;
        int end = n;
        int ans = 0;
        while(start <= end){
            int mid = start+(end-start)/2;
            // predefined api
//            boolean x = isBadVersion(mid);
//            if(x==true){
//                ans = mid;
//                end = mid-1;
//            }
//            else{
//                start = mid+1;
//            }
        }
        return ans;
    }
}
