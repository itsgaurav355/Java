package com.gaurav;

public class CallGuestRecursion {
public static int call(int n){
    if(n<=1){
        return 1;
    }
    //gives the total no of way in which we can invite n peoples
    //for single person
    int single= call(n-1);
    //for couple
    int pair=(n-1)*call(n-2);
    return single+pair;
}
    public static void main(String[] args) {
        int n=4;
        System.out.println(call(n));
    }
}
