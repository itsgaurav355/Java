package com.Practice;

public class question1 {
    public static void main(String[] args) {
        int arr[] = {3,6,5,11};
        System.out.println(contributions(arr.length , arr));
    }
    static long contributions(int n, int []a) {
        long ans = 0;
        return getContro(n ,a ,0,0);
    }

    private static long getContro(int n, int[] a, long ans, int index) {
        if(index == n){
            return ans;
        }
        for (int i = index+1 ; i < n; i++) {
            if(isValid(a, index, i)){
                ans = ans + (a[index]^a[i]);
            }
        }
        return getContro(n , a , ans , index+1);

    }

    static boolean isValid( int a[],int index , int next){
        return a[index]%3 == a[next]%3;
    }
}
