package com.Practice;

public class findZeros {
    public static void main(String[] args) {
         int [] arr = {0,1 ,1, 0, 1, 1, 1 ,0 ,1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 ,0 ,1 ,0, 1, 0, 0 ,0 ,1, 1 ,1 ,0 ,0, 1, 0 ,0 ,0 ,0 ,0 ,1, 0, 1 ,0 ,0 ,0, 1, 1 ,1 ,1 ,0 ,1 ,1 ,0 ,1 ,1, 1, 1, 0, 1, 0};
        System.out.println(findZeroes(arr,arr.length,25));
    }

        // m is maximum of number zeroes allowed to flip
        static int findZeroes(int arr[], int n, int m) {
            int count = 0;
            int maxLength = 0;
            int length = 0;
            int index=0;
            int flip = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i] == 0){
                    count++;
                }
            }
            if(count <= m){
                return n;
            }
            for ( int i =0 ; i < n ; i++){
                if(arr[i] == 1){
                    length++;
                }else if(arr[i] == 0 && flip == 0 && flip < m){
                    index = i;
                    length++;
                    flip++;
                }else if(arr[i]== 0 && flip < m){
                    length++;
                    flip++;
                }else if(arr[i] == 0 && flip == m && (count - m >=0 )) {
                    if (maxLength < length) {
                        maxLength = length;
                    }
                    i = index + 1;
                    flip = 0;
                    length = 0;
                    count--;
                }
            }
            return maxLength;
    }
}
