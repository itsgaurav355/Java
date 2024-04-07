package com.Practice;

public class question3 {
    public static void main(String[] args) {

    }
//    static int terminalDefence(int n, int m, int[] a, int[] h, int[] b, int k) {
////        return checkDefence(n , m , a, h , k , b,0 , 0 );
//    }

    private static int checkDefence(int n, int m, int[] a, int[] h,int [] b, int k, int i, int j) {
        if(allDead(h)) {
            return 1;
        }
        if( i < m && j < n &&  a[i] == b[j]){
            h[i] = h[i] - k;
            return checkDefence(n ,m ,a,h,b,k,i++,j++);
        }
        return 0;
    }

    private static boolean allDead(int[] h) {
        for(int x: h){
            if(x != 0){
                return false;
            }
        }
        return true;
    }
}
