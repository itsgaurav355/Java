package com.DSA;

public class BinarySearchSqrt {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        //pretty painting or formatting
        System.out.printf("%.3f",sqrt(n , p));

    }
    //Time\: O(log(n))
    static double sqrt(int n , int p){
        int s = 0;
        int e = n;

        double root = 0.0 ;
        while ( s <= e) {
            int m =s +(e -s) /2 ;
            if(m*n>n){
                e= m-1;
            }else{
                s = m+1;
            }
        }
        double incr = 0.1;
        for(int i=0;i< p; i++){
        while(root * root <=n){
            root += incr;
        }
        root -= incr;
        incr /= 10;
        }
        return root;
    }
}
