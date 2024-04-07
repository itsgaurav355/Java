package com.Practice;

import java.util.Arrays;

public class question6 {
    public static void main(String[] args) {

    }
    static int xAndY(int x, int y, int[] a) {
        Arrays.sort(a);
        for(int i= 0; i <a.length ; i++ ){
            if(a[i] >= x && a[i] <= y ){
                return a[i];
            }
        }
        return -1;
    }
}
