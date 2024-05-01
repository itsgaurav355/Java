package com.DSA;

public class validPerfectSquare {
    public static void main(String[] args) {

    }
    //Valid Perfect Square
    public static boolean isPerfectSquare(int num) {
        if(num == 0 || num == 1){
            return true;
        }
        int start = 0;
        int end = num;
        int mid = -1;
        while(start <= end){
            mid = start + (end - start)/2;
            if((long)mid * mid == (long)num){
                return true;
            }else if((long)mid * mid > (long)num){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
}
