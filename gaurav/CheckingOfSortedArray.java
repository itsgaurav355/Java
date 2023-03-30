package com.gaurav;

public class CheckingOfSortedArray {
  //  public static int a[],index;
    public static boolean check(int a[],int index){
        if(index==a.length-1){
            return true;
        }
        int l=a.length;
        if(a[index]>=a[index+1]){
           return false;
        }
        return check(a,index+1);
    }
    public static void main(String[] args) {
        int a[]={1,3,1};
        System.out.println(check(a,0));
    }
}
