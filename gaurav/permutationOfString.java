package com.gaurav;
//recursion
public class permutationOfString {

    public static void printPermutation(String str , String permutatioin){
        if(str.length()==0){
            System.out.println(permutatioin);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar =str.charAt(i);//i=0 c==a a
            //"abc"-->"bc"
            String newString =str.substring(0,i)+str.substring(i+1);//nS=abc,
            printPermutation(newString,permutatioin+currChar);//abc a /abc ab /abc abc
        }
    }
   // Time Complexity O(n!)
    public static void main(String[] args) {
        String str ="abc";
        printPermutation(str,"");
    }
}
