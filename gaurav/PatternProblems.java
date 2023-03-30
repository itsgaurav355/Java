package com.gaurav;


import static java.lang.Math.*;

public class PatternProblems {
    public static void main(String[] args) {
            pattern(4);

        }
        static void pattern(int n){
        int original= n;
        n= 2*n;
        for(int row =0 ; row <= n ; row++){
            for( int col =0 ; col<=n ; col ++ ){
                int atEveryIndex = original - Math.min(Math.min(row, col) , Math.min(n- row, n-col));
                System.out.print(atEveryIndex + " ");

            }
            System.out.println();
        }
        }
    }

