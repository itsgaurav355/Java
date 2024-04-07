package com.Practice;

public class question5 {
    public static void main(String[] args) {

    }
    public static int butterflies(int n, int []a) {
        int turn = 0;
        int ones = 0;
        int total = 0;

        for(int i=0;i<n;i++){
            if(a[i] == 1){
                ones++;
            }
            total += a[i];
        }

        int left = total - (2*ones);
        if(ones == 0){
            return n+1;
        }

        if(left % 2 == 0){
            turn = ones + (left/2);
        }
        else if(left % 2 ==1){
            turn = ones + ((left/2)+1);
        }
        else{
            turn = ones + (left/2);
        }
     return turn;
    }
}
