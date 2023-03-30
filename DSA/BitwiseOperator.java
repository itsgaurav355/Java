package com.DSA;

public class BitwiseOperator {
    public static void main(String[] args) {
//        System.out.println(isOdd(10));
//        int arr[] ={2,3,3,4,2,6,4};
//        System.out.println(isUnique(arr));
//        int base =2;
//        int power =4;
//
//        int ans = power(base,power);
//        System.out.println(ans);
//        System.out.println(magicNumber(n));
        int n= 45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));

    }
    static int setBits(int n)
    {
        //setBits == 1
        int count= 0;
//        while(n > 0){
//            count++;
//            n -= (n & -n);
//        } OR
        while(n > 0)
        {
            count++;
            n = n & (n-1);

        }

        return count;
    }
    static int power(int base, int power)
    {
        int ans =1;
        while(power >0 ){
            if((power & 1) == 1)
            {
                ans *=base;
            }
            base *= base;
            power =power >> 1;
        }
        return ans;
    }
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
    static int isUnique(int arr[]){
        //Debug for step-by-step solution
        int unique=0;
        for(int n: arr){
            unique ^= n;
        }
        return unique;
    }
    static int magicNumber(int n){
        int ans =0;
        int base = 5 ;
        while(n > 0){
            int last = n & 1;
            n = n >> 1 ;
            ans +=last *base;
            base = base * 5;
        }
        return ans;
    }
    static int noOfDigits(int n,int base)
    {
        return (int)(Math.log(n)/Math.log(base))+1;
    }
}
