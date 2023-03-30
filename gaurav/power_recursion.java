package com.gaurav;
/*
public class power_recursion {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }else if (x==0){
            return 0;
        }else{
            int temPower =power(x,n-1);
            int totalPower=x*temPower;
            return totalPower;
        }
        //time complexity O(n)
    }
    public static void main(String[] args) {
     int x=2,n=5;
     int ans=power(x,n);
        System.out.println(ans);

    }
}
*/
public class power_recursion {
    public static int power(int x,int n) {
        if (n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
        //for checking even or odd
        if(n%2==0){
           return power(x,n/2) *power(x,n/2);
        }else{
            return power(x,n/2)*power(x,n/2)*x;
        }
        //Time Complexity O(log n to the base 2)
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans=power(x,n);
        System.out.println(ans);
    }
}